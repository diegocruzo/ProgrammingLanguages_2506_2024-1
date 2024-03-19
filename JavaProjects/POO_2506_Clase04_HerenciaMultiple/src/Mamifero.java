public class Mamifero {
    private String nombre;
    // Constructor
    public Mamifero(String nombre){
        this.nombre = nombre;
    }
    // Método
    public void Amamantar(){
        System.out.println("Tomo leche proveniente de mi madre.");
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
