/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Sign_up.java
 *
 * Created on 10 Dec, 2018, 5:48:33 PM
 */

package cars;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author DEll
 */
public class Sign_up extends javax.swing.JFrame {

    /** Creates new form Sign_up */
    public Sign_up() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jName_TF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPhone_TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEmail_TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAddress_TA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jMale_RB = new javax.swing.JRadioButton();
        jFemale_RB = new javax.swing.JRadioButton();
        jSave_L = new javax.swing.JLabel();
        jPassword_F = new javax.swing.JPasswordField();
        jRe_Password_F = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBack_L = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 70));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("D:\\Apps\\k\\a\\s\\form.jpg").getImage());
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Email ID");

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Re-Enter Passward");

        jAddress_TA.setColumns(20);
        jAddress_TA.setRows(5);
        jScrollPane2.setViewportView(jAddress_TA);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        buttonGroup1.add(jMale_RB);
        jMale_RB.setFont(new java.awt.Font("Tahoma", 0, 14));
        jMale_RB.setForeground(new java.awt.Color(204, 255, 255));
        jMale_RB.setText("Male");
        jMale_RB.setOpaque(false);

        buttonGroup1.add(jFemale_RB);
        jFemale_RB.setFont(new java.awt.Font("Tahoma", 0, 14));
        jFemale_RB.setForeground(new java.awt.Color(204, 255, 255));
        jFemale_RB.setText("Female");
        jFemale_RB.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMale_RB, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jFemale_RB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMale_RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(jFemale_RB)
                .addContainerGap())
        );

        jSave_L.setFont(new java.awt.Font("Nyala", 0, 24));
        jSave_L.setForeground(new java.awt.Color(0, 0, 51));
        jSave_L.setText("Submit");
        jSave_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSave_LMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSave_LMouseEntered(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars/robot-hd-wallpaper_1053401_45.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPhone_TF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPassword_F, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jEmail_TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                        .addComponent(jRe_Password_F, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jName_TF, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSave_L, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPhone_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jEmail_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassword_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRe_Password_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jSave_L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 1040, 400);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 48));
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText(" Sign up");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 0, 180, 60);

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
        });
        getContentPane().add(jBack_L);
        jBack_L.setBounds(0, 0, 70, 30);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 710, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSave_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSave_LMouseEntered
        jSave_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
}//GEN-LAST:event_jSave_LMouseEntered

    private void jSave_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSave_LMouseClicked
        // TODO add your handling code here:
        try{
            Class.forName("java.sql.Driver");
            Connection con=(Connection)DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/cars","root","");
            Statement stmt=con.createStatement();

            int pno,id=0;
         pno=Integer.parseInt(jPhone_TF.getText());
         String query="select id from sign_up;";
         ResultSet rs=stmt.executeQuery(query);
         rs.last();
         id=rs.getInt("id");
         id++;
        SimpleDateFormat dformat=new SimpleDateFormat("yyyy-MM-dd");
            String date=dformat.format(jDateChooser1.getDate());

        String name,email,address,gender,sex,password,ipassword;
        name=jName_TF.getText();
        email=jEmail_TF.getText();
        address=jAddress_TA.getText();
        password=new String(jPassword_F.getPassword());
         ipassword=new String(jRe_Password_F.getPassword());
        if(jMale_RB.isSelected()==true){
            sex="M";
        }
        else
          if(jFemale_RB.isSelected()==true){
            sex="F";
        }
        else
            sex="null";



        int check=JOptionPane.showConfirmDialog(this,"Do you really want to save your Data?","Confirmation Dialog Box",
                     JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);

            if(check==JOptionPane.YES_OPTION){
                if(password.equals(ipassword)){


                String query1="insert into sign_up values " +
                        "('"+name+"',"+pno+",'"+email+"','"+password+"','"+address+"','"+sex+"','"+date+"',"+id+");";

                        int rs1=stmt.executeUpdate(query1);
                        JOptionPane.showMessageDialog(this,"Data saved successfully");
                       JOptionPane.showMessageDialog(this,"Your id number is "+"'"+id+"'");
                        dispose();
                      new Vehicle().setVisible(true);
                }
                else
                {JOptionPane.showMessageDialog(this,"Your password doesn't match");}
             }
           con.close();
           stmt.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());

        }
          
        
}//GEN-LAST:event_jSave_LMouseClicked

    private void jBack_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseClicked
        // TODO add your handling code here:
        new First_Window().setVisible(true);
            dispose();
    }//GEN-LAST:event_jBack_LMouseClicked

    private void jBack_LMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBack_LMouseEntered
        // TODO add your handling code here:
        jBack_L.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jBack_LMouseEntered

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea jAddress_TA;
    private javax.swing.JLabel jBack_L;
    private javax.swing.JTextField jEmail_TF;
    private javax.swing.JRadioButton jFemale_RB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jMale_RB;
    private javax.swing.JTextField jName_TF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword_F;
    private javax.swing.JTextField jPhone_TF;
    private javax.swing.JPasswordField jRe_Password_F;
    private javax.swing.JLabel jSave_L;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
