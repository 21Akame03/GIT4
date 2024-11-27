package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;
import javafx.geometry.Insets;

public class App extends Application {
    Set<Integer> LottoNumbers = new TreeSet<>(); // Tree structure is similar to Binary Tree but instead of only 2 branches, it can have more
    Random random = new Random(955080);

    TextField[] textFields = new TextField[6]; // arrax of text fields
       
    @Override
    public void start(Stage stage) {

        // Initialisation of the textfields
        // empty the Tree set before generating new numbers
        this.LottoNumbers.clear();
        // generate new values 
        while (this.LottoNumbers.size() < 6) {
            this.LottoNumbers.add(0); // Numbers 1-49
        }
        this.populateTextField();
 


        // New Button to actuate the drawing
        HsdButton drawButton = new HsdButton("Draw");
        drawButton.setOnAction(event -> Lottoziehung()); // draw new numbers on click hehehehehhe

        VBox root = new VBox(10, textFields);
        root.getChildren().add(drawButton);
        root.setPadding(new Insets(10));
        
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Lets go Gambling!!!!!!");
        stage.setScene(scene);
        stage.show();
    }

    // draw new random numbers and show them on the screen.
    public void Lottoziehung(){
        // empty the Tree set before generating new numbers
        this.LottoNumbers.clear();
        // generate new values 
        while (this.LottoNumbers.size() < 6) {
            this.LottoNumbers.add(1 + random.nextInt(49)); // Numbers 1-49
        }

        // then populate the textfields
        this.populateTextField();
    } 

    public void populateTextField() {
        int i = 0;
        // for every number value in uniquenumbers
        for (int number : this.LottoNumbers) {
            this.textFields[i].setText(String.valueOf(number));
            i++;
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
