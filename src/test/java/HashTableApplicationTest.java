import org.example.HashTableApplications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableApplicationTest {
    @Test
    public void methodTest1_success() {
        Assertions.assertEquals('c', HashTableApplications.method1("abacabad"));
    }

    @Test
    public void methodTest2_no_nonRepeatingCharacter() {
        Assertions.assertEquals('_', HashTableApplications.method1("abaaabab"));
    }
}
