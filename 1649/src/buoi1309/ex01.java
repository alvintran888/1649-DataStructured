package buoi1309;


import java.util.Scanner;
 
public class ex01 {
    // Kiểm tra xem có phải só chính phương hay không
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Input
        int x = scanner.nextInt();
        //Process: Kiểm tra x xem có phải số chính phương không?
        //Ví dụ số chính phương là số 9 vì căn 9 = 3
        if(Math.sqrt(x) % 1 == 0){
            System.out.println("Là số chính phương");
        }else {
            System.out.println("Không phải là số chính phương");
        }
        
        //Cach 2:
        System.out.println("--------------------");
        int a = (int) Math.sqrt(x);
        if(a*a == x){
            System.out.println("Là số chính phương");
        }else{
            System.out.println("Không phải là số chính phương");
        }
        
        
        
        //Cach 3:
        int i = 1;
//        while(i * i < x) {
//        i++;
//        }
        
        
        for(; i*i < x; )
        {
        i++;
        }
        if(i*i == x) {
            System.out.println("Là số chính phương");
        }else{
            System.out.println("Không phải là số chính phương");
        }
        
        
 
      
    }
}
