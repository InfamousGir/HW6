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
import javafx.scene.control.ChoiceBox;
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

public class WelcomeGUI extends Application {

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

    public WelcomeGUI() {

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
        imageView.setImage(new Image(getClass().getResource("Welcome-Screen.jpg").toExternalForm()));

        Button launch = new Button("Launch Game");
        launch.setLayoutX(180.0);
        launch.setLayoutY(290.0);
        
        ChoiceBox<String> mapChoice = new ChoiceBox<>();

        mapChoice.setLayoutX(160.0);
        mapChoice.setLayoutY(258.0);
        
        mapChoice.getItems().add("Ticket to Ride");
        mapChoice.getItems().add("Ticket to Ride 10th Anniversary");
        mapChoice.getItems().add("Ticket to Ride 1910");
        mapChoice.getItems().add("Ticket to Ride Asia");
        mapChoice.getItems().add("Ticket to Ride India");
        mapChoice.getItems().add("Ticket to Ride Europe");
        mapChoice.getItems().add("Ticket to Ride New York");
        mapChoice.getItems().add("Ticket to Ride First Journey");
        mapChoice.getItems().add("Ticket to Ride First Journey Europe");
        
        mapChoice.setValue("Ticket to Ride");
        
        launch.setOnAction(event -> getChoice(mapChoice));

        
        
        

        
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(imageView);
        anchorPane.getChildren().add(launch);
        anchorPane.getChildren().add(mapChoice);
        v.getChildren().add(anchorPane);
        return v;
    }


    public static void main(String [] args){
        launch(args);


}

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ticket to Ride");
        GridPane p = new GridPane();
        p.getChildren().add(setScene());
        Scene scene = new Scene(p, 900, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getChoice(ChoiceBox<String> mapChoice) {
       String map = mapChoice.getValue();
       //Call to change map
       if(map.equals("Ticket to Ride")){
           getStageBoard1GUI();
       }
       if(map.equals("Ticket to Ride 10th Anniversary")){
           getStageBoard2GUI();
       }
       if(map.equals("Ticket to Ride 1910")){
           getStageBoard3GUI();
       }
       if(map.equals("Ticket to Ride Asia")){
           getStageBoard4GUI();
       }
       if(map.equals("Ticket to Ride India")){
           getStageBoard5GUI();
       }
       if(map.equals("Ticket to Ride Europe")){
           getStageBoard6GUI();
       }
       
       if(map.equals("Ticket to Ride New York")){
           getStageBoard7GUI();
       }
       
       if(map.equals("Ticket to Ride First Journey")){
           getStageBoard8GUI();
       }
       
       if(map.equals("Ticket to Ride First Journey Europe")){
           getStageBoard9GUI();
       }
      
    }
    
}


