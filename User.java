public class User implements ValidateUserPass {
    String name;
    private String username;
    private String password;

    // default constructor
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    // constructor overloading
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }

}
