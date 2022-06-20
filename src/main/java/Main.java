import presentation.*;

public class Main {
    public static void main(String[] args) {
        View view=new View();
        ViewAdmin viewAdmin=new ViewAdmin();
        ViewClient viewClient=new ViewClient();
        ViewEm viewEm=new ViewEm();
        Controller controller=new Controller(view,viewAdmin,viewClient,viewEm);
    }
}
