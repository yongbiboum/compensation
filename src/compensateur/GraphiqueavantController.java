/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

import com.sun.java.swing.plaf.windows.resources.windows;
import static java.awt.PageAttributes.MediaType.C;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.C;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class GraphiqueavantController implements Initializable {

    @FXML
    private LineChart<String, Number> geac;
    @FXML
    private LineChart<String, Number> greac;
    @FXML
    private Button suivant;
    @FXML
    private Button precedent;
    @FXML
    private NumberAxis y1;
    @FXML
    private CategoryAxis x1;
    @FXML
    private NumberAxis y2;
    @FXML
    private CategoryAxis x2;
    @FXML
    private TextField pac;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pac.setText(224.99+"");
        
           XYChart.Series series = new XYChart.Series();
              series.setName("pertes P avant");
              int k=0;
             
              for(loader l : DonneesapresController.lists){
              series.getData().add(new XYChart.Data(k+1+"",DonneesapresController.lists.get(k).getMwa_loss_avant()));
              k=k+1;
              }
           XYChart.Series serie1 = new XYChart.Series();
              serie1.setName("pertes P apres");
              int t=0;
               
              for(loader l : DonneesapresController.lists){
              serie1.getData().add(new XYChart.Data(t+1+"",DonneesapresController.lists.get(t).getMwa_loss_apres()));
              t=t+1;
              }
             geac.getData().addAll(series,serie1);
           XYChart.Series serie2 = new XYChart.Series();
              serie2.setName("pertes Q avant");
              int u=0;
               
              for(loader l : DonneesapresController.lists){
              serie2.getData().add(new XYChart.Data(u+1+"",DonneesapresController.lists.get(u).getMva_avant()));
              u=u+1;
              }
           XYChart.Series serie3 = new XYChart.Series();
              serie3.setName("pertes Q apres");
              int v=0;
               
              for(loader l : DonneesapresController.lists){
              serie3.getData().add(new XYChart.Data(v+1+"",DonneesapresController.lists.get(v).getMva_apres()));
              v=v+1;
              }
             greac.getData().addAll(serie2,serie3);
// TODO
    }    

    @FXML
    private void on_suivant(ActionEvent event) throws IOException {
        System.exit(0);
    }

    @FXML
    private void on_precedent(ActionEvent event) {
    }


    
}
