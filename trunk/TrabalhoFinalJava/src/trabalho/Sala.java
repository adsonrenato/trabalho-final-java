/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

/**
 *
 * @author Rafael
 */
public class Sala 
{
    private int capacidade;
    private int numero;
    private boolean disponivel;
    
    public Sala(int capacidade,int numero)
    {
        this.capacidade=capacidade;
        this.numero=numero;
        this.disponivel = true;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
    public boolean isDisponivel() {
        return disponivel;
    }

    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public int getCapacidade() 
    {
        return capacidade;
    }
    
}
