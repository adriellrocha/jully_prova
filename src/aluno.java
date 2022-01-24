public class aluno extends instituição{
    private String curso;
    private String periodo;
    public aluno(String nome, String usuario, int idade, String curso, String periodo) {
        super(nome, usuario, idade);
        this.curso = curso;
        this.periodo = periodo;
    }
    
   }