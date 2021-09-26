package untitledslideshow;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
    private boolean isNewSlide;
    public PopUp(){
        //-----------------POPUP CREATION-----------------------------//
                isNewSlide = false;
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
                        isNewSlide = true;
                        JFileChooser filechooser = new JFileChooser();
                        filechooser.setDialogTitle("Choose a Directory of Images to use for your slideshow!");
                        //filechooser.addChoosableFileFilter(new FileNameExtensionFilter("JPEG Images", "jpeg"));
                        //filechooser.setAcceptAllFileFilterUsed(true);
                        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                        filechooser.showOpenDialog(null);
                        File imageDirectory = filechooser.getCurrentDirectory();
                        System.out.print(imageDirectory);
                    }
                });
    }
    public boolean getSlideStatus(){
        return isNewSlide;
    }
}
