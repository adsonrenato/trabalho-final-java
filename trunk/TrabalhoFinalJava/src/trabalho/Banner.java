/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Eric
 */
public class Banner extends JLabel{
    //indica qual a imagem atualmente no banner;
    private int ImageKey = 1;
    
    
    /**
     *
     * @param valor
     */
    public int getImageKey(){
        return this.ImageKey;
    }
    public void setImageKey(int valor){
        this.ImageKey = valor;
    }
    
    public void Atualiza(){
        if(this.ImageKey == 1)
            this.ImageKey = 2;
        else
            this.ImageKey = 1;
        
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        if(this.ImageKey == 1){
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/No guts No glory.jpg")));
        
        }
        else{
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/banner2.jpg")));
           
        }
    }
    
    
    
    
}
