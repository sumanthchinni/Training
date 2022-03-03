package day12;


import java.util.Scanner;
class Main {
	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of Shirts to order:");
	        int shirts = sc.nextInt();
	        System.out.println("Enter the number of Trousers to order:\n");
	        int trousers=sc.nextInt();
	        int price,netpay,total;
	        double discount=0.00;
	        System.out.println("Item 		 Quantity 	  Price 	  Total");
	        System.out.println("-------------------------------------------------------------");
	        System.out.println("Shirts 		 "+shirts+" 		  300 		  "+shirts*300+" ");
	        System.out.println("Trousers 	 "+trousers+" 		   700 		  "+trousers*700+" ");
	        
	        price=(shirts*300)+(trousers*700);
	        if (price>3000){
	            discount=price/10;
	        }
	        
	        total=(int) (price-(discount));
	        netpay=total/10;
	        System.out.println("Discount 	  		  		  "+String.format("%.2f",discount)+" ");
	        System.out.println("-------------------------------------------------------------");
	        System.out.println("Net Total 	  		  		  "+String.format("%.2f",total)+" ");
	        System.out.println("-------------------------------------------------------------");
	        System.out.println("Points Earned 	  "+netpay+" ");
	        System.out.println("Thank you!");
	        
	    }
        
    }
	
