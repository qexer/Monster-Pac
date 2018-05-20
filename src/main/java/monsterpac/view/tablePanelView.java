/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import monsterpac.domain.Enemy;
import monsterpac.domain.Field;
import monsterpac.domain.Movable;
import monsterpac.domain.Player;
import monsterpac.domain.Position;

/**
 *
 * @author still
 */
public class tablePanelView extends JPanel {
    
    private ArrayList<tablePanelViewItem> items;
    
    public tablePanelView() {
        this.items = new ArrayList<>();
    }
    
    public void init() {
        
        int i = 0;
        int j = 0;
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        tablePanelViewItem item;
        
        
        for ( int k = 0; k < 100 ; ++k ) {    
            item = new tablePanelViewItem( "", new Position(i,j) );
            
            item.setBorder(border);
            this.add( item );
            this.items.add(item);
            
            
            ++j;
            if( i == 10 ) {
                i = 0;
                j = 0;
            }
            else if ( j == 10 ) {
                j = 0;
                ++i;
            }
        }
    }
    
    public void initElements( Field[][] fields ) {
        for ( int i = 0; i < fields.length; ++i )  {
            for ( int j = 0; j < fields[i].length; ++j ) {
                Field f = fields[i][j];
                
                tablePanelViewItem item = this.getItemByPos(new Position(i,j));
                        
                Movable m = f.getMovable();
                
                if ( m != null && m instanceof Player ) {
                    
                }
            }
        }
    }
    
    public void drawElements( HashMap<Movable, Position> positions ) {
        
         Iterator i = positions.entrySet().iterator();
            while (i.hasNext()) {
                Entry pair = (Entry)i.next();
                
                Movable m = (Movable)pair.getKey();
                Position p = (Position)pair.getValue();
                
                tablePanelViewItem item = this.getItemByPos(p);
                
                if ( m instanceof Enemy ) {
                    item.setSymbol( tablePanelViewItem.SYMBOL_ENEMY );
                }
                else if ( m instanceof Player ) {
                    item.setSymbol( tablePanelViewItem.SYMBOL_PLAYER );
                }
                else {
                    item.setSymbol( tablePanelViewItem.SYMBOL_ITEM );
                }
            }
    }
    
    public tablePanelViewItem getItemByPos( Position p ) {
        for ( tablePanelViewItem item : this.items ) {
            if ( item.getPos().getX() == p.getX() && item.getPos().getY() == p.getY() ) {
                return item;
            }
        }
        
        return null;
    }
}
