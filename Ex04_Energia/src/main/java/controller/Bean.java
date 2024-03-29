
package controller;

import java.io.Serializable;
import javax.faces.bean.*;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    public Bean() {
    }

private String cpNomeEq;
private String cpPotencia;
private String cpTempo;
private String cpUnidade;
private String cpValor;
private String cpTotal;

//// GET E SET////

    public String getCpNomeEq() {
        return cpNomeEq;
    }

    public void setCpNomeEq(String cpNomeEq) {
        this.cpNomeEq = cpNomeEq;
    }

    public String getCpPotencia() {
        return cpPotencia;
    }

    public void setCpPotencia(String cpPotencia) {
        this.cpPotencia = cpPotencia;
    }

    public String getCpTempo() {
        return cpTempo;
    }

    public void setCpTempo(String cpTempo) {
        this.cpTempo = cpTempo;
    }

    public String getCpUnidade() {
        return cpUnidade;
    }

    public void setCpUnidade(String cpUnidade) {
        this.cpUnidade = cpUnidade;
    }

    public String getCpValor() {
        return cpValor;
    }

    public void setCpValor(String cpValor) {
        this.cpValor = cpValor;
    }

    public String getCpTotal() {
        return cpTotal;
    }

    public void setCpTotal(String cpTotal) {
        this.cpTotal = cpTotal;
    }



    
}
