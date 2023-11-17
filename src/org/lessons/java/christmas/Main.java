package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List <Gift> wishlist= new ArrayList<>();
		
		do {
			
			System.out.println("inserisci per chi è il regalo ?");
			String person = in.nextLine();
			
			System.out.println("inserisci il regalo da comprare?");
			String gift = in.nextLine();
			Gift entry = new Gift(person, gift);
			wishlist.add(entry);
			
			System.out.println("hai aggiunto " + entry);
			
			System.out.println("vuoi aggiungere un altro regalo? (y/n)");
			String strChoice = in.nextLine().toLowerCase();
			boolean choice = strChoice.equals("y")? true : false;
			
			if (choice) continue;
			else break;
			
		}while(true);
		
//		**BONUS**
		
		System.out.println("come vuoi ordinare la lista?\n1.per persona\n2.per regalo");
		
		String strOrderingChoice = in.nextLine();
		int orderingChoice = Integer.valueOf(strOrderingChoice);
		
		if(orderingChoice == 1) wishlist.sort( Comparator.comparing(regalo->regalo.person));
		
		else if(orderingChoice == 2)wishlist.sort( Comparator.comparing(regalo->regalo.person));
		
		
		
		System.out.println("----------\n" + wishlist);
	}

}
