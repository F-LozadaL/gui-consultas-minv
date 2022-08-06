/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.modelo.vo;

/**
 *
 * @author Erjin
 */
//CONSUTLA 1 - UNO
public class PrimerInforme {
    private Integer id_lider;
    private String nombre;
    private String apellido;
    private String ciudad;

    public PrimerInforme() {
    }

    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getId_lider() {
        return id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
}
