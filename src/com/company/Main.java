package com.company;

public class Main {

    public static void main(String[] args) {
	// lesson3


        String name [] = {"Руслан","Баястан", "Эрлан", "Артем" };
        System.out.println("Здравсвуйте  " + " " + name[0] + "," + name[1] + "," + name[2] + "!");
        for (int i = 0; i < name.length; i++)
        switch (name[i]){
            case "Руслан":
                System.out.println("Доброе утро! Руслан.");
                break;
            case "Баястан":
                System.out.println("Доброго дня! Баястан.");
                break;
            case "Эрлан":
                System.out.println("Доброго вечера! Эрлан.");
                break;
            case "Артем":
                System.out.println("Доброй ночи ! Артем.");
                break;
            default:
                System.out.println("Не нашел имя" + " " + name[i]);


        }

    }
}
