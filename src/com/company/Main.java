package com.company;

public class Main {

    public static void main(String[] args) {
	// lesson3


        String name [] = {"Руслан","Баястан", "Эрлан" };
        System.out.println("Здравсвуйте  " + " " + name[0] + "," + name[1] + "," + name[2] + "!");
        switch (name[0]){
            case "Руслан":
                System.out.println("Доброе утро! Руслан.");
            case "Баястан":
                System.out.println("Доброго дня! Баястан.");
            case "Эрлан":
                System.out.println("Доброго вечера! Эрлан.");

        }

    }
}
