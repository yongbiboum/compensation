/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

import static compensateur.donneesavantController.liste;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class lignesController implements Initializable {

    @FXML
    private Pane pane;
    @FXML
    private Button suivant;
    @FXML
    private Button precedent;
    @FXML
    private TableView<load> tables;
    @FXML
    private TableColumn<load, Double> q;
    @FXML
    private Label chemins;
    @FXML
    private Label titre;
    @FXML
    private TableColumn<load, Integer> du_noeud;
    @FXML
    private TableColumn<load, String> noeud_depart;
    @FXML
    private TableColumn<load, Integer> au_noeud;
    @FXML
    private TableColumn<load, String> noeud_arriver;
    @FXML
    private TableColumn<load, Integer> num_branche;
    @FXML
    private TableColumn<load, String> type_branche;
    @FXML
    private TableColumn<load, Double> p;
    @FXML
    private TableColumn<load, Double> s;
    @FXML
    private TableColumn<load, Double> snom;
    @FXML
    private TableColumn<load, Double> spourcent;
    @FXML
    private TableColumn<load, Double> dp;
    @FXML
    private TableColumn<load, Double> dq;
    public static int[] a = {11,12,13,14,15,33,36,37,46,47,48,50,53,55,56,59};
    public static ArrayList<load> listes = new ArrayList<load>();
    
    int i;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        i=0; 
        for(i=0;i<16;i++){
        listes.add(donneesavantController.liste.get(a[i]));       
        }
        
                    tables.getItems().setAll(listes);
                    du_noeud.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getDu_noeud());
                    });
                    noeud_depart.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getNoeud_depart());
                    });
                    au_noeud.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getAu_noeud());
                    });
                    noeud_arriver.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getNoeud_arriver());
                    });
                    num_branche.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getNumero_branche());
                    });
                    type_branche.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getType_branche());
                    });
                    p.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getP());
                    });
                    q.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getQ());
                    });
                    s.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getS());
                    });
                    snom.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getSnom());
                    });
                    spourcent.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getSpourcent());
                    });
                    dp.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getDp());
                    });
                    dq.setCellValueFactory(param->{
                    load n=param.getValue();
                    return new SimpleObjectProperty(n.getDq());
                    });
                    }
        


        

    @FXML
    private void on_suivant(ActionEvent event) throws IOException {
        Compensateur.changerVues("donneesapres.fxml");
    }

    @FXML
    private void on_precedent(ActionEvent event) throws IOException {
   Compensateur.changerVues("donneesavant.fxml");
    }
    
}
