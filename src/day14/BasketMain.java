package day14;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;


public class BasketMain {

	public static void main(String[] args) {
		BasketMain bm=new BasketMain();
		List<Basket> bstList=bm.createList();
		System.out.println("Highest quantity : "+ bm.getBasketWithHighestQuantity(bstList));
		System.out.println("Lowest quantity : "+ bm.getBasketWithLowestQuantity(bstList));
		System.out.println("Total quantity : "+ bm.totalQtyOfAllBaskets(bstList));

	}
	public int getBasketWithHighestQuantity(List<Basket> list) {
		OptionalInt  l1=list.stream().mapToInt(e -> e.getQty()).max();
		return l1.getAsInt();
	}
	
	public int getBasketWithLowestQuantity(List<Basket> list) {
		OptionalInt  l2=list.stream().mapToInt(e -> e.getQty()).min();
		return l2.getAsInt();
	}
	
	public int totalQtyOfAllBaskets(List<Basket> list) {
		int  l3=list.stream().mapToInt(Basket::getQty).sum();
		return l3;
	}
	private List<Basket> createList(){
		List<Basket> bst=Arrays.asList(new Basket(123456,6),
								new Basket(456789,10),
								new Basket(123789,12),
								new Basket(456123,5),
								new Basket(789456,9));
		
		
		return bst;
	}
	
}
