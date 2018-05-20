/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.domain;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author still
 */
public class tablePanelView extends JPanel {
    
    public JLabel alive;
    
    public JLabel score;
    
    public tablePanelView() {
        
    }
    
    public void init() {
//        this.score = new JLabel("Score: 1sdasdsad0");
//        this.alive = new JLabel("Alive: Yes");
//        Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
//        this.alive.setBorder(border);
//        this.add( this.alive );
//        this.add( this.score );
        
        for ( int i = 0; i < 100 ; ++i ) {
            JLabel l = new JLabel( "ASD"+ i, JLabel.CENTER );
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            l.setBorder(border);
            
            this.add( l );
        }
    }
    
    public void setScore() {
        this.score.setText("Score: 0");
    }
    
}
