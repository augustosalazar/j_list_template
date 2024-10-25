import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest4 {


    @Test
    public void testGetIndexOfNodeWithValeEmptyList() {
        CustomList customList = new CustomList();
        assertEquals(-1, customList.getIndexOfNodeWithVale(7));
    }

}
