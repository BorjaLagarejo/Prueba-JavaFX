package control;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private ImageView refugees;
	
	
	public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Superheader.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            
            //clips
           
            refugees = new ImageView();
//            );
//    
//            ColorAdjust colorAdjust = new ColorAdjust();
//            colorAdjust.setContrast(1);
//            colorAdjust.setHue(0);
//            colorAdjust.setBrightness(0);	
//            colorAdjust.setSaturation(0);
//            ceiling_image.setEffect(colorAdjust);
//            ceiling_image.setEffect(new GaussianBlur(5));
//            refugees.setClip(ceiling);
            refugees.setEffect(new GaussianBlur(5));
            
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	@FXML
	private void handleSend() {
		System.exit(0);
    }
}
