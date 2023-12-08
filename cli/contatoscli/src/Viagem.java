public class Viagem{
  int IDViagem;
  String localPartida;
  String localDestino;
  float valor;

  public Viagem(int IDViagem, String localPartida, String localDestino, float valor){
    this.IDViagem = IDViagem;
    this.localPartida = localPartida;
    this.localDestino = localDestino;
    this.valor = valor;
  }

  public int getIDViagem(){
    return this.IDViagem;
  }
  
  public String getLocalPartida(){
    return this.localPartida;
  }

  public String getLocalDestino(){
    return this.localDestino;
  }

  public float getValor(){
    return this.valor;
  }

  public void setIDViagem(int IDViagem){
    this.IDViagem = IDViagem;
  }
  
  public void setLocalPartida(String localPartida){
    this.localPartida = localPartida;
  }

  public void setLlocalDestino(String localDestino){
    this.localDestino = localDestino;
  }

  public void setValor(float valor){
    this.valor = valor;
  }

}