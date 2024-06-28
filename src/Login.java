import entity.Usuarios;

import java.awt.*;
import java.util.Scanner;

public class Login {

  Menu menu = new Menu();

  Scanner sc = new Scanner(System.in);

  public void login(){
    Usuarios usuarios = new Usuarios();

    System.out.println("Nome: ");
    String Nome = sc.nextLine();

    System.out.println("Sobrenome: ");
    String Sobrenome = sc.nextLine();

    System.out.println("Apelido: ");
    String Apelido = sc.nextLine();


    usuarios.setNameUsuario(Nome);
    usuarios.SetSobrenomeUsuario(Sobrenome);
    usuarios.SetApelidoUsuario(Apelido);

    menu.menu();

  }
}
