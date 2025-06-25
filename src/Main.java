

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Day 2 Exercises ----");
        int choice;
        do {
            System.out.println("1- Exercise 1");
            System.out.println("2- Exercise 2");
            System.out.println("3- Exercise 3");
            System.out.println("4- Exercise 4");
            System.out.println("5- Exercise 5");
            System.out.println("6- Exercise 6");
            System.out.println("7- Exercise 7");
            System.out.println("8- Exercise 8");
            System.out.println("9- Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    ExerciseOne();
                    break;
                case 2:
                    ExerciseTwo();
                    break;
                case 3:
                    ExerciseThree();
                    break;
                case 4:
                    ExerciseFour();
                    break;
                case 5:
                    ExerciseFive();
                    break;
                case 6:
                    ExerciseSix();
                    break;
                case 7:
                    ExerciseSeven();
                    break;
                case 8:
                    ExerciseEight();
                    break;

            }
        }while (choice != 9);

    }


    public static void ExerciseOne(){
        System.out.println("--Exercise 1--");
            for(int i=0; i<= 100; i++){
                if(i % 3 ==0 && i % 5 ==0){
                    System.out.println("FizzBuzz");
                } else if (i % 3 ==0) {
                    System.out.println("Fizz");
                }else if (i % 5 ==0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
    }
    public static void ExerciseTwo(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("--Exercise 2--");
        System.out.println("Enter Text to reverse it");
        String userInput = sc2.nextLine();
        StringBuilder sb = new StringBuilder(userInput);
        System.out.println("Reversed String: " + sb.reverse());
    }
    public static void ExerciseThree(){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("--Exercise 3 --");
        System.out.println("Enter a number to find its factorial number");
        long userInput = sc3.nextInt();
        long factorial = 1;
        for (int i = 1 ; i <= userInput ; i++){
            factorial *= i;

        }
        System.out.println("The factorial number for "+userInput+" is = "+ factorial);
    }
    public static void ExerciseFour(){
        Scanner sc4 = new Scanner(System.in);
        System.out.println("--Exercise 4--");
        System.out.println("Enter the Base number: ");
        int baseInput = sc4.nextInt();
        System.out.println("Enter the Exponent number:");
        int exponentInput = sc4.nextInt();
        int result =1;
        for (int i = 1;i <=exponentInput ; i++){
            result *= baseInput;
        }
        System.out.println("Result is: " +result);
    }
    public static void ExerciseFive(){
        Scanner sc5 = new Scanner(System.in);
        System.out.println("--Exercise 5--");
        System.out.println("Enter numbers to sum (-1 TO EXIT)");
        int number;
        int evenNumbers = 0;
        int oddNumbers = 0;
        do{
        number = sc5.nextInt();

        if(number % 2 ==0){
            evenNumbers += number;

        }else {
            oddNumbers += number;
        }
        }while(number !=-1);
        System.out.println("Sum of even numbers:" + evenNumbers);
        System.out.println("Sum of odd numbers:" + oddNumbers);
    }
    public static void ExerciseSix(){
        Scanner sc6 = new Scanner(System.in);
        System.out.println("--Exercise 6--");
        System.out.println("Prime checker");
        System.out.println("Enter a number:");
        int number = sc6.nextInt();
        boolean flag = false;
        if(number <2){
            flag = true;
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println(number+ " is not Prime number.");
        else
            System.out.println(number+ " is a Prime number.");

    }
    public static void ExerciseSeven(){
    for (int i = 1; i <= 4 ; i++){
        System.out.println("-----Week"+i +"-----\n");
        for (int j = 1; j <= 7; j++){
            System.out.println("--Day"+j+"--\n");
        }
    }
    }
    public static void ExerciseEight(){
        Scanner sc8 = new Scanner(System.in);
        System.out.println("--Exercise 8--");
        System.out.println("Find if its Palindrome text!");
        System.out.println("Enter a string: ");
        String normalText = sc8.nextLine();
        StringBuilder sb = new StringBuilder(normalText);
        if(!normalText.equalsIgnoreCase(sb.reverse().toString()))
            System.out.println("Its not a Palindrome!");
        else
            System.out.println("Its a Palindrome!");
    }

}
