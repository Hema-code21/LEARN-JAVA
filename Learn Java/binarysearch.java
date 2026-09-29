import java.io.*;
import java.util.*;
public class binarysearch {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    int low=0,high=n-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(key==a[mid]){
            System.out.print("Element found ");
            return;
        }
        else if(key>a[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    System.out.println("Element not found");
    }
}
