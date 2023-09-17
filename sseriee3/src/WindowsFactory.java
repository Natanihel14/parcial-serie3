public class WindowsFactory implements AbstractFactory {
    @Override
    public Boton createBoton() {
        return new BotonWindows();
    }

    @Override
    public Ventana createVentana() {
        return new VentanaWindows();
    }

    @Override
    public CuadroTexto createCuadroTexto() {
        return new CuadroTextoWindows();
    }

}
