/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Xiaohong Deng
 */
public class FXMLDocumentGameBoardController implements Initializable {
    private DeckofCards deck, deadwood;
    private MachinePlayer[] machine=new MachinePlayer[3];
    private HumanPlayer player;
    private Game game=new Game();
    @FXML 
    GridPane gridpane_player;
    
    @FXML
    Label label_machine1, label_machine2, label_machine3, label_deadwood, label_status;

    @FXML
    Button button_draw, button_next;
    
    public void draw(ActionEvent e) {

        if (game.getCurrentPlayer()==0) {
            player.getHand().cards.add(deck.cards.remove(0));
            game.setCurrentPlayer(game.next());
            machinePlay();
        } else JOptionPane.showMessageDialog
            (null, "It's not your turn.","Error",
                    JOptionPane.ERROR_MESSAGE);
    }

    /**
     * display the latest status on the pane
     */
    public void display(){
        label_machine1.setText(machine[0].getPlayerID()+" : "+String.valueOf(machine[0].getHand().cards.size())+ " card(s).");
        label_machine2.setText(machine[1].getPlayerID()+" : "+String.valueOf(machine[1].getHand().cards.size())+ " card(s).");
        label_machine3.setText(machine[2].getPlayerID()+" : "+String.valueOf(machine[2].getHand().cards.size())+ " card(s).");
        for (int i = 0; i < machine.length; i++) {
            System.out.println("Machine"+(i+1)+"'s hand: "+machine[i].getHand());
        }

        if(deadwood.getTop()==null) label_deadwood.setText("No card to match");
        else label_deadwood.setText("The card to match is: "+ game.overwriteColor(deadwood.getTop()).toString());
        displayPlayer();
    }
    
    private void displayPlayer(){
        DeckofCards playerHand=player.getHand();
        gridpane_player.getChildren().clear();
        for (int i = 0; i < playerHand.cards.size(); i++) {
                Button button=new Button();
                button.setOnAction(e->{
                    play(e);
 
                });
                button.setText(playerHand.cards.get(i).toString()); 
                if(i<5) gridpane_player.add(button, 0, i);
                else gridpane_player.add(button, 1, i-5);
                gridpane_player.setHalignment(button, HPos.CENTER);
        }

    }
    
    private void actOnCard(Cards card){

        if (card.getValue()==Cards.Value.REVERSE)
            game.setDirection(-game.getDirection());
        game.setCurrentPlayer(game.next());
        if (card.getValue()==Cards.Value.WILDCARD) game.setGameColor(card.getColor());
        if (card.getValue()==Cards.Value.DRAWTWO) {              
            for (int i = 0; i < 2; i++) 
                game.getPlayerList()[game.getCurrentPlayer()].getHand().cards.add(deck.cards.remove(0));
        }
        if (card.getValue()==Cards.Value.DRAWTWO) {
            for (int i = 0; i < 4; i++) 
                game.getPlayerList()[game.getCurrentPlayer()].getHand().cards.add(deck.cards.remove(0));
        }
        if (card.getValue()!=Cards.Value.SKIP) game.setGameColor(null);
    
        deadwood.cards.add(card);
       
    }
    
    private void changeColor(){
    
    
    }
    
    private void recycle() {
        Cards matchCard=deadwood.getTop();
        for (int i = 0; i < deadwood.cards.size() || deadwood.cards.get(0)==matchCard; i++) {
            deck.cards.add(deadwood.cards.remove(0));    
        }
    }
    
    private Cards nextCard() {
        if (deck.cards.size()==0) {
            recycle();
            game.shuffle(deck);
        }
        return deck.cards.remove(0);
    }
    

    
    public void endGame(Player player, int result){
        display();
        String message;
        if (result==1) message=" Win!";
        else message=" Lose!";
        JOptionPane.showMessageDialog
                (null, player.getPlayerID()+message,"Game Over",
                        JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    

    public void play(ActionEvent e){
        if (game.getCurrentPlayer()==0){
            Node source = (Node)e.getSource();
            int cardOrder=gridpane_player.getRowIndex(source)+gridpane_player.getColumnIndex(source)*5;
            Cards card=player.play(cardOrder, game.overwriteColor(deadwood.getTop()));
        
            if (card==null) JOptionPane.showMessageDialog
                (null, "The card you selected is not a valid card.","Error",
                        JOptionPane.ERROR_MESSAGE);
            else {
                actOnCard(card);  
                if (game.isWon(player)==1) endGame(player,1);
                if (game.isWon(player)==-1) endGame(player,-1);

                machinePlay();
            }
        } else JOptionPane.showMessageDialog
                (null, "You are not the current player.","Error",
                        JOptionPane.ERROR_MESSAGE);
    }
    
    public void machinePlay(){
        Cards card;
        if (game.getCurrentPlayer()!=0) {
            MachinePlayer currentPlayer=(MachinePlayer)(game.getPlayerList()[game.getCurrentPlayer()]);
            card=currentPlayer.play(game.overwriteColor(deadwood.getTop()));
            if(card==null) {
                currentPlayer.getHand().cards.add(deck.cards.remove(0));
                game.setCurrentPlayer(game.next());
                label_status.setText(currentPlayer.getPlayerID()+" draws. "+
                        "current player is "+game.getPlayerList()[game.getCurrentPlayer()].getPlayerID());
            }
            else {
                actOnCard(card);
                label_status.setText(currentPlayer.getPlayerID()+" plays " +card.toString()+
                        ". Current player is "+game.getPlayerList()[game.getCurrentPlayer()].getPlayerID());
            }
            
            if (game.isWon(currentPlayer)==1) endGame(currentPlayer,1);
            if (game.isWon(currentPlayer)==-1) endGame(currentPlayer,-1);
            display();
        } else JOptionPane.showMessageDialog
            (null, "It's your turn.","Error",
                    JOptionPane.ERROR_MESSAGE);

    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        
       deck=new DeckofCards();
       deadwood=new DeckofCards();
       deck.generateSet();
       deck=game.shuffle(deck);
       player=new HumanPlayer("Human");
       player.setHand(game.deal(deck));
       for (int i = 0; i < machine.length; i++) {
            machine[i]=new MachinePlayer("Machine"+(i+1));
            machine[i].setHand(game.deal(deck));          
       }
       deadwood.cards.add(deck.cards.remove(0));
       game.setPlayerList(new Player[]{player, machine[0],machine[1],machine[2]});
       game.setCurrentPlayer(0);
       label_status.setText("");
       display();
       
       
    }    
    
}
