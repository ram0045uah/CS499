
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Murcia
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import untitledslideshow.PopUp;
public class MightyPointGui extends javax.swing.JFrame {
    
    /**
     * Creates new form MightyPointGUI
     */
    public MightyPointGui() {
        initComponents();
    }
    private boolean isManual;
    private boolean isInterval;
    private int intervalTime;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manualIntervalButton = new javax.swing.ButtonGroup();
        slideshowTitleLabel = new javax.swing.JLabel();
        slideshowImagesScrollBar = new javax.swing.JScrollBar();
        saveButton = new javax.swing.JButton();
        filenameTextBox = new javax.swing.JTextField();
        mainTabbedPane = new javax.swing.JTabbedPane();
        imagesPanel = new javax.swing.JPanel();
        imagesScrollPane = new javax.swing.JScrollPane();
        imagesList = new javax.swing.JList<>();
        soundsPanel = new javax.swing.JPanel();
        soundsScrollPane = new javax.swing.JScrollPane();
        soundsList = new javax.swing.JList<>();
        soundSelectButton = new javax.swing.JButton();
        transitionsPanel = new javax.swing.JPanel();
        transitionsScrollPane = new javax.swing.JScrollPane();
        transitionsList = new javax.swing.JList<>();
        exitButton = new javax.swing.JButton();
        iconPanel = new javax.swing.JPanel();
        imagesSlidesPanel = new javax.swing.JScrollPane();
        slideshowImagesList = new javax.swing.JList<>();
        soundsSlidesPanel = new javax.swing.JScrollPane();
        soundsSlidesList = new javax.swing.JList<>();
        extraSettingsPanel = new javax.swing.JPanel();
        manualButton = new javax.swing.JRadioButton();
        intervalButton = new javax.swing.JRadioButton();
        intervalLabel = new javax.swing.JLabel();
        intervalSpinner = new javax.swing.JSpinner();
        previewButton = new javax.swing.JButton();
        transitionSettingsPanel = new javax.swing.JPanel();
        transitionLengthSpinner = new javax.swing.JSpinner();
        transitionLengthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        slideshowTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slideshowTitleLabel.setText("Untitled Slideshow Editor");

        slideshowImagesScrollBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        saveButton.setText("Save and Export");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        imagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {""};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        imagesList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        imagesScrollPane.setViewportView(imagesList);

        javax.swing.GroupLayout imagesPanelLayout = new javax.swing.GroupLayout(imagesPanel);
        imagesPanel.setLayout(imagesPanelLayout);
        imagesPanelLayout.setHorizontalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
        );
        imagesPanelLayout.setVerticalGroup(
            imagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagesPanelLayout.createSequentialGroup()
                .addComponent(imagesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Images", imagesPanel);

        soundsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        soundsList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        soundsScrollPane.setViewportView(soundsList);

        soundSelectButton.setText("Import Sound File");

        javax.swing.GroupLayout soundsPanelLayout = new javax.swing.GroupLayout(soundsPanel);
        soundsPanel.setLayout(soundsPanelLayout);
        soundsPanelLayout.setHorizontalGroup(
            soundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, soundsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(soundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soundsScrollPane)
                    .addComponent(soundSelectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE))
                .addContainerGap())
        );
        soundsPanelLayout.setVerticalGroup(
            soundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soundsPanelLayout.createSequentialGroup()
                .addComponent(soundSelectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soundsScrollPane)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Sounds", soundsPanel);

        transitionsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        transitionsList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        transitionsScrollPane.setViewportView(transitionsList);

        javax.swing.GroupLayout transitionsPanelLayout = new javax.swing.GroupLayout(transitionsPanel);
        transitionsPanel.setLayout(transitionsPanelLayout);
        transitionsPanelLayout.setHorizontalGroup(
            transitionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transitionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transitionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
        );
        transitionsPanelLayout.setVerticalGroup(
            transitionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transitionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transitionsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainTabbedPane.addTab("Transitions", transitionsPanel);

        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        slideshowImagesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        slideshowImagesList.setToolTipText("This is the Slideshow Reel");
        slideshowImagesList.setDropMode(javax.swing.DropMode.ON);
        slideshowImagesList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        imagesSlidesPanel.setViewportView(slideshowImagesList);

        soundsSlidesList.setToolTipText("This is the soundtrack Reel.");
        soundsSlidesList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        soundsSlidesPanel.setViewportView(soundsSlidesList);

        extraSettingsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        manualIntervalButton.add(manualButton);
        manualButton.setText("Manual Slides");

        manualIntervalButton.add(intervalButton);
        intervalButton.setText("Interval");
        intervalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalButtonActionPerformed(evt);
            }
        });

        intervalLabel.setText("User interval or manual selection");

        intervalSpinner.setMaximumSize(new java.awt.Dimension(0, 10));
        intervalSpinner.setName(""); // NOI18N

        previewButton.setText("Preview");
        previewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewButtonActionPerformed(evt);
            }
        });

        transitionSettingsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        transitionLengthLabel.setText("Transition Length");

        javax.swing.GroupLayout transitionSettingsPanelLayout = new javax.swing.GroupLayout(transitionSettingsPanel);
        transitionSettingsPanel.setLayout(transitionSettingsPanelLayout);
        transitionSettingsPanelLayout.setHorizontalGroup(
            transitionSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transitionSettingsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transitionLengthLabel)
                .addGap(18, 18, 18)
                .addComponent(transitionLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        transitionSettingsPanelLayout.setVerticalGroup(
            transitionSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transitionSettingsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(transitionSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transitionLengthLabel)
                    .addComponent(transitionLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout extraSettingsPanelLayout = new javax.swing.GroupLayout(extraSettingsPanel);
        extraSettingsPanel.setLayout(extraSettingsPanelLayout);
        extraSettingsPanelLayout.setHorizontalGroup(
            extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extraSettingsPanelLayout.createSequentialGroup()
                .addGroup(extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manualButton)
                    .addGroup(extraSettingsPanelLayout.createSequentialGroup()
                        .addComponent(intervalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intervalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(intervalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transitionSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        extraSettingsPanelLayout.setVerticalGroup(
            extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extraSettingsPanelLayout.createSequentialGroup()
                .addGroup(extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(extraSettingsPanelLayout.createSequentialGroup()
                        .addComponent(intervalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transitionSettingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(extraSettingsPanelLayout.createSequentialGroup()
                                .addGroup(extraSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(intervalButton)
                                    .addComponent(intervalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manualButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(extraSettingsPanelLayout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addComponent(previewButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slideshowTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(filenameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slideshowImagesScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soundsSlidesPanel)
                    .addComponent(mainTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagesSlidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(extraSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slideshowTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filenameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagesSlidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soundsSlidesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slideshowImagesScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extraSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Gives the user the option to have slides transition with a given interval
     * @param evt is the event of the user selecting the interval radio option
     */
    private void intervalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalButtonActionPerformed
        isInterval = true;
        intervalTime = (Integer) intervalSpinner.getValue();
    }//GEN-LAST:event_intervalButtonActionPerformed
    /**
     * Allows the user to exit the program
     * @param evt is the event of the user clicking the exit button
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

       System.exit(1);
    }//GEN-LAST:event_exitButtonActionPerformed
    /**
     * Allows the user to preview their slideshow by saving the file and launching the companion application
     * @param evt is the event of the user clicking the preview button
     */
    private void previewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewButtonActionPerformed
    
    }//GEN-LAST:event_previewButtonActionPerformed

   /**
     * Allows the user to save a file that can be opened in the companion application
     * Will also create a folder in the project directory for saved slideshows if not present already
     * @param evt is the event of the user clicking on the Save button
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try
        {
            boolean isSuccessful = new File("slideshows").mkdir();                          //Attempts to create a folder named slideshows in the root project folder
            if(isSuccessful)
            {
                
                System.out.println("Directory for slides successfully created.");
            }
            else
            {
                System.out.println("Directory already created.");
            }
        }
        catch(SecurityException e)
        {
            e.printStackTrace();
        }
        String filename = filenameTextBox.getText() + ".JSON";
        
        File saveFile = new File("slideshows/" + filename);
        boolean isSuccessful;
        try
        {
            isSuccessful = saveFile.createNewFile();
            if(isSuccessful)
            {
                System.out.println("File created at " + saveFile.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exists at location: " + saveFile.getCanonicalPath());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            FileWriter writer = new FileWriter("slideshows/" + filename);
            writer.write("This is a test, Hello World!");
            writer.write("\nThe name of this file is " + filename);
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * Main will begin by providing a popup, asking the user if they would like to
     * create a new slideshow, or import an old one. The editor will not open unless
     * an option is chosen by the user.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PopUp firstDialog = new PopUp();
        File imageFiles[];
        for(;;){
            
            if(firstDialog.isVisible() == false){
                new MightyPointGui().setVisible(true);
                System.out.print("\nMightyPoint should be visible.");
                break;
            }
            try{
                File tempFiles[] = firstDialog.getFiles();
                if(tempFiles.length > 0){
                    firstDialog.setSlideStatus(false);
                    imageFiles = tempFiles;
                    break;
                }
            }
            catch(Exception e){
            }
            
        };
        
        
        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // @Override
            //public void run() {
                
              //  PopUp firstDialog = new PopUp();
               // new MightyPointGui().setVisible(true);
                
            
                
            //}
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel extraSettingsPanel;
    private javax.swing.JTextField filenameTextBox;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JList<String> imagesList;
    private javax.swing.JPanel imagesPanel;
    private javax.swing.JScrollPane imagesScrollPane;
    private javax.swing.JScrollPane imagesSlidesPanel;
    private javax.swing.JRadioButton intervalButton;
    private javax.swing.JLabel intervalLabel;
    private javax.swing.JSpinner intervalSpinner;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JRadioButton manualButton;
    private javax.swing.ButtonGroup manualIntervalButton;
    private javax.swing.JButton previewButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JList<String> slideshowImagesList;
    private javax.swing.JScrollBar slideshowImagesScrollBar;
    private javax.swing.JLabel slideshowTitleLabel;
    private javax.swing.JButton soundSelectButton;
    private javax.swing.JList<String> soundsList;
    private javax.swing.JPanel soundsPanel;
    private javax.swing.JScrollPane soundsScrollPane;
    private javax.swing.JList<String> soundsSlidesList;
    private javax.swing.JScrollPane soundsSlidesPanel;
    private javax.swing.JLabel transitionLengthLabel;
    private javax.swing.JSpinner transitionLengthSpinner;
    private javax.swing.JPanel transitionSettingsPanel;
    private javax.swing.JList<String> transitionsList;
    private javax.swing.JPanel transitionsPanel;
    private javax.swing.JScrollPane transitionsScrollPane;
    // End of variables declaration//GEN-END:variables
}
