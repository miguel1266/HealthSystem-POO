package healthsystem;
class Zombie {
  //Atributos
  private String nombre;
  private int vida = 50;
  private int danioRasgunio;
  //private int recibirdanio = 20;

  public Zombie (String nom, int daniozombie){
    this.nombre = nom;
    this.danioRasgunio = daniozombie;
  }

  public void recibirdanio(int danio){
    vida= vida-danio;
  }

  public int ataque(){
    return(danioRasgunio);
  }

  public int getVida(){return(this.vida);}

}