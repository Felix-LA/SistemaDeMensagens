package entity;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

  private String nome;
  private String sobrenome;
  private String apelido;
  private Long id;
  private List<String> mensagem = new ArrayList<>();
  private List<String> amigos = new ArrayList<>();
  private int senha;
=======
//TODO Entidades normalmente são criadas no singular porque vc vai ter um usuario e eventualmente pode fazer uma lista de usuarios mas no banco é um usuario por linha
public class Usuarios {

  //TODO Nomes de atributos, variaveis e parametros sempre devem começar com letra minuscula, letra maiucula é exclusivo para classes, enums e interfaces
  //TODO Mantenha um padrão do projeto, você esta usando portugues pra todos os atributos, não faz sentido chamar NameUsuario em vez de NomeUsuario
  //TODO É desnecessário você colocar o sufixo Usuario nos atributos da classe Usuario, é uma redundância, se você deixar somente nome, sobrenome e apelido já fica claro que são referentes ao Usuario
  private String NameUsuario;
  private String SobrenomeUsuario;
  private String ApelidoUsuario;
  //TODO Por convenção, sempre deixe o ID como primeiro atributo da entidade
  private Long Id;
  //TODO Usuario deve ter um atributo do tipo List<Mensagem> que seja uma lista de entidades Mensagem e não uma String para que você possa relacionar a mensagem ao Usuario
  private String Mensagem;
  //TODO Usuario deve ter um atributo do tipo List<Usuario> chamado amigos para que você possa relacionar outros usuarios como sendo amigo de um usuario especifico
  private String Amigos;
>>>>>>> 5f0a185c3e9fa405419bad52bd35d07d015c6127

  public Long getId(){return this.id = id;}
  public void setId(Long id) {this.id = id;}

  public String getNome(){return this.nome = nome;}
  public void setNome(String nome) {this.nome = nome;}

  public String getSobrenome(){return this.sobrenome = sobrenome;}
  public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

  public String getApelido(){return this.apelido = apelido;}
  public void setApelido(String apelido) {this.apelido = apelido;}

  public List getMensagem(){return this.mensagem = mensagem;}
  public void setMensagem(List mensagem) {this.mensagem = mensagem;}

  public List getAmigos(){return this.amigos = amigos;}
  public void setAmigos(List amigos) {this.amigos = amigos;}

  public int getSenha() {return this.senha = senha;}
  public void setSenha(int senha) {this.senha =  senha;}
}
