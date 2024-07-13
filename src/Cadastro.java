import entity.Usuarios;

import java.util.Scanner;

public class Cadastro {

  Usuarios usuarios =  new Usuarios();

  Scanner sc = new Scanner(System.in);

  //TODO Voce precisa de uma senha para os usuarios e precisa salvar esses usuario no banco de dados
  public void cadastro(){
    System.out.println("Informe o Nome: ");
    String Nome = sc.nextLine();

    System.out.println("Informe o Sobrenome: ");
    String Sobrenome = sc.nextLine();

    System.out.println("Informe um Apelido: ");
    String Apelido = sc.nextLine();
    //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca


    usuarios.setNameUsuario(Nome);
    usuarios.SetSobrenomeUsuario(Sobrenome);
    usuarios.SetApelidoUsuario(Apelido);
  }

}
