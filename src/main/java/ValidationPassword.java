import java.security.SecureRandom;

public class ValidationPassword {

    public static String generateRandomSecurePassword(){
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:',.<>?/";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(8);

        do{
            sb.delete(0, sb.length());
            for (int i = 0; i < 8; i++) {
                sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }
        }while(!isPasswordSecure(sb.toString()));

        return sb.toString();
    }

    private static boolean isPasswordSecure(String password) {
        return     isPasswordEightChar(password)
                && hasPasswordDigit(password)
                && hasPasswordUpperAndLowerLetter(password)
                && hasPasswordSpecialChar(password);
    }

    public static boolean isPasswordEightChar(String password) {
        return password.length() >= 8;
    }

    public static boolean hasPasswordDigit(String password) {
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean hasPasswordUpperAndLowerLetter(String password) {
        boolean hasUpper = hasUpperCase(password);
        boolean hasLower = hasLowerCase(password);
        return hasUpper && hasLower;
    }

    private static boolean hasLowerCase(String password) {
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                return true;
            }
        }
        return false;
    }

    private static boolean hasUpperCase(String password) {
        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean isPasswordCommon(String password, String[] commonPasswords) {
        for(String commonPassword : commonPasswords){
            if (password.equals(commonPassword)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPasswordSpecialChar(String password) {
        for(char c : password.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return true;
            }
        }
        return false;
    }
}
