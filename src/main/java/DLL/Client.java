package DLL;

import java.util.ArrayList;

public class Client {
    private String utilizator;
    private String parola;
    private String email;
    private ArrayList<Client> clientArrayList=new ArrayList<>();

    public Client(String utilizator, String parola, String email) {
        this.utilizator = utilizator;
        this.parola = parola;
        this.email = email;
    }

    public Client() {
    }

    public String getUtilizator() { return utilizator; }

    public void setUtilizator(String utilizator) { this.utilizator = utilizator; }

    public String getParola() { return parola; }

    public void setParola(String parola) { this.parola = parola; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public ArrayList<Client> getClientArrayList() { return clientArrayList; }

    public void setClientArrayList(ArrayList<Client> clientArrayList) { this.clientArrayList = clientArrayList; }

    public void inrolareClient(String utilizator, String parola, String email){
        Client c=new Client(utilizator,parola,email);
        clientArrayList.add(c);
    }

    public boolean verificareClient(String utilizator, String parola){
        for(Client c: clientArrayList){
            if(c.getUtilizator().equals(utilizator) && c.getParola().equals(parola))
                return true;
        }
        return false;
    }
}
