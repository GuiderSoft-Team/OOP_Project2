package day033;

public class Daire extends Sekil{
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public Daire() {
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    double alanHesapla() {
        return Math.PI*Math.pow(yaricap,2);
    }

    @Override
    double cevreHesapla() {
        return 2*Math.PI*yaricap;
    }

    @Override
    void ciz() {
        System.out.println("Daire çizildi.");
    }
}
