public class funcionario extends instituição {

    public funcionario(String nome, String usuario, int idade, double valorhora) {
        super(nome, usuario, idade);
        this.valorhora = valorhora;
        
    }

    double valorhora;

    double salario;

    public double calculasalario(double valorhora) {
        salario = valorhora ;
        return salario;
    }
}