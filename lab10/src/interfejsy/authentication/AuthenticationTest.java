package interfejsy.authentication;

public class AuthenticationTest {
    public static void main(String[] args) {
        System.out.println("=== Testowanie UserAuthentication ===");
        Authentication userAuth = new UserAuthentication();
        userAuth.login("user", "user123");
        userAuth.resetPassword("user", "user123", "newUserPass");
        userAuth.logout();

        userAuth.login("user", "newUserPass");
        userAuth.logout();

        System.out.println("\n=== Testowanie AdminAuthentication ===");
        Authentication adminAuth = new AdminAuthentication();
        adminAuth.login("admin", "admin123");
        adminAuth.resetPassword("admin", "admin123", "newAdminPass");
        adminAuth.logout();


        adminAuth.login("admin", "newAdminPass");
        adminAuth.logout();
    }
}
