package entity;

//TODO Entidades normalmente são criadas no singular porque vc vai ter uma mensagem e eventualmente pode fazer uma lista de mensagens mas no banco é um mensagem por linha
public class Mensagens {

<<<<<<< HEAD

  public String mensagemOriginal;
  public String apelidoUsuario;
  public String respostasMensagem;
=======
  //TODO Nomes de atributos, variaveis, parametros e metodos sempre devem começar com letra minuscula, letra maiucula é exclusivo para classes, enums e interfaces
  //TODO Para ficar mais claro o que você precisa fazer é melhor fazer a integração com o banco de dados e o diagrama de classes
  public String MensagemOriginal;
  public String ApelidoUsuario;
  public String RespostasMensagens;
  //TODO Espaço desnecessário de linhas brancas, deletar pelo menos uma linha branca
>>>>>>> 5f0a185c3e9fa405419bad52bd35d07d015c6127


  public String getMensagemOriginal(){return mensagemOriginal;}
  public void setMensagemOriginal(String mensagemOriginal) {
    this.mensagemOriginal = mensagemOriginal;}

  public String getApelidoUsuario() {return apelidoUsuario;}
  public void setApelidoUsuario(String apelidoUsuario) {
    this.apelidoUsuario = apelidoUsuario;}

  public String getRespostasMensagem() {return respostasMensagem;}
  public void setRespostasMensagem(String respostasMensagem) {
    this.respostasMensagem = respostasMensagem;}


}
