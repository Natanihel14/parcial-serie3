public class Juego {
    private AbstractFactory factory;
    private Boton boton;
    private Ventana ventana;
    private CuadroTexto cuadroTexto;

    public Juego(AbstractFactory factory) {
        this.factory = factory;
        this.boton = factory.createBoton();
        this.ventana = factory.createVentana();
        this.cuadroTexto = factory.createCuadroTexto();
    }

    public void iniciar() {
        // Lógica del juego
        boton.renderizar();
        ventana.renderizar();
        cuadroTexto.renderizar();
    }
}