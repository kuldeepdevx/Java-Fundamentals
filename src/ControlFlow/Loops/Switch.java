package ControlFlow.Loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter which day to print:");
        int num=input.nextInt();

        switch(num){
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default:System.out.println("Invalid num");
        }

        String output=switch(num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid date";
        };
        System.out.println(output);
    }
}
