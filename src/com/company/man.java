package com.company;

public class man {
    private String name;
    private String Surname;
    private man Father;
    private man Mother;

    public man(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public man(String name, String surname, man father, man mother) {
        this.name = name;
        Surname = surname;
        Father = father;
        Mother = mother;
    }

    @Override
    public String toString() {
        return "man{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Father=" + Father +
                ", Mother=" + Mother +
                '}';
    }
}
