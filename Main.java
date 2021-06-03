package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private final static int DELAY = 750;

    private final static String WELCOME_USER_MSG = "Welcome To Password Generator";
    private final static String MAIN_MSG = "Please Give Me The Size Of The Password, Remember To Exit Enter 0";

    private final static String ANSI_ALPHANUM =
                    "0123456789" +
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                    "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
	// write your code here

        long i;

        System.out.println(WELCOME_USER_MSG);

        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {

        }

        var scaner = new Scanner(System.in);

        while (true){
            System.out.println(MAIN_MSG);

            i = scaner.nextLong();

            if (i == 0)
                break;

            System.out.println(random_str(i,ANSI_ALPHANUM));

        }

    }


    private static String random_str(final long len,final String alphaNum){

        var str = "";

        var rand = new Random();

        for (long i = 0 ; i < len ; i++)
            str += alphaNum.charAt(rand.nextInt(alphaNum.length()));

        return str;
    }
}
