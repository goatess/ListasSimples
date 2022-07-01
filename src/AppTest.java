import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void checkString(){
        //arrange
        final String expectedString = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";
        StringList stringList = new StringList();
        
        //act
        String actualString = stringList.getFullString();
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkSubstringToString(){
        //arrange
        final String expectedString = "Java es un lenguaje de programación, y una plataforma informática";
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Java es un lenguaje de programación");
        stringList.setItem("y una plataforma informática");
        String actualString = stringList.addSubString();
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkDivideSubstringByPosition(){
        //arrange
        final String expectedString = "Java ";
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Java es un lenguaje de programación");
        String actualString = stringList.divideString(0);
        
        //assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void checkSearchSubString(){
        //arrange
        final int expectedPosition = 53;
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        int actualPosition = stringList.getSearchPosition("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkDeleteSubStringBySearchWord(){
        //arrange
        final int expectedPosition = -1;
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        stringList.setDeleteThisString("informática");
        int actualPosition = stringList.getSearchPosition("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkDeleteSubStringByPosition(){
        //arrange
        final int expectedPosition = -1;
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        stringList.setDeleteThisString(53);
        int actualPosition = stringList.getSearchPosition("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    public void checkStringToArray(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un ");
        arrayItemsList.stringintoArray();
        String[]actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkArraytoString(){
        //arrange
        final String expectedString = "Java, es, un";
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        String[]testArray = {"Java","es","un"};
        arrayItemsList.setArrayList(testArray);
        String testString = arrayItemsList.arrayToString();
        arrayItemsList.setAllItems(testString); 
        String actualString = arrayItemsList.getAllItems();

        //assert
        assertEquals(expectedString, actualString);
    }
    
    @Test
    public void checkArrayToArray(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un ");
        arrayItemsList.stringintoArray();
        String[]actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals( expectedArray, actualArray);
    }

    @Test
    public void compareStringtoArray(){
        //arrange
        final boolean expectedBoolean = true;
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.compareStringtoArray();
        boolean actualBoolean = arrayItemsList.getComparation();
        
        //assert
        assertEquals(expectedBoolean, actualBoolean);
    }
    
    @Test
    public void checkSearchArrayItem(){
        //arrange
        final int expectedPosition = 9;
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
        arrayItemsList.stringintoArray();
        int actualPosition = arrayItemsList.searchItemPosition("informática");

        //assert
        assertEquals(expectedPosition, actualPosition);
    }
    @Test
    public void checkDeleteArrayItem(){
        //arrange
        final String[] expectedArray = {"","es","un","lenguaje"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje");
        arrayItemsList.stringintoArray();
        arrayItemsList.deleteArrayElement(0);
        String[] actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void checkEliminateArrayPositionBySearchWord(){
        //arrange
        final String[] expectedArray = {"es","un","lenguaje"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje");
        arrayItemsList.stringintoArray();
        arrayItemsList.setEliminateArrayPosition("Java");
        String[] actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkEliminateArrayPositionByIndex(){
        //arrange
        final String[] expectedArray = {"es","un","lenguaje"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje");
        arrayItemsList.stringintoArray();
        arrayItemsList.setEliminateArrayPosition(0);
        String[] actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }
}
