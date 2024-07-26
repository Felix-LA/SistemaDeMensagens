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

    System.out.println("Informe uma senha: ");
    int Senha = sc.nextInt();

    usuarios.setNome(Nome);
    usuarios.setSobrenome(Sobrenome);
    usuarios.setApelido(Apelido);
    usuarios.setSenha(Senha);
  }

}
