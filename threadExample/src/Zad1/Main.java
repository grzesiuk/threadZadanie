package Zad1;

import Zad1.Star;

public class Main {
    public static void main(String [] args) {
        Star g = new Star();
        Plus p = new Plus();
        g.start();
        p.start();
        System.out.println("koniec");
    }
}