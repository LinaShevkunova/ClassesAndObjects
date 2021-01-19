package task5_1;

public class User {
    private String login;
    private String password;
    private int tries = 3;
    private boolean blockedUser = false;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getblockedUser() {
        return blockedUser;
    }

    public void blockedUser() {
        if (tries == 0) {
            blockedUser = true;
        }
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void decreaseTries() {
        tries--;
    }

    public void newTries() {
        tries = 3;
    }
}
