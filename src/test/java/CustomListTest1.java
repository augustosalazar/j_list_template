import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest1 {

    @Test
    public void testNoNodes() {
        CustomList customList = new CustomList();
        assertEquals(0, customList.getNumberOfNodes());
    }

    @Test
    public void testNodeCount() {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(9);
        customList.add(13);
        assertEquals(3, customList.getNumberOfNodes());
    }

}
