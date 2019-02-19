/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compensateur;

/**
 *
 * @author faya
 */
public class loader {
    private int fromn;
    private String fromName;
    private int tonumber ;
    private String toname;
    private int circuit;
    private String branch ;
    private double mva_avant;
    private double mva_apres;
    private double mva_pourcent_avant;
    private double mva_pourcent_apres;
    private double mwa_loss_avant;
    private double mwa_loss_apres;
    private double mva_loss_avant;
    private double mva_loss_apres;

    public loader(int fromn, String fromName, int tonumber, String toname, int circuit, String branch, double mva_avant, double mva_apres, double mva_pourcent_avant, double mva_pourcent_apres, double mwa_loss_avant, double mwa_loss_apres, double mva_loss_avant, double mva_loss_apres) {
        this.fromn = fromn;
        this.fromName = fromName;
        this.tonumber = tonumber;
        this.toname = toname;
        this.circuit = circuit;
        this.branch = branch;
        this.mva_avant = mva_avant;
        this.mva_apres = mva_apres;
        this.mva_pourcent_avant = mva_pourcent_avant;
        this.mva_pourcent_apres = mva_pourcent_apres;
        this.mwa_loss_avant = mwa_loss_avant;
        this.mwa_loss_apres = mwa_loss_apres;
        this.mva_loss_avant = mva_loss_avant;
        this.mva_loss_apres = mva_loss_apres;
    }

    public loader() {
    }

    public int getFromn() {
        return fromn;
    }

    public void setFromn(int fromn) {
        this.fromn = fromn;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public int getTonumber() {
        return tonumber;
    }

    public void setTonumber(int tonumber) {
        this.tonumber = tonumber;
    }

    public String getToname() {
        return toname;
    }

    public void setToname(String toname) {
        this.toname = toname;
    }

    public int getCircuit() {
        return circuit;
    }

    public void setCircuit(int circuit) {
        this.circuit = circuit;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getMva_avant() {
        return mva_avant;
    }

    public void setMva_avant(double mva_avant) {
        this.mva_avant = mva_avant;
    }

    public double getMva_apres() {
        return mva_apres;
    }

    public void setMva_apres(double mva_apres) {
        this.mva_apres = mva_apres;
    }

    public double getMva_pourcent_avant() {
        return mva_pourcent_avant;
    }

    public void setMva_pourcent_avant(double mva_pourcent_avant) {
        this.mva_pourcent_avant = mva_pourcent_avant;
    }

    public double getMva_pourcent_apres() {
        return mva_pourcent_apres;
    }

    public void setMva_pourcent_apres(double mva_pourcent_apres) {
        this.mva_pourcent_apres = mva_pourcent_apres;
    }

    public double getMwa_loss_avant() {
        return mwa_loss_avant;
    }

    public void setMwa_loss_avant(double mwa_loss_avant) {
        this.mwa_loss_avant = mwa_loss_avant;
    }

    public double getMwa_loss_apres() {
        return mwa_loss_apres;
    }

    public void setMwa_loss_apres(double mwa_loss_apres) {
        this.mwa_loss_apres = mwa_loss_apres;
    }

    public double getMva_loss_avant() {
        return mva_loss_avant;
    }

    public void setMva_loss_avant(double mva_loss_avant) {
        this.mva_loss_avant = mva_loss_avant;
    }

    public double getMva_loss_apres() {
        return mva_loss_apres;
    }

    public void setMva_loss_apres(double mva_loss_apres) {
        this.mva_loss_apres = mva_loss_apres;
    }
    
}