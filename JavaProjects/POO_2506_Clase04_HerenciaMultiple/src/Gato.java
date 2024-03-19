public class Gato extends Mamifero implements Animal {
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public void expresarse() {
        System.out.println("Miau");
    }

    @Override
    public String recorridoEnMetrosPorSegundo() {
        return "¡Corro 3 metros en un segundo!";
    }

    @Override
    public void alimentarse() {
        System.out.println("Vivo en una casa, me alimento de concentrado");
    }
}
