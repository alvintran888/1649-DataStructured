
package buoi2709;

import java.util.Scanner;


public class ex01 {
    public static void main(String[] args) {
        
    
    //Sum = 1 + 2 + ... + n
        int n = new Scanner(System.in).nextInt();
//        
//        //C1: Equation
        int sum = n * (n+1)/2;
        System.out.println("Ket qua" + sum);
        
//        //C2: Iteration
        sum = tinh_tong(n);
        System.out.println("Ket qua" + sum);
        
      
//        //C3: Recursion
        sum = s(n);
        System.out.println("Ket qua" + sum);
        }
    /* 
    Câu lệnh 52: counter++ là câu lệnh chạy nhiều lần nhất khi
    các giá trị i & j là hợp lệ
    i = t20; j = 0-> (n-1): có n giá trị khác nhau của j
 -   i = 1; j = 0-> (n-1): có n giá trị khác nhau của j
    i = 2; j = 0-> (n-1): có n giá trị khác nhau của j
    ...
    i = n-1;j = 0-> (n-1)
    */
    
    
    
    private static int tinh_tong(int n) {
    int sum = 0;
    for(int i=1; i<=n; i++)
        sum = sum + i;
    return sum;
    }
    
    /*
    counter = 0             //1
    i = 0                   //1
    i < n                   // (n + 1) times
    i <= n                  // n times
    sum = sum + i           // n times
    */
    // T(n) = 4n + 3
    // -> 0(n): Linear time
}
