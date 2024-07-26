import entity.Usuarios;

import java.util.Scanner;

public class Cadastro {

  Usuarios usuarios =  new Usuarios();

  Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
=======
  //TODO Voce precisa de uma senha para os usuarios e precisa salvar esses usuario no banco de dados
>>>>>>> 5f0a185c3e9fa405419bad52bd35d07d015c6127
  public void cadastro(){
    System.out.println("Informe o Nome: ");
    String Nome = sc.nextLine();

    System.out.println("Informe o Sobrenome: ");
    String Sobrenome = sc.nextLine();

    System.out.println("Informe um Apelido: ");
    String Apelido = sc.nextLine();
    //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca

    System.out.println("Informe uma senha: ");
    int Senha = sc.nextInt();

    usuarios.setNome(Nome);
    usuarios.setSobrenome(Sobrenome);
    usuarios.setApelido(Apelido);
    usuarios.setSenha(Senha);
  }

}
