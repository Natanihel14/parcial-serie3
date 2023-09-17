public class Main {
    public static void main(String[] args) {
        // Ejemplo de ejecución en Windows
        AbstractFactory windowsFactory = new WindowsFactory();
        Juego juegoWindows = new Juego(windowsFactory);
        juegoWindows.iniciar();

        // Ejemplo de ejecución en macOS
        AbstractFactory macFactory = new MacFactory();
        Juego juegoMac = new Juego(macFactory);
        juegoMac.iniciar();

        // Ejemplo de ejecución en Linux
        AbstractFactory linuxFactory = new LinuxFactory();
        Juego juegoLinux = new Juego(linuxFactory);
        juegoLinux.iniciar();
    }
}