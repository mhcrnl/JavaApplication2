
//**************************************
// Name: Bubble Sort Program
// Description:In this article I would like to share with you one of the most common sorting algorithm used in computer science it is called bubble sort. Basically we use sorting to arrange the values in ascending or descending order. What our program does is to ask the user how many items to be sorted and then our program will ask the user to enter a series of values. After which our program will display the original values and it will display the ascending and descending order of values after it is processed by our program using bubble sort algorithm.
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

// bubble_sort.java
// Written By: Mr. Jake R. Pomperada, BSCS, MAED-IT
// August 5, 2015Wednesday
// Create a program that uses bubble sort algorithm with the following results.
//BUBBLE SORT PROGRAM
//How many values :6
//Enter value in item no.1: 540
//Enter value in item no.2: 313
//Enter value in item no.3: 741
//Enter value in item no.4: -456
//Enter value in item no.5: 600
//Enter value in item no.6: 341
//
//BEFORE SORTING
//540 313 741 -456 600 341 
//AFTER SORTING
//
//ASCENDING ORDER
//
// -456 313 341 540 600 741
//DESCENDING ORDER
//741 600 540 341 313 -456
//	 THANK YOU FOR USING THIS PROGRAM
import java.util.Scanner;



    class bubble_sort {
    	


        	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        	
        int items[] = null;
        	int values = 0;
        System.out.print("BUBBLE SORT PROGRAM");
        System.out.println();
        	System.out.print("How many values :");
        	values = scan.nextInt();
        items = new int[values];
        for(int i=0; i<values; i++)


            {
            System.out.print("Enter value in item no." + (i+1) + ": "); 
            items[i] = scan.nextInt();
        }
        System.out.println();
        	System.out.print("BEFORE SORTING");
        	System.out.println();	
        	for(int i=0; i<values; i++) 


            {
            		System.out.print(items[i] + " ");
            	 }


                	for(int i = 0; i < values; i++) {


                    	 for(int j = 1; j < (values-i); j++) {


                        	if(items[j-1] > items[j]) {
                        	 int temp = items[j-1];
                        items[j-1] = items[j];
                        		 items[j] = temp;
                        		}
                        	}
                        	}
                        System.out.println();
                        	System.out.println("AFTER SORTING");
                        System.out.println();
                        	System.out.println("ASCENDING ORDER");
                        System.out.println();
                        
                        	for(int i=0; i<values; i++) 


                            {
                            	 System.out.print(" " + items[i]);
                            	 }
                            System.out.println();	
                            	System.out.print("DESCENDING ORDER");
                            System.out.println();
                            	for(int i=values-1; i>=0; i--)


                                {
                                	System.out.print(" " + items[i]);
                                	}
                                System.out.println("\n\n");
                                System.out.print("\t THANK YOU FOR USING THIS PROGRAM"); 
                                System.out.println();	
                            }
                        }
		
