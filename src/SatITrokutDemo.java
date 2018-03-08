/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JApplet;

/**
 *
 * @author Bogstar
 */
public class SatITrokutDemo extends JApplet {

    @Override
    public void init() {
        add(new GuiLayout());
        setSize(300, 300);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
