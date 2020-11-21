package com.joser.model;

import javax.naming.OperationNotSupportedException;

public interface Teller {

    void withdrawFrom(Account account, Integer dollars) throws OperationNotSupportedException;

}
