package healthsystem;

class Healthsystem{
  public static void main(String[] args){
    Jugador J1 = new Jugador("Miguel",15);
    Botiquin B1 = new Botiquin(15,false);
    Zombie Z1 = new Zombie("Brain",400);

    System.out.println("Sistema de Salud (Healthsystem) /n");

    System.out.println("Jugador "+J1.getNombre()+" tiene "+J1.getVida()+" de vida total");

    J1.recibirDanio(Z1.ataque());
    System.out.println("Zombie ataca a Jugador (Jugador resulta con "+J1.getVida()+ " de vida) ");

    Z1.recibirdanio(15);
    System.out.println("Jugador ataca a Zombie (Zombie resulta con "+Z1.getVida()+ " de vida)");

    J1.recibirDanio(40);
    System.out.println("Zombie ataca a jugador realizando un golpe crítica (jugador resulta con "+J1.getVida()+ "de vida)");
  }
}