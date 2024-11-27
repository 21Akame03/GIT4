package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;
import javafx.geometry.Insets;

public class App extends Application {
    // arrax of text fields
       
    @Override
    public void start(Stage stage) {
        Random random = new Random(955080);
        Set<Integer> LottoNumbers = generateNumbers(random); // Tree structure is similar to Binary Tree but instead of only 2 branches, it can have more
        
        TextField[] textFields = createTextFields(LottoNumbers);

        // New Button to actuate the drawing
        HsdButton drawButton = new HsdButton("Draw");
        drawButton.setOnAction(event -> {
            Random newRandom = new Random(955080); 
            Set<Integer> newNumbers = generateNumbers(newRandom); // Generate new numbers
            updateTextFields(newNumbers, textFields); // Update UI
        }); // draw new numbers on click hehehehehhe

        VBox root = new VBox(10, textFields);
        root.getChildren().add(drawButton);
        root.setPadding(new Insets(10));
        
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Lets go Gambling!!!!!!");
        stage.setScene(scene);
        stage.show();
    }


    private Set<Integer> generateNumbers(Random random) {
        Set<Integer> uniqueNumbers = new TreeSet<>();
        while (uniqueNumbers.size() < 6) {
            uniqueNumbers.add(1 + random.nextInt(49)); // between 1 and 49
        }
        return uniqueNumbers;
    }

    private TextField[] createTextFields(Set<Integer> numbers) {
        TextField[] textFields = new TextField[6];
        int i = 0;
        for (int number : numbers) {
            textFields[i] = new TextField(String.valueOf(number));
            textFields[i].setEditable(false);
            textFields[i].setMinWidth(50);
            i++;
        }
        return textFields;
    }

    // add the new values to the textfields
    private void updateTextFields(Set<Integer> LottoNumbers, TextField[] textFields) {
        int i = 0;
        for (int number : LottoNumbers) {
            textFields[i].setText(String.valueOf(number));
            i++;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}