/* Quick check: you only need to test divisors up to √17 ≈ 4.12 → try 2, 3, 4.

17 % 2 ≠ 0

17 % 3 ≠ 0

17 % 4 ≠ 0 */

public class PrimeNumber_optimal {

     public static boolean findPrimeNo(int result,int pno){
     int i=2;
         while(i<=result){
         if(pno%i==0){
            return true;
        }
         i++;
        
    }
    return false;
    }

    public static void main(String[] args) {
        int pno=99;
        int result = (int)Math.sqrt(pno);
        boolean ans = findPrimeNo(result,pno);
        System.out.println(ans);
       

    }
    
}
