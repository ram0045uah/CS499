/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitledslideshow;

import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Roberto Murcia
 */
public class ClickPopUp extends JPopupMenu{
    /*
    Test Variables
    */
    private JMenuItem isJList;
    private JMenuItem isJLabel;
    
    
    /*
    Actual Variables
    */
    private JMenuItem addToImageReel;
    private JMenuItem addToSoundReel;
    private JMenuItem shiftLeft;
    private JMenuItem shiftRight;
    private JMenuItem removeItem;
    public ClickPopUp(Component c){
        if(c.getClass() == JList.class && "imagesList".equals(c.getName())){
            isJList = new JMenuItem("This is a JList");
            addToImageReel = new JMenuItem("Add to Slideshow Reel");
            add(addToImageReel);
            addToImageReel.setMnemonic(MouseEvent.MOUSE_CLICKED);
            addToImageReel.setToolTipText("Adds this image to the image reel.");
            
        }
        else if(c.getClass() == JLabel.class){
            isJList = new JMenuItem("This is a JLabel");
        }
        else{
            JMenuItem isNotJList = new JMenuItem("Not a JList");
            add(isNotJList);
            System.out.println(c.getClass().getName());
        }
        
        
        
    }
    
    
}
