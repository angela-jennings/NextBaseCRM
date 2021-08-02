package com.nextBase.step_definitions;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
