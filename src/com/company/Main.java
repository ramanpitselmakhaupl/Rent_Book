package com.company;

public class Main {

    public static void main(String[] args) {

        man fat  = new man("Max","Pitselmakhau");
        man mot  = new man("Nata","Pitselmakhava");

        man Son1  = new man("Raman","Pitselmakhau", fat, mot );
        man Son2  = new man("Dima","Pitselmakhau", fat, mot);

        System.out.println(fat);
        System.out.println(mot);
        System.out.println(Son1);
        System.out.println(Son2);



    }
}
