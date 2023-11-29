package com.example.f23comp1011assignment_2;

public class Testing {
    public static void main(String[] args) {
        try {
            APIUtility.callAPI("mazda");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}