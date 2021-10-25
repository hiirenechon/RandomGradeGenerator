package com.company.controllers;

import com.company.views.CmdLineView;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        GetName getName = new GetName();
        RandomGrade randomGrade = new RandomGrade();

        for (int i = 0; i < 10; i++) {
            String theName = getName.names[i];
            int grade = randomGrade.grade[i];
            char letter = randomGrade.letter[i];
            CmdLineView view = new CmdLineView(theName, grade, letter);
        }
    }
}
