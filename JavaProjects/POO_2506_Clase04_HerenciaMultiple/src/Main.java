public class Main {
    public static void main(String[] args) {
        Gato mia = new Gato("Mia");
        System.out.println("Nombre: " + mia.getNombre());
        mia.expresarse();
        mia.alimentarse();
        mia.Amamantar();
        System.out.println(mia.recorridoEnMetrosPorSegundo());

        Perro firulais = new Perro("Firulais");
        System.out.println("\nNombre: " + firulais.getNombre());
        firulais.expresarse();
        firulais.alimentarse();
        firulais.Amamantar();
        System.out.println(firulais.recorridoEnMetrosPorSegundo());
    }
}
