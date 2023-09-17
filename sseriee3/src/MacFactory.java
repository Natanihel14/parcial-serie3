public class MacFactory implements AbstractFactory {
    @Override
    public Boton createBoton() {
        return new BotonMac();
    }

    @Override
    public Ventana createVentana() {
        return new VentanaMac();
    }

    @Override
    public CuadroTexto createCuadroTexto() {
        return new CuadroTextoMac();
    }

}
