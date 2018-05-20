/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import monsterpac.domain.GameController;
import monsterpac.main.Main;

/**
 *
 * @author still
 */
public class MenuView extends BaseView implements ActionListener {
    
    public MenuView() {
        super();
        this.title( "Menu" );
        this.init();
    }
    
    public void init() {
        
        JPanel titlePanel = new JPanel();
        JPanel btnPanel = new JPanel();
        
        titlePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.setMinimumSize(new Dimension(480, 150));
        titlePanel.setPreferredSize(new Dimension(480, 150));
        titlePanel.setMaximumSize(new Dimension(480, 150));
        
        btnPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnPanel.setPreferredSize(new Dimension(480, 50));
        btnPanel.setMaximumSize(new Dimension(480, 50));
        
        String h1 = 
            "<html>"
                + "<body style='width: 350px'>"
                    + "<h1>"
                        + "<center>Menu</center>"
                    + "</h1> "
                    + "<p>"
                        + "Welcome to Monster Pac! Click the \"start\" button to start a new game. Documentation is available in the install folder."
                    + "</p>"
                    + "<p>"
                        + "Creators: ..."
                    + "</p>"
                + "</body"
            + "</html>";
        
        JLabel title = new JLabel( h1 );
        titlePanel.add( title );
        
        JButton btn = new JButton("<html><div><center>Start</center></div></html>");
        btn.setFocusable( false);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.addActionListener( this);
        btnPanel.add( btn );        
        
        this.addPane(titlePanel);
        this.addPane(btnPanel);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch ( command ) {
            case "<html><div><center>Start</center></div></html>":
                Main.menu.close();
                Main.table.open();
                break;
        }
    }
}
