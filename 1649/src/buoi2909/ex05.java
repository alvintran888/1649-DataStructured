package buoi2909;

public class ex05 {

    public static void main(String[] args) {
        //  TODO Auto-generated method stub
        int n = 50;
        long mem[] = new long[n+1];
        System.out.println(fib(n));

    }

    private static long fib(int n) {
        if (n <= 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }
    private static long fib_mem(int n, long mem[]) {
    if(n <= 2) mem[n] = 1;
    else{
    if(mem[n]==0)
        mem[n] = fib_mem(n-1, mem) + fib_mem(n-2, mem);
    }
    return mem[n];
    }
}
