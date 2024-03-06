package configMadeSimple.impl;

import configMadeSimple.contract.IConfig;
import configMadeSimple.contract.IConfigKeys;

import java.io.Serializable;
import java.util.Properties;

public class Config<T extends Enum<T> & IConfigKeys> implements IConfig<T> {
    private final Properties properties;

    public Config() {
        this.properties = new Properties();
    }

    public Config(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public Serializable getObject(T key) {
        Serializable value = properties.getProperty(key.toString());
        return (value != null) ? value : key.getDefaultValue();
    }

    @Override
    public IConfig<T> setObject(T key, Serializable object) {
        properties.setProperty(key.toString(), object.toString());
        return this;
    }
}
