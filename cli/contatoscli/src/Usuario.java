public class Usuario{
  String nome;
  String endereco;
  String numeroDeTelefone;
  String email;
  String senha;

  public Usuario(String nome, String endereco, String numeroDeTelefone, String email, String senha){
    this.nome = nome;
    this.endereco = endereco;
    this.numeroDeTelefone = numeroDeTelefone;
    this.email = email;
    this.senha = senha;
  }

  public String getNome(){
    return this.nome;
  }

  public String getEndereco(){
    return this.endereco;
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

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setNumeroDeTelefone(String numeroDeTelofone){
    this.numeroDeTelefone = numeroDeTelefone;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

}


