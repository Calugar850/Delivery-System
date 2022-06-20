package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ViewAdmin extends JFrame {
    private JLabel label1=new JLabel("Selectati operatia:",SwingConstants.CENTER);
    private JLabel label2=new JLabel("Introduceti numele produsului de sters",SwingConstants.CENTER);
    private JLabel label3=new JLabel("Intoduceti numele produsului",SwingConstants.CENTER);
    private JLabel label4=new JLabel("Intoduceti ratingul",SwingConstants.CENTER);
    private JLabel label5=new JLabel("Intoduceti valoare calori",SwingConstants.CENTER);
    private JLabel label6=new JLabel("Intoduceti valoare proteine",SwingConstants.CENTER);
    private JLabel label7=new JLabel("Intoduceti valoare grasimi",SwingConstants.CENTER);
    private JLabel label8=new JLabel("Intoduceti valoare sare",SwingConstants.CENTER);
    private JLabel label9=new JLabel("Intoduceti valoare pret",SwingConstants.CENTER);
    private JLabel label10=new JLabel("Intoduceti numele produsului",SwingConstants.CENTER);
    private JLabel label11=new JLabel("Intoduceti numele produsului de baza",SwingConstants.CENTER);
    private JLabel label12=new JLabel("Intoduceti utilizatorul",SwingConstants.CENTER);
    private JLabel label13=new JLabel("Intoduceti parola",SwingConstants.CENTER);
    private JLabel label14=new JLabel("Intoduceti ora de inceput",SwingConstants.CENTER);
    private JLabel label15=new JLabel("Intoduceti ora de sfarsit",SwingConstants.CENTER);
    private JLabel label16=new JLabel("Intoduceti numarul de comenzi",SwingConstants.CENTER);
    private JLabel label17=new JLabel("Intoduceti comenzi",SwingConstants.CENTER);
    private JLabel label18=new JLabel("Intoduceti suma",SwingConstants.CENTER);
    private JLabel label19=new JLabel("Intoduceti ziua lunii",SwingConstants.CENTER);
    private JLabel emptyLabel1=new JLabel("");
    private JRadioButton button2=new JRadioButton("Adaugare base product");
    private JRadioButton button3=new JRadioButton("Adaugare composite product");
    private JRadioButton button4=new JRadioButton("Stergere produs");
    private JRadioButton button5=new JRadioButton("Modificare produs");
    private JRadioButton button6=new JRadioButton("Importare produse");
    private JRadioButton button7=new JRadioButton("Raport 1");
    private JRadioButton button8=new JRadioButton("Raport 2");
    private JRadioButton button9=new JRadioButton("Raport 3");
    private JRadioButton button10=new JRadioButton("Raport 4");
    private JLabel emptyLabel3=new JLabel("");
    private JLabel emptyLabel4=new JLabel("");
    private JLabel emptyLabel5=new JLabel("");
    private JLabel emptyLabel6=new JLabel("");
    private JLabel emptyLabel7=new JLabel("");
    private JLabel emptyLabel8=new JLabel("");
    private JLabel emptyLabel9=new JLabel("");
    private JLabel emptyLabel10=new JLabel("");
    private JLabel emptyLabel11=new JLabel("");
    private JButton submitButton= new JButton("Submit");
    private JButton submitButton1= new JButton("Submit");
    private JButton backButton= new JButton("Back");
    private JButton backButton1= new JButton("Back");
    private JButton addButton= new JButton("Add");
    private JButton logButton= new JButton("Log In");
    private JButton r1Button= new JButton("Generare raport");
    private JButton r2Button= new JButton("Generare raport");
    private JButton r3Button= new JButton("Generare raport");
    private JButton r4Button= new JButton("Generare raport");
    JTextField jTextField1=new JTextField();
    JTextField jTextField2=new JTextField();
    JTextField jTextField3=new JTextField();
    JTextField jTextField4=new JTextField();
    JTextField jTextField5=new JTextField();
    JTextField jTextField6=new JTextField();
    JTextField jTextField7=new JTextField();
    JTextField jTextField8=new JTextField();
    JTextField jTextField9=new JTextField();
    JTextField jTextField10=new JTextField();
    JTextField jTextField11=new JTextField();
    JTextField jTextField12=new JTextField();
    JTextField jTextField13=new JTextField();
    JTextField jTextField14=new JTextField();
    JTextField jTextField15=new JTextField();
    JTextField jTextField16=new JTextField();
    JTextField jTextField17=new JTextField();
    JTextField jTextField18=new JTextField();
    JTextField jTextField19=new JTextField();
    JTextField jTextField20=new JTextField();
    ButtonGroup group=new ButtonGroup();
    JPanel panel=new JPanel();
    JFrame frame=new JFrame();
    JTable jTable=new JTable();
    JScrollPane jScrollPane;
    public ViewAdmin (){
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
        panel1.add(label12);
        label12.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField13);
        panel1.add(label13);
        label13.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField14);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(logButton);
        logButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public JRadioButton getButton2() { return button2; }
    public JRadioButton getButton3() { return button3; }
    public JRadioButton getButton4() { return button4; }
    public JRadioButton getButton5() { return button5; }
    public JRadioButton getButton6() { return button6; }
    public JRadioButton getButton7() { return button7; }
    public JRadioButton getButton8() { return button8; }
    public JRadioButton getButton9() { return button9; }
    public JRadioButton getButton10() { return button10; }
    public JButton getBackButton() { return backButton; }
    public JButton getBackButton1() { return backButton1; }
    public void addButtonListener(ActionListener listener){ submitButton.addActionListener(listener); }
    public void addAddButtonListener(ActionListener listener){ addButton.addActionListener(listener); }
    public void addButtonListener1(ActionListener listener){ submitButton1.addActionListener(listener); }
    public void backButtonListener(ActionListener listener){ backButton.addActionListener(listener); }
    public void backButtonListener1(ActionListener listener){ backButton1.addActionListener(listener); }
    public void logButtonListener(ActionListener listener){ logButton.addActionListener(listener); }
    public void r1ButtonListener(ActionListener listener){ r1Button.addActionListener(listener); }
    public void r2ButtonListener(ActionListener listener){ r2Button.addActionListener(listener); }
    public void r3ButtonListener(ActionListener listener){ r3Button.addActionListener(listener); }
    public void r4ButtonListener(ActionListener listener){ r4Button.addActionListener(listener); }
    public JFrame getFrame() { return frame; }
    public JTextField getjTextField1() { return jTextField1; }
    public JTextField getjTextField2() { return jTextField2; }
    public JTextField getjTextField3() { return jTextField3; }
    public JTextField getjTextField4() { return jTextField4; }
    public JTextField getjTextField5() { return jTextField5; }
    public JTextField getjTextField6() { return jTextField6; }
    public JTextField getjTextField7() { return jTextField7; }
    public JTextField getjTextField8() { return jTextField8; }
    public JTextField getjTextField9() { return jTextField9; }
    public JTextField getjTextField10() { return jTextField10; }
    public JTextField getjTextField11() { return jTextField11; }
    public JTextField getjTextField12() { return jTextField12; }
    public JTextField getjTextField13() { return jTextField13; }
    public JTextField getjTextField14() { return jTextField14; }
    public JTextField getjTextField15() { return jTextField15; }
    public JTextField getjTextField16() { return jTextField16; }
    public JTextField getjTextField17() { return jTextField17; }
    public JTextField getjTextField18() { return jTextField18; }
    public JTextField getjTextField19() { return jTextField19; }
    public JTextField getjTextField20() { return jTextField20; }

    public void logIn(){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        panel1.add(button6);
        button6.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel7);
        panel1.add(button7);
        button7.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel8);
        panel1.add(button8);
        button8.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel9);
        panel1.add(button9);
        button9.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel10);
        panel1.add(button10);
        button10.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel11);
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
        group.add(button6);
        group.add(button7);
        group.add(button8);
        group.add(button9);
        group.add(button10);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void back(){
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
        panel1.add(button6);
        button6.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel7);
        panel1.add(button7);
        button7.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel8);
        panel1.add(button8);
        button8.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel9);
        panel1.add(button9);
        button9.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel10);
        panel1.add(button10);
        button10.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel11);
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
        group.add(button6);
        group.add(button7);
        group.add(button8);
        group.add(button9);
        group.add(button10);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void addBaseProduct(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label3);
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField1);
        panel1.add(label4);
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel1.add(label5);
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField3);
        panel1.add(label6);
        label6.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField4);
        panel1.add(label7);
        label7.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField5);
        panel1.add(label8);
        label8.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField6);
        panel1.add(label9);
        label9.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField7);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void importare(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.removeAll();
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
    }

    public void modificare(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label3);
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField1);
        panel1.add(label4);
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel1.add(label5);
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField3);
        panel1.add(label6);
        label6.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField4);
        panel1.add(label7);
        label7.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField5);
        panel1.add(label8);
        label8.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField6);
        panel1.add(label9);
        label9.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField7);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void stergere(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField10);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void addCompositeProduct(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label10);
        label10.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField11);
        panel1.add(label11);
        label11.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField12);
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

    public void raportul12(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        jTable=j;
        JScrollPane jScrollPane;
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

    public void raportul1(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label14);
        label14.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField15);
        panel1.add(label15);
        label15.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField16);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(r1Button);
        panel2.add(backButton);
        r1Button.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void raportul22(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        jTable=j;
        JScrollPane jScrollPane;
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

    public void raportul2(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label16);
        label16.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField17);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(r2Button);
        panel2.add(backButton);
        r2Button.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void raportul32(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        jTable=j;
        JScrollPane jScrollPane;
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

    public void raportul3(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label17);
        label17.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField18);
        panel1.add(label18);
        label18.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField19);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(r3Button);
        panel2.add(backButton);
        r3Button.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void raportul42(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        jTable=j;
        JScrollPane jScrollPane;
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

    public void raportul4(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.add(label19);
        label19.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField20);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(r4Button);
        panel2.add(backButton);
        r4Button.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
