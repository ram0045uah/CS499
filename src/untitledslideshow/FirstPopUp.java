/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitledslideshow;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nikol
 */
public class FirstPopUp {
    public JFrame firstFrame = new JFrame();
    public JButton newSlide = new JButton();
    public JButton oldSlide = new JButton();
        public void createPop(){
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
                
        /*
        Resizing and dimensions of the popup
        */
        firstFrame.setPreferredSize(new Dimension(400,150));
        firstFrame.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - firstFrame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - firstFrame.getHeight()) / 2);
        firstFrame.setLocation(x, y);
        firstFrame.setResizable(false);
        firstFrame.setVisible(true);
    }
        public JFrame getFrame(){
            return firstFrame;
        }
        public JButton getNewSlide(){
            return newSlide;
        }
        public JButton getOldSlide(){
            return oldSlide;
        }
        
}
