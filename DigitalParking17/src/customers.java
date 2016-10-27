
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class customers extends javax.swing.JInternalFrame {

    Connection con;

    public customers(Connection c) {
        initComponents();
        con = c;
        fillPcode();
        fillTable();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCcode = new javax.swing.JTextField();
        txtCname = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCarno = new javax.swing.JTextField();
        txtRegno = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        cmbPcode = new javax.swing.JComboBox();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCstatus = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Customers ");

        jLabel1.setText("Customer Code");

        jLabel2.setText("Customer name");

        jLabel3.setText("Gender");

        jLabel4.setText("Phone No.");

        jLabel5.setText("Email");

        jLabel6.setText("Car No.");

        jLabel7.setText("Registration No.");

        jLabel8.setText("Plan Code");

        jLabel9.setText("Address");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoMale);
        rdoMale.setSelected(true);
        rdoMale.setText("Male");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
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

        jLabel10.setText("Date of Birth");

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

        jLabel12.setText("Date");

        jLabel11.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(rdoFemale))
                            .addComponent(txtCcode)
                            .addComponent(txtCname)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPcode, javax.swing.GroupLayout.Alignment.TRAILING, 0, 116, Short.MAX_VALUE)
                            .addComponent(txtRegno)
                            .addComponent(txtCarno)
                            .addComponent(txtEmail)
                            .addComponent(txtDob)
                            .addComponent(txtPhone)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCdate, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtCstatus))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(rdoMale)
                            .addComponent(rdoFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCarno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRegno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbPcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtCdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtCstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnModify)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void fillPcode() {
        try {
            String query = "select * from plans";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            String pcode;
            while (rs.next()) {
                pcode = rs.getString("pcode");
                cmbPcode.addItem(pcode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillTable() {
        try {
            String query = "select * from customers";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            Vector heading = new Vector();
            heading.add("Code");
            heading.add("Name");
            heading.add("Gender");
            heading.add("Date of Birth");
            heading.add("Phone No");
            heading.add("Email");
            heading.add("car no");
            heading.add("reg no");
            heading.add("plan code");
            heading.add("Address");
            heading.add("Date");
            heading.add("Status");
            Vector data = new Vector();

            String ccode, cname, gender, dob, email, phone, carno, regno, pcode, address, cdate, cstatus;
            while (rs.next()) {
                ccode = rs.getString("ccode");
                cname = rs.getString("cname");
                gender = rs.getString("gender");
                dob = rs.getString("dob");
                email = rs.getString("email");
                phone = rs.getString("phone");
                carno = rs.getString("carno");
                regno = rs.getString("regno");
                pcode = rs.getString("pcode");
                address = rs.getString("address");
                cdate = rs.getString("cdate");
                cstatus = rs.getString("cstatus");

                Vector d = new Vector();
                d.add(ccode);
                d.add(cname);
                d.add(gender);
                d.add(dob);
                d.add(phone);
                d.add(email);
                d.add(carno);
                d.add(regno);
                d.add(pcode);
                d.add(address);
                d.add(cdate);
                d.add(cstatus);

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
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String ccode = txtCcode.getText();
            String cname = txtCname.getText();
            String pcode = (String) cmbPcode.getSelectedItem();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String carno = txtCarno.getText();
            String regno = txtRegno.getText();
            String address = txtAddress.getText();
            String cdate = txtCdate.getText();
            String cstatus="Empty";

            if (ccode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer code cannot be left blank");
                return;
            }
            if (cname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer Name field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (phone.length() == 0) {
                JOptionPane.showMessageDialog(this, "Phone Number cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (carno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Car Number cannot be left blank");
                return;
            }
            if (regno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Registration Number cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }
            if (cdate.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date field cannot be left blank");
                return;
            }
            //validations
            if (valid.isValidName(cname) == false) {
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

            String query = "insert into customers values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ccode);
            ps.setString(2, cname);
            ps.setString(3, gender);
            ps.setString(4, dob);
            ps.setString(5, phone);
            ps.setString(6, email);
            ps.setString(7, carno);
            ps.setString(8, regno);
            ps.setString(9, pcode);
            ps.setString(10, address);
            ps.setString(11, cdate);
            ps.setString(12, cstatus);
            int x = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, x + " rows inserted");
            txtCcode.setText("");
            txtCname.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtCarno.setText("");
            txtRegno.setText("");
            txtAddress.setText("");
            txtCdate.setText("");
            txtCstatus.setText("");
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
            String ccode = (String) y.getValueAt(a, 0);
            String cname = (String) y.getValueAt(a, 1);
            String gender = (String) y.getValueAt(a, 2);
            String dob = (String) y.getValueAt(a, 3);
            String phone = (String) y.getValueAt(a, 4);
            String email = (String) y.getValueAt(a, 5);
            String carno = (String) y.getValueAt(a, 6);
            String regno = (String) y.getValueAt(a, 7);
            String pcode = (String) y.getValueAt(a, 8);
            String address = (String) y.getValueAt(a, 9);
            String cdate = (String) y.getValueAt(a, 10);
            String cstatus =(String) y.getValueAt(a,11);

            txtCcode.setText(ccode);
            txtCname.setText(cname);
            if (gender.equalsIgnoreCase("male")) {
                rdoMale.setSelected(true);
            } else {
                rdoFemale.setSelected(true);
            }
            txtDob.setText(dob);
            txtEmail.setText(email);
            txtPhone.setText(phone);
            txtCarno.setText(carno);
            txtRegno.setText(regno);
            cmbPcode.setSelectedItem(pcode);
            txtAddress.setText(address);
            txtCdate.setText(cdate);
            txtCstatus.setText(cstatus);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            String ccode = txtCcode.getText();
            String cname = txtCname.getText();
            String pcode = (String) cmbPcode.getSelectedItem();
            String gender;
            if (rdoMale.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = txtDob.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String carno = txtCarno.getText();
            String regno = txtRegno.getText();
            String address = txtAddress.getText();
            String cdate = txtCdate.getText();
            String cstatus=txtCstatus.getText();

            if (ccode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer code cannot be left blank");
                return;
            }
            if (cname.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer Name field cannot be left blank");
                return;
            }
            if (dob.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date of Birth field cannot be left blank");
                return;
            }
            if (phone.length() == 0) {
                JOptionPane.showMessageDialog(this, "Phone Number cannot be left blank");
                return;
            }
            if (email.length() == 0) {
                JOptionPane.showMessageDialog(this, "Email field cannot be left blank");
                return;
            }
            if (carno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Car Number cannot be left blank");
                return;
            }
            if (regno.length() == 0) {
                JOptionPane.showMessageDialog(this, "Registration Number cannot be left blank");
                return;
            }
            if (address.length() == 0) {
                JOptionPane.showMessageDialog(this, "address field cannot be left blank");
                return;
            }
            if (cdate.length() == 0) {
                JOptionPane.showMessageDialog(this, "Date field cannot be left blank");
                return;
            }
            
            //validations
            if (valid.isValidName(cname) == false) {
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

            String query = "update customers set cname=?, gender=?, dob=?, phone=?, email=?, carno=?, regno=?, pcode=?, address=?, cdate=? , cstatus=? where ccode=? ";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, cname);
            ps.setString(2, gender);
            ps.setString(3, dob);
            ps.setString(4, phone);
            ps.setString(5, email);
            ps.setString(6, carno);
            ps.setString(7, regno);
            ps.setString(8, pcode);
            ps.setString(9, address);
            ps.setString(10, cdate);
            ps.setString(11, cstatus);
            ps.setString(12, ccode);
            int x = ps.executeUpdate();

            JOptionPane.showMessageDialog(this, x + " rows modified");
            txtCcode.setText("");
            txtCname.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtCarno.setText("");
            txtRegno.setText("");
            txtAddress.setText("");
            txtCdate.setText("");
            txtCstatus.setText("");
            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String ccode = txtCcode.getText();

            if (ccode.length() == 0) {
                JOptionPane.showMessageDialog(this, "Customer code cannot be left blank");
                return;
            }
            
            String query = "delete from customers where ccode=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, ccode);

            int x = ps.executeUpdate();
            if (x == 1) {
                JOptionPane.showMessageDialog(this, x + " record deleted");
            } else {
                JOptionPane.showMessageDialog(this, "unsuccessful");
            }
            txtCcode.setText("");
            txtCname.setText("");
            txtDob.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtCarno.setText("");
            txtRegno.setText("");
            txtAddress.setText("");
            txtCdate.setText("");
            txtCstatus.setText("");
            ps.close();
            fillTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbPcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCarno;
    private javax.swing.JTextField txtCcode;
    private javax.swing.JTextField txtCdate;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtCstatus;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRegno;
    // End of variables declaration//GEN-END:variables
}
