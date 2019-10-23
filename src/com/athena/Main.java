package com.athena;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    private static ResourceBundle resInternal;
    private static ResourceBundle resUi;

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println(MessageFormat.format("--- {0}", resUi.getString(Common.HELLO_WORLD)));
        URL url = Common.getForm(resInternal.getString("main_form"));
        Parent root = FXMLLoader.load(url, resUi);
        primaryStage.setTitle(resUi.getString(Common.HELLO_WORLD));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Locale locale = new Locale("de"); //NON-NLS
        resInternal = ResourceBundle.getBundle("resources.internal", locale); //NON-NLS
        resUi = ResourceBundle.getBundle("resources.ui", locale); //NON-NLS
        launch(args);
    }
}
