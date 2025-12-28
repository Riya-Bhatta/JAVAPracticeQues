import java.util.*;
public class test{
  public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for( int i=0;i<=n-1;i++){
        arr[i] = sc.nextInt();
    }
        int  count =0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]%2 !=0){
                count++;
            }
        }
            if(count==3){
                System.out.print("true");
            }
            else{
                System.out.print("false");
            }
        }
    }
    
