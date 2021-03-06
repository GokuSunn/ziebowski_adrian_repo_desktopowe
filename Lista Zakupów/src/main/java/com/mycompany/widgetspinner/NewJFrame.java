/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.widgetspinner;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author adrik
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {        
        initComponents();
        addKeyListenerTojTFCoKupiles();
        addKeyListenerToTFWartosc();
        addKeyListenerTojTFData();
        addTooltipToElements();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCoKupiles = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFWartosc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFData = new javax.swing.JTextField();
        jComboBoxType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jBSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTATodaysShopping = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Wpisz co kupiłeś");

        jLabel2.setText("Podaj wartość");

        jTFWartosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFWartoscActionPerformed(evt);
            }
        });

        jLabel3.setText("Typ zakupionego towaru");

        jLabel4.setText("Data");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("Dzisiejsze zakupy");

        jBSave.setText("ZAPISZ");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Wydatki z dzisiaj: ");

        jLabel7.setText("Wydatki z tygodnia: ");

        jTATodaysShopping.setColumns(20);
        jTATodaysShopping.setRows(5);
        jScrollPane1.setViewportView(jTATodaysShopping);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(424, 424, 424)
                        .addComponent(jBSave))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jTextField5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jTFWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jBSave))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(272, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", jPanel2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFWartoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFWartoscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFWartoscActionPerformed

    private void jComboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        zapis();
        jTFCoKupiles.setText(" ");
        jTFWartosc.setText(" ");
        jTFData.setText(" ");    
        //brakuje ustawienia item w Combobox
    }//GEN-LAST:event_jBSaveActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerTojTFCoKupiles(){    
        jTFCoKupiles.addKeyListener(new KeyListener() {
            @Override            
            public void keyTyped(KeyEvent e) {                
                char ch = e.getKeyChar();
                if(ch == KeyEvent.VK_ENTER || ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch == KeyEvent.VK_SPACE){
                    jTFCoKupiles.setEditable(true);
                }
                jTFCoKupiles.setEditable(false);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("2 keyPressed"+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("3 keyReleased"+e.getKeyChar());
            }
        });    
    }
    
    private void addKeyListenerToTFWartosc(){
        jTFWartosc.addKeyListener(new KeyListener() {
            @Override            
            public void keyTyped(KeyEvent e) {   
                char ch = e.getKeyChar();
                String temp = jTFWartosc.getText();
                
                System.out.println(temp.indexOf(','));
                
                if(temp.contains(",")){
                    if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE){
                        jTFWartosc.setEditable(true);//                    
                    } else{                
                        jTFWartosc.setEditable(false);                
                    }    
                
                }else{
                    
                    if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE || ch == '.'){     
                        jTFWartosc.setEditable(true);
                    }else{
                    
                        jTFWartosc.setEditable(false);
                    }
                   
                }    
            }            
            @Override
            public void keyPressed(KeyEvent e) {
                
            }
            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println("3 keyReleased"+e.getKeyChar());
            }
        });
    }
    
    private void addKeyListenerTojTFData(){
        jTFData.addKeyListener(new KeyListener() {
            @Override            
            public void keyTyped(KeyEvent e) {
                String temp = jTFData.getText();
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE) &&
                        (temp.length() < 10 || ch==KeyEvent.VK_BACK_SPACE)){
                    jTFData.setEditable(true);
                    if((temp.length() == 4 || temp.length() == 7) && ch != KeyEvent.VK_BACK_SPACE){
                        jTFData.setText(temp+"-");
                    }
                }else{
                    jTFData.setEditable(false);
                }
            }            
            @Override
            public void keyPressed(KeyEvent e) {
                
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }             
    
    
    private  void zapis(){
    
        String zapis1 = jTFCoKupiles.getText();
        String zapis2 = jTFWartosc.getText();
        String zapis3 = jTFData.getText();
        String zapis4 = (String) jComboBoxType.getSelectedItem();
        
        String gettext = jTATodaysShopping.getText();
        
        jTATodaysShopping.setText(gettext+"Kupiłeś: "+zapis1+"\n"+"Typ twojego towaru: "+zapis4+"\n"+"Wydałeś: "+zapis2+"zł"+"\n"+"Data: "+zapis3+"\n");              
        
    }
    
    private void addTooltipToElements(){
        jTFCoKupiles.setToolTipText("<html>"
            +"<h3>Wprowadz tekst</h3>"
            +"<p>Nie uzywaj polskich znakow</p>"
            +"</html>"
        );
        jTFData.setToolTipText("<html>"
                +"<h3>Wprowadz date</h3>"
                +"<p>0000.00.00</p>"
                +"</html>"
        );
        jTFWartosc.setToolTipText("<html>"
                + "<h3>Wprowadz wartosc"
                + "<p>00.00</p>"
                + "</html>"
        );
        
        jTATodaysShopping.setToolTipText("<html>"
                +"<img src='D:\\Files\\Images\\Saved\\commit.png>'"
                +"</html>"
        );
    }
    
    /*private void filljCBProducts()
    {
        ArticleTypeUtils atu = new ArticleTypeUtils();
        jComboBoxType.removeAllItems();
        try {
            Scanner sc = new Scanner (new File("produkty.txt"));
            while(sc.hasNext()){
                String item = sc.nextLine();
                jComboBoxType.addItem(item);
            }
        }catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSave;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTATodaysShopping;
    private javax.swing.JTextField jTFCoKupiles;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFWartosc;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
