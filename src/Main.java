import configMadeSimple.impl.ConfigManager;

public class Main {

    public static void main(String[] args) throws Exception {
        var configManger = new ConfigManager<MyConfigKeys>();
        var config = configManger.create("/home/luca/config.txt");

        var oldObj = config.getObject(MyConfigKeys.MY_KEY);

        var newValue = 15;
        System.out.println("Current value: " + oldObj);
        System.out.println("New value: " + newValue);

        config.setObject(MyConfigKeys.MY_KEY, newValue);
        configManger.save(config, "/home/luca/config.txt");
    }
}
