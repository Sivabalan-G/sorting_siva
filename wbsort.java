/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;
import java.util.*;
/**
 *
 * @author USERi
 */
public class wbsort {
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
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
