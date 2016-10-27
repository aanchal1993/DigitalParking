
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener {

    Connection con;
    int scount, bno;
    GridLayout g;
    JButton j[];
    String s[];
    JTextField floor_code, block_code, slot_code, cust_code, cust_name, cust_phoneno, cust_carno, booking_id, Status, cust_status;
    JComboBox floor_k_code, block_k_code;
    JButton Show, Book, Return;

    public Panel(Connection c, int no, String s_code, JComboBox floor_kcode, JComboBox block_kcode, JTextField floor, JTextField block, JTextField slot, JTextField Code, JTextField Name, JTextField Phone, JTextField Carno, JButton btnShow, JButton btnBook, JButton btnReturn, JTextField BookId, JTextField Vehicle_Status, JTextField txtCstatus) {
        //public Panel(Connection c, int no) {
        setBackground(Color.DARK_GRAY);
        String a;
        con = c;
        scount = no;
        floor_code = floor;
        block_code = block;
        slot_code = slot;
        cust_code = Code;
        cust_name = Name;
        cust_phoneno = Phone;
        cust_carno = Carno;
        floor_k_code = floor_kcode;
        block_k_code = block_kcode;
        Show = btnShow;
        Book = btnBook;
        Return = btnReturn;
        booking_id = BookId;
        Status = Vehicle_Status;
        cust_status = txtCstatus;

        s = s_code.split(",");
        System.out.println(scount + " scount");
        setLayout(null);
        j = new JButton[scount];
        System.out.println("before");

        create_buttons(scount);

        System.out.println("after");
        Show.addActionListener(this);
        Book.addActionListener(this);
        Return.addActionListener(this);
        Return.setVisible(false);
    }

    //----------------------------------------------------------------------------------------------------------------
    public void create_buttons(int a) {
        int x, y, w, h;
        w = 70;
        h = 30;
        x = 0;
        y = 0;
        for (int i = 0; i < a; i++) {

            j[i] = new JButton();
            j[i].setText(s[i + 1]);

            j[i].setBounds(x, y, w, h);
            if (x <= 310) {
                x = x + w + 5;
            }

            if (x > 310) {
                x = 0;
                y = y + 40;
                j[i].setBounds(x, y, w, h);
            }

            add(j[i]);

            System.out.println("in");
            j[i].addActionListener(this);
        }
    }

    //-------------------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e) {

        try {

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            if (e.getSource() == Show) {
                String ccode = cust_code.getText();
                if (ccode.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Enter the customer code");
                    return;
                }

                String query_customers = "select * from customers where ccode=?";
                PreparedStatement ps_customers = con.prepareStatement(query_customers);
                ps_customers.setString(1, ccode);
                ResultSet rs = ps_customers.executeQuery();
                String cname, cphoneno, carno, cstatus;
                if (rs.next()) {
                    ccode = rs.getString("ccode");
                    cname = rs.getString("cname");
                    cphoneno = rs.getString("phone");
                    carno = rs.getString("carno");
                    cstatus = rs.getString("cstatus");

                    cust_code.setText(ccode);
                    cust_name.setText(cname);
                    cust_phoneno.setText(cphoneno);
                    cust_carno.setText(carno);
                    cust_status.setText(cstatus);
                    rs.close();
                    
                    ps_customers.close();
                } else {
                    JOptionPane.showMessageDialog(this, "There's no customer with this code");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                }
                /*no 1 customer will hav 2 slots*/
                /*
                 String query_csa = "select * from cust_slot_allotment where ccode=?";
                 PreparedStatement ps_csa = con.prepareStatement(query_csa);
                 ps_csa.setString(1, ccode);
                 ResultSet rs_csa = ps_csa.executeQuery();
                 if(rs_csa.next()){
                 JOptionPane.showMessageDialog(this, "The slot has already been alloted to this customer");
                 }
                 rs_csa.close();
                 ps_csa.close();*/
            } 
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (e.getSource() == Book) {
                String floor = floor_code.getText();
                String block = block_code.getText();
                String slot = slot_code.getText();
                String ccode = cust_code.getText();
                long d = System.currentTimeMillis();
                String date = String.valueOf(d);
                String status = Status.getText();
                String cstatus = cust_status.getText();
                if (ccode.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Enter the customer code");
                    return;

                } else if (status.equals("Empty") && cstatus.equals("Empty")) {

                    String q1 = "insert into cust_slot_allotment(fcode, bcode, scode, ccode, booking_date ) values (?,?,?,?,?) ";
                    PreparedStatement ps1 = con.prepareStatement(q1);

                    ps1.setString(1, floor);
                    ps1.setString(2, block);
                    ps1.setString(3, slot);
                    ps1.setString(4, ccode);
                    ps1.setString(5, date);

                    Status.setText("Booked");
                    cust_status.setText("Booked");
                    int x1 = ps1.executeUpdate();
                    JOptionPane.showMessageDialog(this, x1 + " Record Booked");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                    ps1.close();

                    /*updation of status in slot table*/
                    String statusb = Status.getText();
                    String q2 = "update slots set status= ? where fcode=? and bcode=? and scode=?";
                    PreparedStatement ps2 = con.prepareStatement(q2);

                    ps2.setString(1, statusb);
                    ps2.setString(2, floor);
                    ps2.setString(3, block);
                    ps2.setString(4, slot);
                    int x2 = ps2.executeUpdate();

                    JOptionPane.showMessageDialog(this, x2 + " Slot Status has been set as booked");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                    ps2.close();

                    /*updation of cstatus in customers table*/
                    String cstatusb = cust_status.getText();
                    String q2c = "update customers set cstatus=? where ccode=?";
                    PreparedStatement ps2c = con.prepareStatement(q2c);

                    ps2c.setString(1, cstatusb);
                    ps2c.setString(2, ccode);

                    int x2c = ps2c.executeUpdate();

                    JOptionPane.showMessageDialog(this, x2c + " Customer Status has been set as booked");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                    ps2c.close();
                }/*else {
                 JOptionPane.showMessageDialog(this, " Customer has already Booked");
                 }
                 }else{
                 JOptionPane.showMessageDialog(this, "Slot is booked");
                 }
                    
                 } */ else if (status.equalsIgnoreCase("Booked")) {
                    JOptionPane.showMessageDialog(this, "Slot is booked.");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                    Return.setVisible(true);
                } else if (cstatus.equals("Booked")) {
                    JOptionPane.showMessageDialog(this, "Customer Status is booked.");
                    floor_code.setText("");
                    block_code.setText("");
                    slot_code.setText("");
                    cust_code.setText("");
                    Status.setText("");
                    cust_name.setText("");
                    cust_status.setText("");
                    booking_id.setText("");
                    cust_phoneno.setText("");
                    cust_carno.setText("");

                    Return.setVisible(true);
                }

                /*so that no 1 customer will have 2 slots*/
                /*String Query = "select * from cust_slot_allotment where fcode= ? and bcode=? and scode=? and ccode=?";
                 PreparedStatement PS = con.prepareStatement(Query);

                 PS.setString(1, floor);
                 PS.setString(2, block);
                 PS.setString(3, slot);
                 PS.setString(4, ccode);
                 ResultSet rs = PS.executeQuery();
                 if (rs.next()) {
                 String bid;
                 bid = rs.getString("booking_id");//booking_id is d attribute f datatbase
                 booking_id.setText(bid);
                 rs.close();
                 }
                 PS.close();*/
            } 
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (e.getSource() == Return) {
                String bid = (String) booking_id.getText();

                long d = System.currentTimeMillis();
                String rdate = String.valueOf(d);

                String q4 = "update cust_slot_allotment set return_date=? where booking_id=?";
                PreparedStatement ps4 = con.prepareStatement(q4);

                ps4.setString(1, rdate);
                ps4.setString(2, bid);
                int x4 = ps4.executeUpdate();

                JOptionPane.showMessageDialog(this, x4 + "record deleted");
                floor_code.setText("");
                block_code.setText("");
                slot_code.setText("");
                cust_code.setText("");
                Status.setText("");
                cust_name.setText("");
                cust_status.setText("");
                booking_id.setText("");
                cust_phoneno.setText("");
                cust_carno.setText("");

                ps4.close();

                /*----------to set status=empty in slots table--------*/
                String status = "Empty";
                String slot = slot_code.getText();
                String q5 = "update slots set status=? where scode=?";
                PreparedStatement ps5 = con.prepareStatement(q5);
                ps5.setString(1, status);
                ps5.setString(2, slot);

                ps5.executeUpdate();

                JOptionPane.showMessageDialog(this, "Status updated");
                floor_code.setText("");
                block_code.setText("");
                slot_code.setText("");
                cust_code.setText("");
                Status.setText("");
                cust_name.setText("");
                cust_status.setText("");
                booking_id.setText("");
                cust_phoneno.setText("");
                cust_carno.setText("");

                ps5.close();

                /*--------to set status=empty in customer table-------*/
                String cstatus = "Empty";
                String ccode = cust_code.getText();
                String q6 = "update cutomers set cstatus=? where ccode=?";
                PreparedStatement ps6 = con.prepareStatement(q6);
                ps6.setString(1, cstatus);
                ps6.setString(2, ccode);

                ps6.executeUpdate();

                JOptionPane.showMessageDialog(this, "Status updated");
                floor_code.setText("");
                block_code.setText("");
                slot_code.setText("");
                cust_code.setText("");
                Status.setText("");
                cust_name.setText("");
                cust_status.setText("");
                booking_id.setText("");
                cust_phoneno.setText("");
                cust_carno.setText("");

                ps6.close();

            } 
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else {
                String slot = e.getActionCommand();
                String floor = (String) floor_k_code.getSelectedItem();
                String block = (String) block_k_code.getSelectedItem();

                String query = "select * from slots where fcode=? and bcode=? and scode=?";
                PreparedStatement p = con.prepareStatement(query);

                p.setString(1, floor);
                p.setString(2, block);
                p.setString(3, slot);
                ResultSet rs = p.executeQuery();
                String status;
                if (rs.next()) {
                    status = rs.getString("status");

                    Status.setText(status);

                    rs.close();

                }

                floor_code.setText(floor);
                block_code.setText(block);
                slot_code.setText(slot);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
