public class podcast extends Reproducible{
    public String titulo;
    public String numeroEpisodio;

    public podcast( String nombre, String titulo,String numeroEpisodio) {
        super(nombre);
        this.titulo = titulo;
        this.numeroEpisodio = numeroEpisodio;

    }

    @Override
    public String reproducir() {
            System.out.println("===Podcast: " + nombre + "/Reproduciendo===");
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Resolucion: " + this.numeroEpisodio);
        return "";
    }
}
