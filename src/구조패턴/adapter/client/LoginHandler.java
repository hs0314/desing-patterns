package 구조패턴.adapter.client;

// client쪽 소스 코드
public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    // client쪽 코드
    public String login(String name, String password){
        UserDetails userDetails = userDetailsService.loadUser(name);

        if(userDetails.getPassword().equals(password)){
            return userDetails.getName();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
