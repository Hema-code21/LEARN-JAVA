import java.io.*;
import java.util.*;
public class laroftwoarr {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int m1=Integer.MIN_VALUE;
    int m2=Integer.MIN_VALUE;
    for(int i:a){
        if(m1<i){
        m2=m1;
            m1=i;
        }
    
        else if(m1!=i && m2<i){
         m2=i;
    }
    
}
    System.out.print(m2);
}
}
