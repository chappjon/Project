/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Xiaohong Deng
 */
public class HumanPlayer extends Player{
    public HumanPlayer(String name) {
        super(name);
    }
    
    @Override
    public void play(){
    }
    
    public Cards play(int cardOrder, Cards matchCard){
        
        if (matchCard==null) return this.getHand().cards.remove(cardOrder);
        if (this.getHand().cards.get(cardOrder).match(matchCard)) return this.getHand().cards.remove(cardOrder);
        return null;    
    }
    public String toString() {
        String result="";
        return result;
    }
}
