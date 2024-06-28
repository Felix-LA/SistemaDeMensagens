import entity.Usuarios;

import java.util.Scanner;

public class Cadastro {

  Usuarios usuarios =  new Usuarios();

  Scanner sc = new Scanner(System.in);


  public void cadastro(){
    System.out.println("Informe o Nome: ");
    String Nome = sc.nextLine();

    System.out.println("Informe o Sobrenome: ");
    String Sobrenome = sc.nextLine();

    System.out.println("Informe um Apelido: ");
    String Apelido = sc.nextLine();


    usuarios.setNameUsuario(Nome);
    usuarios.SetSobrenomeUsuario(Sobrenome);
    usuarios.SetApelidoUsuario(Apelido);
  }

}
