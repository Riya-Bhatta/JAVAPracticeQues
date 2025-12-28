public class bubblesort{
    public static void main(String args[]){
        
        int n= 5;
        int arr[] ={1,2,5,4,6};
        for(int i =0 ;i<=n-1;i++){
            for(int j=0; j<n-i-1; j++ ){
                if(arr[i+1]>arr[i]){
                arr[i+1]=arr [i];
                }
            }
        }

    }
}