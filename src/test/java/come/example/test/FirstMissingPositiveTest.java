package come.example.test;


import com.example.problems.FirstMissingPositive;
import org.junit.Assert;
import org.junit.Test;

public class FirstMissingPositiveTest {
    @Test
    public void testFirstMissingPositive() {
        int res = FirstMissingPositive.firstMissingPositive(new int[] {
                1,2,0
        });
        Assert.assertEquals(3, res);
    }

    @Test
    public void testFirstMissingPositive2() {
        int res = FirstMissingPositive.firstMissingPositive(new int[] {
                3,4,-1,1
        });
        Assert.assertEquals(2, res);
    }

    @Test
    public void testFirstMissingPositive3() {
        int res = FirstMissingPositive.firstMissingPositive(new int[] {
                7,8,9,11,12
        });
        Assert.assertEquals(1, res);
    }
}
