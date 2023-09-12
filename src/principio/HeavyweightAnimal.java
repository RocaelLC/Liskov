package principio;

public class HeavyweightAnimal {
    String nombre;
    String habitad;
    String peso;

    public HeavyweightAnimal(String nombre, String habitad, String peso) {
        this.nombre = nombre;
        this.habitad = habitad;
        this.peso = peso;
    }

        //metodos
        public static void Caminar(){
            System.out.println("El elefante camina");
    }
    public static void Rodear(){
        System.out.println("El animal rodea el aguajero");
    }
    public void Agujero(){
        HeavyweightAnimal.Caminar();
    }
}
