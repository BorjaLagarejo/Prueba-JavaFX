package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Borja
 * @version 1.0
 * @see Prueba JavaFX
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader=new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
        AnchorPane pane=loader.load();
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
