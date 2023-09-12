package principio;

public class LeightweightAnimal {
    String nombre;
    String habitad;
    String peso;

    public LeightweightAnimal(String nombre, String habitad, String peso) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.peso = peso;
    }
    //metodos
    public static void Caminar(){
        System.out.println("El animal camina");
    }
    public static void Saltar(){
        System.out.println("El animal salta el obstaculo");
    }
    public void Agujero(){
        LeightweightAnimal.Caminar();
        LeightweightAnimal.Saltar();
    }
}
