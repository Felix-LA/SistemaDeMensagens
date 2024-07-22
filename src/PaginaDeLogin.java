import java.util.Scanner;

public class PaginaDeLogin {
  Sair sair = new Sair();
  Login login = new Login();
  Cadastro cadastro = new Cadastro();

  public void run(){

    String acao = null;
    do{
      acao = MenuDeLogin();
    }
    while (!"0".equals(acao));
  }

  public String MenuDeLogin(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Olá");
    System.out.println(" Seja Bem Vindo");
    System.out.println("O que Deseja Fazer");
    System.out.println("\n");

    System.out.println("\n");
    System.out.println("0 - Sair");
    System.out.println("1 - Login");
    System.out.println("2 - Cadastro");

    System.out.println("\n");

    String opcaoSelecionada = sc.nextLine();

    switch (opcaoSelecionada) {
      case "0":
        sair.sair();
        break;
      case "1":
        login.login();
        break;
      case "2":
        cadastro.cadastro();
    }

    return opcaoSelecionada;
  }
}
