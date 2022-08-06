/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.modelo.dao;

import co.edu.utp.misiontic.fjlozadal.modelo.vo.PrimerInforme;
import co.edu.utp.misiontic.fjlozadal.modelo.vo.SegundoInforme;
import co.edu.utp.misiontic.fjlozadal.modelo.vo.TercerInforme;
import co.edu.utp.misiontic.fjlozadal.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erjin
 */
public class ConsultasDAO {

    public ConsultasDAO() {
    }

    public List<PrimerInforme> generarPrimerInforme() throws SQLException {
        var respuesta = new ArrayList<PrimerInforme>();
        ResultSet rset = null;
        try ( Statement stm = JDBCUtilities.getConnection().createStatement()) {
            rset = stm.executeQuery("SELECT ID_Lider AS Id, Nombre, Primer_Apellido AS Apellido, Ciudad_Residencia AS Ciudad FROM Lider ORDER BY Ciudad_Residencia;");
            
            while (rset.next()) {
                var row = new PrimerInforme();
                row.setId_lider(rset.getInt("Id"));
                row.setNombre(rset.getString("Nombre"));
                row.setApellido(rset.getString("Apellido"));
                row.setCiudad(rset.getString("Ciudad"));
                respuesta.add(row);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
        }
        System.out.println("Antes de Retornar");
        return respuesta;
    }

    public List<SegundoInforme> generarSegundoInforme() throws SQLException {
        var respuesta = new ArrayList<SegundoInforme>();
        ResultSet rset = null;
        try ( Statement stm = JDBCUtilities.getConnection().createStatement()) {
            rset = stm.executeQuery("SELECT Id_Proyecto AS Id, Constructora, Numero_Habitaciones AS \"Numero de Habitaciones\", Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND Ciudad IN ('Santa Marta' ,'Cartagena' ,'Barranquilla');");
            while (rset.next()) {
                var row = new SegundoInforme();
                row.setId(rset.getInt("Id"));
                row.setConstructora(rset.getString("Constructora"));
                row.setNum_habitaciones(rset.getInt("Numero de Habitaciones"));
                row.setCiudad(rset.getString("Ciudad"));
                respuesta.add(row);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
        }
        return respuesta;
    }

    public List<TercerInforme> generarTercerInforme() throws SQLException {
        var respuesta = new ArrayList<TercerInforme>();
        ResultSet rset = null;
        try ( Statement stm = JDBCUtilities.getConnection().createStatement()) {
            rset = stm.executeQuery("SELECT ID_Compra AS 'Id de Compra', Constructora , Banco_Vinculado AS 'Banco Vinculado'"
                    + "FROM Compra c JOIN Proyecto p ON p.ID_Proyecto=c.ID_Proyecto "
                    + "WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento';");
            while (rset.next()) {
                var row = new TercerInforme();
                row.setId_compra(rset.getInt("Id de Compra"));
                row.setConstructora(rset.getString("Constructora"));
                row.setBanco_vinculado(rset.getString("Banco Vinculado"));
                respuesta.add(row);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
        }
        return respuesta;
    }

}
