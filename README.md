### Configs Made Simple
I hate java configuration files and its a reoccuring issue in my school projects.
This lets you store any java serializables in a file. You can set the contents of your
file in a custom enum and specify a default value if the key you want is not present.

#### How to make your life easier
1. Copy the `src/configMadeSimple` component into your application
2. Just copy paste the example in `MyConfigKeys` and `Main` and you are good

> You should probably reference this repository so others can reuse this or update

```java
    public static void main(String[] args) throws Exception {
        var configManger = new ConfigManager<MyConfigKeys>();
        var config = configManger.create("/my/file/path.ext");

        var oldObj = config.getObject(MyConfigKeys.MY_KEY); // Getting stuff (Might return default value)
        config.setObject(MyConfigKeys.MY_KEY, 15); // Getting stuff
        configManger.save(config, "/my/file/path.ext");
    }
```
