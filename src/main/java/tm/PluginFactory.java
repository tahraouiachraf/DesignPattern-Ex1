package tm;

public class PluginFactory {
    public static Plugin creerPlugin(String type) {
        if (type.equals("Plugin1")) {
            return new PluginConcret1();
        } else if (type.equals("Plugin2")) {
            return new PluginConcret2();
        }
        throw new IllegalArgumentException("Type de plugin inconnu");
    }
}