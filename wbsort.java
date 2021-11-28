package javasort;
import java.util.*;
public class wbsort {
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);
        int[] arr=new int[5];           //new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65}; 
        for(int i=0;i<5;i++){           //i<arr.length
            arr[i]=p.nextInt();
        }
        System.out.println("Before sorting:");
        for(int i:arr){
            System.out.println(i);
        }
        int t=0;
        System.out.println("After sorting:");
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            System.out.println(arr[i]);
        }

    }
    
}
