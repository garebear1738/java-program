//Santas Little Helper
//Robert Aszman
//11-30-2017

import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DecimalFormat;

   


public class SantaLittleHelper {
	//Global Variable Definitions
	static String iChildFirstName;
	static String iChildLastName;
	static Scanner scanner;
	static String iToyName1;
	static String iToyName2;
	static String iToyPrice1;
	static String iToyPrice2;
	static String iDate;
	static String iAge;
	static String iDiscountIN;
	static double cToyPrice1;
	static double cToyPrice2;
	static double cSubtotal;
	static double cTax;
	static double cTotal;
	static double cDiscountIN;
	static double cSubtotalOut, cDiscount;
	static String oTax;
	static String oTotal;
	static String oSubtotal;
	static String oDiscount;
	static DecimalFormat dfTax, dfTotal, dfSubtotal, dfDiscount;
	
//getting current date and time using Date class
   static  DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    static  Date dateobj = new Date();
	
	
	public static void main(String[] args){
		
		init();
		input();
		calcs();
		output();	
	}
	public static void init() {
 		dfTotal = new DecimalFormat("###.00");
		dfTax = new DecimalFormat("###.00");
		dfSubtotal = new DecimalFormat("###.00");
		dfDiscount = new DecimalFormat("###.00");
       
 		scanner = new Scanner(System.in);
 		scanner.useDelimiter("\r\n");
  	}

	public static void input(){
		System.out.println("Please Enter The Childs First Name");
		iChildFirstName = scanner.next();
		System.out.println("Please Enter The Childs Last Name");
		iChildLastName = scanner.next();
		System.out.println("Please Enter The Childs Age");
		iAge = scanner.next();
		System.out.println("Please Enter The Name Of The First Toy");
		iToyName1 = scanner.next();
		System.out.println("Please Enter The Price Of The First Toy");
		iToyPrice1 = scanner.next();
		try {
 			cToyPrice1 = Double.parseDouble(iToyPrice1);
 		}	
 		catch (Exception e) {
 			System.out.println("Invalid First Toy Price Entered. Toy Price assigned a value of 0");
 			cToyPrice1 = 0;
 		}
		//cToyPrice1 = Double.parseDouble(iToyPrice1);	
		System.out.println("Please Enter The Name Of The Second Toy");
		iToyName2 = scanner.next();
		System.out.println("Please Enter The Price Of The Second Toy");
		iToyPrice2 = scanner.next();
		try {
 			cToyPrice2 = Double.parseDouble(iToyPrice2);
 		}	
 		catch (Exception e) {
 			System.out.println("Invalid Second Toy Price Entered. Toy Price assigned a value of 0");
 			cToyPrice2 = 0;
 		}
		//cToyPrice2 = Double.parseDouble(iToyPrice2);
		System.out.println("Please Enter The Discount In This Format. '0.00'");
		iDiscountIN = scanner.next();
		try	{
			cDiscountIN = Double.parseDouble(iDiscountIN);	
		}
		catch  (Exception e) {
			System.out.println("Invalid Discount Entered. Discount Defaulted to 0.");
			cDiscountIN = 0;
		}
	}
	public static void calcs(){
		cSubtotal = cToyPrice1 + cToyPrice2;
		cDiscount = cSubtotal * cDiscountIN;
		cSubtotalOut = cSubtotal - cDiscount;
		cTax = cSubtotalOut * 0.07;
		cTotal = cSubtotalOut + cTax;
		
	}
	public static void output(){
		oTotal = dfTotal.format(cTotal);
		oTax = dfTax.format(cTax);
		oDiscount = dfDiscount.format(cDiscount);
		oSubtotal = dfSubtotal.format(cSubtotal);
		System.out.println();
		System.out.println("Date:			" + df.format(dateobj));  /*System.out.println(df.format(dateobj));*/
		System.out.println("Name:			" + iChildFirstName + " " + iChildLastName );
		System.out.println(iToyName1 + "			" + "$" + iToyPrice1);
		System.out.println(iToyName2 + "			" + "$" + iToyPrice2);
		System.out.println("Subtotal:		" + "$" + oSubtotal);
		System.out.println("Discount:		" + "$" + oDiscount);
		System.out.println("Sales Tax(7%):		" + "$" + oTax);
		System.out.println("Total:			" + "$" + oTotal);
		System.out.println();
		System.out.println("	Merry Christmas!		");
		System.out.println(); 
	}	
}
