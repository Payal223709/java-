class Demo {
    int a = 3; //instance
    static int c = 6;  //statc
 public static void main(String args[]) {
    int b = 4; //local
     System.out.println(b);
     System.out.println(Demo.c);
     Demo obj = new Demo();
     
     System.out.println(obj.a);
     
    }
}