/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.domain;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author still
 */
public class GameView extends BaseView{
    
    private JPanel info;
    private tablePanelView table;
    
    public GameView( /*GameController controller*/ ) {
        super();
        this.title( "Game" );
        //this.info = new InfoPanel();
        this.table = new tablePanelView();
        
        this.init();
    }
    
    public void init() {
        this.setSize( 500, 500 );
        
//        info.setAlignmentX(Component.CENTER_ALIGNMENT);
//        info.setMinimumSize(new Dimension(500, 50));
//        info.setPreferredSize(new Dimension(500, 50));
//        info.setMaximumSize(new Dimension(500, 50));
        
        this.table.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.table.setMinimumSize(new Dimension(500, 500));
        this.table.setPreferredSize(new Dimension(500, 500));
        this.table.setMaximumSize(new Dimension(500, 500));
        this.table.setLayout( new GridLayout(10,10) );
        this.table.init();
        
        //this.addPane( info );
        this.addPane( this.table );
        
        //this.table.setScore();
    }
    
}
