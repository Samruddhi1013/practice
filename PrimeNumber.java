public class PrimeNumber {

     public static boolean FindprimeNumber(int no){
         if (no <= 1) {
            return false; // 0 and 1 are not prime
        }

        int i=2;
        while(i<no){
         if(no%i==0){
            return true;
        }
         i++;
        
    }
    return false;
    }
    public static void main(String[] args) {
        
        int no=31;
        
         boolean result = FindprimeNumber(no);
        System.out.println(result);
       
    
}
}
