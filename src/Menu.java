import java.util.Scanner;

public class Menu {

  PaginaDeLogin paginaDeLogin = new PaginaDeLogin();
  Scanner sc = new Scanner(System.in);

  public void menu(){

    System.out.println("Usuário Conectado");

    System.out.println("0 - Voltar");
    System.out.println("1 - Ver Suas Mensagens: ");
    System.out.println("2 - Ver suas Respostas");


    String opcaoSelecionada = sc.nextLine();

    switch (opcaoSelecionada){
      case "0":
        paginaDeLogin.MenuDeLogin();
        break;
    }
  }

}
