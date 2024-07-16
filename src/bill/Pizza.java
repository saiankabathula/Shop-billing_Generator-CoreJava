package bill;
import java.util.Scanner;
public class Pizza
{
	protected int price;
	private Boolean veg;
	private Boolean delux;
	private Boolean fries;
	private Boolean wings;
	
	protected int extraCheesePrice=100;
	protected int extraToppingsPrice=150;
	protected int extraSaucePrice=30;
	protected int bagPackPrice=20;
	
	protected int itemPrice;
	
	private boolean extraCheeseAdded=false;
	private boolean extraToppingsAdded=false;
	private boolean extraSauceAdd;
	private boolean bagForTakeaway=false;
	
	Scanner sc=new Scanner(System.in);
	
	public void  normalPizza(Boolean veg)
	{
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		itemPrice = this.price;
	}
	

	public void deluxPizza(Boolean delux)
	{
		this.delux=delux;
		if(this.delux) {
			this.price=550;
		}else {
			this.price=650;
		}
		itemPrice=this.price;
	}
	
	public void frenchFries(Boolean fries)
	{
		this.price=100;
		itemPrice=this.price;
	}
	
	public void chickenWings(Boolean wings)
	{
		this.price=250;
		itemPrice=this.price;
	}
	
	public void addExtraCheese()
	{
		System.out.print("Do you Want Extra Cheese(y/n) :");
		char ch=Character.toLowerCase(sc.next().charAt(0));
		switch(ch)
		{
		case ('y'):{
			extraCheeseAdded=true;
			this.price +=extraCheesePrice;
			break;
			}
		case ('n'):{
			extraCheeseAdded=false;
			break;
			}
		default:{
			System.out.println("\t Sorry,Wrong Choose.... Only (y/n). Enter Again!!! \t");
			Pizza.this.addExtraCheese();	//Wrong Choose. Recall the Method
			break;
			}
		}
	}
		
	public void addExtraToppings()
	{
		System.out.print("Do you Want Extra Toppings(y/n) :");
		char ch=Character.toLowerCase(sc.next().charAt(0));
		switch(ch)
		{
		case ('y'):
		{
			extraToppingsAdded=true;
			this.price +=extraToppingsPrice;
			break;
		}
		case ('n'):
		{
			extraToppingsAdded=false;
			break;
		}
		default:{
			System.out.println("\t Sorry,Wrong Choose... Only (y/n). Enter Again!!! \t");
			Pizza.this.addExtraToppings();	//Wrong Choose. Recall the Method
			break;
			}
		} 
	}
	public void addSauce()
	{
		System.out.print("Do you Want Sauce(y/n) :");
		char ch=Character.toLowerCase(sc.next().charAt(0));
		switch(ch)
		{
		case ('y'):
		{
			extraSauceAdd=true;
			this.price +=extraSaucePrice;
			break;
		}
		case ('n'):
		{
			extraSauceAdd=false;
			break;
		}
		default:
		{
			System.out.println("\t Sorry,Wrong Choose... Only (y/n). Enter Again!!! \t");
			Pizza.this.addSauce();//Wrong Choose. Recall the Method
			break;
		}
		}
	}
	
	public void takeaway()
	{
		System.out.print("Do you Want Takeaway(y/n) :");
		char ch=Character.toLowerCase(sc.next().charAt(0));
		switch(ch)
		{
		case ('y'):
		{
			bagForTakeaway=true;
			this.price +=bagPackPrice;
			break;
		}
		case ('n'):
		{
			bagForTakeaway=false;
			break;
		}
		default:{
			System.out.println("\t Sorry,Wrong Choose...  Only (y/n). Enter Again!!! \t");
			Pizza.this.takeaway();	//Wrong Choose. Recall the Method
			break;
			}
		} 
	}
	
	public void getBill()
	{
		String bill="";
		System.out.println("Pizza :"+itemPrice);
		
		if(extraCheeseAdded) {
			bill +="Extra Cheese :"+extraCheesePrice+"\n";
		}
		if(extraToppingsAdded) {
			bill +="Extra Toppings :"+extraToppingsPrice+"\n";
		}
		if(extraSauceAdd) {
			bill +="Extra Sauce :"+extraSaucePrice+"\n";
		}
		if(bagForTakeaway) {
			bill +="Take away :"+bagPackPrice+"\n";
		}
		bill +="\nTotal Amount :"+this.price+"\n";
		
		System.out.println(bill);
		System.out.println("\n Completed The Order, Thank You...");
		System.out.println("******************************************************************************************************************************************************");
	}
}
