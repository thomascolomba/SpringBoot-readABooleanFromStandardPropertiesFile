package readABooleanFromStandardPropertiesFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private Boolean myBoolean;
	public Boolean getMyBoolean() {
		return myBoolean;
	}
	public void setMyBoolean(Boolean myBoolean) {
		this.myBoolean = myBoolean;
	}
}