package configMadeSimple.impl;

import configMadeSimple.contract.IConfig;
import configMadeSimple.contract.IConfigKeys;
import configMadeSimple.contract.IConfigManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager<T extends Enum<T> & IConfigKeys> implements IConfigManager<T> {

    @Override
    public IConfig<T> create(String path) throws Exception {
        try (FileInputStream input = new FileInputStream(path)) {
            var props = new Properties();
            props.load(input);
            return new Config<T>(props);
        } catch (IOException e) {
            return new Config<T>(new Properties());
        }
    }

    @Override
    public void save(IConfig<T> config, String path) throws Exception {
        try (FileOutputStream output = new FileOutputStream(path)) {
            config.getProperties().store(output, null);
        } catch (IOException e) {
            throw new Exception("Error reading from that path.");
        }
    }

}
