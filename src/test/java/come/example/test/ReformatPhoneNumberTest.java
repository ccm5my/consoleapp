package come.example.test;

import com.example.problems.ReformatPhoneNumber;
import org.junit.Assert;
import org.junit.Test;

public class ReformatPhoneNumberTest {

    @Test
    public void testReformatPhoneNumber() {
        String res = ReformatPhoneNumber.reformatNumber("1-23-45 6");
        Assert.assertEquals("123-456", res);
    }

    @Test
    public void testReformatPhoneNumber2() {
        String res = ReformatPhoneNumber.reformatNumber("123 4-567");
        Assert.assertEquals("123-45-67", res);
    }

    @Test
    public void testReformatPhoneNumber3() {
        String res = ReformatPhoneNumber.reformatNumber("123 4-5678");
        Assert.assertEquals("123-456-78", res);
    }
}
