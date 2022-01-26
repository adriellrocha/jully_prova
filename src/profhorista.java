public class profhorista extends prof{
    


  

   

    public profhorista(String nome, String usuario, int idade, double valorhora, int numerodisciplina,
            double quanthoras) {
        super(nome, usuario, idade, valorhora, numerodisciplina);
        this.quanthoras = quanthoras;
    }

    protected double quanthoras;

    @Override
    public double calculasalario(double valorhora) {
        super.salario = super.calculasalario(this.valorhora)  * quanthoras; 
        return super.salario;
    }

    @Override
    public String toString() {
        return "Você é Professor horista , possui carga horária semanal de "+quanthoras+", carga horária mensal de "+ quanthoras*4 +" e "+numerodisciplina+" disciplinas.";
        
    }
    
    
    
   }