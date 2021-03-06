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
    void givenpasswordruleshould_retuenTrue() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("Manishkm@1");
        Assertions.assertEquals(result,true);
    }

    @Test
    void givenpasswordshould_returnFalse() {
        UserRegistrationMain userRegistrationMain = new UserRegistrationMain();
        boolean result = userRegistrationMain.passwordValidation("manish@km1");
        Assertions.assertEquals(result,false);
    }
}

