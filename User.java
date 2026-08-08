public class User {

    private String username;
    private String password;

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Display User Details
    public void displayUser() {
        System.out.println("Username : " + username);
    }
}