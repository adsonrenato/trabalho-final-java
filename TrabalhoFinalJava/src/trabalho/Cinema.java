/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rafael
 */
public class Cinema extends AbstractTableModel 
{
    private static final String[] columnNames = {"Filme", "Sala", "Ingressos", "Horário"};
    private ArrayList <Sala> salas;
    private ArrayList <Sessao> sessoes;
    
    public Cinema()
    {          
        InicializaExemplos s = new InicializaExemplos();
        this.salas=s.getSalas();
        this.sessoes= s.getSessoes();
    }
    
    public ArrayList<Sala> getSalas() {
        return this.salas;
    }

    public ArrayList<Sessao> getSessoes() {
        return this.sessoes;
    }
    public void add_sala(Sala sala)
    {
        salas.add(sala);
    }
    public void add_sessoes(Sessao sessao)
    {
        this.sessoes.add(sessao);
    }
    public void remove_sala(Sala sala)
    {
        this.salas.remove(sala);
    }
    public void remove_sessao(Sessao sessao)
    {
        this.sessoes.remove(sessao);
    }
    
    public boolean vendeIngresso(Sessao s){
        if(s.getVendidos()!=s.getSala().getCapacidade()){
            s.vendeUm();
            return true;
        }
        else 
            return false;
    }
    public ArrayList<String> gera_relatorio()
    {
        ArrayList <String> relatorio = new ArrayList();
        relatorio.add("FILME,VENDIDOS\n");
        for(Sessao tmp: this.sessoes)
        {
            relatorio.add(tmp.getFilme()+","+Integer.toString(tmp.getVendidos()));
        }
        return relatorio;
    }
    public void grava_relatorio() 
    {
        try{

            //Criação de um buffer para a escrita em uma stream
            BufferedWriter StrW = new BufferedWriter(new FileWriter("tabela.csv"));
            //Escrita dos dados da tabela
            for(String tmp:this.gera_relatorio())
            {
                 StrW.write(tmp);
                 StrW.newLine();
            }
              
            //Fechamos o buffer
                StrW.close(); 
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace(); 
        }
        catch (IOException e)
        {   
            e.printStackTrace(); 
        } 

    }
    public String le_relatorio()
    {
        String relatorio=new String();
        //A estrutura try-catch é usada pois o objeto BufferedWriter exige que as
        //excessões sejam tratadas
        try 
        {
            //Criação de um buffer para a ler de uma stream
            BufferedReader StrR = new BufferedReader(new FileReader("tabela.csv"));
            String Str;
            String[] TableLine;
            //Essa estrutura do looping while é clássica para ler cada linha
            //do arquivo 
            while((Str = StrR.readLine())!= null)
            {
                relatorio+=Str;
                relatorio+="\n";
            }
            //Fechamos o buffer
            StrR.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return relatorio;
    }

    public Sessao select(int index){
        return this.sessoes.get(index);
 
    }
    public void update(){
        int linha = getRowCount()-1;  
        fireTableRowsInserted(linha,linha);
    }
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public int getRowCount() {
       return this.sessoes.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0: return this.sessoes.get(linha).getFilme();
            case 1: return this.sessoes.get(linha).getSala().getNumero();
            case 2: return (this.sessoes.get(linha).getSala().getCapacidade()-this.sessoes.get(linha).getVendidos());
            case 3: return this.sessoes.get(linha).getHorario();
        }
        return null;
    }
}
