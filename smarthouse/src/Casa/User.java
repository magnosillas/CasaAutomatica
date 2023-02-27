package Casa;

import java.util.List;

public class User {
    private String email;
    private String username;
    private String password;
    private String name;

    private List<House> houses[];

    public User(String email, String username, String password, String name) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
    }
}
