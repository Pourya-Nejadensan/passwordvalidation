import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationPasswordTest {

   @Test
    public void isPasswordEightCharTest_whenPasswordEightChar_thenReturnTrue(){
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = ValidationPassword.isPasswordEightChar(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void isPasswordEightCharTest_whenPasswordMoreThanEightChar_thenReturnTrue(){
        //GIVEN
        String password = "passwords";

        //WHEN
        boolean actual = ValidationPassword.isPasswordEightChar(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void isPasswordEightCharTest_whenPasswordLowerThanEightChar_thenReturnFalse(){
        //GIVEN
        String password = "passwor";

        //WHEN
        boolean actual = ValidationPassword.isPasswordEightChar(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordEightCharTest_whenPasswordEmpty_thenReturnFalse(){
        //GIVEN
        String password = "";

        //WHEN
        boolean actual = ValidationPassword.isPasswordEightChar(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void hasPasswordDigitTest_whenPasswordHasDigit_thenReturnTrue(){
        //GIVEN
        String password = "password1";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordDigit(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasPasswordDigitTest_whenPasswordHasNoDigit_thenReturnFalse(){
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordDigit(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void hasPasswordDigitTest_whenPasswordStartWithDigit_thenReturnTrue(){
        //GIVEN
        String password = "1password";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordDigit(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasPasswordUpperAndLowerLetterTest_whenPasswordHasUpperAndLowerLetter_thenReturnTrue(){
        //GIVEN
        String password = "PassWord";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordUpperAndLowerLetter(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasPasswordUpperAndLowerLetterTest_whenPasswordHasOnlyUpperLetter_thenReturnFalse(){
        //GIVEN
        String password = "PASSWORD";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordUpperAndLowerLetter(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void hasPasswordUpperAndLowerLetterTest_whenPasswordHasOnlyLowerLetter_thenReturnFalse(){
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordUpperAndLowerLetter(password);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordCommonTest_whenPasswordIsCommon_thenReturnTrue(){
        //GIVEN
        String password = "password";
        String[] commonPasswords = {"Password1", "Aa345678", "12345678", "password", "1234word", "PassWord1234"};

        //WHEN
        boolean actual = ValidationPassword.isPasswordCommon(password, commonPasswords);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void isPasswordCommonTest_whenPasswordIsUnique_thenReturnFalse(){
        //GIVEN
        String password = "passw1ord";
        String[] commonPasswords = {"Password1", "Aa345678", "12345678", "password", "1234word", "PassWord1234"};

        //WHEN
        boolean actual = ValidationPassword.isPasswordCommon(password, commonPasswords);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void isPasswordCommonTest_whenPasswordIsWeak_thenReturnTrue(){
        //GIVEN
        String password = "Password1";
        String[] commonPasswords = {"Password1", "Aa345678", "12345678", "password", "1234word", "PassWord1234"};

        //WHEN
        boolean actual = ValidationPassword.isPasswordCommon(password, commonPasswords);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasPasswordSpecialCharTest_whenPasswordHasSpecialChar_thenReturnTrue(){
        //GIVEN
        String password = "pass$word";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordSpecialChar(password);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void hasPasswordSpecialCharTest_whenPasswordHasNoSpecialChar_thenReturnFalse(){
        //GIVEN
        String password = "password";

        //WHEN
        boolean actual = ValidationPassword.hasPasswordSpecialChar(password);

        //THEN
        assertFalse(actual);
    }
}
