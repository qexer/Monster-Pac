/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterpac.main;

import monsterpac.domain.GameController;
import monsterpac.view.MenuView;
import monsterpac.view.GameView;

/**
 *
 * @author still
 */
public class Main {
    
    public static MenuView menu;
    public static GameView table;
    
    public static void main( String args[] ) {
        //@TODO: Factory
        GameController controller = null;
        
        Main.menu = new MenuView( controller );
        Main.table = new GameView( controller );
        
        Main.table.close();
        Main.menu.open();
    }
}
