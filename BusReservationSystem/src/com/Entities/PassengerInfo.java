package com.Entities;

import java.io.BufferedReader;
import java.io.IOException;

public class PassengerInfo {
 public int getDetails(int[] available, BufferedReader in,int ticketI[][], String ticketS[][], double ticketD[][], int z, int to) throws NumberFormatException, IOException {
	 int print=1;
	int x=1;	
		
		
		//display first the Destination Details//
		System.out.println("***************************************");
		System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
		System.out.println("***************************************");
		System.out.println("** 1.)DAVAO CITY   | Php600 |   "+available[1]+"   **");
		System.out.println("** 2.)BUTUAN CITY  | Php170 |   "+available[2]+"   **");
		System.out.println("** 3.)CABADBARAN   | Php150 |   "+available[3]+"   **");
		System.out.println("** 4.)TANDAG       | Php200 |   "+available[4]+"   **");
		System.out.println("** 5.)CAGAYAN      | Php250 |   "+available[5]+"   **");
		System.out.println("***************************************");
		System.out.println("***************************************\n");
		System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 20% DISCOUNT!!!\n");
		
		if((available[1]==0)&&(available[2]==0)&&(available[3]==0)&&(available[4]==0)&&(available[5]==0)){
			System.out.println("Sorry, We don't  have available seats for all Destination!");
			x=0;
			
		}
		
		
		
		//inputing of Passenger's Name//
		else{
		for(x=1; x==1;){
			System.out.print("\nENTER PASSENGER'S NAME: ");
			ticketS[z][0] = in.readLine();
			
			x=0;
			
			//if Passenger's Name already used, display error and go back to Inputing//
			for(int l=0; l<z; l++){
				if(ticketS[l][0].equalsIgnoreCase(ticketS[z][0])){
					System.out.println("Sorry, Passenger's name have already used!");
					x=1;
				}
			}
		}
		
		//inputing of Destination//
		//integers Only [1-5]//
		
		for(x=1; x==1;){
			System.out.print("ENTER DESTINATION [number]: ");
			to = Integer.parseInt(in.readLine());
			
			//if Inputed integers are "<1" or ">5", display error and go back to Inputing//
			if(to<1 || to>5){
				System.out.println("Invalid Input!");
				x=1;
			}
			//if available seat is equal to "Zero", display error and go back to Inputing//
			for(int d=1; d<=5; d++){
				if(to==d){
					if(available[to]==0){
						System.out.println("Sorry, We don't have available seat!");
						x=1;
					}
					x=0;
				}
			}
		}
		
		//convert the integer to string//
		String dest[] = { " ", "DAVAO CITY", "BUTUAN CITY", "CABADBARAN", "TANDAG", "CAGAYAN"};
		double fare[] = { 0,600,170,150,200,250};

		//converted integer to string, transfer to storage array//
		ticketS[z][1] = dest[to];
		ticketD[z][0] = fare[to];
		
		//inputing for Number of Passenger's//
		for(x=1; x==1;){
		System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
		ticketI[z][0] = Integer.parseInt(in.readLine());

			//subtract the available seat by the the number inputed//
			for(int p=1; p<=5; p++){
				if(to==p){
					print=1;
					available[to] = available[to]-ticketI[z][0];
					
					//if the subtracted available seat is "<0", display error//
					//add the inputed number to the subtracted seat, to back the original seat//
					//display the available seat and back to the inputing//
					if(available[to]<0){
						System.out.print("Sorry, We don't have seat available for " +ticketI[z][0] +" person\n");
						available[to] = available[to]+ticketI[z][0];
						System.out.print("We only have " +available[to] +" seat available\n");
						x=1;
						print=0;
					}
					else{
						x=0;
					}
				}
			}

		}
		
		//inputing for Number of Discounted Passenger's//
		for(x=1;x==1;){
			System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
			ticketI[z][1] = Integer.parseInt(in.readLine());
		
			if(ticketI[z][1]>ticketI[z][0]){
				
				System.out.println("Invalid Input!");
				System.out.println("No. of Passengers are only " +ticketI[z][0] +"!");
			x=1;
			}
			else{
				break;
			}
		}


		//print out of passengers details....
		if(print==1){
			System.out.println("\n***************************************");
			System.out.println("**        PASSENGER'S DETAILS        **");
			System.out.println("***************************************");
			System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
			System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
			System.out.println("FARE PRICE: Php " + ticketD[z][0]);
			System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
			System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[z][1]);
			System.out.println("***************************************");
			System.out.println("***************************************\n");
			ticketS[z][2]="0";
			double discount=(ticketD[z][0]-(ticketD[z][0]*0.2))*ticketI[z][1];
			ticketD[z][2]= ((ticketI[z][0]-ticketI[z][1])*ticketD[z][0])+discount;
			x=0;
		}
		z++;
		}
		return x;

 }
}
 


