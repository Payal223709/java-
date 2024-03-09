public class College
 {  
    int id;  
    String name;  
    College(){  
    System.out.println("This a default constructor");  
    }  
    College(int i, String n){  
    id = i;  
    name = n;  
    }  
    public static void main(String[] args) {  
    College s = new College(); 
    Student student = new Student(0, "Payal");  
    System.out.println("Student Id : "+s.id + "\nStudent Name : "+student.name);  
    }  
}
    