package interfejsy.authentication;

public class UserAuthentication implements Authentication {
    private String username = "user";
    private String password = "user123";
    private boolean loggedIn = false;

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            loggedIn = true;
            System.out.println("Użytkownik zalogowany pomyślnie.");
            return true;
        }
        System.out.println("Błędna nazwa użytkownika lub hasło.");
        return false;
    }

    @Override
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("Użytkownik wylogowany.");
        } else {
            System.out.println("Użytkownik nie jest zalogowany.");
        }
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Hasło zostało zresetowane.");
            return true;
        }
        System.out.println("Nie udało się zresetować hasła. Niepoprawne dane.");
        return false;
    }
}
