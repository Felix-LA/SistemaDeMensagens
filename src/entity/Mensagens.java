package entity;

//TODO Entidades normalmente são criadas no singular porque vc vai ter uma mensagem e eventualmente pode fazer uma lista de mensagens mas no banco é um mensagem por linha
public class Mensagens {

  //TODO Nomes de atributos, variaveis, parametros e metodos sempre devem começar com letra minuscula, letra maiucula é exclusivo para classes, enums e interfaces
  //TODO Para ficar mais claro o que você precisa fazer é melhor fazer a integração com o banco de dados e o diagrama de classes
  public String MensagemOriginal;
  public String ApelidoUsuario;
  public String RespostasMensagens;
  //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca


  public String getMensagemOriginal(){return MensagemOriginal;}
  public void setMensagemOriginal(String mensagemOriginal) {MensagemOriginal = mensagemOriginal;}

  public String getApelidoUsuario() {return ApelidoUsuario;}
  public void setApelidoUsuario(String apelidoUsuario) {ApelidoUsuario = apelidoUsuario;}

  public String getRespostasMensagens() {return RespostasMensagens;}
  public void setRespostasMensagens(String respostasMensagens) {RespostasMensagens = respostasMensagens;}


}
