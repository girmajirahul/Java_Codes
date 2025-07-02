class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class EmailId {
    private String username;
    private String password;


    public EmailId() {}


    public EmailId(String username, String password) throws InvalidUsernameException, InvalidPasswordException {
        setUsername(username);
        setPassword(password);
    }


    public void setUsername(String username) throws InvalidUsernameException {
        if (username.length() < 5) {
            throw new InvalidUsernameException("Username must be at least 5 characters long");
        }
        this.username = username;
    }


    public void setPassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }
        this.password = password;
    }
}


class Main {
    public static void main(String[] args) {
        try {

            String username = args[0];
            String password = args[1];

            EmailId email = new EmailId(username, password);
            System.out.println("Email ID created successfully!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide username and password as command line arguments.");
        } 
        catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
