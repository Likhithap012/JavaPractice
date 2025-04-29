package com.gevernova.javaeightfeatures.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations  {
    public static void main(String[] args) {
        Employee employeeone=new Employee("likhitha",20000);
        Employee employeeTwo=new Employee("vyshnavi",40000);
        Employee employeeThree=new Employee("manasa",60000);
        Employee employeeFour=new Employee("chaitanya",10000);

        List<Employee>list;
        list=new ArrayList<>();
        list.add(employeeone);
        list.add(employeeTwo);
        list.add(employeeThree);
        list.add(employeeFour);

        List<String>listTwo=list.stream().filter(a->a.getSalary()>50000).map(x->x.getName()).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
        System.out.println(listTwo);

    }
}
