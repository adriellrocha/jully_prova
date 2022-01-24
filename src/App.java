import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner ler = new Scanner(System.in);
    String user [] = {"july","jean","Elen","adriel" };
    String senha [] = {"1234","senha","5678","@adr15"};
    String funcao [] = {"AL","PH","TA","PR"};
        String resp;    
    System.out.println("deseja realizar o login caso sim digite (login) caso não digite (s) para sair");
        resp = ler.nextLine();
        if (resp.equals("login")) {
            String senhaP;
            String userString;
            System.out.println("digite seu usuario ");
            userString = ler.nextLine();
            System.out.println("digite sua senha ");
            senhaP = ler.nextLine();
             
            for (int i =0 ;i<5;i++ ){
                if (userString.equals(user[i]) & senhaP.equals(senha[i])) {
                   System.out.println("login correto");
                 switch (funcao[i]){
                     case "AL":
                     System.out.println("funçao aluno ");
                     break;
                     case "PH":
                     System.out.println("funçao professor horista");
                     break;
                     case "TA":
                     System.out.println("funçao administrativo ");
                     break;
                     case "PR":
                     System.out.println("funçao professor regime");
                    break;
                 
                 } 
                }else{
                    System.out.println("login incorreto");
                }

            }


        }  else if (resp.equals("s")) {
            System.out.println("Saindo");
        }
    }
}
