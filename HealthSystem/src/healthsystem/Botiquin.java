package healthsystem;
class Botiquin {
  //atributos
  private int montoPuntoDeVida;
  private boolean estaUsado;

  //metodos
  public Botiquin(int botVida, boolean botUsado){
    this.montoPuntoDeVida = botVida;
    this.estaUsado = botUsado;
  }
  public boolean getestaUsado(){return(estaUsado);}
  }