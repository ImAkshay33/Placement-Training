class Order extends Thread {
    synchronized public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Order "+i+" is being processed");
            try{Thread.sleep(300);}catch(Exception e){}
        }
    }
}

class Kitchen extends Thread {
    synchronized public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Kitchen is preparing Order "+i);
            try{Thread.sleep(400);}catch(Exception e){}
        }
    }
}

class Delivery extends Thread {
    synchronized public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Order "+i+" is out for delivery");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

public class foodorder {
    public static void main(String[] args){
        new Order().start();

        new Kitchen().start();
        new Delivery().start();
    }
}
