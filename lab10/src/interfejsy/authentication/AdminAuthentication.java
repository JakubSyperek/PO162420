package interfejsy.authentication;

public class AdminAuthentication implements Authentication {
    private String username = "admin";
    private String password = "admin123";
    private boolean loggedIn = false;

    @Override
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            loggedIn = true;
            System.out.println("Administrator zalogowany pomyślnie.");
            return true;
        }
        System.out.println("Błędna nazwa użytkownika lub hasło.");
        return false;
    }

    @Override
    public void logout() {
        if (loggedIn) {
            loggedIn = false;
            System.out.println("Administrator wylogowany.");
        } else {
            System.out.println("Administrator nie jest zalogowany.");
        }
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Hasło administratora zostało zresetowane.");
            return true;
        }
        System.out.println("Nie udało się zresetować hasła administratora. Niepoprawne dane.");
        return false;
    }
}
