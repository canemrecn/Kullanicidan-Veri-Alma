package kda;

import java.util.Scanner;

public class kva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi giriniz.");
        String isimString = scanner.nextLine();
        System.out.println("Soyadinizi giriniz");
        String soyisimString = scanner.nextLine();
        System.out.println("Adiniz ve Soyadiniz: " + isimString + " " + soyisimString);
    }
}