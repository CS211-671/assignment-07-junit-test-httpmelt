package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Espanol1", "Ingles1");
        userList.addUser("Espanol2", "Ingles2");
        userList.addUser("Espanol3", "Ingles3");

        // TODO: find one of them
        User user = userList.findUserByUsername("Espanol2");

        // TODO: assert that UserList found User
         String expected = "Espanol2";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Espanol1", "Ingles1");
        userList.addUser("Espanol2", "Ingles2");
        userList.addUser("Espanol3", "Ingles3");

        // TODO: change password of one user
        boolean result = userList.changePassword("Espanol1", "Ingles1", "computadora");
        assertTrue(result);

        // TODO: assert that user can change password
        User user = userList.findUserByUsername("Espanol1");
        assertNotNull(user);
        assertTrue(user.validatePassword("computadora"));
        assertFalse(user.validatePassword("Ingles1"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Espanol1", "Ingles1");
        userList.addUser("Espanol2", "Ingles2");
        userList.addUser("Espanol3", "Ingles3");

        // TODO: call login() with correct username and password
        User user = userList.login("Espanol1", "Ingles1");

        // TODO: assert that User object is found
        String expected = "Espanol1";
        String actual = user.getUsername();
        assertNotNull(user);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Espanol1", "Ingles1");
        userList.addUser("Espanol2", "Ingles2");
        userList.addUser("Espanol3", "Ingles3");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Espanol1", "Inglesss");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}