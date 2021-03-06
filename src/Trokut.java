
import java.awt.Graphics;
import java.awt.event.*;
import static java.lang.Math.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bogstar
 */

public class Trokut extends javax.swing.JPanel {
    
    public boolean naprijedON = true;
    public int diskretnipok = 60;
    public int brojKutova = 3;
    
    private final int promjer = 248;
    private final int polumjer = promjer / 2;
    private final Timer okidac;
    private final int interval = 1000;
    private float[] coordX;
    private float[] coordY;
    private float kut = 180 + (360 / diskretnipok);
    private float kutMeduTockama = 360 / brojKutova;

    public Trokut() {
        initValues();
        initComponents();
        izracunajXYTrokuta();
        okidac = new Timer(interval, new AkcijaTajmera());
    }
    
    class AkcijaTajmera implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            izracunajXYTrokuta();
            repaint();
        }
    }
    
    private void izracunajXYTrokuta(){
        kutMeduTockama = 360 / brojKutova;
        if (naprijedON){
            kut = kut - (360 / diskretnipok);
            if (kut < 0){
                kut = kut + 360;
            }
        }else{
            kut = kut + (360 / diskretnipok);
            if (kut > 0){
                kut = kut - 360;
            }
        }
        for (int i = 0; i < brojKutova; i++) {
            coordX[i] = (float) ((sin(Funktions.degtorad(kut) + i * Funktions.degtorad(kutMeduTockama)) * polumjer) + polumjer);
            coordY[i] = (float) ((cos(Funktions.degtorad(kut) + i * Funktions.degtorad(kutMeduTockama)) * polumjer) + polumjer);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        NacrtajOkvir(g);
        NacrtajLinije(g);
    }
    
    private void NacrtajOkvir(Graphics g){
        g.drawOval(0, 0, promjer, promjer);
    }
    
    private void NacrtajLinije(Graphics g){
        for (int i = 0; i < brojKutova; i++) {
            g.drawLine((int) coordX[i], (int) coordY[i], (int) coordX[(i < brojKutova - 1) ? i+1 : 0], (int) coordY[(i < brojKutova - 1) ? i+1 : 0]);
        }
    }
    
    public void TurnONOFF(boolean a){
        if (a){
            okidac.start();
        }else{
            okidac.stop();
        }
    }

    private void initValues(){
        coordX = new float[25];
        coordY = new float[25];
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(250, 250));
        setMinimumSize(new java.awt.Dimension(250, 250));
        setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
