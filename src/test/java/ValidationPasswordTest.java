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
}
