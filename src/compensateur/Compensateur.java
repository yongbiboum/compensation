/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
/**
 *
 * @author faya
 */
public class Compensateur extends Application {
    public static Stage stage;
    public static String icon="/compensateur/icon.jpg";
     public static void changerVues(String chemin) throws IOException
    {
        Parent root = FXMLLoader.load(Compensateur.class.getResource(chemin));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void start(Stage stage) throws Exception {
       Compensateur.stage=stage;
        stage.setTitle("Compensator");
        
        stage.getIcons().add(new Image(icon));
        changerVues("acceuil.fxml");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
