public class video extends Reproducible{

    public String titulo;
    public String resolucion;

    public video( String nombre, String titulo,String resolucion) {
        super(nombre);
        this.titulo = titulo;
        this.resolucion = resolucion;

    }

    @Override
    public String reproducir() {
            System.out.println("===Video: " + nombre + "/Reproduciendo===");
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Resolucion: " + this.resolucion);
        return "";
    }

}
