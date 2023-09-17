public class LinuxFactory implements AbstractFactory {
    @Override
    public Boton createBoton() {
        return new BotonLinux();
    }

    @Override
    public Ventana createVentana() {
        return new VentanaLinux();
    }

    @Override
    public CuadroTexto createCuadroTexto() {
        return new CuadroTextoLinux();
    }

}