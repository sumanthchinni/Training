package mazenetday9;

import java.util.Scanner;
class Program10
{
 public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     
     Restaurant r = new Restaurant();
     
     try {
         r.order(s);
     }catch(Exception e) {
         System.out.println(e.getMessage());
     }finally {
         System.out.println("Bye");
         sc.close();
     }
 }
}

class Restaurant {

    public void order(String dish) throws Exception {
    	int randNo = (int) Math.round(Math.random()); // It will print O and 1.
    	boolean isDishAvailable = true;
    	
    	if(randNo == 0) {
    		isDishAvailable = false;
            throw new Exception("DishNotAvailable");
        }else {
        	System.out.println("Available!");
        }
    }
}