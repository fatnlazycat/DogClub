/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dogclub;
import java.awt.Dimension;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author dkosyakov
 */
public class DogClubJFrame extends javax.swing.JFrame {
    static boolean noDogs;
    static int prevListIndex=-1;
    /**
     * Creates new form DogClubJFrame
     */
    public DogClubJFrame() {
        noDogs=DogClub.dogs.isEmpty();
        initComponents();
    }

    @Override
    public Dimension size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dogPanel = new javax.swing.JPanel();
        dogNameLabel = new javax.swing.JLabel();
        dogNameTextField = new javax.swing.JTextField();
        breedLabel = new javax.swing.JLabel();
        breedCombo = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        dismissButton = new javax.swing.JButton();
        newDogButton = new javax.swing.JButton();
        masterPanel = new javax.swing.JPanel();
        masterNameLabel = new javax.swing.JLabel();
        masterNameTextField = new javax.swing.JTextField();
        iCodeCheckBox = new javax.swing.JCheckBox();
        iCodeTextField = new javax.swing.JTextField(){
            public void replaceSelection(String content){
                super.replaceSelection(content);
                String text = getText();
                if ( text.length() > 4 ){setText( text.substring(0, 4) );}
            }
        };
        phoneLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField(){
            public void replaceSelection(String content){
                boolean warningDisplayed=false;
                super.replaceSelection(content);
                String text = getText();
                StringBuffer buf = new StringBuffer(text);
                char c;
                int index=0;
                int size=buf.length();
                for (int i = 0; i < size; i++) {
                    c = buf.charAt(index);
                    if (!Character.isDigit(c)) {
                        buf.deleteCharAt(index);
                        warningLabel.setText("digits only, max 7 characters");
                        warningDisplayed=true;
                    }
                    else {
                        index++;
                        warningLabel.setText("");
                        warningDisplayed=false;
                    }
                }
                text=buf.toString();
                if ( text.length() > 7 ){
                    setText( text.substring(0, 7) );
                    warningLabel.setText("digits only, max 7 characters");
                }
                else {
                    setText(text);
                    if (!warningDisplayed) warningLabel.setText("");
                }
            }
        }
        ;
        warningLabel = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dogList = new javax.swing.JList();
        omLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dog Club v.1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dogPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dog data"));

        dogNameLabel.setText("Name");

        dogNameTextField.setText(noDogs? "":DogClub.dogs.get(0).dogName);

        breedLabel.setText("Breed");

        breedCombo.setModel(new javax.swing.DefaultComboBoxModel(Breed.breeds.toArray()));
        breedCombo.setSelectedIndex(noDogs? 0:DogClub.dogs.get(0).breed);

        saveButton.setText("Save changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        dismissButton.setText("Dismiss");
        dismissButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismissButtonActionPerformed(evt);
            }
        });

        newDogButton.setText("New Dog");
        newDogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dogPanelLayout = new javax.swing.GroupLayout(dogPanel);
        dogPanel.setLayout(dogPanelLayout);
        dogPanelLayout.setHorizontalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dogPanelLayout.createSequentialGroup()
                        .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dogNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(breedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dogNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(breedCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dogPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dismissButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newDogButton)
                .addContainerGap())
        );
        dogPanelLayout.setVerticalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogNameLabel)
                    .addComponent(dogNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breedLabel)
                    .addComponent(breedCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(dismissButton)
                    .addComponent(newDogButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        masterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Master data"));

        masterNameLabel.setText("Name");

        masterNameTextField.setText(noDogs? "":DogClub.dogs.get(0).masterName);

        iCodeCheckBox.setSelected(noDogs||DogClub.dogs.get(0).phonePrefix.equals("") ? false:true);
        iCodeCheckBox.setText("mobile operator code");
        iCodeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCodeCheckBoxActionPerformed(evt);
            }
        });

        iCodeTextField.setText(noDogs? "":DogClub.dogs.get(0).phonePrefix);
        iCodeTextField.setMinimumSize(new java.awt.Dimension(30, 20));

        phoneLabel.setText("Contact phone");

        phoneTextField.setText(noDogs? "":DogClub.dogs.get(0).phone);
        phoneTextField.setMaximumSize(new java.awt.Dimension(200, 20));
        phoneTextField.setName(""); // NOI18N
        phoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFieldFocusLost(evt);
            }
        });

        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout masterPanelLayout = new javax.swing.GroupLayout(masterPanel);
        masterPanel.setLayout(masterPanelLayout);
        masterPanelLayout.setHorizontalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(masterPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(masterNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(masterNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(masterPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(iCodeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(masterPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(phoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        masterPanelLayout.setVerticalGroup(
            masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masterNameLabel)
                    .addComponent(masterNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iCodeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(masterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel)
                    .addComponent(jLabel1)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        welcomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welcomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                welcomePanelMouseExited(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to the dog club! (v.1)");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        dogList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = DogClub.arrForList;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        dogList.setSelectedIndex(noDogs? -1:0);
        dogList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dogListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(dogList);

        omLabel.setText("Our members");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(omLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(listPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(omLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(masterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(masterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newDogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDogButtonActionPerformed
        int i=DogClub.dogs.size();
        DogClub.dogs.add(new Dog());
        DogClub.dogs.get(i).dogName=dogNameTextField.getText();
        DogClub.dogs.get(i).breed=breedCombo.getSelectedIndex();
        DogClub.dogs.get(i).masterName=masterNameTextField.getText();
        DogClub.dogs.get(i).phonePrefix=iCodeTextField.getText();
        DogClub.dogs.get(i).phone=phoneTextField.getText();
        try {DogClub.saveFile(DogClub.dogs.size());} catch (IOException e){System.out.println(e.getMessage());}
        DogClub.setArrForList();
        DogClub.arrForList[i]=DogClub.dogs.get(i).dogName;
        prevListIndex=i;
        dogList.setListData(DogClub.arrForList);
        noDogs=false;
    }//GEN-LAST:event_newDogButtonActionPerformed

    private void dogListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dogListValueChanged
        if (prevListIndex!=-1) {
            dogList.setSelectedIndex(prevListIndex);
            prevListIndex=-1;
        }
        if (noDogs) {
            dogNameTextField.setText("");
            breedCombo.setSelectedIndex(0);
            masterNameTextField.setText("");
            iCodeTextField.setVisible(false);
            iCodeCheckBox.setSelected(false);
            phoneTextField.setText("");
        }
        else {
            int i=dogList.getSelectedIndex();
            dogNameTextField.setText(DogClub.dogs.get(i).dogName);
            breedCombo.setSelectedIndex(DogClub.dogs.get(i).breed);
            masterNameTextField.setText(DogClub.dogs.get(i).masterName);
            iCodeTextField.setText(DogClub.dogs.get(i).phonePrefix);
            phoneTextField.setText(DogClub.dogs.get(i).phone);
            if (DogClub.dogs.get(i).phonePrefix.equals("")) {
                iCodeTextField.setVisible(false);
                iCodeCheckBox.setSelected(false);
            }
            else {
                jLabel1.setVisible(true);
                iCodeTextField.setVisible(true);
                iCodeCheckBox.setSelected(true);
            }
        }
    }//GEN-LAST:event_dogListValueChanged

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int i=dogList.getSelectedIndex();
        if (noDogs) {
            DogClub.dogs.add(new Dog());
            i=0;
            DogClub.arrForList=new String[1];
            noDogs=false;
        }
        DogClub.dogs.get(i).dogName=dogNameTextField.getText();
        DogClub.dogs.get(i).breed=breedCombo.getSelectedIndex();
        DogClub.dogs.get(i).masterName=masterNameTextField.getText();
        DogClub.dogs.get(i).phonePrefix=iCodeTextField.getText();
        DogClub.dogs.get(i).phone=phoneTextField.getText();
        try {DogClub.saveFile(DogClub.dogs.size());} catch (IOException e){System.out.println(e.getMessage());}
        DogClub.arrForList[i]=DogClub.dogs.get(i).dogName;
        prevListIndex=i;
        dogList.setListData(DogClub.arrForList);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        iCodeTextField.setVisible(!noDogs&&!DogClub.dogs.get(0).phonePrefix.equals(""));
    }//GEN-LAST:event_formWindowActivated

    private void iCodeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCodeCheckBoxActionPerformed
        jLabel1.setVisible(!iCodeTextField.isVisible());
        iCodeTextField.setVisible(!iCodeTextField.isVisible());
        iCodeTextField.setText("");
    }//GEN-LAST:event_iCodeCheckBoxActionPerformed

    private void dismissButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismissButtonActionPerformed
        if (!noDogs) {
            int i=dogList.getSelectedIndex();
            DogClub.dogs.remove(dogList.getSelectedIndex());
            try {DogClub.saveFile(DogClub.dogs.size());} catch (IOException e){System.out.println(e.getMessage());}
            DogClub.setArrForList();
            prevListIndex= i<DogClub.dogs.size() ? i : i-1;
            if (prevListIndex==-1) {
                prevListIndex=0;
                noDogs=true;
            }
            dogList.setListData(DogClub.arrForList);
        }
    }//GEN-LAST:event_dismissButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void welcomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomePanelMouseEntered
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 10));
        welcomeLabel.setText("<html>A small tool for accounting members of a certain organization."
                + " A canine club was taken as an example."
                + "The program maintains data about the dog & its master as well as some basic operations: "
                + "insertion & exclusion of members. The main idea was to show the developer's ability for "
                + "creation of simple code. "
                + "Further versions will provide some extra functionality.<br>"
                + "Yours, Dmitriy Kosyakov.</html>");
        jLabel1.setVisible(true);
    }//GEN-LAST:event_welcomePanelMouseEntered

    private void welcomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomePanelMouseExited
        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        welcomeLabel.setText("Welcome to the dog club! (v.1)");
        jLabel1.setVisible(false);
    }//GEN-LAST:event_welcomePanelMouseExited

    private void phoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFieldFocusLost
        warningLabel.setText("");
    }//GEN-LAST:event_phoneTextFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DogClubJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DogClubJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DogClubJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DogClubJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DogClubJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox breedCombo;
    private javax.swing.JLabel breedLabel;
    private javax.swing.JButton dismissButton;
    private javax.swing.JList dogList;
    private javax.swing.JLabel dogNameLabel;
    private javax.swing.JTextField dogNameTextField;
    private javax.swing.JPanel dogPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox iCodeCheckBox;
    private javax.swing.JTextField iCodeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JLabel masterNameLabel;
    private javax.swing.JTextField masterNameTextField;
    private javax.swing.JPanel masterPanel;
    private javax.swing.JButton newDogButton;
    private javax.swing.JLabel omLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
