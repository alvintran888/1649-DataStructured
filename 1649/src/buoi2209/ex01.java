
package buoi2209;

import static java.lang.Integer.sum;
import java.util.Scanner;


public class ex01 {
    public static void main(String[] args) {
//        
//    }
//}
//    //Sum = 1 + 2 + ... + n
//    // Cach 1: su dung do-while
   
//        System.out.println("Input N: ");
//  int n = new Scanner(System.in).nextInt();  
//  
  int sum = 0; 
//  int i=1; 
//   do{ 
//    sum = sum + i; 
//    i++; 
//    }
//   while(i<=n) ;
//   System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum); 
//        System.out.println("-----------Cach 1-------------");
//        } 
//}
//=====================================================================   
//        Cach 2: Dung for
   System.out.println("Input N: ");
  int n = new Scanner(System.in).nextInt();  
  for(int i=1;i<=n;i++) { 
      sum = sum + i ; 
   } 
     System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum); 
     System.out.println("-----------Cach 2-------------");
    }
}
//======================================================================
// Cach 3: Equation
//int sum = n * (n+1)/2;
//     System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum);  
//     System.out.println("-----------Cach 3-------------");
//======================================================================
// Cach 4: Recursion
//sum = s(n);
//  System.out.println("Sum = 1 + 2 + ... "+ n + " is: "  +sum);

