/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Internet_Banking.java
 *
 * Created on 18 Dec, 2018, 9:19:08 PM
 */

package cars;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DEll
 */
public class Internet_Banking extends javax.swing.JFrame {

    /** Creates new form Internet_Banking */
    public Internet_Banking() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCard_TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCvv_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPin_PF = new javax.swing.JPasswordField();
        jRegister_BT = new javax.swing.JLabel();
        jBack_L = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("D:\\Apps\\k\\a\\s\\form.jpg").getImage());
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 102));
        jLabel3.setText("Enter your Card Number");

        jCard_TF.setFont(new java.awt.Font("Tahoma", 0, 14));
        jCard_TF.setForeground(new java.awt.Color(255, 255, 0));
        jCard_TF.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("Enter your CVV");

        jCvv_TF.setFont(new java.awt.Font("Tahoma", 0, 14));
        jCvv_TF.setForeground(new java.awt.Color(255, 255, 0));
        jCvv_TF.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 102));
        jLabel5.setText("Enter your PIN");

        jPin_PF.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPin_PF.setForeground(new java.awt.Color(255, 255, 0));
        jPin_PF.setOpaque(false);

        jRegister_BT.setFont(new java.awt.Font("Nyala", 0, 24));
        jRegister_BT.setForeground(new java.awt.Color(255, 255, 255));
        jRegister_BT.setText("<html><head><u>Register me Now</u></head></html>");
        jRegister_BT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRegister_BTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jRegister_BTMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(70, 70, 70)))
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCvv_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPin_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCard_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRegister_BT, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCard_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCvv_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPin_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRegister_BT, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 90, 450, 200);

        jBack_L.setBackground(new java.awt.Color(255, 255, 255));
        jBack_L.setFont(new java.awt.Font("Nyala", 0, 18)); // NOI18N
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
        });
        getContentPane().add(jBack_L);
        jBack_L.setBounds(0, 0, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/credit-header.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegister_BTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegister_BTMouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("java.sql.Driver");
            Connection con=(Connection)DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/cars","root","");
            Statement stmt=con.createStatement();

            int cardno,cvv;
            cardno=Integer.parseInt(jCard_TF.getText());
            cvv=Integer.parseInt(jCvv_TF.getText());
            String pin1=new String(jPin_PF.getPassword());
            int pin=Integer.parseInt(pin1);

            String query="select id from recycle;";
            ResultSet rs=stmt.executeQuery(query);
            rs.last();
            int id=rs.getInt("id");
            String query1="select id from internet_banking;";
            ResultSet rs1=stmt.executeQuery(query1);
            
            while(rs1.next()){
                if(id==rs1.getInt("id")){
                    JOptionPane.showMessageDialog(this, "You are already registered");
                    new Payment().setVisible(true);
                    dispose();
                }
                else
                {
              String query2="insert into internet_banking values("+cardno+","+cvv+","+pin+","+id+");";
              int rs2=stmt.executeUpdate(query2);
            JOptionPane.showMessageDialog(this,"You have been successfully registered");
            new Payment().setVisible(true);
                    dispose();
                }
            }
        con.close();
        stmt.close();
        rs.close();
        rs1.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
}//GEN-LAST:event_jRegister_BTMouseClicked

    private void jBack_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseClicked
        // TODO add your handling code here:
        new Payment().setVisible(true);
        dispose();
    }//GEN-LAST:event_jBack_LMouseClicked

    private void jBack_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseEntered
        // TODO add your handling code here:
        jBack_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jBack_LMouseEntered

    private void jRegister_BTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegister_BTMouseEntered
        // TODO add your handling code here:
       jRegister_BT.setCursor(new Cursor(Cursor.HAND_CURSOR));
}//GEN-LAST:event_jRegister_BTMouseEntered

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Internet_Banking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBack_L;
    private javax.swing.JTextField jCard_TF;
    private javax.swing.JTextField jCvv_TF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPin_PF;
    private javax.swing.JLabel jRegister_BT;
    // End of variables declaration//GEN-END:variables

}
