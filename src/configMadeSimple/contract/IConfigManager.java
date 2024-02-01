package configMadeSimple.contract;

public interface IConfigManager<T extends Enum<T> & IConfigKeys>  {
    IConfig<T> create(String path) throws Exception;
    void save(IConfig<T> config, String path) throws Exception;
}