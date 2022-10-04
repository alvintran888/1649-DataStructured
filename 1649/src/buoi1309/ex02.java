package buoi1309;


public class ex02 {
    public static void main(String[] args) {
        //Cho số x, phân tích x thành tích các thừa số nguyên tố
    //  Ví dụ: 88 = 11 x 2 x 2 x 2
              //100 = 5 x 5 x 2 x 2
              int x = 132;
              int i = 2;
              while(x!=1){
              if(x%i==0){
                  System.out.print(i + " ");
                  x = x/i;
                  
              }else {
              i++;
              }
              }
              //cach2
              System.out.println("\n----------------------");
               x =265;
              for(i=2; x!=1; i++){
              if(x%i==0) {
                  System.out.print(i + " ");
                  x = x/i;
                  i--;
              }
              }
              
              
              
              
              //Homework:
              /* 
              1. cho tổng 1 mảng arr và 1 giá trị k, tìm các cặp có tổng bằng k 
                Ví dụ: ar = {1, 9, 2, 8, 2, 7, 0, 4, 1, 6}
              k = 10
              output: (1,9); (2,8), (4,6)
              
              2. Tìm dãy tăng liên tiếp dài nhát trong 1 mảng
              Ví dụ: arr = {3, 2, 1, 4, 5, 2, 4, 7, 9, 10, 2, 3}
              Output: 
              Dãy tăng liên tiếp dài nhất là: 2, 4, 7, 9, 10
              */
    }

}
