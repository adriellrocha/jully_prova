public class funcionario extends instituição {

    public funcionario(String nome, String usuario, int idade, double valorhora, double salario) {
        super(nome, usuario, idade);
        this.valorhora = valorhora;
        this.salario = salario;
    }

    double valorhora;

    double salario;

    public double calculasalario(double valorhora) {
        salario = valorhora ;
        return salario;
    }
}