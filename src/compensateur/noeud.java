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
public class noeud {
    private int num;
    private String nom;

    public noeud() {
    }

    public noeud(int num, String nom, int numb, double Q, double fpmax, double fpmin, double fpactu, double dev, double qmin, double qmax) {
        this.num = num;
        this.nom = nom;
        this.numb = numb;
        this.Q = Q;
        this.fpmax = fpmax;
        this.fpmin = fpmin;
        this.fpactu = fpactu;
        this.dev = dev;
        this.qmin = qmin;
        this.qmax = qmax;
    }
    private int numb;
    private double Q;
    private double fpmax;
    private double fpmin;
    private double fpactu;
    private double dev;
    private double qmin;
    private double qmax;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public double getQ() {
        return Q;
    }

    public void setQ(double Q) {
        this.Q = Q;
    }

    public double getFpmax() {
        return fpmax;
    }

    public void setFpmax(double fpmax) {
        this.fpmax = fpmax;
    }

    public double getFpmin() {
        return fpmin;
    }

    public void setFpmin(double fpmin) {
        this.fpmin = fpmin;
    }

    public double getFpactu() {
        return fpactu;
    }

    public void setFpactu(double fpactu) {
        this.fpactu = fpactu;
    }

    public double getDev() {
        return dev;
    }

    public void setDev(double dev) {
        this.dev = dev;
    }

    public double getQmin() {
        return qmin;
    }

    public void setQmin(double qmin) {
        this.qmin = qmin;
    }

    public double getQmax() {
        return qmax;
    }

    public void setQmax(double qmax) {
        this.qmax = qmax;
    }
}
