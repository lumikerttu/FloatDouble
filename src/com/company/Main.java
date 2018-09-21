package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.print("myIntValue = " + myIntValue);
        System.out.print("myFloatValue = " + myFloatValue);
        System.out.print("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        //90.7185
        double pi = 3_000_000.141_592_7d;
    }
}
