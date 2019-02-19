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
public class load {
    private int du_noeud;
    private String noeud_depart;
    private int au_noeud;
    private String noeud_arriver;
    private int numero_branche;
     private String type_branche;
    private double p;
    private double q;
    private double s;
    private double snom;
    private double spourcent;
    private double dp;
    private double dq;
   
    

    public load() {
    }

    public load(int du_noeud, String noeud_depart, int au_noeud, String noeud_arriver, int numero_branche, String type_branche, double p, double q, double s, double snom, double spourcent, double dp, double dq) {
        this.du_noeud = du_noeud;
        this.noeud_depart = noeud_depart;
        this.au_noeud = au_noeud;
        this.noeud_arriver = noeud_arriver;
        this.numero_branche = numero_branche;
        this.type_branche = type_branche;
        this.p = p;
        this.q = q;
        this.s = s;
        this.snom = snom;
        this.spourcent = spourcent;
        this.dp = dp;
        this.dq = dq;
    }
   

    public int getDu_noeud() {
        return du_noeud;
    }

    public void setDu_noeud(int du_noeud) {
        this.du_noeud = du_noeud;
    }

    public String getNoeud_depart() {
        return noeud_depart;
    }

    public void setNoeud_depart(String noeud_depart) {
        this.noeud_depart = noeud_depart;
    }

    public int getAu_noeud() {
        return au_noeud;
    }

    public void setAu_noeud(int au_noeud) {
        this.au_noeud = au_noeud;
    }

    public String getNoeud_arriver() {
        return noeud_arriver;
    }

    public void setNoeud_arriver(String noeud_arriver) {
        this.noeud_arriver = noeud_arriver;
    }

    public int getNumero_branche() {
        return numero_branche;
    }

    public void setNumero_branche(int numero_branche) {
        this.numero_branche = numero_branche;
    }

    public String getType_branche() {
        return type_branche;
    }

    public void setType_branche(String type_branche) {
        this.type_branche = type_branche;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getSnom() {
        return snom;
    }

    public void setSnom(double snom) {
        this.snom = snom;
    }

    public double getSpourcent() {
        return spourcent;
    }

    public void setSpourcent(double spourcent) {
        this.spourcent = spourcent;
    }

    public double getDp() {
        return dp;
    }

    public void setDp(double dp) {
        this.dp = dp;
    }

    public double getDq() {
        return dq;
    }

    public void setDq(double dq) {
        this.dq = dq;
    }
    
    
}
