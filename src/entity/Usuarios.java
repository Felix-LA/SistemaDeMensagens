package entity;


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
