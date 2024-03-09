public class Variable {
    static int a = 10; //static
    void fun(){
        int b = 30; //local
        System.out.println(a+ " " + b);
        a = a+1 ;
        b = b+1;

    }
    public static void main(String[] args) {
       
    
    Variable obj = new Variable();
    
    obj.fun();
    obj.fun();
    obj.fun();
    obj.fun();
    obj.fun();
    obj.fun();
    obj.fun();
    obj.fun();

    }   
}
