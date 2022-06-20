package presentation;


import BLL.DeliveryService;
import BLL.Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class ViewEm extends JFrame implements Observer {
    private JLabel label1=new JLabel("Intoduceti utilizatorul",SwingConstants.CENTER);
    private JLabel label2=new JLabel("Intoduceti parola",SwingConstants.CENTER);
    JTextField jTextField1=new JTextField();
    JTextField jTextField2=new JTextField();
    private JButton backButton= new JButton("Back");
    private JButton logButton= new JButton("Log In");
    JPanel panel=new JPanel();
    JFrame frame=new JFrame();
    JTable jTable=new JTable();
    JScrollPane jScrollPane;
    public ViewEm(){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

            }
        });
    }

    public void inceput(){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField1);
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(logButton);
        logButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public JButton getBackButton() { return backButton; }
    public JButton getLogButton() { return logButton; }
    public JFrame getFrame() { return frame; }
    public void backButtonListener(ActionListener listener){ backButton.addActionListener(listener); }
    public void logButtonListener(ActionListener listener){ logButton.addActionListener(listener); }
    public JTextField getjTextField1() { return jTextField1; }
    public JTextField getjTextField2() { return jTextField2; }

    public void logIn(JTable j){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        jTable=j;
        jScrollPane=new JScrollPane(jTable);
        jScrollPane.setBounds(180,120,1200,625);
        jScrollPane.setPreferredSize(new Dimension(800,625));
        panel1.add(jScrollPane);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(backButton);
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        Order d=(Order) arg;
        //d.createOrder(d.getOrder());
        Toolkit.getDefaultToolkit().beep();
    }
}
