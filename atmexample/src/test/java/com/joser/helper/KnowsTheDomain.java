package com.joser.helper;

import com.joser.model.Account;
import com.joser.model.CashSlot;
import com.joser.model.Teller;
import com.joser.ui.AtmUserInterface;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class KnowsTheDomain {

    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;
    private EventFiringWebDriver webDriver;

    private static KnowsTheDomain instance;

    private KnowsTheDomain() {
    }

    public static KnowsTheDomain getInstance() {
        if (instance == null ) {
            instance = new KnowsTheDomain();
        }
        return instance;
    }
    public Account getMyAccount() {
        if(myAccount == null) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null) {
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }
        return webDriver;
    }

    public Teller getTeller() {
        if (teller == null) {
            teller = new AtmUserInterface();
        }
        return teller;
    }

}
