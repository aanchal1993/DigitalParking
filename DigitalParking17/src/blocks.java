
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gogha
 */
public class blocks extends javax.swing.JInternalFrame {

    Connection con;

    public blocks(Connection c) {
        initComponents();
        con = c;
        fillFcode();
        fillTable();
    }

    void fillFcode() {
        try {
            String query = "select * from floors";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            String fcode;
            while (rs.next()) {
                fcode = rs.getString("fcode");
                cmbFcode.addItem(fcode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTable() {
        try {
            String query = "select * from blocks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Floor Code");
            heading.add("Block Code");
            heading.add("Block Name");

            Vector data = new Vector();

            String fcode, bcode, bname;
            while (rs.next()) {
                fcode = rs.getString("fcode");
                bcode = rs.getString("bcode");
                bname = rs.getString("bname");

                Vector d = new Vector();
                d.add(fcode);
                d.add(bcode);
                d.add(bname);

                data.add(d);
            }

            DefaultTableModel x = new DefaultTableModel(data, heading);
            jTable1.setModel(x);

            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbFcode = new javax.swing.JComboBox();
        txtBcode = new javax.swing.JTextField();
        txtBname = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Block Management");

        jLabel2.setText("Floor Code");

        jLabel3.setText("Block Code");

        jLabel4.setText("Block Name");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btnSave))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtBcode)
                        .addComponent(cmbFcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(36, 36, 36)
                        .addComponent(btnModify)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbFcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtBname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnModify)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String fcode = (String) cmbFcode.getSelectedItem();
            String bcode = txtBcode.getText();
            String bname = txtBname.getText();
            
            if(bcode.length()== 0){
                JOptionPane.showMessageDialog(this,"block code is empty");
                return;
            }
            if(bname.length()== 0){
                JOptionPane.showMessageDialog(this,"block name is empty");
                return;
            }
           
            String query = "insert into blocks values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bcode);
            ps.setString(2, bname);
            ps.setString(3, fcode);

            int x = ps.executeUpdate();

            JOptionPane.showMessageDialog(this, x + " records inserted");
            txtBcode.setText("");
            txtBname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String fcode = (String) y.getValueAt(a, 0);
            String bcode = (String) y.getValueAt(a, 1);
            String bname = (String) y.getValueAt(a, 2);
            cmbFcode.setSelectedItem(fcode);
            txtBcode.setText(bcode);
            txtBname.setText(bname);
            
        } 
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String bcode = txtBcode.getText();
            String bname= txtBname.getText();
           
            if(bcode.length()== 0){
                JOptionPane.showMessageDialog(this,"block code is empty");
                return;
            }
            if(bname.length()== 0){
                JOptionPane.showMessageDialog(this,"block code is empty");
                return;
            }
            
            String query = "delete from blocks where bcode=?";
            if (bcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Block name s blank");
                return;
            }
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bcode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "Record Deleted");
            txtBcode.setText("");
            txtBname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String bcode = txtBcode.getText();
            String bname = txtBname.getText();
            String fcode=(String)cmbFcode.getSelectedItem();
            
            if(bcode.length()== 0){
                JOptionPane.showMessageDialog(this,"block code is empty");
                return;
            }
            if(bname.length()== 0){
                JOptionPane.showMessageDialog(this,"block name is empty");
                return;
            }

            String query = "update blocks set bname=? , fcode=? where bcode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bname);
            ps.setString(2, fcode);
            ps.setString(3, bcode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "records modified");
            txtBcode.setText("");
            txtBname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbFcode;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBcode;
    private javax.swing.JTextField txtBname;
    // End of variables declaration//GEN-END:variables
}
