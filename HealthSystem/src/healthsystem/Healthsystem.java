package healthsystem;

class Healthsystem{
  public static void main(String args){
    Jugador J1 = new Jugador("Miguel",15,100);
    botiquin B1 = new botiquin(15,false);
    zombie Z1 = new zombie("Brain",50,100);

    System.out.println("Sistema de Salud (Healthsystem) /n");

    System.out.println("Jugador "+J1.getnom()+" tiene "+J1.getvida()+" de vida total");

    J1.recibirDanio();
    System.out.println("Zombie ataca a Jugador (Jugador resulta con "+J1.getvida()+ " de vida) ");

    Z1.recibirdanio(15);
    System.out.println("Jugador ataca a Zombie (Zombie resulta con "+Z1.getvida()+ " de vida)");

    J1.recibirDanio(40);
    System.out.println("Zombie ataca a jugador realizando un golpe crítica (jugador resulta con "+J1.getvida()+ "de vida)");
  }