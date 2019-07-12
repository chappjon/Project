/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Xiaohong Deng
 */
public class FXMLDocumentGameBoardController implements Initializable {
    private DeckofCards deck, deadwood;
    private MachinePlayer[] machine=new MachinePlayer[3];
    private HumanPlayer player;
    private Game game;
    

    

    
    public void display(){
    }
    
    public void endGame(Player player){
    
    }
    
    @FXML
    public void play(MouseEvent event){
        player.play();
        if (game.isWon(player)) endGame(player);
        
        for (int i = 0; i < machine.length; i++) {
             machine[i].play();
             if (game.isWon(machine[i])) endGame(machine[i]);
        }
        display();
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       deck=game.shuffle(deck);
       player.setHand(game.deal(deck));
       for (int i = 0; i < machine.length; i++) {
            machine[i].setHand(game.deal(deck));          
       }
       display();
       
    }    
    
}
