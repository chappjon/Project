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
public class MachinePlayer extends Player {

    public MachinePlayer(String name) {
        super(name);
    }
    
    @Override
    public void play(){
    }
    
    public Cards play(Cards matchCard){
        for (int i = 0; i < this.getHand().cards.size(); i++) {
          if (this.getHand().cards.get(i).match(matchCard)) return this.getHand().cards.remove(i);
        }
        return null;
    }
    
    public String toString() {
        String result="";
        return result;
    }
    
}
