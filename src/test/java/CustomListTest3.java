import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest3 {


    @Test
    public void testgetIndexOfNodeWithValueNotFound() {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(9);
        customList.add(13);
        assertEquals(-1, customList.getIndexOfNodeWithValue(7));
    }

}
