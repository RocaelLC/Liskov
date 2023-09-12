public  class Animal {
    //Atributos
    String nombre;
    String Habitad;
    String Peso;

    public Animal(String nombre, String habitad, String peso) {
        this.nombre = nombre;
        this.Habitad = habitad;
        this.Peso = peso;
    }

    public static void caminar(){
        System.out.println("El animal camina");
    }
    public static void saltar(){
        System.out.println("El animal salta la zanja");
    }

    public static void SaltarAgujero(){
        Animal.caminar();
        Animal.saltar();
        Animal.caminar();
    }
}
