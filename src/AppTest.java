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
    public void deleteItem_ByValue() {
        // arrange
        final int expectedPosition = -1;
        SimpleList stringList = new SimpleList();

        // act
        stringList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        stringList.setDeleteSubString("informática");
        int actualPosition = stringList.getPosition_string("informática");

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void deleteItem_ByPosition_chekPosition() {
        // arrange
        final int expectedPosition = -1;
        SimpleList simpleList = new SimpleList();

        // act
        simpleList.setList_string(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        simpleList.setDeleteSubString(53);
        int actualPosition = simpleList.getPosition_string("informática");

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void compareSimpleListToArray() {
        // arrange
        final boolean expectedComparation = true;
        ArrayList arrayList = new ArrayList();

        // act
        boolean actualComparation = arrayList.getComparation();

        // assert
        assertEquals(expectedComparation, actualComparation);
    }

    @Test
    public void stringToArrayConversion() {
        // arrange
        final String[] expectedArray = { "Java", "es", "un" };
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullString("Java es un ");
        arrayItemsList.stringToArray();
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
        arrayItemsList.convertArrayToString();
        String actualString = arrayItemsList.getFullString();

        // assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void arrayEqualsToAnotherArray() {
        // arrange
        final String[] expectedArray = { "Java", "es", "un" };
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullString("Java es un ");
        arrayItemsList.stringToArray();
        String[] actualArray = arrayItemsList.getAllItemsArray();

        // assert
        assertArrayEquals(expectedArray, actualArray);
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

    @Test
    public void searchArrayItemPosition() {
        // arrange
        final int expectedPosition = 9;
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullString(
                "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        arrayItemsList.stringToArray();
        int actualPosition = arrayItemsList.searchItemPosition("informática");

        // assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void eliminateArrayPositionByValue() {
        // arrange
        String[] testArray = { "Java", "es", "un", "lenguaje" };
        final String[] expectedArray = { "es", "un", "lenguaje" };
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullArray(testArray);
        arrayItemsList.eliminatePosition("Java");
        String[] actualArray = arrayItemsList.getAllItemsArray();

        // assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void eliminateArrayPositionByIndex() {
        // arrange
        String[] testArray = { "Java", "es", "un", "lenguaje" };
        final String[] expectedArray = { "es", "un", "lenguaje" };
        ArrayList arrayItemsList = new ArrayList();

        // act
        arrayItemsList.setFullArray(testArray);
        arrayItemsList.eliminatePosition(0);
        String[] actualArray = arrayItemsList.getAllItemsArray();

        // assert
        assertArrayEquals(expectedArray, actualArray);
    }
}