package adapter.client;

public interface UserDetailsService {
    public UserDetails loadUser(String name);
}
