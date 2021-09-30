/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledslideshow;

/**
 *
 * @author Taylor
 */
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;

/*
 * 
 * 
 */

public class DisplayImage {
    private String imagePath;
    private ImageIcon image;
    public DisplayImage(){
        
    }
    public ImageIcon getDisplayImage(String path) throws IOException {
        BufferedImage img = ImageIO.read(new File(path));
        BufferedImage thumbnail = resize(img,100,150);                          // 100x150 is preferred size for thumbnails
        ImageIcon icon = new ImageIcon(thumbnail);                                //display thumnail on screen
        return icon;
    }
    
    //resize takes a .jpg via its file path, along with the new height and width to change the image to
    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
    public void setImagePath(String path){
        imagePath = path;
    }
    public String getImagePath(){
        return imagePath;
    }
    public ImageIcon getImage(){
        try{
            ImageIcon image = getDisplayImage(imagePath);
        }
        catch(IOException exception){    
        }
        return image;
    }
    
    
}