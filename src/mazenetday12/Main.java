package mazenetday12;

import java.util.*;

class Freq extends Thread{
	char[] ar;

	Freq(char[] ar){
		this.ar=ar;
	}

@Override
public void run(){
    System.out.println();
    for(int i=0;i<ar.length;i++){
        int c=1;
        for(int j=i+1;j<ar.length;j++){
            if(ar[i]==ar[j] && ar[i]!='0'){
                c=c+1;
                ar[j]='0';
            }
        }
        if(c>0 && ar[i]!='0'){
            System.out.print(ar[i]);
            System.out.println(c);
        }
    }
}
}

class Main{
public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    for(int i=0;i<n;i++){
        String s=sc.next();
        char[] ch=s.toCharArray();
    
        Thread t=new Freq(ch);
        t.start();
    }
    
}
}