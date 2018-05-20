/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import monsterpac.domain.GameController;
import monsterpac.domain.Table;
import monsterpac.main.Main;

/**
 *
 * @author still
 */
public class GameView extends BaseView implements Runnable{
    
    private InfoPanelView info;
    private tablePanelView table;
    
    public GameView() {
        super();
        this.title( "Game" );
        this.info = new InfoPanelView();
        this.table = new tablePanelView();
        
        this.init();
    }
    
    public void init() {
        this.setSize( 500, 500 );
        
        this.info.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.info.setMinimumSize(new Dimension(500, 20));
        this.info.setPreferredSize(new Dimension(500, 20));
        this.info.setMaximumSize(new Dimension(500, 20));
        
        this.table.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.table.setMinimumSize(new Dimension(500, 500));
        this.table.setPreferredSize(new Dimension(500, 500));
        this.table.setMaximumSize(new Dimension(500, 500));
        this.table.setLayout( new GridLayout(10,10) );
        this.table.init();
        
        this.addPane( this.info );
        this.addPane( this.table );
    }
    
    @Override
    public void run() {
        this.updateView();
    }
    
    private void updateView() {
        Table t = Main.controller.getGame().getTable();
        
        this.info.setScore( t.getPlayer().getScore() );
        this.info.setAlive(t.playerIsAlive());
    }
}
