
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class floors extends javax.swing.JInternalFrame {

    Connection con;

    public floors(Connection c) {
        initComponents();
        con = c;
        fillTable();
    }

    void fillTable() {
        try {
            String query = "select * from floors";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Floor Code");
            heading.add("Floor Name");

            Vector data = new Vector();

            String fcode, fname;
            while (rs.next()) {
                fcode = rs.getString("fcode");
                fname = rs.getString("fname");

                Vector d = new Vector();
                d.add(fcode);
                d.add(fname);

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
        txtFcode = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Floor Management");

        jLabel2.setText("Floor Code");

        jLabel3.setText("Floor Name");

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
                        .addGap(26, 26, 26)
                        .addComponent(btnSave)
                        .addGap(36, 36, 36)
                        .addComponent(btnModify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFcode)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnModify)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String fcode = txtFcode.getText();
            String fname = txtFname.getText();
            if (fcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Floor Code cannot be left blank");
                return;
            }
            if (fname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Floor Namecannot be left blank");
                return;
            }
            
            String query = "insert into floors values(?,?)";
           
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fcode);
            ps.setString(2, fname);

            int x = ps.executeUpdate();

            JOptionPane.showMessageDialog(this, x + " records inserted");
            txtFcode.setText("");
            txtFname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String fcode = txtFcode.getText();
            String fname = txtFname.getText();
if (fcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Floor Code cannot be left blank");
                return;
            }
            if (fname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Floor Namecannot be left blank");
                return;
            }
            String query = "update floors set fname=? where fcode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fname);
            ps.setString(2, fcode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "records modified");
            txtFcode.setText("");
            txtFname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String fcode = txtFcode.getText();
            if (fcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Floor Code cannot be left blank");
                return;
            }
            
            String query = "delete from floors where fcode=?";
            if (fcode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Code s blank");
                return;
            }
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fcode);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + "Record Deleted");
            txtFcode.setText("");
            txtFname.setText("");
            ps.close();
            fillTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String fcode = (String) y.getValueAt(a, 0);
            String fname = (String) y.getValueAt(a, 1);

            txtFcode.setText(fcode);
            txtFname.setText(fname);

        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFcode;
    private javax.swing.JTextField txtFname;
    // End of variables declaration//GEN-END:variables
}
