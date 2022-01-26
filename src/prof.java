public class prof extends funcionario{
    
    
    public prof(String nome, String usuario, int idade, double valorhora, int numerodisciplina) {
        super(nome, usuario, idade, valorhora);
        this.numerodisciplina = numerodisciplina;
    }

    protected int numerodisciplina;

    @Override
    public double calculasalario(double valorhora) {
        super.salario = super.calculasalario(this.valorhora) *numerodisciplina; 
        return salario;
    }

   
    
   }