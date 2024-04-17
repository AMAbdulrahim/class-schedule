package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class projectTest extends Application  implements Initializable{

    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    ListView<String> sectionsListView = new ListView<String>();

    @FXML
    ListView<String> basketListView = new ListView<String>();

    @FXML
    Button basketAdd;

    @FXML
    Button basketDel;

    @FXML
    GridPane scheduleGridPane;

    @FXML
    static
    ArrayList<String> sections = new ArrayList<String>();
    @FXML
    static
    ArrayList<String> basket = new ArrayList<String>();
    

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("test1fxml.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }

    public static void main(String[] args) {
        launch(args);
    }


    @FXML
    public void BasketDel(ActionEvent e) throws IOException{
        // int selectedSection = basketListView.getSelectionModel().getSelectedIndex();
        // String selected = basketListView.getItems().get(selectedSection);
        

    }

    
    @FXML
    public void BasketAdd(ActionEvent e) throws IOException{
        int selectedSection = basketListView.getSelectionModel().getSelectedIndex();
        String selected = basketListView.getItems().get(selectedSection);
        scheduleGridPane.add( new Button(selected, new Button("del")), 0, 3);
        scheduleGridPane.add( new Button(selected, new Button("del")), 2, 3);
        scheduleGridPane.add( new Button(selected, new Button("del")), 4, 3);

    }

    @FXML
    public void Back(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("test1fxml.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        basketListView.getItems().addAll(basket); 
    }

}
