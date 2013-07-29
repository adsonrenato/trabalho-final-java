/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;


import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Eric
 */
public class BannerThread extends Thread {
    private Banner banner;
    private long espera;


    /**
     *
     * @param gui
     */
    public BannerThread(Banner gui){
        
        this.banner = gui;
        //espera = 2s.
        this.espera = 2000;
    }
    
    public void Atualiza(){
       this.banner.Atualiza();
       this.banner.repaint();
        
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void run(){
        
        do{
            try {
                this.Atualiza();
                sleep(this.espera);
                //this.Atualiza();
        }   catch (InterruptedException ex) {
                Logger.getLogger(BannerThread.class.getName()).log(Level.SEVERE, null, ex);
        }}while(true);
        
        }
        
}        
       
    
    

        
