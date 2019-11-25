package Zad2;

public class Main {
    public static void main(String [] args)
    {
        Thread g = new Thread(new Star());
        Thread p = new Thread(new Plus());
        g.start();
        p.start();

        System.out.println("koniec");
    }
}
