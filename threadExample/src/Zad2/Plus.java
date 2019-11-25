package Zad2;

class Plus implements Runnable {
    public void run() {
        for (int i = 0; i < 10;i++) {
            System.out.print("+");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
            }
        }
    }
}