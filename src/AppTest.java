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
        final String expectedString = "Vamos a añadir esta cadena.";
        StringList stringList = new StringList();

        //act
        stringList.setFullString("Vamos a añadir");
        stringList.setItem("esta cadena.");
        String actualString = stringList.addString();
        
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
    public void checkDeleteSubString(){
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
    public void checkStringToArray(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};// lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems"};
        ArrayItemsList arrayList = new ArrayItemsList();

        //act
        arrayList.setAllItems("Java es un ");
        String[]actualArray = arrayList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkArraytoString(){
        //arrange
        final String expectedString = "[Java es un]";// lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un ");
        arrayItemsList.stringintoArray();
        //Arrays.toString(arrayItemsList.arrayList);
        String actualString = arrayItemsList.arrayListToString(); 

        //assert
        assertEquals(expectedString, actualString);
    }
    
    @Test
    public void checkArrayToArray(){
        //arrange
        final String [] expectedArray = {"Java", "es", "un"};// lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un ");
        String[]actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }
    
    @Test
    public void checkSearchArrayItem(){
        //arrange
        final int expectedPosition = 9;
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems");
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
        arrayItemsList.deleteArrayElement(0);
        String[] actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void checkEliminateArrayPosition(){
        //arrange
        final String[] expectedArray = {"es","un","lenguaje"};
        ArrayItemsList arrayItemsList = new ArrayItemsList();

        //act
        arrayItemsList.setAllItems("Java es un lenguaje");
        //arrayItemsList.setArrayList();
        arrayItemsList.deleteArrayElement(0);
        arrayItemsList.arrayToString();
        arrayItemsList.stringintoArray();
        String[] actualArray = arrayItemsList.getArrayList();

        //assert
        assertArrayEquals(expectedArray, actualArray);
    }
    
}
