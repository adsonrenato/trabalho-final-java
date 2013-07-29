/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Rafael
 */
public class Sessao 
{
    private Sala sala;
    private int vendidos;
    private int horario;
    private String filme;
    private String data;

    public Sessao(Sala sala, int vendidos, int horario, String filme, String data) {
        this.sala = sala;
        this.vendidos = vendidos;
        this.horario = horario;
        this.filme = filme;
        this.data = data;
        this.sala.setDisponivel(false);
    }

    public Sala getSala() {
        return sala;
    }

    public int getVendidos() {
        return vendidos;
    }

    public int getHorario() {
        return horario;
    }

    public String getFilme() {
        return filme;
    }

    public String getData() {
        return data;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    
    public void vendeUm(){
        this.vendidos++;
    }
    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
