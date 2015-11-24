package com.funkygames.funkyhilo.model;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import com.funkygames.funkyhilo.constants.Rank;
import com.funkygames.funkyhilo.constants.Suit;
import com.funkygames.funkyhilo.exceptions.NoMoreCardsInDeckException;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		cards = CardFactory.createCardList();
		shuffle();
	}
	
	

	public Card drawCard() throws NoMoreCardsInDeckException {
		// check if not empty
		if (cards.size() > 0) {
			//we remove the topmost card
			Card card = cards.remove(0);
			
			//we return card
			return card;	
		} else {
			// if deck is empty throw an exception
			throw new NoMoreCardsInDeckException();
		}
	}

	public static void main(String args[]) {
		Deck deck = new Deck();
		Card card = null;
		try {
			deck.drawCard();
		} catch (NoMoreCardsInDeckException e) {
			System.out.println(e.getMessage());
			System.out.print("exiting program");
			deck = new Deck();
			try {
				card = deck.drawCard();
			} catch (NoMoreCardsInDeckException e1) {
				// ignore as i know this works
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

}
