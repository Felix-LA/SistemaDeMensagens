import entity.Usuarios;

import java.util.Scanner;

public class Login {

  Menu menu = new Menu();

  Scanner sc = new Scanner(System.in);

  public void login(){
    Usuarios usuarios = new Usuarios();

    System.out.println("Apelido: ");
    String Apelido = sc.nextLine();

    System.out.println("Senha: ");
    int Senha = sc.nextInt();

    menu.menu();

  }
}
