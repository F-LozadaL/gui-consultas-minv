/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erjin
 */
public class JDBCUtilities {
    private static final String BASE_DE_DATOS = "C:\\VSC-DOC\\Mintic Ciclo2\\Maven-Ciclo2\\GUI-Consultas\\src\\main\\resources\\ProyectosConstruccion.db";
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            var url = "jdbc:sqlite:" + BASE_DE_DATOS;
            connection = DriverManager.getConnection(url);
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
}
