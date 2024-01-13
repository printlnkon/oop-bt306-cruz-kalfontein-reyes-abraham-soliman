public class RegisteredUser extends User {
    private String email;

    // default constructor
    public RegisteredUser () {
    }

    public RegisteredUser (String name) {
        super(name);
    }

    // constructor overloading
    public RegisteredUser (String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    // getter method for email
    public String getEmail () {
        return email;
    }

    @Override
    public boolean authenticate (String usernameOrEmail, String password) {
        return (getUsername().equals(usernameOrEmail) || getEmail().equals(usernameOrEmail))
                && getPassword().equals(password);
    }

}
