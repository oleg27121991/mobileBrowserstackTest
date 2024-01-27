package by.veremei.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:browserstack_android.properties")
public interface BrowserstackConfig extends Config {
    @Key("browserstack.user")
    String browserstackUser();
    @Key("browserstack.key")
    String browserstackKey();
    @Key("app")
    String app();
    @Key("device")
    String device();
    @Key("os_version")
    String osVersion();
    @Key("project")
    String project();
    @Key("build")
    String build();
    @Key("name")
    String name();
    @Key("baseUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String baseUrl();
}
