
package model;

public class Equipamento {
    private int pos;
    private String nomeEq;
    private double potencia;
    private double tempo;
    private String medida;
    private double kwh;
    private double reais;

    
    //--- GET E SET---\\
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getNomeEq() {
        return nomeEq;
    }

    public void setNomeEq(String nomeEq) {
        this.nomeEq = nomeEq;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public double getKwh() {
        return kwh;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }

    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }
    
    
    
}
