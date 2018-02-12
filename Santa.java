import java.util.*;
import java.text.*;
//import java.util.LocalDate;

public class Santa {
	
	static String iFirstName, iLastName, iToy1, iToy2, iPrice1, iPrice2;
	static double cPrice1, cPrice2, cSubTotal, cSaleTax, cTotalbill;
		
	static Scanner scanner;
	static Date today;
	static SimpleDateFormat DF1, DF2;
	static DecimalFormat df1, df2;

	public static void main(String [] args) {
		init();
		input();
		calcs();
		output();
	}
	public static void init(){
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\r\n");
		
	//	dfInt3 = new DecimalFormat("##0");
		df1 = new DecimalFormat ("$##0.00");
}

	public static void input() {
		System.out.println("Please enter your first name");
		iFirstName = scanner.next();
		//System.out.println(iFirstName);
		
		System.out.println("Please enter your last name");
		iLastName = scanner.next();
		//System.out.println(iLastName);
		
		System.out.println("Please enter your first toy");
		iToy1 = scanner.next();
		//System.out.println(iToy1);
		
		System.out.println("Please enter your second toy");
		iToy2 = scanner.next();
		//System.out.println(iToy2);
		
		System.out.println("Please enter your first price");
		iPrice1 = scanner.next();
		
		
		System.out.println("Please enter your second price");
		iPrice2 = scanner.next();
		
	}
	
	
	public static void calcs() {
		cPrice1 = Double.parseDouble(iPrice1);
		cPrice2 = Double.parseDouble(iPrice2);
		cSubTotal = cPrice1 + cPrice2;
		cSaleTax = cSubTotal * .07;
		cTotalbill = cSaleTax + cSubTotal;
		
	}
	
	
	public static void output () {
		today = new Date();
		DF1 = new SimpleDateFormat();
		DF2 = new SimpleDateFormat("MM/dd/yyyy");
		
		System.out.println("Date: " + DF2.format(today));
		System.out.println("Name: " + iFirstName + " " + iLastName);
		System.out.println(" ");
		System.out.println("Name of toy 1: " + iToy1);
		System.out.println(" ");
		System.out.println("Price of toy 1: " + df1.format(cPrice1));
		System.out.println(" ");
		System.out.println("Name of toy 2: " + iToy2);
		System.out.println(" ");
		System.out.println("Price of toy 2: " + df1.format(cPrice2));
		System.out.println(" ");
		System.out.println("Subtotal: " + df1.format(cSubTotal));
		System.out.println(" ");
		System.out.println("Sale tax: " + df1.format(cSaleTax));
		System.out.println(" ");
		System.out.println("Total bill: " + df1.format (cTotalbill));
		System.out.println(" ");
		
		System.out.println("Have a merry Christmas");
		
		}
	}

