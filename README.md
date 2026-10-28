Resolucion del ejercicio N°1  de la unidad 4 de programación 2.
El código implementa un sistema en Java basado en programación orientada a objetos para demostrar los conceptos de abstracción y polimorfismo a través de un reproductor multimedia:

Interfaz (Reproducible): Define un contrato estándar con el método abstracto reproducir().

Clases Concretas (Cancion, Video, Podcast): Implementan dicha interfaz y definen su propia lógica y mensajes específicos para la reproducción.

Clase Coordinadora (Reproductor): Posee un método iniciarReproduccion(Reproducible item) que acepta cualquier objeto que cumpla con el contrato, ejecutando el método correspondiente de forma dinámica gracias al polimorfismo.

Clase Principal (Main): Crea una lista heterogénea que almacena distintos tipos de contenido (Cancion, Video, Podcast), la recorre en un bucle y delega la ejecución al reproductor.
<img width="691" height="351" alt="Captura de pantalla 2026-10-28 100022" src="https://github.com/user-attachments/assets/e5fff4f0-e9ef-4b3e-872f-639916be4a1d" />
