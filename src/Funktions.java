
import static java.lang.Math.PI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bogstar
 */
public class Funktions {
    
    public static float degtorad(float degs){
        float rads;
        rads = (float) (degs * (PI/180));
        return rads;
    }
}