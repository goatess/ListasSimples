import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void checkSetAllItemsinList_String(){
        //arrange
        final String expectedString = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";
        ListInString stringList = new ListInString();
        
        //act
        String actualString = stringList.getList_string();
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkAddItemToList_String(){
        //arrange
        final String expectedString = "Java es un lenguaje de programación, y una plataforma informática";
        ListInString stringList = new ListInString();

        //act
        stringList.setList_string("Java es un lenguaje de programación");
        stringList.setItem("y una plataforma informática");
        String actualString = stringList.addItem_String();
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkTakeItemFromList_ByPosition_String(){
        //arrange
        final String expectedString = "Java ";
        ListInString stringList = new ListInString();

        //act
        stringList.setList_string("Java es un lenguaje de programación");
        String actualString = stringList.divideString(0);
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkSearchItemInList_String(){
        //arrange
        final int expectedPosition = 53;
        ListInString stringList = new ListInString();

        //act
        stringList.setList_string("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        int actualPosition = stringList.getPosition_string("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkDeleteItem_BySearchWord_String(){
        //arrange
        final int expectedPosition = -1;
        ListInString stringList = new ListInString();

        //act
        stringList.setList_string("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        stringList.setDeleteSubString("informática");
        int actualPosition = stringList.getPosition_string("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkDeleteItem_ByPosition_String(){
        //arrange
        final int expectedPosition = -1;
        ListInString stringList = new ListInString();

        //act
        stringList.setList_string("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        stringList.setDeleteSubString(53);
        int actualPosition = stringList.getPosition_string("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkStringToArrayConversion(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.setAllItemsString("Java es un ");
        arrayItemsList.stringToArray();
        String[]actualArray = arrayItemsList.getAllItemsArray();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkArraytoStringConversion(){
        //arrange
        final String expectedString = "Java es un";
        ListInArray arrayItemsList = new ListInArray();

        //act
        String[]testArray = {"Java","es","un"};
        arrayItemsList.setAllItemsArray(testArray);
        String testString = arrayItemsList.arrayToString();
        arrayItemsList.setAllItemsString(testString); 
        String actualString = arrayItemsList.getAllItemsString();

        //assert
        assertEquals(expectedString, actualString);
    }
    
    @Test
    public void checkArrayEqualsToAnotherArray(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.setAllItemsString("Java es un ");
        arrayItemsList.stringToArray();
        String[]actualArray = arrayItemsList.getAllItemsArray();

        //assert
        assertArrayEquals( expectedArray, actualArray);
    }

    @Test
    public void checkIfStringEqualsToArray(){
        //arrange
        final boolean expectedBoolean = true;
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.compareStringtoArray();
        boolean actualBoolean = arrayItemsList.getComparation();
        
        //assert
        assertEquals(expectedBoolean, actualBoolean);
    }
    
    @Test
    public void checkSearchArrayItem_ByPosition(){
        //arrange
        final int expectedPosition = 9;
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.setAllItemsString("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        arrayItemsList.stringToArray();
        int actualPosition = arrayItemsList.searchItemPosition("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }
    
    @Test
    public void checkEliminateArrayPositionBySearchWord(){
        //arrange
        final String[] expectedArray = {"es","un","lenguaje"};
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.setAllItemsString("Java es un lenguaje");
        arrayItemsList.stringToArray();
        arrayItemsList.setEliminateArrayPosition("Java");
        String[] actualArray = arrayItemsList.getAllItemsArray();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkEliminateArrayPositionByIndex(){
        //arrange
        final String[] expectedArray = {"es","un","lenguaje"};
        ListInArray arrayItemsList = new ListInArray();

        //act
        arrayItemsList.setAllItemsString("Java es un lenguaje");
        arrayItemsList.stringToArray();
        arrayItemsList.setEliminateArrayPosition(0);
        String[] actualArray = arrayItemsList.getAllItemsArray();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

}