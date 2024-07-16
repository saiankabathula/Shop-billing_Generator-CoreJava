/* Package of this Project */
package bill;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static int foodCh1;
	static char customerCh1;
	static Scanner sc=new Scanner(System.in);
	
	public static void someFood()
	{
		System.out.print("\n\n Do You Want Some Another Food...(y/n): ");
	
		customerCh1=Character.toLowerCase(sc.next().charAt(0));
		if(!(customerCh1=='y' || customerCh1=='n'))
		{
			System.out.println("\n\t Sorry,Wrong Answer...  Only (y/n). Enter Again!!! \t");
			someFood();	//Wrong Choose. Recall the Method
		}
	}
public static void main(String[] args) 
	{
		System.out.println("\n\t\t\t\t******************** WELCOME TO PIZZAMANIA ********************\n");
		try{
		do
		{
			System.out.println("\n\t\t 1.Veg Pizza   2.Non-Veg Pizza   3.Delux Veg Pizza   4.Delux Non-Veg Pizza   5.French Fries   6.Chicken Wings(4 pcs)\n");
			System.out.print("\nPlease Select The Food(1 to 6) :");
			foodCh1=sc.nextInt();

			switch(foodCh1){
			case 1:
				System.out.println("Your Oder Is : Veg Pizza");
				Pizza vegPizza=new Pizza();
				vegPizza.normalPizza(true);
				vegPizza.addExtraCheese();
				vegPizza.addExtraToppings();
				vegPizza.takeaway();
				vegPizza.getBill();
				
				break;
			case 2:
				System.out.println("Your Oder Is : Non-Veg Pizza");
				Pizza nonVegPizza=new Pizza();
				nonVegPizza.normalPizza(false);
				nonVegPizza.addExtraCheese();
				nonVegPizza.addExtraToppings();
				nonVegPizza.takeaway();
				nonVegPizza.getBill();
				break;
			case 3:
				System.out.println("Your Oder Is : Delux Veg Pizza");
				Pizza vegDelux=new Pizza();
				vegDelux.deluxPizza(true);
				vegDelux.takeaway();
				vegDelux.getBill();
				break;
			case 4:
				System.out.println("Your Oder Is : Delux Non-Veg Pizza");
				Pizza nonVegDelux=new Pizza();
				nonVegDelux.deluxPizza(false);
				nonVegDelux.takeaway();
				nonVegDelux.getBill();
				break;
			case 5:
				System.out.println("Your Oder Is : French Fries");
				Pizza fries=new Pizza();
				fries.frenchFries(true);
				fries.addSauce();
				fries.getBill();
				break;
			case 6:
				System.out.println("Your Oder Is : Chicken Wings(4 pcs)");
				Pizza chicken=new Pizza();
				chicken.chickenWings(true);
				chicken.addSauce();
				chicken.getBill();
				break;
			default:
				System.out.println("\t Sorry,Wrong ChooseOnly (1 to 6). Enter Again!!! \t");
				break;
			}
			someFood();   //Extra Food Order...
		}while(customerCh1=='y');
		
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("\n\t\t\t *** Sorry, Invalid Input. \t*** Please Try Again ***");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.print("\n\t\t\t\t\t***  Thank You!!!  Visit Again...  ***");
	 }
}
