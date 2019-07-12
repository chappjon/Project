/**
 * -SYST 17796 Project - UNO card game.
 * @author Xiaohong, Seo, Jonathon, Muhammad , 07 12 2019 * 
 */
package ca.sheridancollege.project;

/**
 * A class to model cards. Cards have a value(ZERO,ONE,TWO,THREE,FOUR, 
 * FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAWTWO,DRAWFOUR,WILDCARD) and a suit
 * (RED,YELLOW,GREEN,BLUE). There are 60 cards in a deck. This code has high
 * cohesion - the ability of a class to do one thing well, which make programmer
 * to use it as a standard deck of Uno cards. 
 * Make the Suit/Value type an Enumerated type which are easy to 
 * compare and add a layer of coupling if we want to change them.
 *  
 * @author Xiaohong, Seo, Jonathon, Muhammad, 2019
 */
public class Cards {
    /**
    * make the Suit type an Enumerated type which are easy to compare and 
    * add a layer of coupling if we want to change them.
    */ 
    public enum Color {RED, YELLOW, GREEN, BLUE};

    /**
     * make the Value type an Enumerated type which are easy to compare and 
     * add a layer of coupling if we want to change them.
     */ 
    public enum Value{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
    private final Color color;
    private final Value value;

    /**
     * Constructs a Card with a specific s and v
     * 
     * @param c, this Card's color.
     * @param v, this Card's value.
     */ 
    public Cards(Color c, Value v)
    {
       this.color = c;
       this.value = v;
    }

    /**
     * @return the value
     */
    public Value getValue() {
            return this.value;
    }

    /**
     * @return the suit
    */
    public Color getColor() {
            return this.color;
    }
}