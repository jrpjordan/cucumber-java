package com.joser.hooks;

import com.joser.AtmServer;
import com.joser.helper.KnowsTheDomain;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ServerHooks {

    public static final int PORT = 8887;

    private AtmServer server;
    private KnowsTheDomain helper;

    public ServerHooks() {
        this.helper = KnowsTheDomain.getInstance();
    }

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, helper.getCashSlot(), helper.getMyAccount());
        server.start();
        System.out.println("*************** Starting scenario ******************");
    }

    @After
    public void afterScenario(Scenario scenario) throws Exception {
        server.stop();
        System.out.println("************** Finishing scenario ********************" + scenario.getStatus());
    }
}
