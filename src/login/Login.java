
package login;


public class Login {

    public static void main(String[] args) {
       CLogin p1 = new CLogin();
       p1.Cadastrar("Isaque", 1234);
       p1.Logar("Isaque", 1234);
       p1.StatusL();
       
       CLogin p2 = new CLogin();
       p2.Cadastrar("Gabriel", 5555);
       p2.Logar("Gabriel", 5555);
       p2.StatusL();
    }
    
}
