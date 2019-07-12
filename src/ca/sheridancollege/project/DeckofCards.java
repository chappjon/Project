/**
 * -SYST 17796 Project - UNO card game.
 * @author Xiaohong, Seo, Jonathon, Muhammad , 07 12 2019 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * a class that models the cards on deck.
 * A Card hand has an array of cards. 
 * the size of the hand is 60.
 * @author Xiaohong, Seo, Jonathon, Muhammad , 07 12 2019
 */
public class DeckofCards {

        private int CardsSize = 60;
	public Cards[] cards = new Cards[CardsSize];

	
        /**
         * Use foreach loop to load the cards array with one of 
         * each card in a standard card deck(one of each card value 
         * with each suit.
         */
        public void generateCards()
        {
                int countCards = 0;
		for(Cards.Color c: Cards.Color.values())
                {
                    for(Cards.Value v: Cards.Value.values())
                    {
                        cards[countCards] = (new Cards(c,v));
                        countCards++;
                    }
                }//end outter for
        }//end method
        
        /**
         * shuffle the deck
         */
        public void shuffle() {
        
        }

}