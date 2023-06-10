package Programs.data;

public record LoginRequest(String username,String password) {
    public LoginRequest{
        System.out.println("Make Login Req Constructor Username: "+username+" Password: "+password);
    }
    public LoginRequest (String username){

        this(username,"");
    }
}
