
package buoi1509;

public class ex04 {
    public static void main(String[] args) {
         int n = 11;
         for(int i=1; i<=n/2+1; i++){
             for(int j=1; j<=n; j++) {
                 if(j>i && j<n-i+1)
                 System.out.print("  ");
                 else
                 System.out.print("* ");
             }
             System.out.println(); //xuống dòng, sang hàng mới
         }
         for(int i=n/2; i>=1; i--){
             for(int j=1; j<=n; j++) {
                 if(j>i && j<n-i+1)
                 System.out.print("  ");
                 else
                 System.out.print("* ");
             }
             System.out.println(); //xuống dòng, sang hàng mới
         }
    }
    
}
