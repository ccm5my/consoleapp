package come.example.test;

import com.example.problems.ReformatPhoneNumber;
import org.junit.Assert;
import org.junit.Test;

public class ReformatPhoneNumberTest {

    @Test
    public void testReformatPhoneNumber() {
        String res = ReformatPhoneNumber.reformatNumber("");
        Assert.assertNotNull(res);
    }
}
