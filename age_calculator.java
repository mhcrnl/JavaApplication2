
//**************************************
// Name: Age Calculator
// Description:I have wrote a simple program that will ask the user its birth month, birth day and birth year and then the program will check and determine the present age of the user. The code uses calendar libraries in Java programming language.
//If you have some questions about programming, about my work please send mu an email at jakerpomperada@gmail.comand jakerpomperada@yahoo.com. People here in the Philippines can contact me at my mobile number 09173084360.
//Thank you very much and Happy Programming.
// By: Jake R. Pomperada
//
//
// Inputs:None
//
// Returns:None
//
//Assumes:None
//
//Side Effects:None
//**************************************

// age_calculator.java
// Programmer : Mr. Jake R. Pomperada, MAED-IT
// Date: July 30, 2015
// Tools : Netbeans 8.0.2
// Email : jakerpomperada@yahoo.com and jakerpomperada@gmail.com
// Write a program that will determine the age of the person.
import java.util.Scanner; 
import java.util.GregorianCalendar; 
import java.util.Calendar; 
public class age_calculator { 
private static int age_checker(int y, int m, int d) { 
Calendar cal = new GregorianCalendar(y, m, d); 
Calendar now = new GregorianCalendar(); 

int age_result = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR); 
if((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH)) 
|| (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) 
&& cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) 


    { 
    age_result--; 
} 
return age_result; 
} 
public static void main(String [] args) { 
Scanner input = new Scanner(System.in); 
char ch;


do {
int month=0,day=0,year=0;
System.out.println();
System.out.print("\t Age Checker Program ");
System.out.println("\n");
System.out.print("Enter Birth Month : "); 
month = input.nextInt();
System.out.print("Enter Birth Day: "); 
day = input.nextInt();
System.out.print("Enter Birth Year : "); 
year = input.nextInt();
System.out.println("Your present age is " 
+ age_checker(year,month,day)+ " years old.");
System.out.println();
System.out.print("\nDo you want to continue (Type y or n) : ");
ch = input.next().charAt(0);
} while (ch == 'Y'|| ch == 'y'); 
System.out.println();
System.out.print("\t THANK YOU FOR USING THIS PROGRAM");
System.out.println("\n\n");
}
}
		
