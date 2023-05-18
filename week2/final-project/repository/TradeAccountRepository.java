package repository;

import pojo.TradeAccount;
import java.util.HashMap;
import java.util.Map;

public class TradeAccountRepository {

    private Map<String, TradeAccount> datastore = new HashMap<>();

    public void createTradeAccount(TradeAccount tradeAccount) {
        this.datastore.put(tradeAccount.getId(), tradeAccount.clone());
    }

    public TradeAccount retrieveAccount(String id) {
        return datastore.get(id).clone();
    }
    public void updateTradeAccount(TradeAccount tradeAccount) throws IllegalArgumentException {
        if (datastore.containsKey(tradeAccount.getId())){
            datastore.put(tradeAccount.getId(), tradeAccount.clone());
        } else {
            throw new IllegalArgumentException("Invalid account");
        }
    }

    public void deleteTradeAccount(String id) throws IllegalArgumentException {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Invalid ID");
        this.datastore.remove(id);
    }

}
