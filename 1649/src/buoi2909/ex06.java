
package buoi2909;


public class ex06 {
    public static void main(String[] args) {
        int n = 50;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i=3; i <=n; i++) {
        c = a + b;
        a = b;
        b = c;
        }
          System.out.println("Fib(b) = " + c);      
    }
}
