package adapter;

import adapter.client.UserDetails;
import adapter.client.UserDetailsService;

/**
 * 어댑터 클래스
 */
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService; // adaptee

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String name) {
        Account accountByName = accountService.findAccountByName(name);
        return new AccountUserDetails(accountByName);
    }
}
