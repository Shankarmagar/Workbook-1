package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();


     System.out.println("Possible calculations: ");
     System.out.println("(A)dd");
     System.out.println("(S)ubtract");
     System.out.println("(M)ultiply");
     System.out.println("(D)ivide");
     System.out.println("Enter the value based on given prompt for calculation:");

     char UserInput = scanner.next().charAt(0);
     int answer;

        switch (UserInput) {
            case 'A':
                // Do addition
                answer = firstNumber + secondNumber;
                break;
            case 'S':
                // Subtract
                answer = firstNumber - secondNumber;
                break;
            case 'M', 'm':
                // Do multiplication
                answer = firstNumber * secondNumber;
                break;
            default:
                // Do Divide
                answer = secondNumber / firstNumber;
                break;
        }

     System.out.println("After calculation, your answer is : "+ answer);

    }
}