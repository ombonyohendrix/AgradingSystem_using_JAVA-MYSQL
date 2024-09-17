/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;


/**
 *
 * @author win
 */
public class ClassEightResults extends javax.swing.JFrame {

    /**
     * Creates new form ClassEightResults
     */
    public ClassEightResults() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcmbClassCode = new javax.swing.JComboBox<>();
        jtxtStudentID = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jtxtTotalScore = new javax.swing.JTextField();
        jtxtAverage = new javax.swing.JTextField();
        jtxtRanking = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtKiswahili = new javax.swing.JTextField();
        jtxtMath = new javax.swing.JTextField();
        jtxtEnglish = new javax.swing.JTextField();
        jtxtScience = new javax.swing.JTextField();
        jtxtSocialCRE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnRanking = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtTranscript = new javax.swing.JTextArea();
        jbtnTranscript = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 4), "ClassEight Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Firstname");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Surname");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Class Code");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Total Score");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Average");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Ranking");

        jcmbClassCode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jcmbClassCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "500", "600", "700", "800" }));

        jtxtStudentID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jtxtFirstname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jtxtSurname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jtxtTotalScore.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jtxtAverage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jtxtRanking.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Kiswahili");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Math");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("English");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Science");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("SocialCRE");

        jtxtKiswahili.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtKiswahili.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtKiswahiliKeyTyped(evt);
            }
        });

        jtxtMath.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMathKeyTyped(evt);
            }
        });

        jtxtEnglish.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnglishActionPerformed(evt);
            }
        });
        jtxtEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEnglishKeyTyped(evt);
            }
        });

        jtxtScience.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtScience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtScienceKeyTyped(evt);
            }
        });

        jtxtSocialCRE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtxtSocialCRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSocialCREKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(96, 96, 96)
                        .addComponent(jcmbClassCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtSurname)
                            .addComponent(jtxtFirstname)
                            .addComponent(jtxtStudentID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtRanking)
                            .addComponent(jtxtAverage)
                            .addComponent(jtxtTotalScore))))
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(49, 49, 49)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtSocialCRE, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jtxtScience, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jtxtEnglish)
                    .addComponent(jtxtKiswahili)
                    .addComponent(jtxtMath))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtKiswahili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtxtMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jtxtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcmbClassCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtScience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtxtSocialCRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 780, 550));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Firstname", "Surname", "Class_Code", "Kiswahili", "Math", "English", "Science", "SocialCRE", "Total_Score", "Average", "Ranking"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 560, 780, 140));

        jbtnRanking.setBackground(new java.awt.Color(0, 0, 51));
        jbtnRanking.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnRanking.setText("Ranking");
        jbtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        jbtnDelete.setBackground(new java.awt.Color(0, 0, 51));
        jbtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 700, -1, -1));

        jbtnReset.setBackground(new java.awt.Color(0, 0, 51));
        jbtnReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 700, -1, -1));

        jbtnExit.setBackground(new java.awt.Color(0, 0, 102));
        jbtnExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, -1, -1));

        jtxtTranscript.setColumns(20);
        jtxtTranscript.setRows(5);
        jScrollPane2.setViewportView(jtxtTranscript);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 480, 490));

        jbtnTranscript.setBackground(new java.awt.Color(0, 0, 51));
        jbtnTranscript.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnTranscript.setText("Transcript");
        jbtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, -1, -1));

        jbtnPrint.setBackground(new java.awt.Color(0, 0, 51));
        jbtnPrint.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEnglishActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        // TODO add your handling code here:
            JTextField temp =null;
        for(Component c:jPanel1.getComponents()){
        if(c.getClass().toString().contains("javax.swing.JTextField")){
        temp=(JTextField)c;
        temp.setText(null);
        
        }
        
        }
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRankingActionPerformed
        // TODO add your handling code here:
          double [] R = new double[14];
        R[0] = Double.parseDouble(jtxtKiswahili.getText());
        R[1] = Double.parseDouble(jtxtMath.getText());
        R[2] = Double.parseDouble(jtxtEnglish.getText());
        R[3] = Double.parseDouble(jtxtScience.getText());
        R[4] = Double.parseDouble(jtxtSocialCRE.getText());
        R[5] = (R[0] + R[1] + R[2] + R[3] +R[4])/5;
        R[6] = R[0] + R[1] + R[2] + R[3] + R[4];
        String Average = String.format("%.0f", R[5]);
        jtxtAverage.setText(Average);
        String TotalScore = String.format("%.0f", R[6]);
        jtxtTotalScore.setText(TotalScore);
        if(R[6]>=400){
         jtxtRanking.setText("Excellent");
        }
        else if (R[6]>=350){
            jtxtRanking.setText("Very good");
        
        }
         else if (R[6]>=300){
            jtxtRanking.setText("Good");
        
        }
         else if (R[6]>=250){
            jtxtRanking.setText("You can do better than this");
        
        }
         else if (R[6]<250){
            jtxtRanking.setText("Failed You need to work extra harder");
        
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
        jtxtStudentID.getText(),
        jtxtFirstname.getText(),
        jtxtSurname.getText(),
        jcmbClassCode.getSelectedItem(),
        jtxtKiswahili.getText(),
        jtxtMath.getText(),
        jtxtEnglish.getText(),
        jtxtScience.getText(),
        jtxtSocialCRE.getText(),
        jtxtTotalScore.getText(),
        jtxtAverage.getText(),
        jtxtRanking.getText(),
        
        });
    }//GEN-LAST:event_jbtnRankingActionPerformed

    private void jbtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTranscriptActionPerformed
        // TODO add your handling code here:
               jtxtTranscript.append("Student Results\n"
                +"==============================\n"
                +"\nStudent ID:\t\t" + jtxtStudentID.getText()
                +"\nFirstname:\t\t" + jtxtFirstname.getText()
                +"\nSurname:\t\t" + jtxtSurname.getText()
                +"\nClass Code:\t\t" + jcmbClassCode.getSelectedItem()
                +"\nKiswahili:\t\t" + jtxtKiswahili.getText()
                +"\nMath:\t\t" + jtxtMath.getText()
                +"\nEnglish:\t\t" + jtxtEnglish.getText()
                +"\nScience:\t\t" + jtxtScience.getText()
                +"\nSocialCRE:\t\t" + jtxtSocialCRE.getText()
                +"\nTotal Score:\t\t" + jtxtTotalScore.getText()
                +"\nAverage:\t\t" + jtxtAverage.getText()
                +"\nRanking:\t\t" + jtxtRanking.getText()
        
        
        );
    }//GEN-LAST:event_jbtnTranscriptActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        // TODO add your handling code here:
           try{
            jtxtTranscript.print();
            
        }catch(PrinterException e){
        
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(null,"No data to delete",
                        "ClassOne Record Results", JOptionPane.OK_OPTION);
            
            }else{
                JOptionPane.showMessageDialog(null, "Select a row to delete",
                        "ClassOne Record Results", JOptionPane.OK_OPTION);
            }
            
            }else{
                    model.removeRow(jTable1.getSelectedRow());
                    
           }
        
        
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
            frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "ClassOne Records Results",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jtxtKiswahiliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtKiswahiliKeyTyped
        // TODO add your handling code here:
           char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber==keyEvent.VK_BACK_SPACE)
                ||(iNumber == keyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtKiswahiliKeyTyped

    private void jtxtMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMathKeyTyped
        // TODO add your handling code here:
           char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber==keyEvent.VK_BACK_SPACE)
                ||(iNumber == keyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtMathKeyTyped

    private void jtxtEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEnglishKeyTyped
        // TODO add your handling code here:
           char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber==keyEvent.VK_BACK_SPACE)
                ||(iNumber == keyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtEnglishKeyTyped

    private void jtxtScienceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtScienceKeyTyped
        // TODO add your handling code here:
           char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber==keyEvent.VK_BACK_SPACE)
                ||(iNumber == keyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtScienceKeyTyped

    private void jtxtSocialCREKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSocialCREKeyTyped
        // TODO add your handling code here:
           char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber==keyEvent.VK_BACK_SPACE)
                ||(iNumber == keyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtxtSocialCREKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(ClassEightResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassEightResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassEightResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassEightResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassEightResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnRanking;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTranscript;
    private javax.swing.JComboBox<String> jcmbClassCode;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtEnglish;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtKiswahili;
    private javax.swing.JTextField jtxtMath;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtScience;
    private javax.swing.JTextField jtxtSocialCRE;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscript;
    // End of variables declaration//GEN-END:variables
}
