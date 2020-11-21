package com.joser.servlet;

import com.joser.model.Account;
import com.joser.model.AutomatedTeller;
import com.joser.model.CashSlot;
import com.joser.model.Teller;

import javax.naming.OperationNotSupportedException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WithdrawalServlet extends HttpServlet {

    private CashSlot cashSlot;
    private Account account;

    public WithdrawalServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Teller teller = new AutomatedTeller(cashSlot);
        int amount = Integer.parseInt(request.getParameter("amount"));
        String message;
        try {
            teller.withdrawFrom(account, amount);
            message = "please, take your $" + amount;
        } catch (OperationNotSupportedException e) {
           message = "Not enough cash stranger...";
        }

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html>" +
                    "<head><title>Nice Bank ATM</title></head>" +
                    "<body>" + message + "</body>" +
                "</html>"
        );
    }
}
