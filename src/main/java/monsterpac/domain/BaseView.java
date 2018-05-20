/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.domain;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.BoxLayout.Y_AXIS;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author still
 */
public class BaseView extends JFrame {
    
    private final String BASEGAME_TITLE = "Monster Pac";
    
    protected final ArrayList<BaseView> views;
    
    //protected GameController controller;
    
    public BaseView( /*GameController controller*/ ) {
        super();
        //this.controller = controller;
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        this.setResizable(false);
        this.setSize(480, 640);
        this.setVisible( true );
        this.setTitle( "Monster Pac" );
        this.setVisible(true);
        this.getContentPane().setLayout(new BoxLayout( this.getContentPane(), Y_AXIS ));
        this.views = new ArrayList<>();
    }
    
    protected void title( String title, boolean addGameTitle ) {
        
        String t = title;
        
        if ( addGameTitle ) {
            t = t + " - " + this.BASEGAME_TITLE;
        }
        this.setTitle( t );
    }
    
    protected void title ( String title ) {
        this.title( title, true );
    }
    
    public void open() {
        this.setVisible( true );
    }
    
    public void close() {
        this.setVisible( false );
    }
    
    public boolean isOpen() {
        return this.isVisible();
    }
    
    public void addPane( JPanel p ) {
        this.getContentPane().add(p);
        this.pack();
        this.open();
    }
}
