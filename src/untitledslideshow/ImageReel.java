/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledslideshow;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JList;

/**
 *
 * @author Roberto Murcia
 */
public class ImageReel extends JList{
    DefaultListModel imageModel;

    public ImageReel(ArrayList<DisplayImage> list) {
        super(new DefaultListModel());
        imageModel = (DefaultListModel) getModel();
        this.setDragEnabled(true);
        this.setDropMode(DropMode.ON_OR_INSERT);
        
        setTransferHandler(new DropHandler(this));
        imageModel.addElement(list.get(0).getImage());
        imageModel.addElement(list.get(1).getImage());
        imageModel.addElement(list.get(2).getImage());
        this.setFixedCellHeight(150);
        this.setFixedCellWidth(150);
        this.setAutoscrolls(true);
        this.setVisibleRowCount(1);
        this.setLayoutOrientation(HORIZONTAL_WRAP);

        new ItemDragListener(this);
        
    }
   
}
