package untitledslideshow;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Murcia
 */

public class PopUp {
    private boolean slideStatus = true;
    public PopUp(){
       
        //-----------------POPUP CREATION-----------------------------//
                JFrame firstFrame = new JFrame();
                firstFrame.setLayout(new FlowLayout());
                firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel firstLabel = new JLabel();
                JLabel secondLabel = new JLabel();
                JButton newSlide = new JButton();
                JButton oldSlide = new JButton();
                firstLabel.setText("Welcome to the mightyPoint slideshow editor!");
                secondLabel.setText("Choose from either of the following options: ");
                newSlide.setText("Create a new slideshow");
                oldSlide.setText("Import an old slideshow");
                firstFrame.add(firstLabel);
                firstFrame.add(secondLabel);
                firstFrame.add(newSlide);
                firstFrame.add(oldSlide);
                
                //----------------SIZE AND LOCATION OF POPUP------------------//
                firstFrame.setPreferredSize(new Dimension(400,150));
                firstFrame.pack();
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((dimension.getWidth() - firstFrame.getWidth()) / 2);
                int y = (int) ((dimension.getHeight() - firstFrame.getHeight()) / 2);
                firstFrame.setLocation(x, y);
                firstFrame.setResizable(false);
                //firstFrame.setAlwaysOnTop(true);
                firstFrame.setVisible(true);
                newSlide.addActionListener( new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        System.out.println("New Slide Pressed.");
                        JFileChooser filechooser = new JFileChooser();
                        filechooser.setDialogTitle("Choose a Directory of Images to use for your slideshow!");
                        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                        filechooser.showOpenDialog(null);
                        File imageDirectory = filechooser.getSelectedFile();
                        File[] fileDirectories = imageDirectory.listFiles();
                        //File[] actualImages = null;
                        int counter = 0;
                        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("regex:^.*\\.jpg");
                        for (File fileDirectory : fileDirectories) {
                            counter++;
                            Path filePath = fileDirectory.toPath();
                            try{
                                if (matcher.matches(filePath)){
                                System.out.print("\nItem name: " + filePath + " is an image!");
                                }
                            else{
                                System.out.print("\nIndex: " + filePath + " is not an image");
                                }
                            }
                            catch(NullPointerException exception){
                                System.out.print("\nExceptionCaught with: " + filePath);
                            }
                            
                        }
                        firstFrame.setVisible(false);
                        System.out.print("\nPop-up is no longer visible.");
                        //System.out.print(actualImages);
                    }
                });
    }
    public boolean isVisible(){
        return slideStatus;
    }
    public void setSlideStatus(boolean trueFalse){
        slideStatus = trueFalse;
    }
    public File[] getFiles(){
        File images[] = null;
        return images;
    }
}
