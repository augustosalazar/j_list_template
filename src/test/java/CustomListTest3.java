import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.uninorte.CustomList;

public class CustomListTest3 {


    @Test
    public void testGetIndexOfNodeWithValeNotFound() {
        CustomList customList = new CustomList();
        customList.add(5);
        customList.add(9);
        customList.add(13);
        assertEquals(-1, customList.getIndexOfNodeWithVale(7));
    }

}
