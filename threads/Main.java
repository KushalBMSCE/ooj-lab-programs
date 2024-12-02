
class BMS extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("BMSCollegeThread interrupted");
        }
    }
}

class CSE extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BMS bmsThread = new BMS();
        CSE cseThread = new CSE();
        bmsThread.start();
        cseThread.start();
    }
}
