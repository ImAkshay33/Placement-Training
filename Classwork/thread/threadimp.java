class threadimp extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) System.out.println(getName()+" : "+i);
    }
}

class Demo {
    public static void main(String[] args) {
        threadimp t1=new threadimp();
        threadimp t2=new threadimp();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}
