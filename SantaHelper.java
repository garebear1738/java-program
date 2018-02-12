/**
 * this program will demonstrate how to display data on the
 * screen and how to accept data from user
 *
 * @Michael Berryhill
 * @version 1.00 2017/11/29
 */
 import java.text.*;
 import java.util.*;

public class SantaHelper {
	
	//Global Definitions
    static String iName1, iName2, iToy1, iToy2, oToyCost1, oToyCost2, oCost, oTotal, oTax;
    static Double iToyCost1, iToyCost2, cost, total, tax = .07;
    static int iAge;
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat dfDouble3v2;
	static Date today = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy\thh:mm a");
    
    public static void main(String[] agr){
		init();
		input();
		calc();
    	output();
    	
    }
    public static void space(String x){
    	int y;
    	y = x.length();
    	if(y <= 9){
    		System.out.print("\t\t");
    	}else if(( 9 < y)&&(y <= 20)){
    		System.out.print("\t");
    	}
    }
    public static void init(){
    	scan.useDelimiter("\r\n");
    	dfDouble3v2 = new DecimalFormat("###.00");
    	
    }
    
    public static void calc(){
    	cost = iToyCost1 + iToyCost2;
    	total = cost*(tax+1);
    	
    	
    }
    
    public static void input(){
    	System.out.println("Please enter your  first name");
    	iName1 = scan.next();
    	System.out.println("Please enter your  last name");
    	iName2 = scan.next();
    	System.out.println("Please enter your age");
    	iAge = Integer.parseInt(scan.next());
    	System.out.println("Please enter the name or the first toy");
    	iToy1 = scan.next();
    	System.out.println("Please enter the price of the toy");
    	try{
    		iToyCost1 = Double.parseDouble(scan.next());
    	}
    	catch (Exception e){
 			System.out.println("Invalid Price Entered. Price assigned a value of 1");
 			iToyCost1 = 1.0;
 		}
    	System.out.println("Please enter the name of the secound toy");
    	iToy2 = scan.next();
    	System.out.println("Please enter the price of the toy");
    	try{
    		iToyCost2 = Double.parseDouble(scan.next());
    	}
    	catch (Exception e){
 			System.out.println("Invalid Price Entered. Price assigned a value of 1");
 			iToyCost2 = 1.0;
 		}
    }
    
    public static void output(){
    	/*oToyCost1 = ;
    	oToyCost2 = ;
    	oCost = ;
    	oTax = ;
    	oTotal = ;*/
    	System.out.print( "\n\n" +sdf.format(today) +
    						"\nName:\t\t" + iName1 + " " + iName2 + "\n" +
    						"Age: \t\t" + iAge + "\n" +
    						"\tPrices\n" + iToy1 + ":");
    	space(iToy1);
    	System.out.print("$" + dfDouble3v2.format(iToyCost1) + "\n" + iToy2 + ":");
    	space(iToy2);
    	System.out.print("$" + dfDouble3v2.format(iToyCost2));
    	System.out.print("\nSubtotal:\t$"+ dfDouble3v2.format(cost) +
    					   "\nTax:\t\t$" + dfDouble3v2.format(cost * tax)+
    					   "\nTotal:\t\t$" + dfDouble3v2.format(total));
 		System.out.print("\nHave a Merry Christmas");
    }
}