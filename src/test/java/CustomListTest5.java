import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest5 {


    @Test
    public void testgetIndexOfNodeWithValueFirstElement() {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(9);
        customList.add(13);
        assertEquals(0, customList.getIndexOfNodeWithValue(5));
    }

}
