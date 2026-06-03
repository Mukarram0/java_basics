package hash;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class store extends JFrame {
    private JTextField id;
    private JTextField name;
    private JTextField age;
    private JLabel msg;

    public void set()
    {
        setLayout(new GridLayout(4,2));
        setSize(500,500);
        JLabel l=new JLabel("emp_id");
        id=new JTextField();
        JLabel l1=new JLabel("emp_name");
        name=new JTextField();
        JLabel l2=new JLabel("emp_age");
        age=new JTextField();
        msg=new JLabel(" ");
        JButton b=new JButton("submit");
        add(l);
        add(id);
        add(l1);
        add(name);
        add(l2);
        add(age);
        add(b);
        add(msg);
        setVisible(true);
        b.addActionListener(e->action());
    }
    public void action()
    {
        String url="jdbc:mysql://localhost:3306/dj";
        String user="root";
        String password="password";
        int ids=Integer.parseInt(id.getText());
        int ages=Integer.parseInt(age.getText());
        String names=name.getText();
        try{
            Connection con= DriverManager.getConnection(url,user,password);
            String q="insert into emp(id,name,age)" +
                    " values(?,?,?);";
            PreparedStatement p= con.prepareStatement(q);
            p.setInt(1,ids);
            p.setString(2,names);
            p.setInt(3,ages);
            p.executeUpdate();
            msg.setText("record inserted");
        } catch (SQLException e) {
            msg.setText("error");
        }
    }
    public static void main(String[] args) {
        store st=new store();
        st.set();
    }
}
