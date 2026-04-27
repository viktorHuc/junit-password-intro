import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
        // Arrange
        String password = "";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        // Assert
        assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthLongPassword(){
        // Arrange
        String password = "sdafasdsaffaeffdfa";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("long", actual);
    }

    @Test
    void testPasswordLongerThan40charsIsVeryLong(){
        // Arrange
        String password = "sdafasdsaffaeffdfateheHfdgGRGgFFGerFDGHeGFBAHhfnstgsghfgga";
        // Act
        String actual = PasswordUtils.describePasswordLength(password);
        //Assert
        assertEquals("very long", actual);
    }
}
