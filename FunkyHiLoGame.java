package com.funkygames.funkyhilo;

import java.util.Scanner;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.Result;
import com.funkygames.funkyhilo.model.Card;
import com.funkygames.funkyhilo.model.Dealer;

public class FunkyHiLoGame {

	public static void main(String[] args) {
		// 1 Create Dealer
		Dealer dealer = new Dealer();

		// 2.Deal the first card
		Card firstCard = dealer.deal();

		// 2.1 Display the first card to the user
		System.out.println("First Card: " + firstCard);

		// 3.Prompt the player for their choice
		System.out.println("Is the next card Hi or Lo?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.println("user entered: " + input);

		Choice playerChoice = Choice.valueOf(input); 

		// 4.Deal the second card

		Card secondCard = dealer.deal();

		System.out.println("First Card: " + secondCard);

		// 5.Decide the outcome
		//if secondCard.compareTo(firstCard) > 0 then outcome is HI else LO
		Choice gameOutcome = null;
		if(firstCard.compareTo(secondCard) > 0)
		{
			gameOutcome = Choice.HI;
		}else{
			gameOutcome = Choice.LO;
		}
		
		Result result = null;
		if (playerChoice == gameOutcome){
			result = Result.WON;
			
		}else{
			result = Result.LOST;
			
		}
		
		System.out.println("You " + result +"!");
	}

}
