
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class manageemployee extends javax.swing.JInternalFrame {

    Connection con;

    public manageemployee(Connection c) {
        initComponents();
        con = c;
        fillTable();
    }

    void fillTable() {
        try {
            String query = "select * from employee order by userid asc";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("User Id");
            heading.add("User Name");
            heading.add("Password");
            heading.add("Gender");
            heading.add("Date of Birth");
            heading.add("Email");
            heading.add("Phone No");
            heading.add("Address");

            Vector data = new Vector();

            String userid, username, password, gender, dob, email, phone, address;
            while (rs.next()) {
                userid = rs.getString("userid");
                username = rs.getString("username");
                password = rs.getString("password");
                gender = rs.getString("gender");
                dob = rs.getString("dob");
                email = rs.getString("email");
                phone = rs.getString("phone");

                address = rs.getString("address");

                Vector d = new Vector();
                d.add(userid);
                d.add(username);
                d.add(password);
                d.add(gender);
                d.add(dob);
                d.add(email);
                d.add(phone);
                d.add(address);

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtUserid = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("User id");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        jLabel4.setText("Phone No");

        jLabel5.setText("Gender");

        jLabel6.setText("Address");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoMale);
        rdoMale.setSelected(true);
        rdoMale.setText("Male");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        jLabel7.setText("Date Of Birth");

        jLabel8.setText("Email");

        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModify)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel8))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUserid, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoMale)
                    .addComponent(rdoFemale)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnModify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String userid = txtUserid.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();

            if (userid.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Id field cannot be left blank");
                return;
            }
            if (username.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Name field cannot be left blank");
                return;
            }
            if (password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Password field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }

            if (valid.isValidName(username) == false) {
                JOptionPane.showMessageDialog(this, "invalid name");
                return;
            }

            if (valid.isValidPhone(phone) == false) {
                JOptionPane.showMessageDialog(this, "invalid phone number");
                return;
            }

            if (valid.isValidEmail(email) == false) {
                JOptionPane.showMessageDialog(this, "invalid email");
                return;
            }

            String query = "insert into employee values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userid);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, gender);
            ps.setString(5, dob);
            ps.setString(6, phone);
            ps.setString(7, email);
            ps.setString(8, address);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows inserted");
            txtUserid.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String userid = txtUserid.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String address = txtAddress.getText();

            if (userid.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Id field cannot be left blank");
                return;
            }
            if (username.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Name field cannot be left blank");
                return;
            }
            if (password.length() == 0) {
                JOptionPane.showMessageDialog(this, "Password field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }

            if (valid.isValidName(username) == false) {
                JOptionPane.showMessageDialog(this, "invalid name");
                return;
            }

            if (valid.isValidPhone(phone) == false) {
                JOptionPane.showMessageDialog(this, "invalid phone number");
                return;
            }

            if (valid.isValidEmail(email) == false) {
                JOptionPane.showMessageDialog(this, "invalid email");
                return;
            }

            String query = "update employee set username=?, password=?, gender=?, dob=?, phone=?, email=?, address=? where userid=? ";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, gender);
            ps.setString(4, dob);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setString(7, address);
            ps.setString(8, userid);

            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows modified");
            txtUserid.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String userid = txtUserid.getText();
            if (userid.length() == 0) {
                JOptionPane.showMessageDialog(this, "User Id field cannot be left blank");
                return;
            }

            String query = "delete from employee where userid=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, userid);

            int x = ps.executeUpdate();
            if (x == 1) {
                JOptionPane.showMessageDialog(this, x + " record deleted");
            } else {
                JOptionPane.showMessageDialog(this, "unsuccessful");
            }
            txtUserid.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");

            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int a = jTable1.getSelectedRow();
        if (a >= 0) {
            TableModel y = jTable1.getModel();
            String userid = (String) y.getValueAt(a, 0);
            String username = (String) y.getValueAt(a, 1);
            String password = (String) y.getValueAt(a, 2);
            String gender = (String) y.getValueAt(a, 3);
            String dob = (String) y.getValueAt(a, 4);
            String email = (String) y.getValueAt(a, 5);
            String phone = (String) y.getValueAt(a, 6);
            String address = (String) y.getValueAt(a, 7);

            txtUserid.setText(userid);
            txtUsername.setText(username);
            txtPassword.setText(password);
            if (gender.equalsIgnoreCase("male")) {
                rdoMale.setSelected(true);
            } else {
                rdoFemale.setSelected(true);
            }
            txtDob.setText(dob);
            txtEmail.setText(email);
            txtPhone.setText(phone);
            txtAddress.setText(address);

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMaleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
