package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ViewClient {
    private JLabel label1=new JLabel("Selectati operatia:",SwingConstants.CENTER);
    private JLabel label2=new JLabel("Introduceti numele produsului",SwingConstants.CENTER);
    private JLabel label3=new JLabel("Introduceti pretul",SwingConstants.CENTER);
    private JLabel label4=new JLabel("Introduceti valoarea proteica",SwingConstants.CENTER);
    private JLabel label5=new JLabel("Introduceti ID-ul comenzii",SwingConstants.CENTER);
    private JLabel label7=new JLabel("Introduceti ID-ul clientului",SwingConstants.CENTER);
    private JLabel label8=new JLabel("Introduceti numele produsului",SwingConstants.CENTER);
    private JLabel label9=new JLabel("Intoduceti utilizatorul",SwingConstants.CENTER);
    private JLabel label10=new JLabel("Intoduceti parola",SwingConstants.CENTER);
    private JLabel label11=new JLabel("Intoduceti numele",SwingConstants.CENTER);
    private JLabel label12=new JLabel("Intoduceti parola",SwingConstants.CENTER);
    private JLabel label13=new JLabel("Intoduceti mail-ul",SwingConstants.CENTER);
    private JLabel emptyLabel1=new JLabel("");
    private JRadioButton button2=new JRadioButton("Cautare dupa nume");
    private JRadioButton button3=new JRadioButton("Cautare dupa pret");
    private JRadioButton button4=new JRadioButton("Cautare dupa valoare proteica");
    private JRadioButton button5=new JRadioButton("Generare comanda");
    private JLabel emptyLabel3=new JLabel("");
    private JLabel emptyLabel4=new JLabel("");
    private JLabel emptyLabel5=new JLabel("");
    private JLabel emptyLabel6=new JLabel("");
    private JButton submitButton= new JButton("Submit");
    private JButton submitButton1= new JButton("Submit");
    private JButton backButton= new JButton("Back");
    private JButton backButton1= new JButton("Back");
    private JButton addButton= new JButton("Add");
    private JButton logButton= new JButton("Log In");
    private JButton registerButton= new JButton("Register");
    private JButton registerNowButton= new JButton("Register Now");
    JTextField jTextField1=new JTextField();
    JTextField jTextField2=new JTextField();
    JTextField jTextField3=new JTextField();
    JTextField jTextField4=new JTextField();
    JTextField jTextField6=new JTextField();
    JTextField jTextField7=new JTextField();
    JTextField jTextField8=new JTextField();
    JTextField jTextField9=new JTextField();
    JTextField jTextField10=new JTextField();
    JTextField jTextField11=new JTextField();
    JTextField jTextField12=new JTextField();
    ButtonGroup group=new ButtonGroup();
    JPanel panel=new JPanel();
    JFrame frame=new JFrame();
    JTable jTable=new JTable();
    JScrollPane jScrollPane;
    public ViewClient (){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

            }
        });
    }

    public void inceput(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label9);
        label9.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField8);
        panel1.add(label10);
        label10.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField9);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(logButton);
        logButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel2.add(registerButton);
        registerButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public JRadioButton getButton2() { return button2; }
    public JRadioButton getButton3() { return button3; }
    public JRadioButton getButton4() { return button4; }
    public JRadioButton getButton5() { return button5; }
    public JButton getBackButton() { return backButton; }
    public JButton getBackButton1() { return backButton1; }
    public JButton getSubmitButton1() { return submitButton1; }
    public JButton getRegisterButton() { return registerButton; }
    public JButton getRegisterNowButton() { return registerNowButton; }
    public JButton getSubmitButton() { return submitButton; }
    public JButton getAddButton() { return addButton; }
    public JButton getLogButton() { return logButton; }
    public void addButtonListener(ActionListener listener){ submitButton.addActionListener(listener); }
    public void addAddButtonListener(ActionListener listener){ addButton.addActionListener(listener); }
    public void addButtonListener1(ActionListener listener){ submitButton1.addActionListener(listener); }
    public void backButtonListener(ActionListener listener){ backButton.addActionListener(listener); }
    public void backButtonListener1(ActionListener listener){ backButton1.addActionListener(listener); }
    public void logButtonListener(ActionListener listener){ logButton.addActionListener(listener); }
    public void registerButtonListener(ActionListener listener){ registerButton.addActionListener(listener); }
    public void registerNowButtonListener(ActionListener listener){ registerNowButton.addActionListener(listener); }
    public JFrame getFrame() { return frame; }
    public JTextField getjTextField1() { return jTextField1; }
    public JTextField getjTextField2() { return jTextField2; }
    public JTextField getjTextField3() { return jTextField3; }
    public JTextField getjTextField4() { return jTextField4; }
    public JTextField getjTextField6() { return jTextField6; }
    public JTextField getjTextField7() { return jTextField7; }
    public JTextField getjTextField8() { return jTextField8; }
    public JTextField getjTextField9() { return jTextField9; }
    public JTextField getjTextField10() { return jTextField10; }
    public JTextField getjTextField11() { return jTextField11; }
    public JTextField getjTextField12() { return jTextField12; }

    public void back(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(emptyLabel1);
        panel1.add(button2);
        button2.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel3);
        panel1.add(button3);
        button3.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel4);
        panel1.add(button4);
        button4.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel5);
        panel1.add(button5);
        button5.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel6);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton);
        submitButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel2.add(backButton1);
        backButton1.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void register(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label11);
        label11.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField10);
        panel1.add(label12);
        label12.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField11);
        panel1.add(label13);
        label13.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField12);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(registerNowButton);
        registerNowButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void logIn(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(emptyLabel1);
        panel1.add(button2);
        button2.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel3);
        panel1.add(button3);
        button3.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel4);
        panel1.add(button4);
        button4.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel5);
        panel1.add(button5);
        button5.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel6);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton);
        submitButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel2.add(backButton1);
        backButton1.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void cautareDupaNume2(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField1);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void cautareDupaNume(JTable j){
        panel.setVisible(false);
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        panel.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel3=new JPanel();
        panel3.removeAll();
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        jTable=j;
        jScrollPane=new JScrollPane(jTable);
        jScrollPane.setBounds(180,120,1200,625);
        jScrollPane.setPreferredSize(new Dimension(800,625));
        panel3.add(jScrollPane);
        panel.add(panel3);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
    }

    public void cautareDupaPret2(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label3);
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void cautareDupaPret(JTable j){
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel3=new JPanel();
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        jTable=j;
        JScrollPane jScrollPane;
        jScrollPane=new JScrollPane(jTable);
        jScrollPane.setBounds(180,120,1200,625);
        jScrollPane.setPreferredSize(new Dimension(800,625));
        panel3.add(jScrollPane);
        panel.add(panel3);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void cautareDupaValoareProteica2(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label4);
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField3);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void cautareDupaValoareProteica(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel3=new JPanel();
        panel3.removeAll();
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        jTable=j;
        jScrollPane=new JScrollPane(jTable);
        jScrollPane.setBounds(180,120,1200,625);
        jScrollPane.setPreferredSize(new Dimension(800,625));
        panel3.add(jScrollPane);
        panel.add(panel3);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void generareComanda(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label5);
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField4);
        panel1.add(label7);
        label7.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField6);
        panel1.add(label8);
        label8.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField7);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(addButton);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        addButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }
}
