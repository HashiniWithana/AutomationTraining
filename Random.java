package com.rootcodelabs.java;

import com.github.javafaker.Faker;

public class Random {

    public static void main(String[] args) {
        Faker faker = new Faker();

        String streetAddress = faker.address().streetAddress();

        String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println ("Address is " + streetAddress);
        System.out.println("Phone Number is " + phoneNumber);
    }
}
