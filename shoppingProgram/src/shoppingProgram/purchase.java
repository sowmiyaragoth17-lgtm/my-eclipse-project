package shoppingProgram;
import java.util.Scanner;
public class purchase {
static Scanner obj=new Scanner(System.in); // creating scanner object
static int amount=1000, discount,total,shirtCount,t1,t2,tot;

void disPart() {        // method-1
	System.out.print("Enter the no of shirts: ");    // shirt count from the user
	shirtCount=obj.nextInt();
	if(shirtCount==4) {
		discount=(amount*10)/100;  // discount= (1000*10)/100 ==> 100 
		total=amount-discount;     // total= 1000-100=900
	System.out.println("10% discount amount is:"+discount);
	System.out.println("Total amount after discount is "+total); // Rs.900
} else {
	System.out.print("No discount appicable");
	}
}
void sekar() {      // method-2
	System.out.print("\nvoucher discount cost(4%): ");   // voucher discount amount--> 4% ==>(1000*4)/100 (Rs.40) 
	int voucher=obj.nextInt();
	System.out.print("Enter inhand cash for sekar: ");   // sekar inhand cash--> Rs.375 
	int cash1=obj.nextInt();                            
	 t1=cash1+voucher;     // total amount of sekar= 375+40 =>Rs.415
	System.out.println("Sekar total share is "+t1 );
}
void ram() {         // method-3
	System.out.print("Enter inhand cash for ram: ");  // Ram inhand cash--> Rs.470
	int cash2=obj.nextInt();
	System.out.print("Amount from mother: ");  // Rs.5
	int cash3=obj.nextInt();
	System.out.print("Amount from Auto driver: ");  // Rs.10
	int cash4=obj.nextInt();
    t2=cash2+cash3+cash4;        // total amount of ram= 470+5+10 ==>Rs.485
	System.out.print("Ram total share is "+t2);
}
void finalPayment() {       // method-4
	 tot=t1+t2;      // Final amount= 415+485 ==> 900
	System.out.println("\nTotal amount collected: "+tot);
	
}
public static void main(String[]args) {        // main method
	
	purchase dis=new purchase();
	dis.disPart();
	dis.sekar();
	dis.ram();
	dis.finalPayment();
	if (total<=tot) {
		System.out.print("\nThank you for purchasing");
	}else {
		System.out.print("Insufficient or excess amount");
	}
}


}
