package main;

import companie.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = Manager.getInstance("ana", 1000, 10);
        Manager manager2 = Manager.getInstance();

        System.out.println(manager1);
        System.out.println(manager2);
    }
}