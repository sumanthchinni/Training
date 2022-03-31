package mazenetday12;
import java.util.*;

class Attendance extends Thread{
    
int[] ar;
int l;
static int c=0;
static int cc=0;
Attendance(int[] ar){
    this.ar=ar;
    this.l=ar.length;
}
public void run(){
    cc=cc+1;
    String tn=Thread.currentThread().getName();
    if(tn.equals("Thread-0")){
        for(int i=0;i<l/2;i++){
            if(ar[i]==100){
                c=c+1;
            }
        }
    }
    else{
        for(int i=l/2;i<l;i++){
            if(ar[i]==100){
                c=c+1;
            }
        }
    }
    if(cc==2){
        System.out.println("Winners : "+c);
    }
}
}

class Program5{
public static void main(String[ ] args){
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] ar=new int[n];
    
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    
    Thread t1=new Attendance(ar);
    Thread t2=new Attendance(ar);
    
    t1.start();
    t2.start();
}
}