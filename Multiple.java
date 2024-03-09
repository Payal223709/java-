public class Multiple {
    public void fun(){
        System.out.println("inside A's fun()method");
    }
    
}
/**
 * InnerMultiple
 */
  public class B{
    public void fun(){
        System.out.println("Inside b");

    }
    }
    class c extends Multiple,B{

    }
    public class Main{
        public void main(String[] args) {
            c obj = new C();
            obj.fun();
        }
    }

    

