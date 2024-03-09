public class A {
    public void fun(){
        System.out.println("In the parent class");
    }
    public static void sfun(){
        System.out.println("In the parent class");
    }
}
     class B extends A {
    public void fun( ) {
        System.out.println("in the child class");
       
        
    }

    public static void sfun(){
        System.out.println("in the child sfun");

    }
}
    class Main {
        public static void main(String[] args) {
            
        B obj1 = new B();
        obj1.fun();
       obj1.sfun(); //b.sfun

        A obj2= new A();
        obj2.fun();
        obj2.sfun(); //b.sfun()

        A obj3 = new B();
        obj3.fun();
         obj3.sfun();   //s.afun()
            
    }
    
}
     