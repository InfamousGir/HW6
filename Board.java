/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author BAEtesting
 */
public class Board {
    int displayScore;//recording of game's current score
    String[] arrayOfRoutes= {"Raleigh->Chicago"};//example routes between destinations, used for points
    String[] destinationPlaces= {"Raleigh","Chicago"};//example destination names
    int[] scoreMarkerArray={20,13,4,15};//temporary scores for four players
    public int displayScore()
    {
    	return displayScore;
    }
    public String displayTrainCars()
    {
    	return"Train Type: Reefer";//Just as an example
    }
    public void scoreMarker()
    {
    	for (int i=0;i<4;i++)
    	{
    		System.out.println(scoreMarkerArray[i]);
    	}
    }
    
}