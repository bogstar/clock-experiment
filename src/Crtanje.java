
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BogstarLap
 */
public class Crtanje {
    
    private final static int DimY = 200;
    private final static int DimX = DimY / 2;
    
    public static void Upper(Graphics g){
        g.drawLine(0, 0, DimX, 0);
    }
    
    public static void UpperLeft(Graphics g){
        g.drawLine(0, 0, 0, DimX);
    }
    
    public static void UpperRight(Graphics g){
        g.drawLine(DimX, 0, DimX, DimX);
    }
    
    public static void Middle(Graphics g){
        g.drawLine(0, DimX, DimX, DimX);
    }
     
    public static void BottomLeft(Graphics g){
        g.drawLine(0, DimX, 0, DimY);
    }
    
    public static void Bottom(Graphics g){
        g.drawLine(0, DimY, DimX, DimY);
    }
    
    public static void BottomRight(Graphics g){
        g.drawLine(DimX, DimX, DimX, DimY);
    }
}
