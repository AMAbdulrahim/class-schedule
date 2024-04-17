package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class controler  extends projectTest {

    public static void main(String[] args) {
        launch(args);
    }
    
    @FXML
    public void Next(ActionEvent e) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("schedulePane.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    @FXML
    public void Add(ActionEvent e){
        
        int selectedSection = sectionsListView.getSelectionModel().getSelectedIndex();
        String selected = sectionsListView.getItems().get(selectedSection);

        if(!basket.contains(selected))
            basket.add(selected);
        else
            System.out.println("Its already there!!!");
        
    }

    @FXML
    public void Remove(ActionEvent e){
        
        int selectedSection = sectionsListView.getSelectionModel().getSelectedIndex();
        String selected = sectionsListView.getItems().get(selectedSection);
        
        if(basket.contains(selected))
            basket.remove(selected); 
        else
            System.out.println("Its NOT there!!!");
        
    }
    @FXML
    public void Saved(ActionEvent e) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("schedulePane.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        basket.addAll(sections);
        basketListView.getItems().addAll(basket);                 
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        sections.add("ics 104 12");sections.add("ias 212 11");
        sections.add("coe 202 13");sections.add("ias 233 11");
        sections.add("ise 291 10");sections.add("engl 214 13");
        sectionsListView.getItems().addAll(sections);
    
    }
}