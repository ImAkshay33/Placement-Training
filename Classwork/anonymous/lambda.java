@FunctionalInterface
interface areas{
    void area();
}

class lambda{
    public static void main(String[] args){
        areas sq=()->System.out.print(4*4);
        areas rect=()->System.out.print(3*5);
        sq.area();
    }
}