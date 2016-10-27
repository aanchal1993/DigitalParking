
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class plans extends javax.swing.JInternalFrame {

    Connection con;

    public plans(Connection c) {
        initComponents();
        con = c;
        fillTable();
    }

    void fillTable() {
        try {
            String query = "select * from plans";

            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Plan Code");

            heading.add("Plan Name");
            heading.add("Weekly Charges");

            Vector data = new Vector();

            String pcode, pname, charges;
            while (rs.next()) {
                pcode = rs.getString("pcode");

                pname = rs.getString("pname");
                charges = rs.getString("charges");

                Vector d = new Vector();
                d.add(pcode);
                d.add(pname);
                d.add(charges);

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCharges = new javax.swing.JTextField();
        txtPname = new javax.swing.JTextField();
        txtPcode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Plans");

        jLabel1.setText("Plan Code");

        jLabel2.setText("Plan Name");

        jLabel3.setText("Weekly Charges");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPname)
                            .addComponent(txtCharges)
                            .addComponent(txtPcode, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addGap(23, 23, 23)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnModify)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String pcode = txtPcode.getText().trim();
            String pname = txtPname.getText().trim();
            String charges = txtCharges.getText().trim();

            if (pcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "plan code cannot be blank");
                return;
            }
            if (pname.length() == 0) {
                JOptionPane.showMessageDialog(this, "plan name cannot be blank");
                return;
            }
            if (charges.length() == 0) {
                JOptionPane.showMessageDialog(this, "weekly charges cannot be blank");
                return;
            }

            String q = "insert into plans values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, pcode);
            ps.setString(2, pname);
            ps.setString(3, charges);

            int x = ps.executeUpdate();

            ps.close();
            fillTable();
            JOptionPane.showMessageDialog(this, x + "Records Saved");
            txtPcode.setText("");
            txtPname.setText("");
            txtCharges.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {

            String pcode = txtPcode.getText().trim();
            String pname = txtPname.getText().trim();
            String charges = txtCharges.getText().trim();

            if (pcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "plan code cannot be blank");
                return;
            }
            if (pname.length() == 0) {
                JOptionPane.showMessageDialog(this, "plan name cannot be blank");
                return;
            }
            if (charges.length() == 0) {
                JOptionPane.showMessageDialog(this, "weekly charges cannot be blank");
                return;
            }

            String q = "update plans set charges=? , pname=? where pcode=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, charges);

            ps.setString(2, pname);
            ps.setString(3, pcode);

            int x = ps.executeUpdate();

            ps.close();
            fillTable();
            JOptionPane.showMessageDialog(this, x + "Records modified");
            txtPcode.setText("");
            txtPname.setText("");
            txtCharges.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Data could not be Saved");
        }

    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {

            String pcode = txtPcode.getText();
            
            if (pcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "plan code cannot be blank");
                return;
            }
            
            String q = "delete from plans where pcode=?";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, pcode);

            int n = ps.executeUpdate();
            ps.close();
            fillTable();
            JOptionPane.showMessageDialog(this, n + " records deleted");
            txtPcode.setText("");
            txtPname.setText("");
            txtCharges.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Data could not be deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row >= 0) {
            TableModel m = jTable1.getModel();
            String pcode = (String) m.getValueAt(row, 0);
            String pname = (String) m.getValueAt(row, 1);

            String charges = (String) m.getValueAt(row, 2);

            txtPcode.setText(pcode);
            txtPname.setText(pname);
            txtCharges.setText(charges);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCharges;
    private javax.swing.JTextField txtPcode;
    private javax.swing.JTextField txtPname;
    // End of variables declaration//GEN-END:variables
}
