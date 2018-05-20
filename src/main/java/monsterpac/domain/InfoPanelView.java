/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.domain;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author still
 */
public class InfoPanelView extends JPanel {
    
    private JLabel alive;
    private JLabel score;
    
    public InfoPanelView() {
        this.init();
    }
    
    public void init() {
        this.alive = new JLabel( "Alive: Yes" );
        this.score = new JLabel( "Score: 10" );
        
        this.add( this.alive );
        this.add( this.score );
    }
    
    public void setScore( int score ) {
        this.score.setText( "Score: " + score );
    }
    
    public void setAlive( boolean alive ) {
        if ( !alive ) {
            this.alive.setText("Alive: No");
        }
    }
    
}

