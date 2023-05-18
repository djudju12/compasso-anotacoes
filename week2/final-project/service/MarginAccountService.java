package service;


import pojo.MarginAccount;
import repository.TradeAccountRepository;

import java.math.BigDecimal;

public class MarginAccountService implements TradeAccountService{

    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository r) { this.repository = r;}

    @Override
    public void deposit(String id, BigDecimal amount) throws IllegalArgumentException{
        MarginAccount t = (MarginAccount) this.repository.retrieveAccount(id);
        t.setMargin(t.getMargin().add(amount));
        this.repository.updateTradeAccount(t);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        MarginAccount t = (MarginAccount) this.repository.retrieveAccount(id);
        t.setMargin(t.getMargin().subtract(amount));
        this.repository.updateTradeAccount(t);
    }

    public void createTradeAccount(MarginAccount c) {
        this.repository.createTradeAccount(c);
    }

    public void updateTradeAccount(MarginAccount c) {
        this.repository.updateTradeAccount(c);
    }

    public void deleteTradeAccount(String id) {
        this.repository.deleteTradeAccount(id);
    }
    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.repository.retrieveAccount(id);
    }


}