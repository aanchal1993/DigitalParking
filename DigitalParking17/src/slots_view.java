
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;

public class slots_view extends javax.swing.JInternalFrame{

    Connection con;
    JButton j[];
    GridLayout g;
    int bcount, scount, count = 0;
    Panel k;
    
    

    public slots_view(Connection c) {
        initComponents();
        con = c;
        fillFcode();
        
        
        infopanel.setVisible(false);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbFcode = new javax.swing.JComboBox();
        cmbBcode = new javax.swing.JComboBox();
        btnGof = new javax.swing.JButton();
        btnGob = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        infopanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFcode = new javax.swing.JTextField();
        txtBcode = new javax.swing.JTextField();
        txtScode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCcode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCname = new javax.swing.JTextField();
        txtPhoneno = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCarno = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBookId = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCstatus = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Slots View");

        jLabel1.setText("Floors");

        jLabel2.setText("Blocks");

        cmbFcode.setForeground(new java.awt.Color(204, 0, 204));
        cmbFcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFcodeActionPerformed(evt);
            }
        });

        btnGof.setText("Go");
        btnGof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGofActionPerformed(evt);
            }
        });

        btnGob.setText("Go");
        btnGob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGobActionPerformed(evt);
            }
        });

        jLabel3.setText("Slots");

        pp.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        infopanel.setBackground(new java.awt.Color(255, 153, 255));

        jLabel4.setText("Floor");

        jLabel5.setText("Block");

        jLabel6.setText("Slot");

        jLabel7.setText("Customer Code");

        jLabel8.setText("Customer Name");

        jLabel9.setText("Phone No");

        btnReturn.setText("Return");

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel10.setText("Car Number");

        btnShow.setText("Show");

        jLabel11.setText("Status");

        jLabel12.setText("Customer Booking Id");

        jLabel13.setText("Customer Status");

        javax.swing.GroupLayout infopanelLayout = new javax.swing.GroupLayout(infopanel);
        infopanel.setLayout(infopanelLayout);
        infopanelLayout.setHorizontalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGroup(infopanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addComponent(jLabel13))
                        .addGap(28, 28, 28)
                        .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infopanelLayout.createSequentialGroup()
                                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(txtBcode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtScode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCcode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCname, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPhoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCstatus, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBookId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                    .addGroup(infopanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnReturn)
                        .addGap(41, 41, 41)
                        .addComponent(btnBook)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        infopanelLayout.setVerticalGroup(
            infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infopanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtScode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCarno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(infopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnBook))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbFcode, 0, 100, Short.MAX_VALUE)
                            .addComponent(cmbBcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGof)
                            .addComponent(btnGob)))
                    .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbFcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGof))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbBcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGob))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFcodeActionPerformed

    private void btnGofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGofActionPerformed
        try {
            cmbBcode.removeAllItems();
            String fcode = (String) cmbFcode.getSelectedItem();
            String bcode = (String) cmbBcode.getSelectedItem();
            String query = "select * from blocks where fcode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, fcode);
            ResultSet rs = ps.executeQuery();
            bcount = 0;
            while (rs.next()) {

                bcode = rs.getString("bcode");
                cmbBcode.addItem(bcode);
                bcount++;
            }

            System.out.println(bcount + "bcount");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGofActionPerformed

    private void btnGobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGobActionPerformed
        try {
            infopanel.setVisible(true);
            infopanel.revalidate();
            String bcode = (String) cmbBcode.getSelectedItem();
            String fcode=(String) cmbFcode.getSelectedItem();
            String query = "select scode from slots where bcode=? and fcode=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bcode);
            ps.setString(2, fcode);
            ResultSet rs = ps.executeQuery();
            String s = "";
            scount = 0;
            while (rs.next()) {
                int scode = rs.getInt("scode");
                scount++;
                s = s + "," + scode;
            }
            System.out.println(scount + "scount");
            k = new Panel(con, scount, s, cmbFcode, cmbBcode, txtFcode , txtBcode, txtScode, txtCcode, txtCname, txtPhoneno, txtCarno , btnShow , btnBook, btnReturn , txtBookId, txtStatus ,txtCstatus);
            count++;
            //Panel k = new Panel(con, scount);
            k.setSize(310, 400);
            // k.setBackground(Color.CYAN);
            k.setVisible(true);
            this.revalidate();
            //System.out.println(pp.getSize());
            pp.add(k);
            this.revalidate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnGobActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnGob;
    private javax.swing.JButton btnGof;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox cmbBcode;
    private javax.swing.JComboBox cmbFcode;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pp;
    private javax.swing.JTextField txtBcode;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtCarno;
    private javax.swing.JTextField txtCcode;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtCstatus;
    private javax.swing.JTextField txtFcode;
    private javax.swing.JTextField txtPhoneno;
    private javax.swing.JTextField txtScode;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables


   


   
        
}
