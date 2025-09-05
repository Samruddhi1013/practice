public class fibonacciRecursion {
    public static int fibo(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[]){
        int n=6;

        int result=fibo(n);
        System.out.println(result);
    }
    
}
