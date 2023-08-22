/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predictingatriskstudents;

import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */

public class Main {
    public static void main(String[] args) throws Exception 
    {        
        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        
        MainFrame mf=new MainFrame();
        mf.setTitle("Main Frame");
        mf.setVisible(true);
        mf.setResizable(false);               
    }
}