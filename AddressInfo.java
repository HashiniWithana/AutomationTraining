package com.rootcodelabs.java;

public class AddressInfo {

    private static void testMethod(){
        String AddressLine1 = "No: 151";
        String AddressLine2 = "Test Street";
        String City= "Gampaha";

        System.out.println(AddressLine1.concat(AddressLine2) .concat(City));

        System.out.println(AddressLine1 + " " + AddressLine2 + " " + City );


    }


    public static void main(String[] args) {

        testMethod();

    }


}
