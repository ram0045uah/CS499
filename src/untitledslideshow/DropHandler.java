/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package untitledslideshow;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.TransferHandler;

/**
 *
 * @author Roberto Murcia
 */
public class DropHandler extends TransferHandler{
    private final ImageReel reel;
    protected DataFlavor localObjectFlavor;
    public DropHandler(ImageReel reel){
        this.localObjectFlavor = null;
        this.reel = reel;
    }
    public boolean isImportable(TransferHandler.TransferSupport supp){
        localObjectFlavor = new DataFlavor(ImageIcon.class, "image icon");
        if(!supp.isDataFlavorSupported(localObjectFlavor)){
            return false;
        }
        JList.DropLocation dropLoc = (JList.DropLocation) supp.getDropLocation();
        if(dropLoc.getIndex() == -1){
            return false;
        } else{
            return true;
        }
    }
    @Override
    public boolean importData(TransferHandler.TransferSupport supp){
        if(!isImportable(supp)){
            return false;
        }
        Transferable transfer = supp.getTransferable();
        String indexStr;
        try{
            indexStr = (String) transfer.getTransferData(DataFlavor.stringFlavor);
        }catch(UnsupportedFlavorException | IOException exception){
            return false;
        }
        //int index = Integer.parseInt(indexStr);
        JList.DropLocation dropLoc = (JList.DropLocation) supp.getDropLocation();
        int dropIndex = dropLoc.getIndex();
        System.out.println(dropIndex + " : ");
        System.out.println("inserted");
        return true;
    }
}
