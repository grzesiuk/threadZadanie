package Zad1;

class Plus extends Thread {
    public void run() {
        for (int i = 0; i < 10;i++) {
            System.out.print("+");
            try {
                sleep(1000);
            }
            catch(InterruptedException e) {
            }
        }
    }
}