package co.edu.utp.misiontic.fjlozadal.controlador;

import co.edu.utp.misiontic.fjlozadal.modelo.dao.ConsultasDAO;
import co.edu.utp.misiontic.fjlozadal.modelo.vo.PrimerInforme;
import co.edu.utp.misiontic.fjlozadal.modelo.vo.SegundoInforme;
import co.edu.utp.misiontic.fjlozadal.modelo.vo.TercerInforme;
import java.sql.SQLException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Erjin
 */
public class GUIController {

    private ConsultasDAO consultas;

    public GUIController() {
        this.consultas = new ConsultasDAO();
    }

    public List<PrimerInforme> pimerInforme() throws SQLException {
        System.out.println("1");
        return consultas.generarPrimerInforme();
    }

    public List<SegundoInforme> segundoInforme() throws SQLException {
        return consultas.generarSegundoInforme();
    }

    public List<TercerInforme> tercerInforme() throws SQLException {
        return consultas.generarTercerInforme();
    }
}
