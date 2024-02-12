// Abstracción: Capacidad de crear una clase o tipo de dato nuevo
public class Automovil {
    // Propiedades
    private static String marca, modelo, color; // Se hace uso del encapsulamiento
    private static int caballosMotor;

    // Métodos
    // Crear el constructor de la clase
    public Automovil(String marcaDeOtroLado, String modelo, String color){
        this.marca = marcaDeOtroLado;
        this.modelo = modelo;
        this.color = color;
    }
    // Polimorfismo: El mismo método realiza acciones diferentes
    public Automovil(String modelo, String color){
        this.marca = "Ferrari";
        this.modelo = modelo;
        this.color = color;
    }


}
