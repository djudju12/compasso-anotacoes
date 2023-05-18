import pojo.CashAccount;
import pojo.MarginAccount;
import repository.TradeAccountRepository;
import service.CashAccountService;
import service.MarginAccountService;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class Main {

    static Path[] paths = new Path[] {Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt")};

    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);
    public static void main(String[] args) {
        try {
            loadTradeAccounts(paths[0]);
            applyTransactions(paths[1]);
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void loadTradeAccounts(Path p) throws IOException, IllegalArgumentException {
        try (Stream<String> lines = lines(p)) {
            lines
                .map(line -> line.split(" "))
                .forEach(line -> {
                    String accountType = line[0];
                    String accountId = line[1];
                    BigDecimal amount = new BigDecimal(line[2]);

                    switch (accountType) {
                        case "MARGIN" -> {
                            marginAccountService.createTradeAccount(new MarginAccount(accountId, amount));
                        }
                        case "CASH" -> {
                            cashAccountService.createTradeAccount(new CashAccount(accountId, amount));
                        }
                        default -> {
                            throw new IllegalArgumentException("Invalid account type " + accountType);
                        }
                    }
                });
        }

    }
    public static void applyTransactions(Path p) throws IOException, IllegalArgumentException {
        try (Stream<String> lines = lines(p)) {
            lines
                .map(line -> line.split(" "))
                .forEach(line -> {
                    String accountType = line[0];
                    String accountId = line[1];
                    String transactionType = line[2];
                    BigDecimal amount = new BigDecimal(line[3]);

                    switch (accountType){
                        case "MARGIN" -> {
                            if (transactionType.equals("DEPOSIT")) {
                                marginAccountService.deposit(accountId, amount);
                            } else if (transactionType.equals("WITHDRAWAL")) {
                                marginAccountService.withdraw(accountId, amount);
                            }
                        }
                        case "CASH" -> {
                            if (transactionType.equals("DEPOSIT")) {
                                cashAccountService.deposit(accountId, amount);
                            } else if (transactionType.equals("WITHDRAWAL")) {
                                cashAccountService.withdraw(accountId, amount);
                            }
                        }
                        default -> {
                            throw new IllegalArgumentException("Invalid account type " + accountType);
                        }
                    }

                });
        }
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }

}