/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;


import static java.awt.PageAttributes.MediaType.C;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import static javafx.print.Paper.C;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.C;
import static javax.print.attribute.standard.MediaSize.Engineering.C;
import static javax.print.attribute.standard.MediaSizeName.C;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * FXML Controller class
 *
 * @author faya
 */
public class DonneesapresController implements Initializable {

    @FXML
    private Button suivant;
    @FXML
    private Button precedent;
    @FXML
    private TableView<loader> tables;
    @FXML
    private TableColumn<loader, Integer> du_noeud;
    @FXML
    private TableColumn<loader, String> noeud_depart;
    @FXML
    private TableColumn<loader, Integer> au_noeud;
    @FXML
    private TableColumn<loader, String> noeud_arrivé;
    private TableColumn<loader, Integer> num_branche;
    @FXML
    private TableColumn<loader, String> type_branche;
//    private TableColumn<loader, Double> p;
//    private TableColumn<loader, Double> s;
//    private TableColumn<loader, Double> snom;
//    private TableColumn<loader, Double> spourcent;
//    private TableColumn<loader, Double> dp;
//    private TableColumn<loader, Double> dq;
//    private TableColumn<loader, Double> q;
    @FXML
    private Label PT;
    @FXML
    private Label PTR;
    @FXML
    private Label pp;
    @FXML
    private TextField PTN;
    @FXML
    private Label qq;
    @FXML
    private TextField PTRN;
    private String chemin;
    public static ArrayList<loader> lists = new ArrayList<loader>();
    @FXML
    private TableColumn<loader, Integer> circuit;
    @FXML
    private TableColumn<loader, Double> mva_avant;
    @FXML
    private TableColumn<loader, Double> mva_apres;
    @FXML
    private TableColumn<loader, Double> mva_pour_avant;
    @FXML
    private TableColumn<loader, Double> mva_pourcent_apres;
    @FXML
    private TableColumn<loader, Double> mw_pe_avant;
    @FXML
    private TableColumn<loader, Double> mw_pe_apres;
    @FXML
    private TableColumn<loader, Double> mvar_av;
    @FXML
    private TableColumn<loader, Double> mvar_apres;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chemin="C:\\Users\\faya\\Documents\\NetBeansProjects\\Compensateur\\Rapport1.xlsx";
        importer();
        
    }    

    @FXML
    private void on_suivant(ActionEvent event) throws IOException {
    
        Compensateur.changerVues("graphiqueavant.fxml");
    }

    @FXML
    private void on_precedent(ActionEvent event) throws IOException {
     Compensateur.changerVues("lignes.fxml");
    }
     public void importer() {

        tables.setVisible(true);
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //XSSFWorkbook wbW = new XSSFWorkbook();
                    XSSFWorkbook wbW = new XSSFWorkbook(new FileInputStream(chemin) );

                    //RÃ©cupÃ©ration de la cellule
                    XSSFSheet sheetIn = wbW.getSheetAt(0);
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
                    int i=2;
                    while(i<62){
                    loader l= new loader();
                    l.setFromn((int) sheetIn.getRow(i).getCell(0).getNumericCellValue());
                    l.setFromName(sheetIn.getRow(i).getCell(1).getStringCellValue());
                    l.setTonumber((int)sheetIn.getRow(i).getCell(2).getNumericCellValue());
                    l.setToname(sheetIn.getRow(i).getCell(3).getStringCellValue());
                    l.setCircuit(Integer.parseInt(sheetIn.getRow(i).getCell(4).getStringCellValue()));
                    l.setBranch(sheetIn.getRow(i).getCell(5).getStringCellValue());
                    l.setMva_avant(sheetIn.getRow(i).getCell(6).getNumericCellValue());
                    l.setMva_apres(sheetIn.getRow(i).getCell(7).getNumericCellValue());
                    l.setMva_pourcent_avant(sheetIn.getRow(i).getCell(8).getNumericCellValue());
                    l.setMva_pourcent_apres(sheetIn.getRow(i).getCell(9).getNumericCellValue());
                    l.setMwa_loss_avant(sheetIn.getRow(i).getCell(10).getNumericCellValue());
                    l.setMwa_loss_apres(sheetIn.getRow(i).getCell(11).getNumericCellValue());
                    l.setMva_loss_avant(sheetIn.getRow(i).getCell(12).getNumericCellValue());
                    l.setMva_loss_apres(sheetIn.getRow(i).getCell(12).getNumericCellValue());
                    lists.add(l);
                    i=i+1;
                    }}catch(Exception e){
                    e.getMessage();
                    }
                    tables.getItems().setAll(lists);
                    du_noeud.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getFromn());
                    });
                    noeud_depart.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getFromName());
                    });
                    au_noeud.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getTonumber());
                    });
                    noeud_arrivé.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getToname());
                    });
                    circuit.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getCircuit());
                    });
                    type_branche.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getBranch());
                    });
                    mva_avant.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_avant());
                    });
                    mva_apres.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_apres());
                    });
                    mva_pour_avant.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_pourcent_avant());
                    });
                    mva_pourcent_apres.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_pourcent_apres());
                    });
                    mw_pe_avant.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMwa_loss_avant());
                    });
                    mw_pe_apres.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMwa_loss_apres());
                    });
                    mvar_av.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_loss_avant());
                    });
                    mvar_apres.setCellValueFactory(param->{
                    loader n=param.getValue();
                    return new SimpleObjectProperty(n.getMva_loss_apres());
                    });
                    
                    
                   
                    PTN.setText("51.76 MW");
                    PTRN.setText("237.74 MVAR");
                   

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }
}
    
   // private void on_su(SortEvent<C> event) {
    //}

   // @FXML
   // private void on_pre(SortEvent<C> event) {
    //}
    

