public class Main {
    public static void main(String[] args) throws Exception {
        Application app;
        UIComponentFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsUIComponentFactory();
        } else if (osName.contains("mac")) {
            factory = new MacOSUIComponentFactory();
        } else {
            throw new Exception("Sistema operacional não suportado");
        }

        app = new Application(factory);
        app.render();
    }
}

