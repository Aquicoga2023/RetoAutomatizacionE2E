package org.example.utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;

public class EnvConf {

    private EnvironmentVariables environmentVariables;

    public void setUpall(Actor actor){
        actor.remember("baseURL",getBaseURL());
        actor.remember("username",EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("username"));
        actor.remember("password",EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("password"));

    }

    public String getBaseURL(){
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("baseURL");
    }

}
