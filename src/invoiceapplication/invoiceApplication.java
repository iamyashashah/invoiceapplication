package invoiceapplication;
import java.util.Scanner;
import java.util.Date;


public class invoiceApplication {
	static Scanner sc = new Scanner(System.in);
	static double [] taxrate = new double[100];
	static double [] prices = new double[100];
	static double [] totalitem = new double[100];
	static double noOfitem;

	public static void main(String[] args) {

		System.out.println("Welcom to invoice Application");
		for (int i=0;i<totalitem.length;i++)
		{
			totalitem[i]=0;
		}
		bill();
	}

	public static void bill ()
	{
		double taxrate;
		double price;
		int i = 0;


		double subtotal = 0, taxamount = 0, grandtotal = 0;
		date();

		System.out.println("Enter the number of item purchased : ");
		noOfitem=sc.nextDouble();
		while (noOfitem > 0)
		{

		for (i = 0 ; i < noOfitem ; i++)
		{
			System.out.println("enter the price of item :");
			price = sc.nextDouble();
			prices [i] = price;
			subtotal += prices[i];
			
		}
		

			System.out.println("enter the tax rate :");
			taxrate = sc.nextDouble();
			taxamount = ((subtotal * taxrate)/100);

			grandtotal = subtotal + taxamount;

			System.out.println("-----Receipt-----");
			for (i = 0; i < noOfitem; i++)
			{
				System.out.println(" " + prices[i]); 
			}
			System.out.println("sub total = " + subtotal);
			System.out.println("tax amount : " + taxamount);
			System.out.println("grand total:  " + grandtotal);
			break;

	}
}
	

	public static void date () {
		// Instantiate a Date object
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());
	}

}
