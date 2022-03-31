package mazenetday9;

//You are using Java
import java.util.*;

class Mythread extends Thread{
	char[] arr;
	Mythread(char[] arr){
		this.arr=arr;
	}
 @Override
 public void run(){
         System.out.println();
        
      
         for (int i=0;i<arr.length;i++){
             int a=1;
             for(int j=i+1;i<arr.length;j++){
                 if(arr[i]==arr[j]&&arr[i]!='0'){
                     
             }
             if(a>0 && arr[i]!='0'){
                 System.out.print(arr[i]);
                 System.out.println(a);
             }
         }
     }
 }
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
         String s=sc.next();
         char[] arr=s.toCharArray();
     }
     Thread t=new Mythread(arr);
     t.start();
 }
}