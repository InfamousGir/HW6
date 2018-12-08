package homework6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;

import java.awt.*;
/**
 *
 * @author BAEtesting
 */
public class DestinationCard extends JFrame {
    protected int points;               // Points given for DestinationCard
    protected City city1, city2;       // Two city objects to compare

    
    
    public DestinationCard(City city1, City city2, int p) {
            DestinationCard destinationCard = new DestinationCard(city1, city2, p);         
// Constructor for DestinationCards which checks for two city locations and point value
    }
    
    public String toString(DestinationCard dc){
        return "Destination: " + dc.city1 + " - " + dc.city2 + " Points: " + points;
    }
}
