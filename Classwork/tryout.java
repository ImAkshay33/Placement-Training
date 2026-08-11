 class t {
    static int a=0;
    {
        System.out.println("This is a (t)non-static block");
    }
    static void main(){
        
        System.out.println("This is a main( of t )method"+(a++));
    }
}
class tryout1 {
    static{
       // int a=10;
        System.out.println("This is a static block");
    }
    public static void main(String args[]){
        
        t var=new t();
        var.main();
        var.main();
        var.main();
        //tryout1 n=new tryout1();
       // var.main();
       // n.main();
        System.out.println("This is a main(tryout1) method");
    }
}

