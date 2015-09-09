package MVoter;


import com.mysql.jdbc.*;
import javax.swing.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * add_new_user.java
 *
 * Created on Apr 30, 2012, 7:15:42 PM
 */

/**
 *
 * @author 66001
 */
public class add_new_user extends javax.swing.JFrame {
    PasswordService ps;
    Connection conn= null;
    String url = "jdbc:mysql://localhost/";
    String dbName = "db66001";
    String driver ="com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";

    /*Connection conn = null;
    String url = "jdbc:mysql://192.168.170.15/";
    String dbName = "db66001";
    String driver = "com.mysql.jdbc.Driver";
    String userName = "66001";
    String password = "66001";*/
    Statement st;
    ResultSet rs;
    

    /** Creates new form add_new_user */
    public add_new_user() {
        initComponents();
        setLocationRelativeTo(null);
       
        
         try{
	       Class.forName(driver);

             conn = (Connection) DriverManager.getConnection(url+dbName,user,password);

              st = (Statement) conn.createStatement();

             this.setTitle("Users Account");

	      }


	            catch(Exception exp)
                    {
	              JOptionPane.showMessageDialog(null, "Cannot connect to the database,check network settings.","ERROR",JOptionPane.ERROR_MESSAGE);
	            }
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        admin_combobox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_tables = new javax.swing.JTable();
        pass = new javax.swing.JPasswordField();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        search_textfield = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        logout_menu_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1.setText("ADD NEW USER");

        jLabel2.setText("ID Number");

        jLabel3.setText("Sur Name");

        jLabel4.setText("Middle Name");

        jLabel5.setText("First Name");

        jLabel7.setText("Level Of Access");

        ID.setDocument(new TextfieldFilter(TextfieldFilter.NUMERIC));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        sname.setDocument(new TextfieldFilter(TextfieldFilter.letters));
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        mname.setDocument(new TextfieldFilter(TextfieldFilter.letters));
        mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnameActionPerformed(evt);
            }
        });

        lname.setDocument(new TextfieldFilter(TextfieldFilter.letters));

        admin_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Station Officer" }));

        jLabel8.setText("Password");

        user_tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        user_tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_tablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(user_tables);
        user_tables.getColumnModel().getColumn(4).setResizable(false);
        user_tables.getColumnModel().getColumn(5).setResizable(false);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Voter Registration");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Select Frame");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        logout_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_WINDOWS, 0));
        logout_menu_item.setText("Log out");
        logout_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_menu_itemActionPerformed(evt);
            }
        });
        jMenu1.add(logout_menu_item);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sname)
                                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(admin_combobox, 0, 0, Short.MAX_VALUE)
                                    .addComponent(lname)
                                    .addComponent(mname, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(pass, 0, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search_button)
                                        .addGap(85, 85, 85)
                                        .addComponent(update_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete_button)
                                        .addGap(50, 50, 50))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(save)
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refresh)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(admin_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(save)
                    .addComponent(search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_button)
                    .addComponent(delete_button)
                    .addComponent(update_button))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnameActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
//        String user=user_id.getText();
//        String pass=userpass.getText();
//         ps=new PasswordService();
        String id=ID.getText();
        String s=sname.getText();
        String m=mname.getText();
        String l=lname.getText();
        String admin=admin_combobox.getSelectedItem().toString();
        String p=pass.getText();
        ps=new PasswordService();
        if (id.length() >7 ) {
              try {
            String encryptedpassword=ps.encrypt(p);
              try {
            String sql="INSERT INTO projectlogin VALUES("+
                              "'"+id+"',"+
                               "'"+encryptedpassword+"',"+
                                "'"+m+"',"+
                                "'"+l+"',"+
                                "'"+s+"',"+
	                       "'"+admin+"')";

	              st.execute(sql);
	                JOptionPane.showMessageDialog(null,"Details successfully saved.","Information",JOptionPane.INFORMATION_MESSAGE );
                        ID.setText("");
                        sname.setText("");
                        mname.setText("");
                        lname.setText("");
                        admin_combobox.setSelectedIndex(0);
                        pass.setText("");
                        JOptionPane.showMessageDialog(rootPane, encryptedpassword);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        } catch (Exception ex) {
            Logger.getLogger(Log_in_form2.class.getName()).log(Level.SEVERE, null, ex);
        }

        } else if(s.equals("")|| m.equals("")|| l.equals("")|| p.equals("")){
            JOptionPane.showMessageDialog(null, "Enter your details ","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Invalid I.D number","Error",JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_saveActionPerformed

    private void logout_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_menu_itemActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to log out?", "Logout", JOptionPane.YES_NO_OPTION);
        if (a==JOptionPane.OK_OPTION) {
            Log_in_form2 lg=new Log_in_form2();
            this.show(false);
            lg.show();
            
        } else {
            this.show(true);
        }
    }//GEN-LAST:event_logout_menu_itemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        after_login_interface af=new after_login_interface();
        af.show();
        this.show(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void user_tablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tablesMouseClicked
        // TODO add your handling code here:
        int row =user_tables.getSelectedRow();
        
        ID.setText(user_tables.getModel().getValueAt(row, 0).toString());
        sname.setText(user_tables.getModel().getValueAt(row, 2).toString());
        mname.setText(user_tables.getModel().getValueAt(row, 3).toString());
        lname.setText(user_tables.getModel().getValueAt(row, 4).toString());
        admin_combobox.setSelectedItem(user_tables.getModel().getValueAt(row, 5).toString());
        pass.setText(user_tables.getModel().getValueAt(row, 1).toString());
        ID.setEnabled(true);
    }//GEN-LAST:event_user_tablesMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        ID.setText("");
        sname.setText("");
        mname.setText("");
        lname.setText("");
        admin_combobox.setSelectedIndex(0);
        pass.setText("");
        ID.setEnabled(true);
        
    }//GEN-LAST:event_clearActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        // TODO add your handling code here:
        String del_id=ID.getText();

        if (!ID.getText().equals("")) {
            int a=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to update? "+del_id, "UPDATE", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.OK_OPTION) {
                String sql = "Update projectlogin set  sname ='"+sname.getText()+"',mname ='"+mname.getText()+"', lname ='"+lname.getText()+"', level ='"+admin_combobox.getSelectedItem().toString()+"' where username='"+del_id+"'";
//                String sqla = "update projectlogin set First_Name = '"+fnm.getText().toString()+"',Last_Name= '"+lnm.getText().toString()+""+"',Gender='" + sex.getSelectedItem().toString() +"',DOB= '" + format.format(age.getDate()) +"',Mobile_No='"+mob.getText().toString()+"',Address= '"+add.getText().toString()+ "',Role='"+pos.getText().toString()+"',Salary= '"+salo.getText()+"',Health_Status= '"+hlt.getText()+"' where Staff_No= '"+staff.getText()+"'";

        try{
            
           st =     (Statement) conn.prepareStatement(sql);
            st.executeUpdate(sql);
            
                                            
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           

        }
                
            } else {
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select item(s) to update? ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_update_buttonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        select_frame sf=new select_frame();
        sf.show();
        this.show(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String sql = "Select * from projectlogin";
        try{
            
            rs = (ResultSet) st.executeQuery(sql);
            st = (Statement) conn.prepareStatement(sql);                            
            user_tables.setModel(DbUtils.resultSetToTableModel(rs));                                
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           

        }
    }//GEN-LAST:event_formWindowOpened

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // TODO add your handling code here:
        String del_id=ID.getText();
        if (!ID.getText().equals("")) {
            int a=JOptionPane.showConfirmDialog(rootPane, "Delete ID "+del_id, "DELETE", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.OK_OPTION) {
                String sql = "delete  from projectlogin where username = '"+del_id+"'";
        try{
            
             st = (Statement) conn.prepareStatement(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletion successful.");
                                            
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, "Items selected are not deleted,try again! ","Error",JOptionPane.ERROR_MESSAGE);           

        }
                
            } else {
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Select item(s) to delete");
        }
        
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String sql = "Select * from projectlogin";
        try{
            
            rs = (ResultSet) st.executeQuery(sql);
            st = (Statement) conn.prepareStatement(sql);                            
            user_tables.setModel(DbUtils.resultSetToTableModel(rs));                                
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           

        }
    }//GEN-LAST:event_refreshActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        String t=search_textfield.getText();
        String sql = "Select * from projectlogin where username like '"+t+"%'";
        try{
            st = (Statement) conn.prepareStatement(sql);
            rs = (ResultSet) st.executeQuery(sql);
            user_tables.setModel(DbUtils.resultSetToTableModel(rs));
            if(!rs.absolute(1)){ JOptionPane.showMessageDialog(null, "No results were found: " );}
                

        } catch(Exception exp){
            System.out.println(exp);
           

        }
        // TO
    }//GEN-LAST:event_search_buttonActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
                      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                    } catch (Exception e) {
                      System.err.println("Look and feel not set.");
                    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_new_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox admin_combobox;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JMenuItem logout_menu_item;
    private javax.swing.JTextField mname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JTextField sname;
    private javax.swing.JButton update_button;
    private javax.swing.JTable user_tables;
    // End of variables declaration//GEN-END:variables

}