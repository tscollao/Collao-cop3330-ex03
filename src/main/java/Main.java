/*
 * UCF COP 3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Tristan Collao
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args )
    {

        System.out.println("What is the Quote");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();
        System.out.println("Who Said it?");

        String author = input.nextLine();
        System.out.println(author + " Says, \"" + quote + "\"");

    }

}
