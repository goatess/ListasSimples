import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
String testList = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";

    @Test
    public void setAllItemsinList_String() {
        // arrange
        final String expectedString = testList;
        SimpleList sList = new SimpleList();

        // act
        sList.setList_string(testList);
        String actualString = sList.getList();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void addItemToList_String() {
        // arrange
        final String expectedString = "Java es un lenguaje de programación y una plataforma informática";
        SimpleList sList = new SimpleList();

        // act
        sList.setList_string("Java es un lenguaje de programación");
        String actualString = sList.addItem("y una plataforma informática");

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void insertItemANDListGetPosition() {
        // arrange
        final int expectedPosition = 53;
        SimpleList sList = new SimpleList();

        // act
        int actualPosition = sList.searchItem_ByValueANDList("informática", testList);

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

        @Test
    public void insertItemGetPosition() {
        // arrange
        final int expectedPosition = 53;
        SimpleList sList = new SimpleList();

        // act
        sList.setList_string(testList);
        int actualPosition = sList.searchItem_ByValue("informática");

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void searchItem_ByPosition() {
        // arrange
        final String expectedString = "informática";
        SimpleList sList = new SimpleList();

        // act
        sList.setList_string(testList);
        String actualString = sList.searchItem_ByPosition(53);

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void deleteItem_ByPosition_chekPosition() {
        // arrange
        final String expectedValue = "que";
        SimpleList sList = new SimpleList();
        
        // act
        sList.setList_string(testList);
        sList.deleteItem(53);
        String actualValue = sList.searchItem_ByPosition(53);
        
        // assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void deleteItem_ByPosition_checkList() {
        // arrange
        final String expectedValue =  "Java es un lenguaje de programación y una plataforma que fue comercializada por primera vez en 1995 por Sun Microsystems";
        SimpleList sList = new SimpleList();
        
        // act
        sList.setList_string(testList);
        sList.deleteItem(53);
        String actualValue = sList.getList();

        // assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void converts_string_to_array() {
        // arrange
        final String[] expectedArray = { "Java", "es", "un" };
        ArrayList arrList = new ArrayList();
        String testString = "Java es un ";

        // act
        arrList.convertToArray(testString);
        String[] actualArray = arrList.getArrList();

        // assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void converts_array_to_string() {
        // arrange
        final String expectedString = "Java es un";
        String[] testArray = { "Java", "es", "un" };
        ArrayList arrList = new ArrayList();

        // act
        arrList.setArrList(testArray);
        String actualString = arrList.convertToString();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void compares_string_to_array() {
        // arrange
        final boolean expectedEquality = true;
        ArrayList arrList = new ArrayList();

        // act
        arrList.convertToArray(testList);
        String[] testArray = arrList.getArrList();
        boolean actualEquality = arrList.compareToArray(testList, testArray);

        // assert
        assertEquals(expectedEquality, actualEquality);
    }
}