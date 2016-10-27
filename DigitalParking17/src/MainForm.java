
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MainForm extends javax.swing.JFrame {

    Connection con;
    String username;
    int arg;

    public MainForm(String u, int a) {
        username = u;
        arg = a;

        initComponents();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            //Connection String
            String r1 = "jdbc:oracle:thin:@localhost:1521:";
            con = DriverManager.getConnection(r1, "digitalparking", "123");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            dispose();
        }

        if (arg == 0) {
            mnuManage.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp = new javax.swing.JDesktopPane();
        mnuPlans = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuChange = new javax.swing.JMenuItem();
        mnuLogout = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManage = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuFloors = new javax.swing.JMenuItem();
        mnuBlocks = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuSlots = new javax.swing.JMenuItem();
        mnuSlotsView = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuplans = new javax.swing.JMenuItem();
        mnuCustomers = new javax.swing.JMenuItem();
        mnuPc = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dp.setBackground(new java.awt.Color(0, 0, 51));
        dp.setForeground(new java.awt.Color(255, 102, 255));

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("General");

        mnuChange.setText("Change Password");
        mnuChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuChangeActionPerformed(evt);
            }
        });
        jMenu1.add(mnuChange);

        mnuLogout.setText("LogOut");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLogout);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        mnuPlans.add(jMenu1);

        jMenu2.setText("Employee");

        mnuManage.setText("Manage Employee");
        mnuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManage);

        mnuPlans.add(jMenu2);

        jMenu3.setText("Parking Management");

        mnuFloors.setText("Floors");
        mnuFloors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFloorsActionPerformed(evt);
            }
        });
        jMenu3.add(mnuFloors);

        mnuBlocks.setText("Blocks");
        mnuBlocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBlocksActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBlocks);

        jMenu5.setText("Slots");

        mnuSlots.setText("Slots");
        mnuSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSlotsActionPerformed(evt);
            }
        });
        jMenu5.add(mnuSlots);

        mnuSlotsView.setText("Slots View");
        mnuSlotsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSlotsViewActionPerformed(evt);
            }
        });
        jMenu5.add(mnuSlotsView);

        jMenu3.add(jMenu5);

        mnuPlans.add(jMenu3);

        jMenu4.setText("Membership");

        mnuplans.setText("Plans");
        mnuplans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuplansActionPerformed(evt);
            }
        });
        jMenu4.add(mnuplans);

        mnuCustomers.setText("Customers");
        mnuCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustomersActionPerformed(evt);
            }
        });
        jMenu4.add(mnuCustomers);

        mnuPc.setText("Plans-Customers");
        mnuPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPcActionPerformed(evt);
            }
        });
        jMenu4.add(mnuPc);

        mnuPlans.add(jMenu4);

        setJMenuBar(mnuPlans);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        JOptionPane.showMessageDialog(this, "Logout Successful");
        dispose();
        LoginPage k = new LoginPage();
        k.setVisible(true);

    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageActionPerformed

        manageemployee k = new manageemployee(con);
        k.setVisible(true);
        dp.add(k);

    }//GEN-LAST:event_mnuManageActionPerformed

    private void mnuChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuChangeActionPerformed
        changepassword k = new changepassword(con, username);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuChangeActionPerformed

    private void mnuFloorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFloorsActionPerformed
        floors k = new floors(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuFloorsActionPerformed

    private void mnuBlocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBlocksActionPerformed
        blocks k = new blocks(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuBlocksActionPerformed

    private void mnuplansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuplansActionPerformed
        plans k = new plans(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuplansActionPerformed

    private void mnuCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustomersActionPerformed
        customers k = new customers(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuCustomersActionPerformed

    private void mnuPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPcActionPerformed
        plans_customers k = new plans_customers(con, dp);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuPcActionPerformed

    private void mnuSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSlotsActionPerformed
        slots k = new slots(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuSlotsActionPerformed

    private void mnuSlotsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSlotsViewActionPerformed
        slots_view k = new slots_view(con);
        k.setVisible(true);
        dp.add(k);
    }//GEN-LAST:event_mnuSlotsViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem mnuBlocks;
    private javax.swing.JMenuItem mnuChange;
    private javax.swing.JMenuItem mnuCustomers;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFloors;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuManage;
    private javax.swing.JMenuItem mnuPc;
    private javax.swing.JMenuBar mnuPlans;
    private javax.swing.JMenuItem mnuSlots;
    private javax.swing.JMenuItem mnuSlotsView;
    private javax.swing.JMenuItem mnuplans;
    // End of variables declaration//GEN-END:variables
}
