package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pickup date: ");
        String Date = scanner.nextLine();

        System.out.println("Enter the number of day: ");
        int Days = scanner.nextInt();

        System.out.println("Do you want an electronic toll tag at $3.95/day (Y/N): ");
        char tag = scanner.next().charAt(0);
        boolean isYesForTag = tag == 'Y';

        System.out.println("Do you want an GPS at $2.95/day (Y/N): ");
        char GPS = scanner.next().charAt(0);
        boolean isYesForGPS = GPS == 'Y';

        System.out.println("Do you want roadside assistance at $3.95/day (Y/N): ");
        char RoadAssistance = scanner.next().charAt(0);
        boolean isYesForRoadAssistance = RoadAssistance == 'Y';

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        doCalculation(Days, isYesForTag, isYesForGPS,isYesForRoadAssistance, age);

    }

    public static void doCalculation(int Days, boolean isYesForTag, boolean isYesForGPS, boolean isYesForRoadAssistance, int age)
    {
        double AdditionalRateForTagAndRoadAssistance = 3.95;
        double AdditionalRateForGPS = 2.95;
        double basic_car_rental = 29.99;
        double UnderAgeCharge = (30.0/100.0) * basic_car_rental;

        double charge = Days * basic_car_rental;

        System.out.println("Basic Car Rental For "+ Days + " is : "+ charge);
        System.out.println("Options cost: ");

        if(isYesForGPS)
        {
            charge+= AdditionalRateForGPS;
            System.out.println("for GPS : 2.95" );

        }
        if(isYesForRoadAssistance)
        {
            charge+= AdditionalRateForTagAndRoadAssistance;
            System.out.println("for RoadAssistance : 3.95");

        }
        if(isYesForTag)
        {
            charge+=AdditionalRateForTagAndRoadAssistance;
            System.out.println("for Tag: 3.95");
        }
        if(age<25)
        {
            charge+= UnderAgeCharge;
            System.out.printf("for UnderAgeCharge : %.3f \n",UnderAgeCharge);
        }

      System.out.println("Your Total Sum: "+ charge);
    }
}