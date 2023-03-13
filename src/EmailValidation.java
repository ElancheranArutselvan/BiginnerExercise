import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String email1 = "cr7ghj89@dport.com";
        String email2 = ".cr7ghj89@dport.com";

        System.out.println("email is "+ validateEmailId(email1));

        System.out.println("email is "+ validateEmailId(email2));
    }

    private static String validateEmailId(String email) {
        if(email == null || email.isEmpty()){
            return "Invalid";
        }
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return "valid";
        } else{
            return "invalid email";
        }
    }
}
