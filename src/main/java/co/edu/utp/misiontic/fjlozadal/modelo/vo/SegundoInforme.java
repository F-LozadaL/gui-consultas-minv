/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.modelo.vo;

/**
 *
 * @author Erjin
 */
//CONSUTLA 2 - DOS
public class SegundoInforme {
    private Integer id;
    private String constructora;
    private Integer num_habitaciones;
    private String ciudad;

    public SegundoInforme() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setNum_habitaciones(Integer num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public String getConstructora() {
        return constructora;
    }

    public Integer getNum_habitaciones() {
        return num_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }
    
}
