/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.vista.modelo;

import co.edu.utp.misiontic.fjlozadal.modelo.vo.SegundoInforme;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Erjin
 */
public class SegundoModelo extends AbstractTableModel{
    private List<SegundoInforme> informe;

    public SegundoModelo(List<SegundoInforme> informe) {
        this.informe = informe;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return informe.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Constructora";
            case 2:
                return "Numero de Habitaciones";
            case 3:
                return "Ciudad";
        }
        return super.getColumnName(column);
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        var registro = informe.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = registro.getId();
                break;
            case 1:
                value = registro.getConstructora();
                break;
            case 2:
                value = registro.getNum_habitaciones();
                break;
            case 3:
                value=registro.getCiudad();
                break;
        }
        return value;
    }
    
}
