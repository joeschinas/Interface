/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    private Integer numContrato;
    private Date moment;
    private Double valorContrato;
    private List<Parcelas> listParcelas = new ArrayList<>();

    public Contrato() {
    }
    
    public Contrato(Integer numContrato, Date moment, Double valorContrato) {
    this.numContrato = numContrato;
    this.moment = moment;
    this.valorContrato = valorContrato;
    }
    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(Double valorContrato) {
        this.valorContrato = valorContrato;
    }
    public void addParcela(Parcelas parcela){
    listParcelas.add(parcela);
    }
    public void removeParcela(Parcelas parcela){
    listParcelas.remove(parcela);
    }

   
}
