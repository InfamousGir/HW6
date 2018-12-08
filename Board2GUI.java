/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;
/**
 *
 * @author Alejandro
 */
import java.util.Arrays;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import static javafx.scene.input.KeyCode.R;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Board2GUI extends Application {

    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;
    protected final Menu menu0;
    protected final SeparatorMenuItem separatorMenuItem;
    protected final MenuItem menuItem1;
    protected final MenuItem menuItem2;
    protected final MenuItem menuItem3;
    protected final MenuItem menuItem4;
    protected final SeparatorMenuItem separatorMenuItem0;
    protected final MenuItem menuItem5;
    protected final SeparatorMenuItem separatorMenuItem1;
    protected final MenuItem menuItem6;
    protected final Menu menu1;
    protected final MenuItem menuItem7;
    protected final MenuItem menuItem8;
    protected final SeparatorMenuItem separatorMenuItem2;
    protected final MenuItem menuItem9;
    protected final MenuItem menuItem10;
    protected final MenuItem menuItem11;
    protected final MenuItem menuItem12;
    protected final SeparatorMenuItem separatorMenuItem3;
    protected final MenuItem menuItem13;
    protected final MenuItem menuItem14;
    protected final Menu menu2;
    protected final MenuItem menuItem15;
    protected final AnchorPane anchorPane;
    protected final Label label;
    protected final ImageView imageView;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected final Button button11;
    protected final Button button12;
    protected final Button button13;
    protected final Button button14;
    protected final Button button15;
    protected final Button button16;
    protected final Button button17;
    protected final Button button18;
    protected final Button button19;
    protected final Button button110;
    protected final Button button111;
    protected final Button button112;
    protected final Button button113;
    protected final Button button114;
    protected final Button button115;
    protected final Button button116;
    protected final Button button117;
    protected final Button button118;
    protected final Button button119;
    protected final Button button1110;
    protected final Button button1111;
    protected final Button button1112;
    protected final Button button1113;
    protected final Button button1114;
    protected VBox v;

    public Board2GUI() {

        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();
        menu0 = new Menu();
        separatorMenuItem = new SeparatorMenuItem();
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menuItem3 = new MenuItem();
        menuItem4 = new MenuItem();
        separatorMenuItem0 = new SeparatorMenuItem();
        menuItem5 = new MenuItem();
        separatorMenuItem1 = new SeparatorMenuItem();
        menuItem6 = new MenuItem();
        menu1 = new Menu();
        menuItem7 = new MenuItem();
        menuItem8 = new MenuItem();
        separatorMenuItem2 = new SeparatorMenuItem();
        menuItem9 = new MenuItem();
        menuItem10 = new MenuItem();
        menuItem11 = new MenuItem();
        menuItem12 = new MenuItem();
        separatorMenuItem3 = new SeparatorMenuItem();
        menuItem13 = new MenuItem();
        menuItem14 = new MenuItem();
        menu2 = new Menu();
        menuItem15 = new MenuItem();
        anchorPane = new AnchorPane();
        label = new Label();
        imageView = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        button11 = new Button();
        button12 = new Button();
        button13 = new Button();
        button14 = new Button();
        button15 = new Button();
        button16 = new Button();
        button17 = new Button();
        button18 = new Button();
        button19 = new Button();
        button110 = new Button();
        button111 = new Button();
        button112 = new Button();
        button113 = new Button();
        button114 = new Button();
        button115 = new Button();
        button116 = new Button();
        button117 = new Button();
        button118 = new Button();
        button119 = new Button();
        button1110 = new Button();
        button1111 = new Button();
        button1112 = new Button();
        button1113 = new Button();
        button1114 = new Button();
        v = new VBox();



    }
    public VBox setScene(){   
        
        //Setting up string array to hold city strings in order to pass to controller
        String[] cityArray = new String[2];

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("New");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Open…");

        menu0.setMnemonicParsing(false);
        menu0.setText("Open Recent");

        separatorMenuItem.setMnemonicParsing(false);

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Close");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Save");

        menuItem3.setMnemonicParsing(false);
        menuItem3.setText("Save As…");

        menuItem4.setMnemonicParsing(false);
        menuItem4.setText("Revert");

        separatorMenuItem0.setMnemonicParsing(false);

        menuItem5.setMnemonicParsing(false);
        menuItem5.setText("Preferences…");

        separatorMenuItem1.setMnemonicParsing(false);

        menuItem6.setMnemonicParsing(false);
        menuItem6.setText("Quit");

        menu1.setMnemonicParsing(false);
        menu1.setText("Edit");

        menuItem7.setMnemonicParsing(false);
        menuItem7.setText("Undo");

        menuItem8.setMnemonicParsing(false);
        menuItem8.setText("Redo");

        separatorMenuItem2.setMnemonicParsing(false);

        menuItem9.setMnemonicParsing(false);
        menuItem9.setText("Cut");

        menuItem10.setMnemonicParsing(false);
        menuItem10.setText("Copy");

        menuItem11.setMnemonicParsing(false);
        menuItem11.setText("Paste");

        menuItem12.setMnemonicParsing(false);
        menuItem12.setText("Delete");

        separatorMenuItem3.setMnemonicParsing(false);

        menuItem13.setMnemonicParsing(false);
        menuItem13.setText("Select All");

        menuItem14.setMnemonicParsing(false);
        menuItem14.setText("Unselect All");

        menu2.setMnemonicParsing(false);
        menu2.setText("Help");

        menuItem15.setMnemonicParsing(false);
        menuItem15.setText("About MyHelloApp");
        
        anchorPane.setMaxHeight(-1.0);
        anchorPane.setMaxWidth(-1.0);
        anchorPane.setPrefHeight(-1.0);
        anchorPane.setPrefWidth(-1.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(346.0);
        label.setLayoutY(176.0);
        label.setStyle("");
        label.setText("Drag components from Library here…");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#9f9f9f"));
        label.setWrapText(false);
        label.setFont(new Font(18.0));

        imageView.setFitHeight(571.0);
        imageView.setFitWidth(849.0);
        imageView.setLayoutX(26.0);
        imageView.setImage(new Image(getClass().getResource("Ticket-To-Ride-10th-Anniversary-Train-Cards-Board.jpg").toExternalForm()));

        button.setId("SanFrancisco");
        button.setLayoutX(37.0);
        button.setLayoutY(326.0);
        button.setMnemonicParsing(false);
        button.setText("San Francisco");
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                if(cityArray[0] == null){
                 //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                 cityArray[0] = "SanFrancisco";
                }
                else if(cityArray[1] == null){
                //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                cityArray[1] = "SanFrancisco";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button0.setId("LosAngeles");
        button0.setLayoutX(99.0);
        button0.setLayoutY(416.0);
        button0.setMnemonicParsing(false);
        button0.setText("Los Angeles");
        
        button0.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "LosAngeles";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "LosAngeles";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1.setId("Porland");
        button1.setLayoutX(64.0);
        button1.setLayoutY(163.0);
        button1.setMnemonicParsing(false);
        button1.setText("Portland");
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Portland";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Portland";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button2.setId("Seatle");
        button2.setLayoutX(84.0);
        button2.setLayoutY(121.0);
        button2.setMnemonicParsing(false);
        button2.setText("Seattle");
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Seatle";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Seattle";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });
        
        button3.setLayoutX(73.0);
        button3.setLayoutY(72.0);
        button3.setMnemonicParsing(false);
        button3.setText("Vancouver");
        
        button3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Vancouver";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Vancouver";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button4.setLayoutX(192.0);
        button4.setLayoutY(59.0);
        button4.setMnemonicParsing(false);
        button4.setText("Calgary");
        
        button4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Calgary";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Calgary";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button5.setLayoutX(173.0);
        button5.setLayoutY(272.0);
        button5.setMnemonicParsing(false);
        button5.setText("Salt Lake City");
        
        button5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "SaltLakeCity";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "SaltLakeCity";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button6.setLayoutX(183.0);
        button6.setLayoutY(370.0);
        button6.setMnemonicParsing(false);
        button6.setText("Las Vegas");
        
        button6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "LasVegas";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "LasVegas";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button7.setLayoutX(215.0);
        button7.setLayoutY(430.0);
        button7.setMnemonicParsing(false);
        button7.setText("Phoenix");
        
        button7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Phoenix";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Phoenix";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button8.setLayoutX(282.0);
        button8.setLayoutY(174.0);
        button8.setMnemonicParsing(false);
        button8.setText("Helena");
        
        button8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Helena";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Helena";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button9.setLayoutX(381.0);
        button9.setLayoutY(59.0);
        button9.setMnemonicParsing(false);
        button9.setText("Winnipeg");
        
        button9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Winnipeg";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Winnipeg";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button10.setLayoutX(476.0);
        button10.setLayoutY(163.0);
        button10.setMnemonicParsing(false);
        button10.setText("Duluth");
        
        button10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Duluth";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Duluth";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button11.setLayoutX(457.0);
        button11.setLayoutY(245.0);
        button11.setMnemonicParsing(false);
        button11.setText("Omaha");
        
        button11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Omaha";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Omaha";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button12.setLayoutX(337.0);
        button12.setLayoutY(299.0);
        button12.setMnemonicParsing(false);
        button12.setText("Denver");
        
        button12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Denver";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Denver";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button13.setLayoutX(403.0);
        button13.setLayoutY(357.0);
        button13.setMnemonicParsing(false);
        button13.setText("Oklahoma City");
        
        button13.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "OklahomaCity";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "OklahomaCity";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button14.setLayoutX(310.0);
        button14.setLayoutY(371.0);
        button14.setMnemonicParsing(false);
        button14.setText("Santa Fe");
        
        button14.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "SantaFe";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "SantaFe";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button15.setLayoutX(317.0);
        button15.setLayoutY(457.0);
        button15.setMnemonicParsing(false);
        button15.setText("El Paso");
        
        button15.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "ElPaso";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "ElPaso";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button16.setLayoutX(556.0);
        button16.setLayoutY(108.0);
        button16.setMnemonicParsing(false);
        button16.setText("Sault St. Marie");
        
        button16.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "SaultStMarie";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "SaultStMarie";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button17.setLayoutX(679.0);
        button17.setLayoutY(135.0);
        button17.setMnemonicParsing(false);
        button17.setText("Toronto");
        
        button17.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Toronoto";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Toronto";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button18.setLayoutX(734.0);
        button18.setLayoutY(59.0);
        button18.setMnemonicParsing(false);
        button18.setText("Montreal");
        
        button18.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Montreal";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Montreal";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button19.setLayoutX(793.0);
        button19.setLayoutY(108.0);
        button19.setMnemonicParsing(false);
        button19.setText("Boston");
        
        button19.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Boston";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Boston";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button110.setLayoutX(764.0);
        button110.setLayoutY(163.0);
        button110.setMnemonicParsing(false);
        button110.setText("New York City");
        
        button110.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "NewYorkCity";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "NewYorkCity";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button111.setLayoutX(442.0);
        button111.setLayoutY(286.0);
        button111.setMnemonicParsing(false);
        button111.setText("Kansas City");
        
        button111.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "KansasCity";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "KansasCity";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button112.setLayoutX(476.0);
        button112.setLayoutY(430.0);
        button112.setMnemonicParsing(false);
        button112.setText("Dallas");
        
        button112.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Dallas";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Dallas";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button113.setLayoutX(679.0);
        button113.setLayoutY(201.0);
        button113.setMnemonicParsing(false);
        button113.setText("Pittsburgh");
        
        button113.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Pittsburgh";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Pittsburgh";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button114.setLayoutX(580.0);
        button114.setLayoutY(218.0);
        button114.setMnemonicParsing(false);
        button114.setText("Chicago");
        
        button114.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Chicago";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Chicago";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button115.setLayoutX(537.0);
        button115.setLayoutY(286.0);
        button115.setMnemonicParsing(false);
        button115.setText("Saint Louis");
        
        button115.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "SaintLouis";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "SaintLouis";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button116.setLayoutX(535.0);
        button116.setLayoutY(370.0);
        button116.setMnemonicParsing(false);
        button116.setText("Little Rock");
        
        button116.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "LittleRock";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "LittleRock";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button117.setLayoutX(764.0);
        button117.setLayoutY(245.0);
        button117.setMnemonicParsing(false);
        button117.setText("Washington");
        
        button117.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Washington";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Washington";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button118.setLayoutX(714.0);
        button118.setLayoutY(299.0);
        button118.setMnemonicParsing(false);
        button118.setText("Raleigh");
        
        button118.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Raleigh";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Raleigh";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button119.setLayoutX(612.0);
        button119.setLayoutY(313.0);
        button119.setMnemonicParsing(false);
        button119.setText("Nashville");
        
        button119.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Nashville";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Nashville";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1110.setLayoutX(657.0);
        button1110.setLayoutY(344.0);
        button1110.setMnemonicParsing(false);
        button1110.setText("Atlanta");
        
        button1110.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Atlanta";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Atlanta";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1111.setLayoutX(735.0);
        button1111.setLayoutY(357.0);
        button1111.setMnemonicParsing(false);
        button1111.setText("Charleston");
        
        button1111.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Charleston";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Charleston";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1112.setLayoutX(764.0);
        button1112.setLayoutY(484.0);
        button1112.setMnemonicParsing(false);
        button1112.setText("Miami");
        
        button1112.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Miami";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Miami";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1113.setLayoutX(505.0);
        button1113.setLayoutY(471.0);
        button1113.setMnemonicParsing(false);
        button1113.setText("Houston");
        
        button1113.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Houston";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Houston";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1114.setLayoutX(580.0);
        button1114.setLayoutY(457.0);
        button1114.setMnemonicParsing(false);
        button1114.setText("New Orleans");
        
        button1114.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "NewOrleans";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "NewOrleans";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });
        
        

        menu.getItems().add(menuItem);
        menu.getItems().add(menuItem0);
        menu.getItems().add(menu0);
        menu.getItems().add(separatorMenuItem);
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        menu.getItems().add(menuItem4);
        menu.getItems().add(separatorMenuItem0);
        menu.getItems().add(menuItem5);
        menu.getItems().add(separatorMenuItem1);
        menu.getItems().add(menuItem6);
        menuBar.getMenus().add(menu);
        menu1.getItems().add(menuItem7);
        menu1.getItems().add(menuItem8);
        menu1.getItems().add(separatorMenuItem2);
        menu1.getItems().add(menuItem9);
        menu1.getItems().add(menuItem10);
        menu1.getItems().add(menuItem11);
        menu1.getItems().add(menuItem12);
        menu1.getItems().add(separatorMenuItem3);
        menu1.getItems().add(menuItem13);
        menu1.getItems().add(menuItem14);
        menuBar.getMenus().add(menu1);
        menu2.getItems().add(menuItem15);
        menuBar.getMenus().add(menu2);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(button2);
        anchorPane.getChildren().add(button3);
        anchorPane.getChildren().add(button4);
        anchorPane.getChildren().add(button5);
        anchorPane.getChildren().add(button6);
        anchorPane.getChildren().add(button7);
        anchorPane.getChildren().add(button8);
        anchorPane.getChildren().add(button9);
        anchorPane.getChildren().add(button10);
        anchorPane.getChildren().add(button11);
        anchorPane.getChildren().add(button12);
        anchorPane.getChildren().add(button13);
        anchorPane.getChildren().add(button14);
        anchorPane.getChildren().add(button15);
        anchorPane.getChildren().add(button16);
        anchorPane.getChildren().add(button17);
        anchorPane.getChildren().add(button18);
        anchorPane.getChildren().add(button19);
        anchorPane.getChildren().add(button110);
        anchorPane.getChildren().add(button111);
        anchorPane.getChildren().add(button112);
        anchorPane.getChildren().add(button113);
        anchorPane.getChildren().add(button114);
        anchorPane.getChildren().add(button115);
        anchorPane.getChildren().add(button116);
        anchorPane.getChildren().add(button117);
        anchorPane.getChildren().add(button118);
        anchorPane.getChildren().add(button119);
        anchorPane.getChildren().add(button1110);
        anchorPane.getChildren().add(button1111);
        anchorPane.getChildren().add(button1112);
        anchorPane.getChildren().add(button1113);
        anchorPane.getChildren().add(button1114);
        v.getChildren().add(anchorPane);
        return v;
    }
	
	private static Stage guiStage;
	
	public static Stage getStageBoard2GUI(){
		return guiStage;
		}
		
    public static void main(String [] args){
        launch(args);


}
	

    @Override
    public void start(Stage primaryStage) throws Exception {
    	guiStage = primaryStage;
    	
        primaryStage.setTitle("Ticket to Ride");
        GridPane p = new GridPane();
        p.getChildren().add(setScene());
        Scene scene = new Scene(p, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}


