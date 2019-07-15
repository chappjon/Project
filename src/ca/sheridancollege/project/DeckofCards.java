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

    public ArrayList<Cards> cards = new ArrayList();


    /**
     * Use foreach loop to load the cards array with one of 
     * each card in a standard card deck(one of each card value 
     * with each suit.
     */
    public void generateSet()
    {
        for(Cards.Color c: Cards.Color.values())
            for(Cards.Value v: Cards.Value.values())
                cards.add(new Cards(c,v));  
        //end outter for
    }//end method
        
    public String toString() {
        String result="";
        for (Cards card: cards) result+=card.toString()+ "|";
        return result;
    }
    
    public Cards getTop() {
        if (cards.size()==0) return null;
        else 
            for (int i = cards.size()-1; i >=0; i--) {
 
                if (!cards.get(i).getValue().equals(Cards.Value.DRAWFOUR) 
                        && !cards.get(i).getValue().equals(Cards.Value.DRAWTWO)
                        && !cards.get(i).getValue().equals(Cards.Value.REVERSE)
                        && !cards.get(i).getValue().equals(Cards.Value.WILDCARD)
                        && !cards.get(i).getValue().equals(Cards.Value.SKIP)
                        )
                    return cards.get(i);            
            }
            
        return null;           

    }
    
}