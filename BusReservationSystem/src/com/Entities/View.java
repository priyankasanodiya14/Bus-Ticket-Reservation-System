package com.Entities;

import java.io.BufferedReader;
import java.io.IOException;

public class View {
public int getDetails(double pay[], double change[],String search,BufferedReader in, int z, int ticketI[][], String ticketS[][],double ticketD[][]) throws IOException {

	for(int sx=1; sx<=3;){
		System.out.print("SEARCH PASSENGER'S NAME: ");
	search = in.readLine();

	   	int s=1;
		for(int x=0; x<=z; x++){
			if(search.equalsIgnoreCase(ticketS[x][0])){
				System.out.println("***************************************");
				System.out.println("**        PASSENGER'S DETAILS        **");
				System.out.println("***************************************");
				System.out.println("PASSENGER'S NAME: " + ticketS[x][0]);
				System.out.println("PASSENGER'S DESTINATION : " + ticketS[x][1]);
				System.out.println("FARE PRICE: Php" + ticketD[x][0]);
				System.out.println("NO. OF PASSENGERS: " + ticketI[x][0]);
				System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
				System.out.println("TOTAL FARE PRICE: Php " + ticketD[x][2]);
				if(ticketS[x][2].equals("x")){
					System.out.println("PAY: Php " +pay[x]);
					System.out.println("CHANGE: Php " +change[x]);
					System.out.println("STATUS: PAID");
				}
				else{
					System.out.println("STATUS: NOT PAID");
				}
				System.out.println("***************************************");
				System.out.println("***************************************");
				s=0;
			    sx=4;
			}
		}	
	
		
		if (s==1){
			System.out.println("Passenger's Name not found!");
			sx++;
		}
		
	}
	return z;
}
}

