/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class 
 *
 * @author faya
 */
public class ChoixController implements Initializable {

    @FXML
    private Button precedent;
    @FXML
    private Button excel;
    @FXML
    private Pane pane;
    @FXML
    private Label chemin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void on_precedent(ActionEvent event) throws IOException {
        Compensateur.changerVues("acceuil.fxml");
    }

    @FXML
    private void on_excel(ActionEvent event) throws IOException {
    Compensateur.changerVues("donneesavant.fxml");
//        FileChooser importer = new FileChooser();
//        importer.setTitle("Import du fichier excel");
//        Stage stage = (Stage)pane.getScene().getWindow();
//        
//        
//       File file = importer.showOpenDialog(stage);
//       if(file!=null){
//       chemin.setText(file.getAbsolutePath());
       //}
    }

  
    
}
