public class findminANDmax {
    public static void main(String args[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={1,2,399,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }}
             for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println(+min+","+max);
    }
    
}
