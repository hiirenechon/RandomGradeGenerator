package com.company.controllers;

import java.util.Random;

public class RandomGrade {

    public int[] grade;
    public char[] letter;

    public RandomGrade() {
        //Random rand = new Random();
        //for(int i = 0; i<10; i++) {
            //grade[i] = rand.nextInt(100) + 1;
        //}
        grade = new int[10];
        letter = new char[10];
        for(int i = 0; i < grade.length; i++) {
            grade[i] = (int) (Math.random() * 100);
            letter[i] = letterGrade(grade[i]);
        }
    }

    public char letterGrade(int grade) {
        if(grade >= 90) {
            return 'A';
        }
        else if(grade >= 80) {
            return 'B';
        }
        else if(grade >= 70) {
            return 'C';
        }
        else if(grade >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
