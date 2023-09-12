package principio;

public class Elefante extends HeavyweightAnimal{
    public Elefante(String nombre, String habitad, String peso) {
        super(nombre, habitad, peso);
    }
    public void Golpear(){
        System.out.println("El animal golpea");

    }
    public void LanzarAgua(){
        System.out.println("El Elefante lanza agua");
    }

}
