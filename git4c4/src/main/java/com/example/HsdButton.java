package com.example;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

public class HsdButton extends Button {

    public HsdButton(String text) {
        super(text);
        this.setMinWidth(150);
        this.setPrefHeight(40);
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
    }
}
