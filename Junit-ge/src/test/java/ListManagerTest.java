import org.example.ListManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    ListManager listManager=new ListManager();
    @Test
    void testAdd(){
        List<Integer>list=new ArrayList<>();
        listManager.addElement(list,5);
        assertTrue(list.contains(5));
        assertEquals(1,list.size());
    }
    @Test
    void testRemoveElement(){
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
        assertEquals(1,list.size());
    }
    @Test
    void testGetSize(){
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        assertEquals(2,listManager.getSize(list));
    }
}
