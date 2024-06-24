import org.junit.*;

public class DemoTest {
    @Test
    public void test(){
        Demo gre = new Demo();
        Assert.assertEquals("Boss", gre.says());
    }
}
