import org.example.LinkedList;
import org.example.ListNode;
import org.example.Recursive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecursiveTest {
    ListNode<Integer> head;
    @BeforeEach
    public void setup() {
        head = LinkedList.createListNode(new int[]{1, 2, 3});
    }

    @Test
    public void searchValue_returnsTrue() {
        Assertions.assertTrue(Recursive.searchValue(head, 2));
    }

    @Test
    public void searchValue_returnsFalse() {
        Assertions.assertFalse(Recursive.searchValue(head, 9));
    }

}
