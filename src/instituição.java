public class instituição{
   
   public instituição(String nome, String usuario, int idade) {
    this.nome = nome;
    this.usuario = usuario;
    this.idade = idade;
  }
  protected String nome;
   protected String usuario;
    int idade;

    @Override
    public String toString() {
      return "Olá " + nome + " seja bem vindo /n";
    }
    
  }