/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Eric
 */
public class ListadeSalasTableModel extends AbstractTableModel{

    
    private ArrayList <Sala> salas;
    
    private static final String[] columnNames = {"Capacidade", "Disponível","Número"};
    
    public ListadeSalasTableModel(ArrayList <Sala> lista){
        this.salas = lista;
    }
    
    public Sala select(int index){
        return this.salas.get(index);
 
    }
    
 
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    @Override
    public int getRowCount() {
        return this.salas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0: return this.salas.get(linha).getCapacidade();
            case 1: return this.salas.get(linha).isDisponivel();
            case 2: return this.salas.get(linha).getNumero();
        }
        return null;
    }
    
}
