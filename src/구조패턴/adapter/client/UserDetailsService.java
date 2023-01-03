package 구조패턴.adapter.client;

public interface UserDetailsService {
    public UserDetails loadUser(String name);
}
