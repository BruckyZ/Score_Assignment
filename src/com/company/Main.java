package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your test score: ");
        Scanner scan=new Scanner(System.in);
        int score = scan.nextInt();

	char grade='F';

        if (score > 89)
        //{grade = 'A';
        System.out.println("your grade is A");
        else if (score > 79)
            System.out.println("your grade is B");
        else if (score > 69)
            System.out.println("your grade is C");
        else if (score>60 && score<69) //and (score<60);
            System.out.println("your grade is D");
        else
            System.out.println("your grade is F");

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");



    }
}
