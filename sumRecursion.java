public class sumRecursion{
      public static int sumofn(int n){
        if(n==0){
            return 0;
        }else{
          
            return n+sumofn(n-1);
        }

    }
    public static void main(String[] args) {
        int n=4;
       
        int result=sumofn(n);  
        System.out.println(result);
    }
}