package swing;
import javax.swing.*;
public class fram {
    static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("My first window");
//        JPanel is a container that holds components like buttons, labels, text fields.
//        You add components to the panel, then add the panel to the frame.
        JPanel p=new JPanel();
        JLabel l=new JLabel("enter");
        JTextArea ta=new JTextArea();
        ta.getColumns();
        JTextField f=new JTextField(15);
        JTextField f2=new JTextField(10);
        JButton b=new JButton("submit");
        p.add(ta);
        p.add(b);
        p.add(l);
        p.add(f2);
        frame.add(p);
        frame.setVisible(true);


    }


}
