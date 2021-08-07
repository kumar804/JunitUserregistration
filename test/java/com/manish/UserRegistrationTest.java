package com.manish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    UserRegistrationMain userRegistrationMain = new UserRegistrationMain();

    /**
     * Purpose : Validate First Name with first letter starting with capital and has minimum 3 characters in it.
     * Return true if the string value passes else return false
     */
    @Test
    void givenfirstnameshouldbeTrue() {
        boolean result = userRegistrationMain.usernameValidation("Jon");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenfirstnameshouldbeFalse(){
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.usernameValidation("Jon@");
        Assertions.assertEquals(result,false);
    }

    @Test
    void givenlastnameshouldbeTrue() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.usernameValidation("Doe");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenlastnameshouldbeFalse() {
        UserRegistrationMain userRegistrationMain = new  UserRegistrationMain();
        boolean result = userRegistrationMain.usernameValidation("Doe@");
        Assertions.assertEquals(result,false);
    }

    @Test
    void givenmobilenumbershouldbeTrue() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.mobileNumValidation("91 8969283357");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenmobilenumbershouldbeFalse() {
        UserRegistrationMain userRegistrationMain  = new UserRegistrationMain();
        boolean result = userRegistrationMain.mobileNumValidation("918969283357");
        Assertions.assertEquals(result,false);

    }

    @Test
    void givenpasswordrulemustbeTrue() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("manishkm");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenpasswordrulemustbeFalse() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("manishk");
        Assertions.assertEquals(result,false);
    }

    @Test
    void givenpassword_shouldoneuppercaseletterTrue() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("Manishkm");
        Assertions.assertEquals(result,true);

    }

    @Test
    void givenpassword_shouldoneuppercaseletterFalse() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("manishkm");
        Assertions.assertEquals(result,false);
    }
}

