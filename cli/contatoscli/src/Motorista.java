public class Motorista{
  String nome;
  String placaMoto;
  String numeroDeTelefone;
  String email;
  String senha;


  public Motorista(String nome, String placaMoto, String numeroDeTelefone, String email, String senha){
    this.nome = nome;
    this.placaMoto = placaMoto;
    this.numeroDeTelefone = numeroDeTelefone;
    this.email = email;
    this.senha = senha;
  }


  public String getNome(){
    return this.nome;
  }

  public String getPlacaMoto(){
    return this.placaMoto;
  }

  public String getNumeroDeTelefone(){
    return this.numeroDeTelefone;
  }

  public String getEmail(){
    return this.email;
  }

  public String getSenha(){
    return this.senha;
  }



  public void setNome(String nome){
    this.nome = nome;
  }

  public void setPlacaMoto(String placaMoto){
    this.placaMoto = placaMoto;
  }

  public void setNumeroDeTelefone(String numeroDeTelefone){
    this.numeroDeTelefone = numeroDeTelefone;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

}