/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitledslideshow;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Roberto Murcia
 */
public class RightClickListener extends MouseAdapter{
    @Override
    public void mousePressed(MouseEvent e){
        if(e.isPopupTrigger()){
            showPopUp(e);
        }
    }
    @Override
    public void mouseReleased(MouseEvent e){
        if(e.isPopupTrigger()){
            showPopUp(e);
        }
    }
    public void showPopUp(MouseEvent e){
        RightClickPopUp popUp = new RightClickPopUp();
        popUp.show(e.getComponent(), e.getX(), e.getY());
    }
}
