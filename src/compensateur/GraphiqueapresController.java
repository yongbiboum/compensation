/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class GraphiqueapresController implements Initializable {

    @FXML
    private LineChart<?, ?> geac;
    @FXML
    private NumberAxis y1;
    @FXML
    private CategoryAxis x1;
    @FXML
    private LineChart<?, ?> greac;
    @FXML
    private NumberAxis y2;
    @FXML
    private CategoryAxis x2;
    @FXML
    private Button suivant;
    @FXML
    private Button precedent;
    @FXML
    private TextField pac;
    @FXML
    private TextField preac;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
   
         pac.setText(20+"");
        preac.setText(35+"");
           XYChart.Series series = new XYChart.Series();
            XYChart.Series serie = new XYChart.Series();
              series.getData().add(new XYChart.Data("1",25));
              series.getData().add(new XYChart.Data("2",24));
              series.getData().add(new XYChart.Data("3",29));
              series.getData().add(new XYChart.Data("4",34));
              series.getData().add(new XYChart.Data("5",35));
              series.getData().add(new XYChart.Data("6",21));
              series.getData().add(new XYChart.Data("7",22));
              series.getData().add(new XYChart.Data("8",30));
              series.getData().add(new XYChart.Data("9",25));
              series.getData().add(new XYChart.Data("10",28));
           serie.getData().add(new XYChart.Data("1",20));
     
              serie.getData().add(new XYChart.Data("2",33));
              serie.getData().add(new XYChart.Data("3",36));
              serie.getData().add(new XYChart.Data("4",33));
              serie.getData().add(new XYChart.Data("5",38));
              serie.getData().add(new XYChart.Data("6",20));
              serie.getData().add(new XYChart.Data("7",24));
              serie.getData().add(new XYChart.Data("8",25));
              serie.getData().add(new XYChart.Data("9",29));
              serie.getData().add(new XYChart.Data("10",28)); 
           
           geac.getData().addAll(series);
           greac.getData().addAll(serie);

    }    

    @FXML
    private void on_suivant(ActionEvent event) {
    }

    @FXML
    private void on_precedent(ActionEvent event) {
    }
    
}
