package come.example.test;


import com.example.problems.FirstMissingPositive;
import org.junit.Assert;
import org.junit.Test;

public class FirstMissingPositiveTest {
    @Test
    public void testFirstMissingPositive() {
        int res = FirstMissingPositive.firstMissingPositive(new int[2]);
        Assert.assertEquals(0, res);
    }
}
