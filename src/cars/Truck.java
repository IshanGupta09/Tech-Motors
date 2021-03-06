/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Truck.java
 *
 * Created on 11 Dec, 2018, 6:25:27 AM
 */

package cars;
import java.awt.Cursor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author DEll
 */
public class Truck extends javax.swing.JFrame {

    /** Creates new form Truck */
    public Truck() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jData_TA = new javax.swing.JTextField();
        jMercedes_BT = new javax.swing.JButton();
        jVolvo_BT = new javax.swing.JButton();
        jBuy_L = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jModel_CB = new javax.swing.JComboBox();
        jImage4_L = new javax.swing.JLabel();
        jImage2_L = new javax.swing.JLabel();
        jImage1_L = new javax.swing.JLabel();
        jImage3_L = new javax.swing.JLabel();
        jBack_L = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("D:\\Apps\\k\\a\\s\\form.jpg").getImage());
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 36));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText(" Trucks");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 0, 190, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jData_TA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jData_TA.setText("Information");
        jData_TA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jData_TAPropertyChange(evt);
            }
        });

        jMercedes_BT.setFont(new java.awt.Font("Century", 0, 14));
        jMercedes_BT.setText("Mercedes");
        jMercedes_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMercedes_BTMouseEntered(evt);
            }
        });
        jMercedes_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMercedes_BTActionPerformed(evt);
            }
        });

        jVolvo_BT.setFont(new java.awt.Font("Century", 0, 14));
        jVolvo_BT.setText("Volvo");
        jVolvo_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jVolvo_BTMouseEntered(evt);
            }
        });
        jVolvo_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolvo_BTActionPerformed(evt);
            }
        });

        jBuy_L.setFont(new java.awt.Font("Century", 0, 18));
        jBuy_L.setForeground(new java.awt.Color(204, 255, 255));
        jBuy_L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBuy_L.setText("Buy Now");
        jBuy_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBuy_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBuy_LMouseEntered(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jModel_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jModel_CB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jModel_CBPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jVolvo_BT, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jMercedes_BT, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jModel_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBuy_L, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addGap(28, 28, 28))))
            .addComponent(jData_TA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMercedes_BT)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jModel_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVolvo_BT))
                .addGap(109, 109, 109)
                .addComponent(jBuy_L, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jData_TA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jImage4_L.setBackground(new java.awt.Color(0, 0, 0));
        jImage4_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/TRUCK-TURBO-REPAIRS_4.jpg"))); // NOI18N
        jImage4_L.setOpaque(true);
        jImage4_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImage4_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jImage4_LMouseEntered(evt);
            }
        });

        jImage2_L.setBackground(new java.awt.Color(0, 0, 0));
        jImage2_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/Mercedes-Truck.jpg"))); // NOI18N
        jImage2_L.setOpaque(true);
        jImage2_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImage2_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jImage2_LMouseEntered(evt);
            }
        });

        jImage1_L.setBackground(new java.awt.Color(0, 0, 0));
        jImage1_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/daf-xf-530-ssc-blue-series-cena.jpg"))); // NOI18N
        jImage1_L.setOpaque(true);

        jImage3_L.setBackground(new java.awt.Color(0, 0, 0));
        jImage3_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/jpeg.jpg"))); // NOI18N
        jImage3_L.setOpaque(true);
        jImage3_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImage3_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jImage3_LMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jImage1_L, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jImage3_L, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jImage2_L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, Short.MAX_VALUE))
                    .addComponent(jImage4_L, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(465, 465, 465))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jImage1_L, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jImage3_L, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImage2_L, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jImage4_L, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 1120, 560);

        jBack_L.setBackground(new java.awt.Color(255, 255, 255));
        jBack_L.setFont(new java.awt.Font("Nyala", 0, 18));
        jBack_L.setForeground(new java.awt.Color(51, 0, 51));
        jBack_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/back.png"))); // NOI18N
        jBack_L.setText("Back");
        jBack_L.setOpaque(true);
        jBack_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBack_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBack_LMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBack_LMouseExited(evt);
            }
        });
        getContentPane().add(jBack_L);
        jBack_L.setBounds(0, 0, 80, 29);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-210, 0, 1280, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jData_TAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jData_TAPropertyChange
        // TODO add your handling code here:
        jData_TA.setEditable(false);
        
    }//GEN-LAST:event_jData_TAPropertyChange

    private void jMercedes_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMercedes_BTActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(0);
        jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\mtruck_2.jpg"));
        jImage4_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\mtruck_4.jpg"));
         jImage3_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\mtruck_3.jpg"));
          jImage2_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\mtruck_2.jpg"));
          jData_TA.setText("Information\n you have chosen Mercedes Trucks");
}//GEN-LAST:event_jMercedes_BTActionPerformed

    private void jImage2_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage2_LMouseClicked
        // TODO add your handling code here:
         jModel_CB.setSelectedIndex(0);
      if(jComboBox1.getSelectedIndex()==0){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\mtruck_2.jpg"));
          jData_TA.setText("Mercedes\n Max Speed:  255kmph\nAverage:  25kmpl\nModelno:  M1");
      }
      else
          if(jComboBox1.getSelectedIndex()==1){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\vtruck_2.jpg"));
          jData_TA.setText("Mercedes\n Max Speed:  295kmph\nAverage:  26kmpl\nModelno:  V1");
      }
          else

          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\backtruck.jpg"));

        
    }//GEN-LAST:event_jImage2_LMouseClicked

    private void jImage3_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage3_LMouseClicked
        // TODO add your handling code here:
         jModel_CB.setSelectedIndex(1);
        if(jComboBox1.getSelectedIndex()==0){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\mtruck_3.jpg"));
          jData_TA.setText("Mercedes\nMax Speed:  250kmph\nAverage:  26kmpl\nModelno:  M2");
      }
      else
          if(jComboBox1.getSelectedIndex()==1){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\vtruck_3.jpg"));
          jData_TA.setText("Mercedes\nMax Speed:  250kmph\nAverage:  26kmpl\nModelno:  V2");
      }
          else

          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\backtruck.jpg"));
       
        
    }//GEN-LAST:event_jImage3_LMouseClicked

    private void jImage4_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage4_LMouseClicked
        // TODO add your handling code here:
        jModel_CB.setSelectedIndex(2);
        if(jComboBox1.getSelectedIndex()==0){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\mtruck_4.jpg"));
          jData_TA.setText("Mercedes\nMax Speed:  260kmph\nAverage:  30kmpl\nModelno:  M3");
      }
      else
          if(jComboBox1.getSelectedIndex()==1){
          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\vtruck_4.jpg"));
          jData_TA.setText("Mercedes\nMax Speed:  260kmph\nAverage:  30kmpl\nModelno:  V3");
      }
          else

          jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\backtruck.jpg"));
       
    }//GEN-LAST:event_jImage4_LMouseClicked

    private void jVolvo_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolvo_BTActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(1);
        jImage1_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\vtruck_2.jpg"));
        jImage2_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\vtruck_2.jpg"));
        jImage3_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\vtruck_3.jpg"));
        jImage4_L.setIcon(new ImageIcon("F:\\Apps\\k\\a\\s\\vtruck_4.jpg"));
         jData_TA.setText("Information\nyou have chosen Volvo Trucks");
}//GEN-LAST:event_jVolvo_BTActionPerformed

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        // TODO add your handling code here:
        jComboBox1.setVisible(false);

    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jBuy_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuy_LMouseClicked
        // TODO add your handling code here:
        try{
        String model="a";
        int price=0;
        int index1=jComboBox1.getSelectedIndex();
        int mindex=jModel_CB.getSelectedIndex();
        if(index1==0){
                     if(mindex==0){
                         model="M1"; price=600000;
                                }
                     else
                     if(mindex==1){
                         model="M2"; price=500000;
                                }
                     else
                     if(mindex==2){
                         model="M3"; price=400000;
                                }
        }
         else
         if(index1==1){
                     if(mindex==0){
                         model="V1"; price=500000;
                                }
                     else
                     if(mindex==1){
                         model="V2"; price=600000;
                                }
                     else
                     if(mindex==2){
                         model="V3"; price=450000;
                                }
                       }
              String id1=JOptionPane.showInputDialog(this, "Please Enter your id number");
                  int id=Integer.parseInt(id1);

         Class.forName("java.sql.Driver");
            Connection con=(Connection)DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/cars","root","");
            Statement stmt=con.createStatement();

             String query="select id from sign_up;";
            ResultSet rs=stmt.executeQuery(query);

            while(rs.next()){
                   if(id==rs.getInt("id")){
            String query1="insert into recycle values('"+model+"',"+price+",'"+"Truck"+"',"+id+");";
            int rs1=stmt.executeUpdate(query1);
             new Order().setVisible(true);
                   }
                   else
                   { JOptionPane.showMessageDialog(this, "No account exist with this ID");}
            }
            con.close();
            stmt.close();
        }
        catch(Exception e)
                 {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       
         
    }//GEN-LAST:event_jBuy_LMouseClicked

    private void jModel_CBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jModel_CBPropertyChange
        // TODO add your handling code here:
        jModel_CB.setVisible(false);

    }//GEN-LAST:event_jModel_CBPropertyChange

    private void jBack_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseClicked
        // TODO add your handling code here:
        new Vehicle().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBack_LMouseClicked

    private void jBack_LMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBack_LMouseExited

    private void jBack_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseEntered
        // TODO add your handling code here:
        jBack_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jBack_LMouseEntered

    private void jMercedes_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMercedes_BTMouseEntered
        // TODO add your handling code here:
        jMercedes_BT.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jMercedes_BTMouseEntered

    private void jVolvo_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVolvo_BTMouseEntered
        // TODO add your handling code here:
        jVolvo_BT.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jVolvo_BTMouseEntered

    private void jBuy_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBuy_LMouseEntered
        // TODO add your handling code here:
        jBuy_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jBuy_LMouseEntered

    private void jImage2_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage2_LMouseEntered
        // TODO add your handling code here:
        jImage2_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jImage2_LMouseEntered

    private void jImage3_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage3_LMouseEntered
        // TODO add your handling code here:
        jImage3_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jImage3_LMouseEntered

    private void jImage4_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImage4_LMouseEntered
        // TODO add your handling code here:
        jImage4_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jImage4_LMouseEntered

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Truck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBack_L;
    private javax.swing.JLabel jBuy_L;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField jData_TA;
    private javax.swing.JLabel jImage1_L;
    private javax.swing.JLabel jImage2_L;
    private javax.swing.JLabel jImage3_L;
    private javax.swing.JLabel jImage4_L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jMercedes_BT;
    private javax.swing.JComboBox jModel_CB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jVolvo_BT;
    // End of variables declaration//GEN-END:variables

}
