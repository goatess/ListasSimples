import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void setAllItemsinList_String() {
        // arrange
        final String expectedString = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        String actualString = simpleList.getList_string();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void addItemToList_String() {
        // arrange
        final String expectedString = "Java es un lenguaje de programación, y una plataforma informática";
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string("Java es un lenguaje de programación");
        simpleList.setItem("y una plataforma informática");
        String actualString = simpleList.addItem();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void insertItemGetPosition() {
        // arrange
        final int expectedPosition = 53;
        SimpleList stringList = new SimpleList();

        // act
        stringList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        int actualPosition = stringList.getPosition_string("informática");

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void searchItem_ByPosition() {
        // arrange
        final String expectedString = "informática";
        SimpleList stringList = new SimpleList();

        // act
        stringList.setList_string("Java es un lenguaje de programación y una plataforma informática");
        String actualString = stringList.searchItem(53);

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void deleteItem_ByPosition_chekPosition() {
        // arrange
        final String expectedValue = "que";
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        simpleList.deleteItem_ByPosition(53);
        String actualValue = simpleList.searchItem(53);
        // assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void deleteItem_ByPosition() {
        // arrange
        final String expectedValue = "";
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        simpleList.deleteItem_ByPosition(64);
        String actualValue = simpleList.searchItem(64);
       
        // assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void stringToArrayConversion() {
        // arrange
        final String[] expectedArray = { "Java", "es", "un" };
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullString("Java es un ");
        arrayItemsList.convertToArray();
        String[] actualArray = arrayItemsList.getAllItemsArray();

        // assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void arraytoStringConversion() {
        // arrange
        final String expectedString = "Java es un";
        ArrayList arrayItemsList = new ArrayList();

        // act
        String[] testArray = { "Java", "es", "un" };
        arrayItemsList.setFullArray(testArray);
        arrayItemsList.convertToString();
        String actualString = arrayItemsList.getFullString();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void stringEqualsToArray() {
        // arrange
        final boolean expectedBoolean = true;
        ArrayList arrayItemsList = new ArrayList();
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        arrayItemsList.compareStringtoArray();
        boolean actualBoolean = arrayItemsList.getComparation();

        // assert
        assertEquals(expectedBoolean, actualBoolean);
    }
}