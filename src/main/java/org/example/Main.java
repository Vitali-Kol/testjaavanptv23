package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        }

        int max = 30;
        int min = -30;
        int[][] myYear = new int[12][];
        myYear[0] = new int[31];
        myYear[1] = new int[28];
        myYear[2] = new int[31];
        myYear[3] = new int[30];
        myYear[4] = new int[31];
        myYear[5] = new int[30];
        myYear[6] = new int[31];
        myYear[7] = new int[31];
        myYear[8] = new int[30];
        myYear[9] = new int[31];
        myYear[10] = new int[30];
        myYear[11] = new int[31];

        Random random = new Random();
        for (int i = 0; i < myYear.length; i++) {
            for (int j = 0; j < myYear[i].length; j++) {
                myYear[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        
        System.out.printf("%9s", " ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.printf("%9s", " ");
        for (int i = 1; i <= 31; i++) {
            System.out.printf("%4s", "-");
        }
        System.out.println();

        for (int i = 0; i < myYear.length; i++) {
            System.out.printf("%9s", Month.values()[i]);
            for (int j = 0; j < myYear[i].length; j++) {
                System.out.printf("%4d", myYear[i][j]);
            }
            System.out.println();
        }
    }
}