/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.modelo.vo;

/**
 *
 * @author Erjin
 */
//CONSUTLA 3 - TRES
public class TercerInforme {
    
    private Integer id_compra;
    private String constructora;
    private String banco_vinculado;

    public TercerInforme() {
    }

    public void setId_compra(Integer id_compra) {
        this.id_compra = id_compra;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }

    public Integer getId_compra() {
        return id_compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getBanco_vinculado() {
        return banco_vinculado;
    }
    
}
