package com.gevernova.javaeightfeatures.lambdaexpressions;

import com.gevernova.javaeightfeatures.lambdaexpressions.TriFunction;

public class CustomTriFunction  {
    public static void main(String[] args) {
        // Step 2: Use the TriFunction
        TriFunction<Integer, Integer, Integer, Integer> sumThreeNumbers = (a, b, c) -> a + b + c;
        ;
        int result = sumThreeNumbers.apply(10, 20, 30);

        System.out.println("Sum of 10, 20, 30 is: " + result);
    }
}
