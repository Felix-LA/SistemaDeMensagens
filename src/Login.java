import entity.Usuarios;

import java.awt.*;
import java.util.Scanner;

public class Login {

  Menu menu = new Menu();

  Scanner sc = new Scanner(System.in);

  //TODO O usuário esta sem senha, você deve salvar o usuario no banco de dados e na hora do login precisa procurar o login correspondente do login inserido do usuario e validar se a ssenha esta igual.
  // O que vc esta fazendo aqui é criando um usuario novo o que não vai fazer sentido com o cadastro ja que não esta sendo cadastrado de verdade e sim criado um novo sempre que se loga no sistema.
  public void login(){
    Usuarios usuarios = new Usuarios();

    System.out.println("Nome: ");
    String Nome = sc.nextLine();

    System.out.println("Sobrenome: ");
    String Sobrenome = sc.nextLine();

    System.out.println("Apelido: ");
    String Apelido = sc.nextLine();
    //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca


    usuarios.setNameUsuario(Nome);
    usuarios.SetSobrenomeUsuario(Sobrenome);
    usuarios.SetApelidoUsuario(Apelido);

    menu.menu();

  }
}
