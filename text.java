package hash;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class text extends JFrame {
    private JTextField user;
    private JPasswordField pass;
    private JLabel msg;
    public void set()
    {
        setSize(400,400);
        setLayout(new GridLayout(3,2));
        JLabel l=new JLabel("username");
        l.setBounds(100,50,50,50);
        user=new JTextField();
        JLabel l1=new JLabel("Password");
        pass=new JPasswordField();
        JButton b=new JButton("submit");
        msg=new JLabel(" ");
        b.addActionListener(e ->get());
        add(l);
        add(user);
        add(l1);
        add(pass);
        add(b);
        add(msg);
        setVisible(true);
    }
    public void get()
    {
        String usr,password;
        usr=user.getText();
        password=new String(pass.getPassword());
        try{
            String url = "jdbc:mysql://localhost:3306/dj";
            String usr_name="root";
            String pa="password";
            Connection con= DriverManager.getConnection(url,usr_name,pa);
            String str="Select username,password from user;";
            Statement pr=con.createStatement();
            ResultSet rs=pr.executeQuery(str);
            while (rs.next())
            {
               String us=rs.getString("username");
               String p=rs.getString("Password");
               if(usr.equals(us)&&password.equals(p))
               {
                   msg.setText("welcome user");
                   return;
               }
               else
               {
                   msg.setText("invalid user ");
               }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
     text ob=new text();
     ob.set();
    }
}
