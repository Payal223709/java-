import java.util.Scanner;
public interface Client {
    void input();
     void output();    
    /**
     *  
     */
  public class InterfaceDemo implements Client {
    String name;
    String salary;
    public void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        salary = sc.nextLine();
    }        
public void output(){
    System.out.println(name);
    System.out.println(salary);
}
 }       
    /**
     *  main
     */
     class  Main {
        public static void main(String[] args) {
            Client C = new InterfaceDemo();
            C.input();
            C.output();
        }
    
        
    }
}      
    

    
