package DLL;

public class Admin {
    private String utilizator="admin";
    private String parola="admin";

    public Admin(String utilizator, String parola) {
        this.utilizator = utilizator;
        this.parola = parola;
    }

    public Admin() {
    }

    public String getUtilizator() { return utilizator; }

    public void setUtilizator(String utilizator) { this.utilizator = utilizator; }

    public String getParola() { return parola; }

    public void setParola(String parola) { this.parola = parola; }
}
