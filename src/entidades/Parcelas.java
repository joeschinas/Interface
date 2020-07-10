/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;


public class Parcelas {
    private Date venc;
    private Double quantidade;

    public Parcelas(Date venc, Double quantidade) {
        this.venc = venc;
        this.quantidade = quantidade;
    }

    public Date getVenc() {
        return venc;
    }

    public void setVenc(Date venc) {
        this.venc = venc;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    
}
