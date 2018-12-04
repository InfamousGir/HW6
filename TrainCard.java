package homework5;

import java.util.List;
import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAEtesting
 */
public class TrainCard extends JFrame {
    public int value;
    public String color;
    public List<TrainCard> trainCards;
    
    
    

    public TrainCard(int v, String c){
    for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                /*
                ImageIcon image = new ImageIcon();
                JLabel label = new JLabel();
                JPanel card = new JPanel();
                String path = getTrainColorString(i);
*/              color = getTrainColorString(i);
                value = j;
                trainCards.add(new TrainCard(value, color));
            }
        }
    }
    

    public String getTrainColorString(int value) {
            // Return a String representing the card''s color
           
        switch ( value ) {
           case 1:   return "Purple";
           case 2:   return "White";
           case 3:   return "Blue";
           case 4:   return "Yellow";
           case 5:   return "Orange";
           case 6:   return "Black";
           case 7:   return "Red";
           case 8:   return "Green";
           case 0:   return "Locomotive";
           default:  return "??";
        }
    }
    
    /**
     *
     * @param tc
     * @return
     */
    public String toString(TrainCard tc){
        return tc.color;
    }
    
    public ArrayList<TrainCard> drawTrainCard(ArrayList<TrainCard> deck){            //Draw's TrainCards
        int lastIndex = trainCards.size() - 1;
        ArrayList<TrainCard> result = new ArrayList<TrainCard>();
        if (lastIndex < 0) {
            return null;
        }
        result.add(trainCards.get(lastIndex));
        trainCards.remove(lastIndex);
        return result;
    }

    private Object trainCards(int j, String trainColorString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
