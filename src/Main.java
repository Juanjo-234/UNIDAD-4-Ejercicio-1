//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Reproducible> listaReproduccion = new ArrayList<>();

    listaReproduccion.add(new cancion("Bohemian Rhapsody", "Queen"));
    listaReproduccion.add(new video("Aprende Programación Orientada a Objetos", "Capitulo 1", "1080p"));
    listaReproduccion.add(new podcast("Café Tech", "15","2"));
    listaReproduccion.add(new cancion("Blinding Lights", "The Weeknd"));

    Reproductor reproductor = new Reproductor();

    System.out.println("=== INICIO DE LA FILA DE REPRODUCCIÓN ===");
    for(Reproducible item : listaReproduccion){
        reproductor.iniciarReproduccion(item);
    }
    System.out.println("=== FIN DE LA REPRODUCCIÓN ===");

}
