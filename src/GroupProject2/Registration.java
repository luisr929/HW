package GroupProject2;

public class Registration {

    /*
    9. Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
     */

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if (!password.contains(userName)&&!password.isEmpty()&&password.length()>6) {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
    class RegistrationTester {
        public static void main(String[] args) {


            Registration obj = new Registration("luisr@google.com", "lu", "hello");
            System.out.println(obj.getEmail());
            obj.setEmail("luisr@yahoo.com");
            System.out.println(obj.getEmail());
            System.out.println(obj.getUserName());
            obj.setUserName("luuwavy");
            System.out.println(obj.getUserName());
            System.out.println(obj.getPassword());
            obj.setPassword("getmoney");
            System.out.println(obj.getPassword());




        }
    }


