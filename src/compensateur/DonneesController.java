/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class DonneesController implements Initializable {

    @FXML
    private Button suivant;
    @FXML
    private Button demarrer1;
    @FXML
    private Button demarrer2;
    @FXML
    private Button precedent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void on_suivant(ActionEvent event) throws IOException {
        Compensateur.changerVues("graphiqueavant.fxml");
    }

    @FXML
    private void on_demarrer(ActionEvent event) {
    }

    @FXML
    private void on_precedent(ActionEvent event) {
    }
    
}
