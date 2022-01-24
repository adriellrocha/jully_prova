public class profhorista extends prof{
    
    public profhorista(String nome, String usuario, int idade, double valorhora, double salario, int numerodisciplina,
            double quanthoras) {
        super(nome, usuario, idade, valorhora, salario, numerodisciplina);
        this.quanthoras = quanthoras;
    }

    private double quanthoras;

    @Override
    public double calculasalario(double valorhora) {
        super.salario = super.calculasalario(this.valorhora) * super.numerodisciplina * quanthoras; 
        return super.salario;
    }
    
    
   }