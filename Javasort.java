package javasort;
import java.util.*;
public class Javasort {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=p.nextInt();
        }
        System.out.println("Before sorting:");
        for(int j:arr){
            System.out.println(j);
        }
        Arrays.sort(arr);
        System.out.println("After sorting:");
        for(int j:arr){
            System.out.println(j);
        }
    }
    
}
