import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest7 {

    @Test
    public void testgetIndexOfNodeWithValueDuplicateElement() {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(9);
        customList.add(9);
        customList.add(13);
        assertEquals(2, customList.getNumberOfNodesWithValue(9));
    }
}
