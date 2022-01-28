import java.util.Scanner;

public class App {
    static String user[] = { "july", "jean", "Elen", "adriel" };
    static String senha[] = { "1234", "senha", "5678", "@adr15" };
    static String funcao[] = { "AL", "PH", "TA", "PR" };
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String resp;
        System.out.println("deseja realizar o login caso sim digite (login) caso não digite (s) para sair");
        resp = ler.nextLine();
        if (resp.equals("login")) {
            login();

        }

        else if (resp.equals("s")) {
            System.out.println("Saindo");
        }
    }

    public static void login() {
       
        String senhaP;
        String userString;
        System.out.println("|___________________|");
        System.out.println("digite seu usuario ");
        userString = ler.nextLine();
        System.out.println("digite sua senha ");
        senhaP = ler.nextLine();

        for (int i = 0; i < 5; i++) {
            if (userString.equals(user[i]) & senhaP.equals(senha[i])) {
                System.out.println("login correto");
                switch (funcao[i]) {
                    case "AL":
                        aluno();
                        break;
                    case "PH":
                        profH();
                        break;
                    case "TA":
                        System.out.println("funçao administrativo ");
                        break;
                    case "PR":
                        profR();
                        break;

                }
            } else {
                System.out.println("login incorreto");
            }
        }
    }

    public static void aluno() {
        aluno aluno01 = new aluno("julyana", "july", 19, "TI", "5°");
        System.out.println("Seja bem vindo " + aluno01.nome + "!!");
        System.out.println(" Informe qual operação se deseja realizar:\n l – Logoff\n e – Exibir dados Pessoais");
    
        String resp1 = ler.nextLine();
        switch (resp1) {
            case "l":
                login();
                break;
            case "e":
                aluno01.toString();
                System.out.println(aluno01.toString());
                System.out.println("Digite l para Logoff");
                String resp2 = ler.nextLine();
                if (resp2.equals("l")) {
                    login();
                }
                break;

        }

    }

    public static void profH() {
        double valh = 15.00;
        profhorista profh01 = new profhorista("Jean Alencar", "jean", 78, valh, 3, 6);
        System.out.println("Seja bem vindo " + profh01.nome + "!!");
        System.out.println(
                " Informe qual operação se deseja realizar:\n l – Logoff\n c – Calcular Salario\n e – Exibir dados Pessoais");
      
        String resp1 = ler.nextLine();
        switch (resp1) {
            case "l":
                login();
                break;
            case "e":
                System.out.println(profh01.toString());
                System.out.println("Digite l para Logoff");
                System.out.println("Digite c para Calcular Salario");
                String resp2 = ler.nextLine();
                if (resp2.equals("l")) {
                    login();
                } else if (resp2.equals("c")) {

                    System.out.println("Voce trabalhou " + profh01.quanthoras + ", seu salario é R$ "
                            + profh01.calculasalario(valh));
                }
                break;
            case "c":

                System.out.println(
                        "Voce trabalhou " + profh01.quanthoras + "h, seu salario é R$ " + profh01.calculasalario(valh));
                System.out.println("Digite l para Logoff");
                System.out.println("Digite e para Exibir dados Pessoais");
                String resp3 = ler.nextLine();
                if (resp3.equals("l")) {
                    login();
                } else if (resp3.equals("e")) {

                    System.out.println(profh01.toString());
                }
                break;

        }
    }

    public static void profR() {

        double valh = 15.00;
        profregime profr01 = new profregime("adriell rocha", "adriel", 19, 15.00, 4, 8);
        System.out.println("Seja bem vindo " + profr01.nome + "!!");
        System.out.println(
                " Informe qual operação se deseja realizar:\n l – Logoff\n c – Calcular Salario\n e – Exibir dados Pessoais");
    
        String resp1 = ler.nextLine();
        switch (resp1) {
            case "l":
                login();
                break;
            case "e":
                System.out.println(profr01.toString());
                System.out.println("Digite l para Logoff");
                System.out.println("Digite c para Calcular Salario");
                String resp2 = ler.nextLine();
                if (resp2.equals("l")) {
                    login();
                } else if (resp2.equals("c")) {

                    System.out.println(" seu salario é R$ " + profr01.calculasalario(valh));
                }
                break;
            case "c":

                System.out.println(" seu salario é R$ " + profr01.calculasalario(valh));
                System.out.println("Digite l para Logoff");
                System.out.println("Digite e para Exibir dados Pessoais");
                String resp3 = ler.nextLine();
                if (resp3.equals("l")) {
                    login();
                } else if (resp3.equals("e")) {

                    System.out.println(profr01.toString());
                }
                break;


        }
    }

    public static void TecAdm() {
     
       administrativo adm01 = new administrativo("elen sales", "elen", 16, 10.00, "secretaria");
        System.out.println("Seja bem vindo " + adm01.nome + "!!");
        System.out.println(" Informe qual operação se deseja realizar: \n l – Logoff\n c – Calcular Salario\n e – Exibir dados Pessoais\n i – Inserir Novo Usuário\n a – Alterar Usuário\n d – Deletar Usuário\n p - Pesquisar Usuário");
        String resp1 = ler.nextLine();
        switch (resp1) {
            case "l":
                login();
                break;
            case "c":
            System.out.println("Seu salário é "+adm01.calculasalario(adm01.valorhora)+"");
                
            break;
            case "e":
            adm01.toString();
            break;
            case "i":
            break;
            case "a":
            break;
            case "d":
            break;
            case "p":
            break;
        }
        
        
    }
    
}
