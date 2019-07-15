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
public class Game {
    private Cards.Color gameColor=null;
    private int nextPlayer=0;
    private Player[] playerList;
    private int direction=1;

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Cards.Color getGameColor() {
        return gameColor;
    }

    public void setGameColor(Cards.Color gameColor) {
        this.gameColor = gameColor;
    }


    public int getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(int nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }




    
    public DeckofCards shuffle(DeckofCards deck) {
        DeckofCards result=deck;
        return result;
    }
    
    public DeckofCards deal(DeckofCards deck) {
        DeckofCards result=new DeckofCards();
        for (int i = 0; i < 5; i++) {
            result.cards.add(deck.cards.remove(0));
        }
        return result;
    }
    
    /**
     * 
     * @param player
     * @return game result: 1 is won, 0 is continue, -1 is lost
     */
    public int isWon(Player player) {
        int result=0;
        return result;
    }
    
    public Cards overwriteColor(Cards card){
        if (gameColor==null) return card;
        else return new Cards(gameColor, card.getValue());
    }
    
    public int next() {
        int next=this.getNextPlayer()+this.getDirection();
        if (next>3) return next-4;
        if (next<0) return next+4;
        return next;
    }
    

}
