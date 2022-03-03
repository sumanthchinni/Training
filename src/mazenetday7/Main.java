package mazenetday7;

import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc;
        try{
            sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            
           
        }catch(ArithmeticException e){
                System.out.println(e.getMessage());
        }
    }
}
