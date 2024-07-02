public class ValidationPassword {

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
