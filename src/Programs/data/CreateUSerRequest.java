package Programs.data;

import Programs.Anotation.NotBlank;

public class CreateUSerRequest {
    @NotBlank
    private String userName;
    @NotBlank
    private String Password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
