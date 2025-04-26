package com.gevernova.collections.set;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Creating two HashSets
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input for setOne
        System.out.println("Enter the number of elements for setOne: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the elements for setOne: ");
        for (int i = 0; i < n1; i++) {
            setOne.add(scanner.nextInt());
        }

        // Input for setTwo
        System.out.println("Enter the number of elements for setTwo: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the elements for setTwo: ");
        for (int i = 0; i < n2; i++) {
            setTwo.add(scanner.nextInt());
        }

        //union
        setOne.addAll(setTwo);
        System.out.println(setOne);

        Set<Integer> setThree = new HashSet<>();
        Set<Integer> setFour = new HashSet<>();

        // Input for setThree
        System.out.println("Enter the number of elements for setThree: ");
        int n3 = scanner.nextInt();
        System.out.println("Enter the elements for setThree: ");
        for (int i = 0; i < n3; i++) {
            setThree.add(scanner.nextInt());
        }

        // Input for setFour
        System.out.println("Enter the number of elements for setFour: ");
        int n4 = scanner.nextInt();
        System.out.println("Enter the elements for setFour: ");
        for (int i = 0; i < n4; i++) {
            setFour.add(scanner.nextInt());
        }
        //intersection
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(Integer i:setThree){
            if(setFour.contains(i)){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }
}
