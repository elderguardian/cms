package configMadeSimple.contract;

import java.io.Serializable;
import java.util.Properties;

public interface IConfig<T extends Enum<T> & IConfigKeys> {
    Properties getProperties();

    Serializable getObject(T key);

    IConfig<T> setObject(T key, Serializable object);
}
