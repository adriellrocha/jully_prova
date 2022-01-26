public class administrativo  extends funcionario{
    String funcao;

    public administrativo(String nome, String usuario, int idade, double valorhora, String funcao) {
        super(nome, usuario, idade, valorhora);
        this.funcao = funcao;
    }



    @Override
    public double calculasalario(double valorhora) {
        super.salario = super.calculasalario(this.valorhora)  + (super.valorhora*0.1); 
        return super.salario;
    }



   

}