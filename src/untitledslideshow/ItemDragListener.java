/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitledslideshow;

import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

/**
 *
 * @author Roberto Murcia
 */
public class ItemDragListener implements DragSourceListener, DragGestureListener{
    ImageReel reel;
    
    DragSource dSource = new DragSource();
    
    public ItemDragListener(ImageReel reel){
        this.reel = reel;
        DragGestureRecognizer dgr;
        dgr = dSource.createDefaultDragGestureRecognizer(reel, DnDConstants.ACTION_MOVE, this);
    }
    public void dragGestRec(DragGestureEvent dge){
    }
    @Override
    public void dragEnter(DragSourceDragEvent dsde){
    }
    @Override
    public void dragExit(DragSourceEvent dse){
    }
    @Override
    public void dragOver(DragSourceDragEvent dsde){  
    }
    @Override
    public void dropActionChanged(DragSourceDragEvent dsde) {
    }

    @Override
    public void dragDropEnd(DragSourceDropEvent dsde) {
        if(dsde.getDropSuccess()){
            System.out.println("Drop Successful");
        }else{
          System.out.println("Drop Failed");
        }
    }

    @Override
    public void dragGestureRecognized(DragGestureEvent dge) {
        StringSelection transfer = new StringSelection(Integer.toString(reel.getSelectedIndex()));
        dSource.startDrag(dge, DragSource.DefaultCopyDrop, transfer, this);
    }
}
