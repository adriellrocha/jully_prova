public class prof extends funcionario{
    
    public prof(String nome, String usuario, int idade, double valorhora, double salario, int numerodisciplina) {
        super(nome, usuario, idade, valorhora, salario);
        this.numerodisciplina = numerodisciplina;
    }

    protected int numerodisciplina;

    @Override
    public double calculasalario(double valorhora) {
        super.salario = super.calculasalario(this.valorhora) *numerodisciplina; 
        return salario;
    }

   
    
   }