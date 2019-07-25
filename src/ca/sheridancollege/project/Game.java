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
    private int currentPlayer=0;
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


    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int nextPlayer) {
        this.currentPlayer = nextPlayer;
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }




    
    public DeckofCards shuffle(DeckofCards deck) {
        DeckofCards result=new DeckofCards();
        for (int i = deck.cards.size(); i >0; i--) {
            result.cards.add(deck.cards.remove((int)(Math.random()*i)));
        }
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
        if(player.getHand().cards.size()==0) return 1;
        if(player.getHand().cards.size()>10) return -1;
        return 0;
    }
    
    public Cards overwriteColor(Cards card){
        if (gameColor==null) return card;
        else return new Cards(gameColor, card.getValue());
    }
    
    public int next() {
        int next=this.getCurrentPlayer()+this.getDirection();
        if (next>3) return next-4;
        if (next<0) return next+4;
        return next;
    }
    
    

}
