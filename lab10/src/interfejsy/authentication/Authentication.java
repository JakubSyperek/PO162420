package interfejsy.authentication;

public interface Authentication {
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldPassword, String newPassword);
}

//Utwórz interfejs Authentication z trzema metodami abstrakcyjnymi: login(String
//username, String password) zwracającą boolean, logout() zwracającą void oraz
//resetPassword(String username, String oldPassword, String newPassword)
//zwracającą boolean. Stwórz dwie klasy UserAuthentication i AdminAuthentication,
//które implementują ten interfejs. W klasie AuthenticationTest przetestuj implementacje
//metod dla obiektów obu klas.