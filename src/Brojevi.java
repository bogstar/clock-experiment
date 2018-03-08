
import java.awt.Color;
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
public class Brojevi {
    
    public static void nula(Graphics g){
        g.setColor(Color.red);
        Crtanje.Upper(g);
        Crtanje.UpperLeft(g);
        Crtanje.UpperRight(g);
        Crtanje.BottomLeft(g);
        Crtanje.BottomRight(g);
        Crtanje.Bottom(g);
        g.setColor(Color.white);
        Crtanje.Middle(g);
    }
    
    public static void jedan(Graphics g){
        g.setColor(Color.white);
        Crtanje.Upper(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.BottomLeft(g);
        Crtanje.Bottom(g);
        g.setColor(Color.red);
        Crtanje.UpperRight(g);
        Crtanje.BottomRight(g);
    }
    
    public static void dva(Graphics g){
        g.setColor(Color.white);
        Crtanje.UpperLeft(g);
        Crtanje.BottomRight(g);
        g.setColor(Color.red);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.Bottom(g);
        Crtanje.Middle(g);
        Crtanje.BottomLeft(g);
    }
    
    public static void tri(Graphics g){
        g.setColor(Color.white);
        Crtanje.UpperLeft(g);
        Crtanje.BottomLeft(g);
        g.setColor(Color.red);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.Bottom(g);
        Crtanje.Middle(g);
        Crtanje.BottomRight(g);
    }
    
    public static void cetiri(Graphics g){
        g.setColor(Color.white);
        Crtanje.BottomLeft(g);
        Crtanje.Upper(g);
        Crtanje.Bottom(g);
        g.setColor(Color.red);
        Crtanje.UpperLeft(g);
        Crtanje.UpperRight(g);
        Crtanje.Middle(g);
        Crtanje.BottomRight(g);
    }
    
    public static void pet(Graphics g){
        g.setColor(Color.white);
        Crtanje.BottomLeft(g);
        Crtanje.UpperRight(g);
        g.setColor(Color.red);
        Crtanje.Upper(g);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.BottomRight(g);
    }
    
    public static void sest(Graphics g){
        g.setColor(Color.white);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        g.setColor(Color.red);
        Crtanje.BottomLeft(g);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.BottomRight(g);
    }
    
    public static void sedam(Graphics g){
        g.setColor(Color.white);
        Crtanje.BottomLeft(g);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        g.setColor(Color.red);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.BottomRight(g);
    }
    
    public static void osam(Graphics g){
        g.setColor(Color.red);
        Crtanje.BottomLeft(g);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.BottomRight(g);
    }
    
    public static void devet(Graphics g){
        g.setColor(Color.white);
        Crtanje.BottomLeft(g);
        g.setColor(Color.red);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.BottomRight(g);
    }
    
    public static void empty(Graphics g){
        g.setColor(Color.white);
        Crtanje.BottomLeft(g);
        Crtanje.Bottom(g);
        Crtanje.UpperLeft(g);
        Crtanje.Middle(g);
        Crtanje.Upper(g);
        Crtanje.UpperRight(g);
        Crtanje.BottomRight(g);
    }
}
