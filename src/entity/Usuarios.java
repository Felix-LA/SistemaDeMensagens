package entity;
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
