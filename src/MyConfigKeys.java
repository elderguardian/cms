import configMadeSimple.contract.IConfigKeys;

import java.io.Serializable;

public enum MyConfigKeys implements IConfigKeys {
    MY_KEY(6);
    private final Serializable defaultValue;

    MyConfigKeys(Serializable defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Serializable getDefaultValue() {
        return defaultValue;
    }
}
