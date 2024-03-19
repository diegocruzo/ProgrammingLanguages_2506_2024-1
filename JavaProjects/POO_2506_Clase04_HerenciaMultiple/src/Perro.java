public class Perro extends Mamifero implements Animal{
    // Constructor
    public Perro(String nombre){
        super(nombre);
    }
    @Override
    public void expresarse(){
        System.out.println("Guau");
    }

    @Override
    public String recorridoEnMetrosPorSegundo() {
        return "¡Corro 2 metros en un segundo!";
    }

    @Override
    public void alimentarse() {
        System.out.println("Soy callejero, me alimento de basura");
    }
}
