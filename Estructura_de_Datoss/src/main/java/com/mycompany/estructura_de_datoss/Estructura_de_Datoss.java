package com.mycompany.estructura_de_datoss;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class Estructura_de_Datoss {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        VentanaPrincipal ven1 = new VentanaPrincipal();
        ven1.setVisible(true);
        
       
        UIManager.put("OptionPane.background", new Color (224,140, 47));
        UIManager.put("Panel.background", new Color (224, 140, 47));
        UIManager.put("OptionPane.messageForeground",Color.white);
        ImageIcon icono = new ImageIcon ("Pitufo1.png");    
        JOptionPane.showMessageDialog(ven1, "       EQUIPO: \nLOS PITUFOS \n        1311", "Bienvenida", 
                JOptionPane.OK_OPTION, icono);
        
        
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);
        UIManager.put("OptionPane.messageForeground",Color.black);
    }
}
