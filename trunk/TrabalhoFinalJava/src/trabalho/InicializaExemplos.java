/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class InicializaExemplos {
    ArrayList <Sala> salas = new ArrayList <>();
    ArrayList <Sessao> sessoes = new ArrayList <>();

    public InicializaExemplos(){
        Sala sala1 = new Sala(50,100);
        Sala sala2 = new Sala(50,101);
        Sessao s1 = new Sessao(sala1,0,2210,"Pee Wee´s Big Adventure","01/01/2013");
        Sessao s2 = new Sessao(sala2,0,2210,"Beetlejuice","01/01/2013");
        this.salas.add(sala1);
        this.salas.add(sala2);
        this.sessoes.add(s1);
        this.sessoes.add(s2);
    }
    
    public ArrayList <Sala> getSalas(){
        return this.salas;
    }
    public ArrayList <Sessao> getSessoes(){
        return this.sessoes;
    }
}
