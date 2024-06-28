package entity;

public class Usuarios {

  private String NameUsuario;
  private String SobrenomeUsuario;
  private String ApelidoUsuario;
  private Long Id;
  private String Mensagem;
  private String Amigos;

  public String getNameUsuario(){return this.NameUsuario = NameUsuario;}
  public void setNameUsuario(String NameUsuario) {this.NameUsuario = NameUsuario;}

  public String getSobrenomeUsuario(){return this.SobrenomeUsuario = SobrenomeUsuario;}
  public void SetSobrenomeUsuario(String SobrenomeUsuario) {this.SobrenomeUsuario = SobrenomeUsuario;}

  public String getApelidoUsuario(){return this.ApelidoUsuario = ApelidoUsuario;}
  public void SetApelidoUsuario(String ApelidoUsuario) {this.ApelidoUsuario = ApelidoUsuario;}

  public Long getId(){return this.Id = Id;}
  public void SetId(Long Id) {this.Id = Id;}

  public String getMensagem(){return this.Mensagem = Mensagem;}
  public void SetMensagem(String Mensagem) {this.Mensagem = Mensagem;}

  public String getAmigos(){return this.Amigos = Amigos;}
  public void SetAmigos(String Amigos) {this.Amigos = Amigos;}
}
