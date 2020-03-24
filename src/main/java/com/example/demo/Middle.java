
// write a java method to display the middle character of a string

package com.example.demo;

import java.util.Scanner;

public class Middle {


    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        String a;

        System.out.println("Enter a string: ");
        a = input.nextLine();
    System.out.println("The middle character in the string: " + middle(a) + "\n");

    }

public static String middle(String a){
        int position;
        int length;
//. length() is counting horizontally the length
        if(a.length() % 2 == 0)
        {
            position = a.length() / 2-1;
            length = 2;
        }

        else{
            position = a.length() /2;
            length = 1;
        }


        return a.substring(position, position + length);

}
}
