import org.example.StacksAndQueues;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class StacksAndQueuesTest {

    @Test
    public void isValid_returnsTrue() {
        assertTrue(StacksAndQueues.isValid("{}()[]")
                        && StacksAndQueues.isValid("{[]}")
                        && StacksAndQueues.isValid("()")
                );
    }

    @Test
    public void isValid_returnsFalse() {
        assertTrue(!StacksAndQueues.isValid("(]")
                && !StacksAndQueues.isValid("(]"));
    }
}
