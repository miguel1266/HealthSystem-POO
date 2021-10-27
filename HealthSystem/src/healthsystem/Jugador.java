package healthsystem;

class Jugador {
  //Atributos
  private String nombre;
  private int vida = 100;
  private int danioGolpe;

  //metodos
  public Jugador(String nombre, int DaGolpe){
    this.nombre = nombre;
    this.danioGolpe = DaGolpe;
    //this.vida = vidaJ;
  }

  public int ataque(){
    return(danioGolpe);
  }

  public void recibirDanio(int danio){
    vida = vida-danio;
  }

  public void recibirVida(int vidaExtra){
    vida = vida + vidaExtra;
  }

  //Get y Set
  public int getVida(){
    return (vida);
  }

  public void setVida(int vida){
    this.vida = vida;
  }

  public String getNombre(){
    return (nombre);
  }
}