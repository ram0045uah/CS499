/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledslideshow;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Roberto Murcia
 */
public class ImageList {
    ImageList(){
    }
    public JList addImage2List(JList list, ImageIcon image){
        JLabel tempLabel = new JLabel();
        tempLabel.setIcon(image);
        list.add(tempLabel);
        return list;
    }
}
