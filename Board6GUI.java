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
import static javafx.application.Application.launch;
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

public class Board6GUI extends Application {

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

    public Board6GUI() {

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

        imageView.setFitHeight(472.0);
        imageView.setFitWidth(375.0);
        imageView.setLayoutX(26.0);
        imageView.setImage(new Image(getClass().getResource("New-York.jpg").toExternalForm()));
        
        button.setLayoutX(14.0);
        button.setLayoutY(14.0);
        button.setMnemonicParsing(false);
        button.setText("Lincoln Center");
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                if(cityArray[0] == null){
                 //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                 cityArray[0] = "LincolnCenter";
                }
                else if(cityArray[1] == null){
                //String btnText = ((Button)findViewById(R.id.my_Button)).getText().toString();
                cityArray[1] = "LincolnCenter";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button0.setLayoutX(177.0);
        button0.setLayoutY(1.0);
        button0.setMnemonicParsing(false);
        button0.setText("Center Park");
        
        button0.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "CenterPark";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "CenterPark";
                
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button1.setLayoutX(253.0);
        button1.setLayoutY(80.0);
        button1.setMnemonicParsing(false);
        button1.setText("United Nations");
        
        button1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "UnitedNations";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "UnitedNations";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button2.setLayoutX(106.0);
        button2.setLayoutY(80.0);
        button2.setMnemonicParsing(false);
        button2.setText("Times Square");
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "TimesSquare";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "TimesSquare";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button3.setLayoutY(107.0);
        button3.setMnemonicParsing(false);
        button3.setText("Midtown West");
        
        button3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "MidtownWest";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "MidtownWest";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button4.setLayoutX(147.0);
        button4.setLayoutY(141.0);
        button4.setMnemonicParsing(false);
        button4.setText("Emipre State Building");
        
        button4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "EmpireStateBuilding";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "EmpireStateBuilding";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button5.setLayoutX(199.0);
        button5.setLayoutY(188.0);
        button5.setMnemonicParsing(false);
        button5.setText("Gramercy Park");
        
        button5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "GramercyPark";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "GramercyPark";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button6.setLayoutX(34.0);
        button6.setLayoutY(188.0);
        button6.setMnemonicParsing(false);
        button6.setText("Chelsea");
        
        button6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Chelsea";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Chelsea";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button7.setLayoutX(84.0);
        button7.setLayoutY(268.0);
        button7.setMnemonicParsing(false);
        button7.setText("Greenwich Village");
        
        button7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "GreenwichVillage";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "GreenwichVillage";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button8.setLayoutX(279.0);
        button8.setLayoutY(255.0);
        button8.setMnemonicParsing(false);
        button8.setText("East Village");
        
        button8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "EastVillage";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "EastVillage";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button9.setLayoutX(265.0);
        button9.setLayoutY(313.0);
        button9.setMnemonicParsing(false);
        button9.setText("Lower East Side");
        
        button9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "LowerEastSide";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "LowerEastSide";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button10.setLayoutX(297.0);
        button10.setLayoutY(431.0);
        button10.setMnemonicParsing(false);
        button10.setText("Brooklyn");
        
        button10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Brooklyn";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Brooklyn";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button11.setLayoutX(157.0);
        button11.setLayoutY(352.0);
        button11.setMnemonicParsing(false);
        button11.setText("Chinatown");
        
        button11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Chinatown";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Chinatown";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button12.setLayoutX(114.0);
        button12.setLayoutY(425.0);
        button12.setMnemonicParsing(false);
        button12.setText("Wall Street");
        
        button12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "WallStreet";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "WallStreet";
               
                //Send city array to routeMethod that will check the route and player tokens
                routeMethod(cityArray[0], cityArray[1]);
                
                //reset cityArray to null for next attempt
                Arrays.fill(cityArray, null);
                
                }
            }
        });

        button13.setLayoutX(76.0);
        button13.setLayoutY(339.0);
        button13.setMnemonicParsing(false);
        button13.setText("Soho");

        button13.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
              
                if(cityArray[0] == null){
                 cityArray[0] = "Soho";
                }
                else if(cityArray[1] == null){
                cityArray[1] = "Soho";
               
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
        v.getChildren().add(anchorPane);
        return v;
    }
	
	
	private static Stage guiStage;
	
	public static Stage getStageBoard6GUI(){
		return guiStage;
	} 

    public static void main(String [] args){
        launch(args);


}

    @Override
    public void start(Stage primaryStage) throws Exception {
    	guiStage = primaryStage;
        primaryStage.setTitle("Ticket to Ride New York");
        GridPane p = new GridPane();
        p.getChildren().add(setScene());
        Scene scene = new Scene(p, 480, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}


