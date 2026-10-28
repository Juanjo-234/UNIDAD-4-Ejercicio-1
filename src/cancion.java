public class cancion extends Reproducible {


    public String artista;

    public cancion( String nombre,String artista) {
        super(nombre);
        this.artista = artista;
    }


    @Override
    public String reproducir() {
            System.out.println("===CANCION : " + nombre + " /Reproduciendo===");
            System.out.println("Artista: " + this.artista);
        return "";
    }
}
