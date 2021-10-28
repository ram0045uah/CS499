/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledslideshow;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JList;

/**
 *
 * @author Roberto Murcia
 */
public class ImageReel extends JList{
    private DefaultListModel imageModel;
    private int modelSize;

    public ImageReel(ArrayList<DisplayImage> list) {
        super(new DefaultListModel());
        this.setName("imageReel");
        imageModel = (DefaultListModel) getModel();
        this.setFixedCellHeight(150);
        this.setFixedCellWidth(150);
        this.setAutoscrolls(true);
        this.setVisibleRowCount(1);
        this.setLayoutOrientation(HORIZONTAL_WRAP);
        this.addMouseListener(new ClickListener());
        this.setSize(500, 1000);
        modelSize = imageModel.size();
    }
    public void addImage2Reel(ImageIcon image, int index){
        this.imageModel.add(index, image);
        this.modelSize++;
    }
    public void removeImageFromReel(int index){
        this.imageModel.remove(index);
        this.modelSize--;
    }
    public void shiftLeft(int index){
        if(index - 1 < 0){
            System.out.println("Cannot shift left, out of index");
        }
        else{
            var tempElement = this.imageModel.getElementAt(index);
            var tempElement2 = this.imageModel.getElementAt(index-1);
            this.imageModel.setElementAt(tempElement, index-1);
            this.imageModel.setElementAt(tempElement2, index);
            System.out.println("Element shifted to the left");
        }
    }
    public void shiftRight(int index){
        if(index + 1 > modelSize){
            System.out.println("Cannot shift right, out of index");
        }
        else{
            var tempElement = this.imageModel.getElementAt(index);
            var tempElement2 = this.imageModel.getElementAt(index+1);
            this.imageModel.setElementAt(tempElement, index+1);
            this.imageModel.setElementAt(tempElement2, index);
            System.out.println("Element shifted to the right");
        }
    }
    
    public DefaultListModel updateModel(){
        return this.imageModel;
    }
}
