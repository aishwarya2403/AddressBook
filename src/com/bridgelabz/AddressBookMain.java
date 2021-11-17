package com.bridgelabz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
            System.out.println("Welcome To Address Book Program");
            Scanner Scan = new Scanner(System.in);

            try {
                InputStream inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Day28AddressBook\\src\\main\\resources\\Welcome.txt");
                int byteData = inputStream.read();
                if(byteData!=-1){
                    System.out.println(byteData);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }


        }

}
