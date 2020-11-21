package com.joser.ui;

import com.joser.hooks.ServerHooks;
import com.joser.model.Account;
import com.joser.model.Teller;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import javax.naming.OperationNotSupportedException;

public class AtmUserInterface implements Teller {

    private EventFiringWebDriver webDriver;

    public AtmUserInterface() {
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    @Override
    public void withdrawFrom(Account account, Integer dollars) throws OperationNotSupportedException {
        try {
            webDriver.get("http://localhost:" + ServerHooks.PORT);
            webDriver.findElement(By.id("Amount"))
                    .sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("Withdraw")).click();
        }
        finally {
            webDriver.close();
        }
    }
}
