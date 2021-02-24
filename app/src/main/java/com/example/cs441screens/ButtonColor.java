package com.example.cs441screens;

public class ButtonColor {
    private static ButtonColor BUTTON_COLOR = null;

    public int ColorID;

    public static ButtonColor getInstance(){
        if(ButtonColor.BUTTON_COLOR == null){
            ButtonColor.BUTTON_COLOR = new ButtonColor();
            return ButtonColor.BUTTON_COLOR;
        }
        else{
            return ButtonColor.BUTTON_COLOR;
        }
    }
}
