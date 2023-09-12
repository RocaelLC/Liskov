package principio;


public class Main {
    public static void main(String[] args) {
        Kanguro ronnie = new Kanguro("Ronnie", "la pancho", "200 kg");
        Elefante Dumbo = new Elefante("Dumbo", "Mundo nuevo", "2 toneladas");

        ronnie.Agujero();
        ronnie.Golpear();
        Dumbo.Agujero();
        Dumbo.LanzarAgua();
    }
}
