import java.util.Scanner;

public class Menu {

  //TODO Seu programa não esta funcionando pois o seu Menu cria um objeto do tipo PaginaDeLogin, PaginaDeLogin cria um objeto do tipo Login e seu Login cria um objeto do tipo Menu o que leva a uma recursividade infinita e estouro de memoria.
  // Você não deve criar um objeto do tipo Menu fora da classe Main, nenhuma classe que trata da funcionalidade de uma opção do Menu deve fazer mais do que essa opção,
  // quando o Login acabar, quem tem que exibir o Menu novamente é o proprio Menu e não o Login, essa é a fonte do seu erro
  PaginaDeLogin paginaDeLogin = new PaginaDeLogin();
  Scanner sc = new Scanner(System.in);

  public void menu(){

    System.out.println("Usuário Conectado");

    System.out.println("0 - Voltar");
    System.out.println("1 - Ver Suas Mensagens: ");
    System.out.println("2 - Ver suas Respostas");
    //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca


    String opcaoSelecionada = sc.nextLine();

    switch (opcaoSelecionada){
      case "0":
        paginaDeLogin.MenuDeLogin();
        break;
    }
  }

}
