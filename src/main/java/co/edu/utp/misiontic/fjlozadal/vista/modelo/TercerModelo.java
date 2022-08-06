/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utp.misiontic.fjlozadal.vista.modelo;

import co.edu.utp.misiontic.fjlozadal.modelo.vo.TercerInforme;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Erjin
 */
public class TercerModelo extends AbstractTableModel{
    
    private List<TercerInforme> informe;

    public TercerModelo(List<TercerInforme> informe) {
        this.informe = informe;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return informe.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id de Compra";
            case 1:
                return "Constructora";
            case 2:
                return "Banco Vinculado";
        }
        return super.getColumnName(column);
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        var registro = informe.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = registro.getId_compra();
                break;
            case 1:
                value = registro.getConstructora();
                break;
            case 2:
                value = registro.getBanco_vinculado();
                break;
        }
        return value;
    }
    
}
