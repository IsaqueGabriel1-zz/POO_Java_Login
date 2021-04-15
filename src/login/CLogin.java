
package login;
public class CLogin {
    private String nome;
    private int senha;
    private int status;
    

    public void StatusL(){
        System.out.println("-----------------------------------------------");
        System.out.println("  ");
        System.out.println("Nome: " + this.getNome());
        
        
        if(status == 1){
            System.out.println("Você está logado");
        }else if(status == 0){
            System.out.println("Algo esta errado! :/");
        }else if(status == 3){
            System.out.println("  ");
        }
        System.out.println("-----------------------------------------------");
    }
    
    public void Cadastrar(String nome, int senha){
        if(nome.length() > 0){
            if(senha > 0){
                this.setNome(nome);
                this.setSenha(senha);
                System.out.println("Cadastrado com sucesso");
            }
        }else{
            System.out.println("Impossivel cadastrar");
        }
    }
    
    public void Logar(String nome, int senha){
       if(nome.length() > 0 && senha > 0){
           if(this.getNome() == nome && this.getSenha() == senha){
               status = 1;
           }else{
               status = 0;
           }
       }else{
           status = 3;
       }
       //(status = 1) = true;
       //(status = 0) = false;
       //(status = 3) = esperando resposta
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getStatus(){
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
