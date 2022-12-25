package adapter;

public class AccountService {

    public Account findAccountByName(String name){
        Account account = new Account();
        account.setName(name);
        account.setPassword(name);
        account.setEmail(name);
        return account;
    }
}
