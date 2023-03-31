package com.Default;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.Entities.BusDestinationDetails;
import com.Entities.Exit;
import com.Entities.PassengerInfo;
import com.Entities.TransactionDetails;
import com.Entities.View;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
	    String user,password,yn = null,search = null,again = null,choice;
	    int to=0,y=1,z=0,end=0,r=1;
	    int available[] = new int[6];
	    int ticketI[][] = new int [100][3];
	    String ticketS[][] = new String[100][3];
	    double ticketD[][] = new double [100][3];
	    double pay[] = new double[20];
	    double change[] = new double[20];
	    
	    for(int i=1;i<4;){
			System.out.print("Enter Username: ");
			user = in.readLine();
			System.out.print("Enter Password: ");
			password = in.readLine();
	    
	    	//"available[]" is the SEAT AVAILABLE//
			//store 20 seats every destination [1-5]//
	    	for(int o=1; o<=5; o++){
	    		available[o]=20;
	  		}
	    
	    	//if user and password are correct proceed to MAIN MENU//
	    	if(user.equals("1234") && password.equals("1234")){
	    	
	    		for(int x=1; x==1;){
	    			//the MAIN MENU//
	    			System.out.println("------------------------------------------");
	    			System.out.println(" BUS RESERVATION AND TICKETING SYSTEM   ");
	    			System.out.println("------------------------------------------");
	    			System.out.println(" [1] BusDestination                   ");
	    			System.out.println(" [2] PassengersInfo                    ");
	    			System.out.println(" [3] TransactionDetails                      ");
	    			System.out.println(" [4] View                          ");
	    			System.out.println(" [5] Exit                          ");
	    			System.out.println("------------------------------------------");
	    			System.out.println("------------------------------------------\n");
	    	
	    			for(x=1; x==1;){
						System.out.print("ENTER CHOICE: ");
						choice=in.readLine();
						
						//if CHOICE is "1" display the DESTINATION//
						if (choice.equals("1")){
							//the DESTINATION DETAILS//
							//display the "Destination", every destination "Fare", and the "Seat" available//
							BusDestinationDetails busDestinationDetails = new BusDestinationDetails();
							x=busDestinationDetails.getDetails(available);
						}
						
						//if CHOICE is "2" proceed to Ticket Booking//
						else if (choice.equals("2")){
							PassengerInfo passengerInfo = new PassengerInfo();
							x=passengerInfo.getDetails(available, in, ticketI, ticketS, ticketD, z, to);
						}
						
						else if (choice.equals("3")){
							TransactionDetails transactionDetails = new TransactionDetails();
							x= transactionDetails.getDetails(ticketI, ticketS, ticketD, search, in, z, change, again, pay);
							
						}
						
						else if (choice.equals("4")){
							
							View view = new View();
							x=view.getDetails(pay, change, search, in, z, ticketI, ticketS, ticketD);
						}		
						
						else if(choice.equals("5")){
							Exit exit = new Exit();
							x=exit.getDetails(choice, x, y, end, in, yn, i);
							
						}
					
						else{
							System.out.println("Invalid Input!");
							x=1;
						}
	    			}
	    	
	    			for(y=1; y==1;){
	    				if(end==1){
	    					break;
	    				}
	    				System.out.print("Do you want another transaction? [Y/N]: ");
	   				 	yn = in.readLine();
	    	
	    				if (yn.equalsIgnoreCase("y")){
	    					x=1;
	    					y=0;
	    				}
	    				else if (yn.equalsIgnoreCase("n")){
	    					System.out.println("\nThank You!!!");
	    					break;
	    				}
	    				else{
	    					System.out.println("Invalid Input!!!");
	    					y=1;
	    				}
	    			}
	    		}
	    		i=4;
	    	}
	    	else{
	    		System.out.println("\nInvalid user or password!\n");
	    		i++;
			}
		
	    }
		

	}

}
