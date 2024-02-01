package configMadeSimple.contract;

import java.util.Properties;

public interface IConfig<T extends Enum<T> & IConfigKeys> {
    Properties getProperties();

    Object getObject(T key);

    IConfig<T> setObject(T key, Object object);
}
