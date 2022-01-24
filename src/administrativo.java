public class administrativo  extends funcionario{
    String funcao;



    public administrativo(String nome, String usuario, int idade, double valorhora, double salario, String funcao) {
        super(nome, usuario, idade, valorhora, salario);
        this.funcao = funcao;
    }



    @Override
    public void calculasalario() {
        // TODO Auto-generated method stub
        
    }

}