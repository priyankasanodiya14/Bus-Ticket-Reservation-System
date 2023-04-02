package com.Entities;

import java.io.BufferedReader;
import java.io.IOException;

public class Exit {
public int getDetails(String choice, int x, int y, int end, BufferedReader in, String yn, int i )  throws NumberFormatException, IOException{
	if(choice.equals("5")){
		end=1;
		x=0;
		System.out.println("Thank You For Booking!");
	}

	else{
		System.out.println("Invalid Input!");
		x=1;
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

i=4;

{
System.out.println("\nInvalid user or password!\n");
i++;
}
return i;

}

public int getDetails(Object choice, int x, int y, int end, BufferedReader in, String yn, int i) {
	// TODO Auto-generated method stub
	return 0;
}
}





