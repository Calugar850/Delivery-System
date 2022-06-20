package presentation;

import BLL.*;
import DLL.Admin;
import DLL.Client;
import DLL.Em;
import DLL.Serializer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Controller {
    View view;
    ViewAdmin viewAdmin;
    ViewClient viewClient;
    ViewEm viewEm;
    Order order;
    Admin admin=new Admin();
    Client clients=new Client();
    Em angajat=new Em();
    Serializer serializer=new Serializer();
    DeliveryService deliveryService=new DeliveryService();

    public Controller(View view, ViewAdmin viewAdmin, ViewClient viewClient, ViewEm viewEm){
        this.view = view;
        this.viewAdmin=viewAdmin;
        this.viewClient=viewClient;
        this.viewEm=viewEm;
        try{
            deliveryService=serializer.read();
        }catch (Exception e){
            deliveryService =new DeliveryService();
            System.out.println("asd");
        }
        deliveryService.addObserver(viewEm);
        viewAdmin.getFrame().setVisible(false);
        viewAdmin.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                serializer.write(deliveryService);
            }
        });
        viewClient.getFrame().setVisible(false);
        viewClient.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                serializer.write(deliveryService);
            }
        });
        viewEm.getFrame().setVisible(false);
        viewEm.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                serializer.write(deliveryService);
            }
        });
        view.addButtonListener(new SubmmitViewListener());
        viewAdmin.addButtonListener(new AdminViewListener());
        viewClient.addButtonListener(new ClientViewListener());
        viewAdmin.backButtonListener(new BackListener());
        viewClient.backButtonListener(new BackListener());
        viewAdmin.backButtonListener1(new MainListener());
        viewClient.backButtonListener1(new MainListener());
    }

    public class SubmmitViewListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(view.getButton1().isSelected()) selectedButton=1;
            if(view.getButton2().isSelected()) selectedButton=2;
            if(view.getButton3().isSelected()) selectedButton=3;
            switch (selectedButton){
                case 1:
                    viewAdmin.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    viewAdmin.inceput();
                    viewAdmin.logButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String user=viewAdmin.getjTextField11().getText();
                            String parola=viewAdmin.getjTextField12().getText();
                            if(!(admin.getUtilizator()==user) && !(admin.getParola()==parola)) {
                                viewAdmin.logIn();
                            }
                        }
                    });
                    break;
                case 2:
                    viewClient.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    viewClient.inceput();
                    viewClient.logButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String user=viewClient.getjTextField8().getText();
                            String parola=viewClient.jTextField9.getText();
                            for(Client c : clients.getClientArrayList()){
                                if(!(c.getUtilizator()==user) && !(c.getParola()==parola))
                                    viewClient.logIn();
                                }
                        }
                    });
                    viewClient.registerButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            viewClient.register();
                            viewClient.registerNowButtonListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String utilizator=viewClient.getjTextField10().getText();
                                    String parola=viewClient.getjTextField11().getText();
                                    String mail=viewClient.getjTextField12().getText();
                                    clients.inrolareClient(utilizator,parola,mail);
                                    viewClient.back();
                                }
                            });
                                                    }
                    });
                    break;
                case 3:
                    viewEm.getFrame().setVisible(true);
                    view.getFrame().setVisible(false);
                    viewEm.inceput();
                    viewEm.logButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String user=viewEm.getjTextField1().getText();
                            String parola=viewEm.getjTextField2().getText();
                            if(!(admin.getUtilizator()==user) && !(admin.getParola()==parola)) {
                                viewEm.logIn(afisareTabela(new ArrayList<>(deliveryService.getOrderHashSetMap().keySet())));
                                viewEm.backButtonListener(new MainListener());
                            }
                        }
                    });
                    break;
                default:
                    break;
            }
        }
    }

    public class AdminViewListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(viewAdmin.getButton2().isSelected()) selectedButton=2;
            if(viewAdmin.getButton3().isSelected()) selectedButton=3;
            if(viewAdmin.getButton4().isSelected()) selectedButton=4;
            if(viewAdmin.getButton5().isSelected()) selectedButton=5;
            if(viewAdmin.getButton6().isSelected()) selectedButton=6;
            if(viewAdmin.getButton7().isSelected()) selectedButton=7;
            if(viewAdmin.getButton8().isSelected()) selectedButton=8;
            if(viewAdmin.getButton9().isSelected()) selectedButton=9;
            if(viewAdmin.getButton10().isSelected()) selectedButton=10;
            if(viewAdmin.getBackButton().isSelected()) selectedButton=11;
            if(viewAdmin.getBackButton1().isSelected()) selectedButton=12;
            switch(selectedButton){
                case 2:
                    viewAdmin.addBaseProduct();
                    viewAdmin.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String titlu=viewAdmin.getjTextField1().getText();
                            String rating=viewAdmin.getjTextField2().getText();
                            String calorii=viewAdmin.getjTextField3().getText();
                            String proteine=viewAdmin.getjTextField4().getText();
                            String grasimi=viewAdmin.getjTextField5().getText();
                            String sare=viewAdmin.getjTextField6().getText();
                            String pret=viewAdmin.getjTextField7().getText();
                            double r=Double.parseDouble(rating);
                            int c=Integer.parseInt(calorii);
                            int p=Integer.parseInt(proteine);
                            int g=Integer.parseInt(grasimi);
                            int s=Integer.parseInt(sare);
                            int pr=Integer.parseInt(pret);
                            BaseProduct baseProduct=new BaseProduct(titlu,r,c,p,g,s,pr);
                            deliveryService.addProduct(baseProduct);
                        }
                    });
                    break;
                case 3:
                    viewAdmin.addCompositeProduct();
                    viewAdmin.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String composite=viewAdmin.getjTextField11().getText();
                            deliveryService.creatComp(composite);
                        }
                    });
                    viewAdmin.addAddButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String base=viewAdmin.getjTextField12().getText();
                            deliveryService.addBase(base);
                        }
                    });
                    break;
                case 4:
                    viewAdmin.stergere();
                    viewAdmin.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String titlu=viewAdmin.getjTextField10().getText();
                            deliveryService.deleteProduct(deliveryService.searchProductByName(titlu));
                        }
                    });
                    break;
                case 5:
                    viewAdmin.modificare();
                    viewAdmin.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String titlu=viewAdmin.getjTextField1().getText();
                            String rating=viewAdmin.getjTextField2().getText();
                            String calorii=viewAdmin.getjTextField3().getText();
                            String proteine=viewAdmin.getjTextField4().getText();
                            String grasimi=viewAdmin.getjTextField5().getText();
                            String sare=viewAdmin.getjTextField6().getText();
                            String pret=viewAdmin.getjTextField7().getText();
                            double r=Double.parseDouble(rating);
                            int c=Integer.parseInt(calorii);
                            int p=Integer.parseInt(proteine);
                            int g=Integer.parseInt(grasimi);
                            int s=Integer.parseInt(sare);
                            int pr=Integer.parseInt(pret);
                            deliveryService.modifyProduct(deliveryService.searchProductByName(titlu),r,c,p,g,s,pr);
                        }
                    });
                    break;
                case 6:
                    deliveryService.importProduct();
                    viewAdmin.importare(afisareTabela(deliveryService.getMenuItemList()));
                    break;
                case 7:
                    viewAdmin.raportul1();
                    viewAdmin.r1ButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String val1=viewAdmin.getjTextField15().getText();
                            String val2=viewAdmin.getjTextField16().getText();
                            int value1=Integer.parseInt(val1);
                            int value2=Integer.parseInt(val2);
                            viewAdmin.raportul12(afisareTabela(deliveryService.report1(value1,value2)));
                        }
                    });
                    break;
                case 8:
                    viewAdmin.raportul2();
                    viewAdmin.r2ButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String val1=viewAdmin.getjTextField17().getText();
                            int value1=Integer.parseInt(val1);
                            viewAdmin.raportul22(afisareTabela(deliveryService.report2(value1)));
                        }
                    });
                    break;
                case 9:
                    viewAdmin.raportul3();
                    viewAdmin.r3ButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String val1=viewAdmin.getjTextField18().getText();
                            String val2=viewAdmin.getjTextField19().getText();
                            int value1=Integer.parseInt(val1);
                            int value2=Integer.parseInt(val2);
                            viewAdmin.raportul32(afisareTabela(deliveryService.report3(value1,value2)));
                        }
                    });
                    break;
                case 10:
                    viewAdmin.raportul4();
                    viewAdmin.r4ButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String val1=viewAdmin.getjTextField20().getText();
                            int value1=Integer.parseInt(val1);
                            viewAdmin.raportul42(afisareTabela(deliveryService.report4(value1)));
                        }
                    });
                    break;
                case 11:
                    viewAdmin.addButtonListener(new BackListener());
                    break;
                case 12:
                    viewAdmin.backButtonListener1(new MainListener());
                default:
                    break;
            }
        }
    }

    public class ClientViewListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedButton=0;
            if(viewClient.getButton2().isSelected()) selectedButton=2;
            if(viewClient.getButton3().isSelected()) selectedButton=3;
            if(viewClient.getButton4().isSelected()) selectedButton=4;
            if(viewClient.getButton5().isSelected()) selectedButton=5;
            for(ActionListener i: viewClient.getBackButton().getActionListeners()){
                viewClient.getBackButton().removeActionListener(i);
            }
            viewClient.backButtonListener(new BackListener1());
            viewClient.backButtonListener1(new MainListener());
            switch (selectedButton){
                case 2:
                    viewClient.cautareDupaNume2();
                    for(ActionListener i: viewClient.getSubmitButton1().getActionListeners()){
                        viewClient.getSubmitButton1().removeActionListener(i);
                    }
                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String nume=viewClient.getjTextField1().getText();
                            viewClient.cautareDupaNume(afisareTabela(deliveryService.searchProductsByName(nume)));
                        }
                    });
                    break;
                case 3:
                    viewClient.cautareDupaPret2();
                    for(ActionListener i: viewClient.getSubmitButton1().getActionListeners()){
                        viewClient.getSubmitButton1().removeActionListener(i);
                    }

                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String pret=viewClient.getjTextField2().getText();
                            int price=Integer.parseInt(pret);
                            viewClient.cautareDupaPret(afisareTabela(deliveryService.searchProductByPrice(price)));
                        }
                    });
                    break;
                case 4:
                    viewClient.cautareDupaValoareProteica2();
                    for(ActionListener i: viewClient.getSubmitButton1().getActionListeners()){

                        viewClient.getSubmitButton1().removeActionListener(i);
                    }
                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String proteine=viewClient.getjTextField3().getText();
                            int proteina=Integer.parseInt(proteine);
                            viewClient.cautareDupaValoareProteica(afisareTabela(deliveryService.searchProductByProteins(proteina)));
                        }
                    });
                    break;
                case 5:
                    order=new Order();
                    viewClient.generareComanda();
                    for(ActionListener i: viewClient.getSubmitButton1().getActionListeners()){
                        viewClient.getSubmitButton1().removeActionListener(i);
                    }

                    viewClient.addButtonListener1(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String comanda=viewClient.getjTextField4().getText();
                            String client=viewClient.getjTextField6().getText();
                            int idcom=Integer.parseInt(comanda);
                            int idcl=Integer.parseInt(client);
                            order.setOrderID(idcom);
                            order.setClientID(idcl);
                            order.setDate(LocalDateTime.now());
                            deliveryService.createOrder(order);
                            order=new Order();
                        }
                    });
                    for(ActionListener i: viewClient.getAddButton().getActionListeners()){
                        viewClient.getAddButton().removeActionListener(i);
                    }
                    viewClient.addAddButtonListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String base=viewClient.getjTextField7().getText();
                            order.adaItemToOrder(deliveryService.searchProductByName(base));
                        }
                    });
                    break;
                default:
                    break;
            }
        }
    }

    public class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewAdmin.back();
            viewClient.back();
            viewAdmin.getFrame().setVisible(true);
            viewClient.getFrame().setVisible(false);
            view.getFrame().setVisible(false);
        }
    }

    public class BackListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewAdmin.back();
            viewClient.back();
            viewAdmin.getFrame().setVisible(false);
            viewClient.getFrame().setVisible(true);
            view.getFrame().setVisible(false);
        }
    }

    public class MainListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            viewAdmin.getFrame().setVisible(false);
            viewClient.getFrame().setVisible(false);
            view.getFrame().setVisible(true);
        }
    }

    public JTable afisareTabela(Object o) {
        List<?> objects = (List<?>) o;
        JTable jTable;
        String[] columnnames;
        ArrayList<String> coloane;
        coloane = new ArrayList<>();
        Field[] fields=objects.get(0).getClass().getDeclaredFields();
        for(int i=0;i<fields.length;i++) {
            fields[i].setAccessible(true);
            try {
                if(fields[i].getName().equals("baseProductArrayList"))
                    continue;
                coloane.add(fields[i].getName());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        columnnames = new String[coloane.size()];
        columnnames = coloane.toArray(columnnames);
        int counter = 0;
        String[][] randuri;
        randuri = new String[objects.size()][];
        for (Object object : objects) {
            coloane = new ArrayList<>();
            fields=objects.get(counter).getClass().getDeclaredFields();
            for(int j=0;j<fields.length;j++) {
                fields[j].setAccessible(true);
                try {
                    coloane.add(fields[j].get(object).toString());
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            randuri[counter] = new String[coloane.size()];
            randuri[counter] = coloane.toArray(randuri[counter++]);
        }
        jTable = new JTable(randuri, columnnames);
        return jTable;
    }
}
