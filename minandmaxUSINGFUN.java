public class minandmaxUSINGFUN {

    public static void main(String args[]){
          int minele=Integer.MAX_VALUE;
        int maxele=Integer.MIN_VALUE;
        int arr[]={1,2,39,9,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            minele=Math.min(arr[i],minele);
            maxele=Math.max(arr[i],maxele);

        }
         System.out.println(minele+","+maxele);
    
    }
    
}
