package healthsystem;
class Zombie {
  //Atributos
  private String nombre;
  private int vida = 50;
  private int hacerDanio = 10;
  //private int recibirdanio = 20;

  public zombie nom, int vidaZ, int danioZ){
    this.nombre = nom;
    this.vida = vidaZ;
    this.danioRasgunio = danioZ;
  }

  public void recibirdanio(int danio){
    vida= vida-danio;
  }

  public int ataque(){
    return(10);
  }

  public int getVida(){return(this.vida);}

}