package MVoter;


import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * view_results.java
 *
 * 
 */

/**
 *
 * @author Ernest
 */
public class view_results extends javax.swing.JFrame {
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

    /** Creates new form view_results */
    public view_results() {
        initComponents();

        this.setLocationRelativeTo(null);

         try{
	       Class.forName(driver);

             conn = (Connection) DriverManager.getConnection(url+dbName,user,password);

              st = (Statement) conn.createStatement();

             this.setTitle("Results");

	            }


	            catch(Exception exp)
                    {
	              JOptionPane.showMessageDialog(null, "Cannot connect to the database,check network settings.","ERROR",JOptionPane.ERROR_MESSAGE);
	            }
         try {

	            rs = (ResultSet) st.executeQuery("SELECT election_id FROM election_details");
	            while(rs.next()){
                     election_id_combo.addItem(rs.getString("election_id"));
                    }
	            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERROR", JOptionPane.ERROR_MESSAGE);
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
        election_id_combo = new javax.swing.JComboBox();
        type_textfield = new javax.swing.JTextField();
        president = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        President_table = new javax.swing.JTable();
        governor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Governor_table = new javax.swing.JTable();
        MP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        MP_table = new javax.swing.JTable();
        councillor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        councillor_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("WELCOME TO RESULT VIEWER");

        jLabel3.setText("Select Election ID");

        election_id_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Election ID" }));
        election_id_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                election_id_comboActionPerformed(evt);
            }
        });

        president.setText("president results");
        president.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentActionPerformed(evt);
            }
        });

        President_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(President_table);

        governor.setText("Governor Results");
        governor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                governorActionPerformed(evt);
            }
        });

        Governor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(Governor_table);

        MP.setText("View MP Results");
        MP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPActionPerformed(evt);
            }
        });

        MP_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(MP_table);

        councillor.setText("View Councillor Results");
        councillor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                councillorActionPerformed(evt);
            }
        });

        councillor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(councillor_table);

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(councillor)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MP)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(election_id_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(type_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(president)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(governor))
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(294, 294, 294))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(election_id_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(type_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(president)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(governor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(councillor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void election_id_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_election_id_comboActionPerformed
        // TODO add your handling code here:
        String select=election_id_combo.getSelectedItem().toString();
        try {
            String sql="Select * from election_details where election_id like '"+select+"'";
            rs=(ResultSet) st.executeQuery(sql);
            st=(Statement) conn.prepareStatement(sql);
            int c=0;
            while(rs.next()){
                String type=rs.getString("type");
                type_textfield.setText(type);

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_election_id_comboActionPerformed

    private void presidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentActionPerformed
        // TODO add your handling code here:
        int t=election_id_combo.getSelectedIndex();
        if (t !=0) {
            String type_text=type_textfield.getText();
            String type=election_id_combo.getSelectedItem().toString();
            String databasename=type_text+"_"+type;

            try {
                String sql="select president, count(*) as votes from "+databasename+" group by president  order by president";
                rs=(ResultSet) st.executeQuery(sql);
                st = (Statement) conn.prepareStatement(sql);
               President_table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Election ID");
        }
    }//GEN-LAST:event_presidentActionPerformed

    private void governorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_governorActionPerformed
        // TODO add your handling code here:
        int t=election_id_combo.getSelectedIndex();
        if (t !=0) {
            String type_text=type_textfield.getText();
            String type=election_id_combo.getSelectedItem().toString();
            String databasename=type_text+"_"+type;

            try {
                String sql="select governor, count(*) as votes from "+databasename+" group by governor  order by governor";
                rs=(ResultSet) st.executeQuery(sql);
                st = (Statement) conn.prepareStatement(sql);
                Governor_table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Election ID");
        }
    }//GEN-LAST:event_governorActionPerformed

    private void MPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPActionPerformed
        // TODO add your handling code here:
        int t=election_id_combo.getSelectedIndex();
        if (t !=0) {
            String type_text=type_textfield.getText();
            String type=election_id_combo.getSelectedItem().toString();
            String databasename=type_text+"_"+type;

            try {
                String sql="select MP, count(*) as votes from "+databasename+" group by MP  order by MP";
                rs=(ResultSet) st.executeQuery(sql);
                st = (Statement) conn.prepareStatement(sql);
                MP_table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Election ID");
        }
    }//GEN-LAST:event_MPActionPerformed

    private void councillorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_councillorActionPerformed
        // TODO add your handling code here:

        int t=election_id_combo.getSelectedIndex();
        if (t !=0) {
            String type_text=type_textfield.getText();
            String type=election_id_combo.getSelectedItem().toString();
            String databasename=type_text+"_"+type;

            try {
                String sql="select councillor, count(*) as votes from "+databasename+" group by councillor  order by councillor";
                rs=(ResultSet) st.executeQuery(sql);
                st = (Statement) conn.prepareStatement(sql);
                councillor_table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select Election ID");
        }
    }//GEN-LAST:event_councillorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        select_frame sf=new select_frame();
        sf.show();
        this.show(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new view_results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Governor_table;
    private javax.swing.JButton MP;
    private javax.swing.JTable MP_table;
    private javax.swing.JTable President_table;
    private javax.swing.JButton councillor;
    private javax.swing.JTable councillor_table;
    private javax.swing.JComboBox election_id_combo;
    private javax.swing.JButton governor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton president;
    private javax.swing.JTextField type_textfield;
    // End of variables declaration//GEN-END:variables

}
