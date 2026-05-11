

public class UserSecurity {
    private String password;

    public void setPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Success password was updated");
    }

    public String getPassword() {
        return password;
    }
}

class Encap {
    public static void main(String[] args) {
        UserSecurity user = new UserSecurity();
        user.setPassword("newPass123");
    }
}
