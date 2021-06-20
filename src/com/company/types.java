package com.company;

import java.util.Scanner;

public class types {

    public static void main(String[] args) {
	    final String nameDog1="bull";
         final String nameDog2="peekenes";
         final String nameDog3="chaochao";
        String dog;
        Scanner sc=new Scanner(System.in);
        System.out.print("Dog=");
        dog=sc.nextLine();
            int age=10;
            switch (dog){
                case nameDog1:
                System.out.println ("Is it a bull");
                break;
                case nameDog2:
                    System.out.println ("Is it a chaochao");
                break;
                case nameDog3:
                    System.out.println ("Is it a peekenes");
                break;
                default:
                    System.out.println("error");
                    break;

        }
    }
}
