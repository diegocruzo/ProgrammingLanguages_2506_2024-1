// Abstracción (capacidad de crear una clase con propiedades y métodos)
public class Automovil {

    // Encapsulamiento (con los parámetros private y static se modificarán las
    // propiedades con métodos propios de la clase)
    private static String marca, modelo, color;
    private static short cilindraje;

    // Constructor
    // Polimorfismo (hacer que un mismo método ejecute tareas diferentes)
    public Automovil(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String modelo, String color){
        this.marca = "Ferrari";
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(short cilindraje){
        this.cilindraje = cilindraje;
    }

    // Getter and Setter
    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Automovil.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Automovil.modelo = modelo;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Automovil.color = color;
    }

    public static double getCilindraje() {
        return cilindraje;
    }

    public static void setCilindraje(short cilindraje) {
        Automovil.cilindraje = cilindraje;
    }
}
