/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class donneesavantController implements Initializable {

    @FXML
    private Pane pane;
    @FXML
    private Button suivant;
    @FXML
    private Button precedent;
    @FXML
    private Button excel;
    @FXML
    private TableView<load> tables;
//    private TableColumn<noeud, Integer> num;
//    private TableColumn<noeud, String> nom;
//    private TableColumn<noeud, Integer> numb;
//    @FXML
//    private TableColumn<noeud, Double> q;
//    private TableColumn<noeud, Double> fmx;
//    private TableColumn<noeud, Double> fmin;
//    private TableColumn<noeud, Double> fp;
//    private TableColumn<noeud, Double> dev;
//    private TableColumn<noeud, Double> qmin;
//    private TableColumn<noeud, Double> qmax;
    FileChooser filechooser;
    String chemin;
    @FXML
    private Label chemins;
     public static ArrayList<load> liste = new ArrayList<load>();
    @FXML
    private Button excel1;
    @FXML
    private Label PT;
    @FXML
    private Label PTR;
    @FXML
    private TextField PTN;
    @FXML
    private TextField PTRN;
    @FXML
    private Label pp;
    @FXML
    private Label qq;
    @FXML
    private TextField PTAPN;
    @FXML
    private Label PTAP;
    @FXML
    private Label ss;
    @FXML
    private Label titre;
    @FXML
    private TableColumn<load, Integer> du_noeud;
    @FXML
    private TableColumn<load, String> noeud_depart;
    @FXML
    private TableColumn<load, Integer> au_noeud;
    @FXML
    private TableColumn<load, String> noeud_arrivé;
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
    @FXML
    private TableColumn<load, Double> q;
    @FXML
    private ImageView imgs;
    public static File file;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       tables.setVisible(false);
       excel1.setVisible(false);
       titre.setVisible(false);
       PT.setVisible(false);
       PTAP.setVisible(false);
       PTAPN.setVisible(false);
       PTR.setVisible(false);
       PTN.setVisible(false);
       PTAP.setVisible(false);
       PTRN.setVisible(false);
       pp.setVisible(false);
       qq.setVisible(false);
       ss.setVisible(false);
       
    }    

     public void importer() {

        tables.setVisible(true);
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //XSSFWorkbook wbW = new XSSFWorkbook();
                    XSSFWorkbook wbW = new XSSFWorkbook(new FileInputStream(file.getPath()));

                    //RÃ©cupÃ©ration de la cellule
                    XSSFSheet sheetIn = wbW.getSheetAt(1);
                    XSSFRow rowIn;
                    XSSFCell cellIn;
                    //Test de la compatibilitÃ© du fichier
                    if(sheetIn.getRow(0).getCell(0) == null){
                        System.out.println("Fichier non Valide");
                    }
                    else{
                        System.out.println("Fichier Valide");
                       
                    }
                   try{
                    int h=2;
                    while(h<62){
                    load l = new load();
                    l.setDu_noeud((int) sheetIn.getRow(h).getCell(0).getNumericCellValue());
                    l.setNoeud_depart(sheetIn.getRow(h).getCell(1).getStringCellValue());
                    l.setAu_noeud((int)sheetIn.getRow(h).getCell(2).getNumericCellValue());
                    l.setNoeud_arriver(sheetIn.getRow(h).getCell(3).getStringCellValue());
                    l.setNumero_branche(Integer.parseInt(sheetIn.getRow(h).getCell(4).getStringCellValue()));
                    l.setType_branche(sheetIn.getRow(h).getCell(5).getStringCellValue());
                    l.setP(sheetIn.getRow(h).getCell(6).getNumericCellValue());
                    l.setQ(sheetIn.getRow(h).getCell(7).getNumericCellValue());
                    l.setS(sheetIn.getRow(h).getCell(8).getNumericCellValue());
                    l.setSnom(sheetIn.getRow(h).getCell(9).getNumericCellValue());
                    l.setSpourcent(sheetIn.getRow(h).getCell(10).getNumericCellValue());
                    l.setDp(sheetIn.getRow(h).getCell(11).getNumericCellValue());
                    l.setDq(sheetIn.getRow(h).getCell(12).getNumericCellValue());
                    liste.add(l);
                    h=h+1;
                    }}catch(Exception e){
                    e.getMessage();
                    }
                    tables.getItems().setAll(liste);
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
                    noeud_arrivé.setCellValueFactory(param->{
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
                    chemins.setVisible(false);
                    excel.setVisible(false);
                    excel1.setVisible(false);
                    imgs.setVisible(false);
                    titre.setVisible(true);
                    PT.setVisible(true);
                    PTAP.setVisible(true);
                    PTR.setVisible(true);
                    PTN.setVisible(true);
                    PTAPN.setVisible(true);
                    PTRN.setVisible(true);
                    pp.setVisible(true);
                    qq.setVisible(true);
                    ss.setVisible(true);
                    PTN.setText("53.57 MW");
                    PTRN.setText("248.18 MVAR");
                    PTAPN.setText("53.57 + i248.18");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }
    @FXML
    private void on_suivant(ActionEvent event) throws IOException {
    
    Compensateur.changerVues("lignes.fxml");
    }

    @FXML
    private void on_precedent(ActionEvent event) throws IOException {
        Compensateur.changerVues("choix.fxml");
    }

    @FXML
    private void on_excel(ActionEvent event) {
        selectionnerFichier();
      
    }
      public void selectionnerFichier() {
           FileChooser importer = new FileChooser();
       importer.setTitle("Import du fichier excel");
        Stage stage = (Stage)pane.getScene().getWindow();
       
       
       file = importer.showOpenDialog(stage);
       if(file!=null){
       chemins.setText(file.getAbsolutePath());
       }
       chemin = file.getPath();
         System.out.println(file);
         excel1.setVisible(true);
//          try {
//              
//            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("from 2007 Excel files (*.xlsx)", "*.xlsx");
//            filechooser.getExtensionFilters().add(extFilter);
//            
//
//       //     File file = filechooser.showOpenDialog(new Stage());
//
//            String titreFichier = file.toString();
//         //   titreFichier = titreFichier.substring(titreFichier.lastIndexOf('\\') + 1, titreFichier.length());
//
//            chemin = file.getPath();
//            chemins.setText(file.getPath());
//            System.out.println(file);
//
////            excel.setDisable(false);
////            excel1.setVisible(true);
//
//            //lecture();
//
//        }catch (NullPointerException e2){
//            chemins.setText("Aucun Fichier");
//            excel.setDisable(true);
//            System.out.println("Fichier non TrouvÃ©");
//        }

    }

    @FXML
    private void on_excel1(ActionEvent event) {
        importer();
    }
}
