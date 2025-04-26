package com.gevernova.collections.map.groupobjects;

import java.util.*;
public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee emp : employees) {
            deptMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }
        return deptMap;
    }

    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = groupByDept(emps);
        for (String dept : grouped.keySet()) {
            System.out.println(dept + ": " + grouped.get(dept));
        }
    }
}
