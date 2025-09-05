public class retrunTrueIfDuplicate_Brute {

    public static boolean returnDuplicate(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                    
            }

            }
        }
        return false;
    }
    public static void main(String args[]) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        
        boolean result = returnDuplicate(arr, n);
        System.out.println(result);
        
    }
}
    

