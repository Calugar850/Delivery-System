package DLL;

public class Em {
    private String utilizator="angajat";
    private String parola="angajat";

    public Em(String utilizator, String parola) {
        this.utilizator = utilizator;
        this.parola = parola;
    }

    public Em() {
    }

    public String getUtilizator() { return utilizator; }

    public void setUtilizator(String utilizator) { this.utilizator = utilizator; }

    public String getParola() { return parola; }

    public void setParola(String parola) { this.parola = parola; }
}
