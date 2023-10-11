package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {

        //part 1
        int bobSalary = 3000;
        int garySalary = 7000;
        int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("HighestSalary is: $" + highestSalary);

        //part 2
        int carPrice = 2000;
        int truckPrice = 100;
        int SmallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("Smallest Price is: $" + SmallestPrice);

        //part 3
        double radius = 7.25;
        double AreaOfCircle = Math.PI * radius * radius; //Math.pow(radius,2)

        System.out.println("Area of the circle with radius "+ radius + " is : "+ AreaOfCircle);

        //part 4
        double number = 5.0;
        double solution = Math.sqrt(number);
        System.out.println("Our solution after square root of " + number + " is: "+ solution);

        //part 5
        int [] a = {5,10};
        int [] b = {85, 50};
        double ans = Math.pow((b[0]-a[0]),2) + Math.pow((b[1]-a[1]),2);
        double distance = Math.sqrt(ans);
        System.out.println("Distance is: "+ distance);
        System.out.printf("Distance = %5.3f\n", distance);

        //part 6
        double GivenNumber = -3.8;
        System.out.println("Absolute value of -3.8 is : "+ Math.abs(GivenNumber));

        //part 7
        System.out.println((int)(Math.random() * 11));

        int num = 42;
        double pi = 3.14159;
        String name = "Alice";
        char grade = 'A';

        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c", num, pi, name, grade);
        System.out.println(formatted);

        System.out.println("Enter value of x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
    }


}