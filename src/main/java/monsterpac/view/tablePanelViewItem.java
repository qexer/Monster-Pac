/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.view;

import javax.swing.JLabel;
import monsterpac.domain.Position;

/**
 *
 * @author still
 */
public class tablePanelViewItem extends JLabel{
    
    public static final int SYMBOL_EMPTY = 0;
    public static final int SYMBOL_PLAYER = 1;
    public static final int SYMBOL_ENEMY = 2;
    public static final int SYMBOL_ITEM = 3;
    
    private Position pos;
    private int symbol;
    
    
    public tablePanelViewItem( String title, Position pos ) {
        super(title);
        this.pos = pos;
        this.symbol = tablePanelViewItem.SYMBOL_EMPTY;
    }
    
    public Position getPos() {
        return this.pos;
    }
    
    public void setSymbol( int symbol ) { 
        this.symbol = symbol;
        this.drawSymbol();
    }
    
    private void drawSymbol() {
        switch ( this.symbol ) {
            case tablePanelViewItem.SYMBOL_EMPTY:
                this.setText("");
                break;
                
            case tablePanelViewItem.SYMBOL_PLAYER:
                this.setText(" -o- ");
                break;
                
            case tablePanelViewItem.SYMBOL_ENEMY:
                this.setText(" -X- ");
                break;
                
            case tablePanelViewItem.SYMBOL_ITEM:
                this.setText(" O ");
                break;
        }
    }
}
