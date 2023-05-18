package service;


import pojo.CashAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

import java.math.BigDecimal;

public class CashAccountService implements TradeAccountService{

/**
    Task 3
*    In the CashAccountService class, implement the deposit and withdraw methods:
*
*    The deposit method should add the given amount to the cashBalance field of the specified CashAccount object.
*    The withdraw method should subtract the given amount from the cashBalance field of the specified CashAccount object.
*            Also, implement the following methods:
*
*    createTradeAccount
*            retrieveTradeAccount
*    updateTradeAccount
*            deleteTradeAccount
*    These methods should interact with the TradeAccountRepository object to manage CashAccount objects.
**/
    private TradeAccountRepository repository;

    public CashAccountService(TradeAccountRepository r) { this.repository = r;}

    @Override
    public void deposit(String id, BigDecimal amount) throws IllegalArgumentException{
        CashAccount t = (CashAccount) this.repository.retrieveAccount(id);
        t.setCashBalance(t.getCashBalance().add(amount));
        this.repository.updateTradeAccount(t);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount t = (CashAccount) this.repository.retrieveAccount(id);
        t.setCashBalance(t.getCashBalance().subtract(amount));
        this.repository.updateTradeAccount(t);
    }

    public void createTradeAccount(CashAccount c) {
        this.repository.createTradeAccount(c);
    }

    public void updateTradeAccount(CashAccount c) {
        this.repository.updateTradeAccount(c);
    }

    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }
   public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.repository.retrieveAccount(id);
    }
}
