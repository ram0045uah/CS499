/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitledslideshow;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Roberto Murcia
 */
public class RightClickPopUp extends JPopupMenu{
    
    public RightClickPopUp(){
        JMenuItem addToImageReel = new JMenuItem("Add to Slideshow Reel");
        JMenuItem addToSoundReel = new JMenuItem("Add to Sound Reel");
        JMenuItem shiftLeft = new JMenuItem("Shift Left");
        JMenuItem shiftRight = new JMenuItem("Shift Right");
        JMenuItem removeItem = new JMenuItem("Remove Item");
        removeItem.createToolTip();
        add(addToImageReel); add(addToSoundReel); add(shiftLeft); add(shiftRight); add(removeItem);
    }
    
}
