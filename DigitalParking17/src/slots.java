
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class slots extends javax.swing.JInternalFrame {

    Connection con;

    public slots(Connection c) {
        initComponents();
        con = c;
//        fillTable();
        fillBcode();
        fillFcode();
    }

    void fillBcode() {
        try {
            String fcode = (String) cmbFcode.getSelectedItem();
            String query = "select * from blocks where fcode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fcode);
            ResultSet rs = ps.executeQuery();
            String bcode;
            while (rs.next()) {
                bcode = rs.getString("bcode");
                cmbBcode.addItem(bcode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* void fillTable() {
     try {
     String query = "select * from slots";
     PreparedStatement ps = con.prepareStatement(query);
     ResultSet rs = ps.executeQuery();

     Vector heading = new Vector();
     heading.add("Floor Code");
     heading.add("Block Code");
     heading.add("Slot Code");
     heading.add("Slot Name");
     heading.add("Slot Status");

     Vector data = new Vector();

     String fcode, bcode, scode, sname, status;
     while (rs.next()) {
     fcode = rs.getString("fcode");
     bcode = rs.getString("bcode");
     scode = rs.getString("scode");
     sname = rs.getString("sname");
     status = rs.getString("status");

     Vector d = new Vector();
     d.add(fcode);
     d.add(bcode);
     d.add(scode);
     d.add(sname);
     d.add(status);
                
     data.add(d);
     }

     DefaultTableModel x = new DefaultTableModel(data, heading);
     jTable1.setModel(x);

     rs.close();
     ps.close();
     } catch (Exception e) {
     e.printStackTrace();
     }
     }*/
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbBcode = new javax.swing.JComboBox();
        cmbFcode = new javax.swing.JComboBox();
        txtScode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSname = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Slot Management");

        jLabel2.setText("Block Code");

        jLabel3.setText("Floor Code");

        jLabel1.setText("Slot Name");

        cmbBcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBcodeActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Slot Code");

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

        jLabel5.setText("Status");

        btnGo.setText("go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(txtSname)
                                    .addComponent(cmbFcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbBcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtScode))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(btnSave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(383, 383, 383))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbFcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtScode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBcodeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String fcode = (String) cmbFcode.getSelectedItem();
            String bcode = (String) cmbBcode.getSelectedItem();
            String scode = txtScode.getText();
            String sname = txtSname.getText();
            String status = "Empty";

            /*if(scode.length()== 0){
             JOptionPane.showMessageDialog(this,"Slot code is empty");
             return;
             }*/
            if (sname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Slot name is empty");
                return;
            }

            String query = "insert into slots(fcode, bcode, sname, status) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fcode);
            ps.setString(2, bcode);
            ps.setString(3, sname);
            ps.setString(4, status);

            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "Record Inserted");
            txtScode.setText("");
            txtSname.setText("");
            ps.close();
//            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String fcode = (String) cmbFcode.getSelectedItem();
            String bcode = (String) cmbBcode.getSelectedItem();
            String scode = txtScode.getText();
            String sname = txtSname.getText();
            String status = txtStatus.getText();
            /*if(scode.length()== 0){
             JOptionPane.showMessageDialog(this,"Slot code is empty");
             return;
             }*/
            if (sname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Slot name is empty");
                return;
            }

            String query = "update slots set bcode=?, fcode=?, sname=?, status=? where scode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bcode);
            ps.setString(2, fcode);
            ps.setString(3, sname);
            ps.setString(4, status);
            ps.setString(5, scode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "records modified");
            txtScode.setText("");
            txtSname.setText("");
            txtStatus.setText("");
            ps.close();
//            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String scode = txtScode.getText();

            if (scode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Slot code is empty");
                return;
            }

            String query = "delete from slots where scode=?";
            if (scode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Block Code s blank");
                return;
            }
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, scode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "Record Deleted");
            txtScode.setText("");
            txtSname.setText("");
            ps.close();
//            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        cmbBcode.removeAllItems();
        this.revalidate();
        fillBcode();
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String fcode = (String) cmbFcode.getSelectedItem();
            String bcode = (String) cmbBcode.getSelectedItem();
            String scode = txtScode.getText();
            String sname = txtSname.getText();
            String status = txtStatus.getText();
            String query = "select * from slots where fcode=? and bcode=? and scode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(2, bcode);
            ps.setString(1, fcode);
            ps.setString(3, scode);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String sn, st;

                sn = rs.getString("sname");
                st = rs.getString("status");

                txtSname.setText(sn);
                txtStatus.setText(st);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbBcode;
    private javax.swing.JComboBox cmbFcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtScode;
    private javax.swing.JTextField txtSname;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
