public class profregime extends prof{
    
    public profregime(String nome, String usuario, int idade, double valorhora, double salario, int numerodisciplina,
            double quanthoras) {
        super(nome, usuario, idade, valorhora, salario, numerodisciplina);
        this.quanthoras = quanthoras;
    }

    protected double quanthoras;

    @Override
    public double calculasalario(double valorhora) {
        super.salario = (super.calculasalario(this.valorhora)  + (super.valorhora*0.3))  * numerodisciplina; 
        return super.salario;
    }
    
   }