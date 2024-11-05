/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author root
 */
public class TextBox extends JTextField{ 
    private Color backgroundColor = Color.WHITE;

    public TextBox() {
        setBackground(new Color(255,255,255,0));
        setOpaque(false);
        setSelectionColor(new Color(80,199,255));
    }

    

    @Override
    protected void paintComponent(Graphics grphcs) {
        int lebar = getWidth();
        int tinggi = getHeight();
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.fillRoundRect(0,0, lebar, tinggi, tinggi,tinggi);
        g2.setBackground(backgroundColor);
        super.paintComponent(grphcs);
    }
    
    
}
