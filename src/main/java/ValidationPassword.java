public class ValidationPassword {
    public static boolean isPasswordEightChar(String password) {
        return password.length() >= 8;
    }
    public static boolean hasPasswordDigit(String password) {
        return true;
    }
    public static boolean hasPasswordUpperAndLowerLetter(String password) {
        return true;
    }
    public static boolean isPasswordCommon(String password) {
        return true;
    }
}
