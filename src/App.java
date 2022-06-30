import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        StringList stringList = new StringList();
        ArrayItemsList arrayItemsList = new ArrayItemsList();
        System.out.println(stringList.generateRandomNumbersList());
    }
}

// A list of items in a String
class StringList{
    String fullString = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";
    int numberOfPositions = 7;
    String Item = "";
    boolean isFound = false;
    String deleteThisString = "";
    String searchedItem = "informática";
    int searchPosition = 0;
    
    public String generateRandomNumbersList(){
        int min = 0;
        int max = 300;
        fullString = "";
        for (int i = 0; i < numberOfPositions; i++) {  
            int randomNumber = (int)Math.floor(Math.random()*(max - min + 1) + min);
            Item = String.valueOf(randomNumber); 
            addString();
        }return fullString; 
    }
    public String addString(){
        if (fullString == ""){
            fullString = Item;
        }else fullString += " " + Item;
        return fullString;
    }
    public void deleteSubString(){
        fullString = fullString.replaceAll(deleteThisString, "");
    }

    //setters and getters os StringList
    public String getFullString() {
        return fullString;
    }
    public void setFullString(String allItems) {
        this.fullString = allItems;
    }
    public void setItem(String item) {
        Item = item;
    }
    public int getSearchPosition(String searchedItem) {
        isFound = fullString.contains(searchedItem);
        searchPosition = fullString.indexOf(searchedItem);
        return searchPosition;
    }
    public void setDeleteThisString(String deleteThisString) {
        this.deleteThisString = deleteThisString;
        deleteSubString();
    }
}

// A list of items in an Array
class ArrayItemsList {
    String[] arrayList = null;
    StringList stringList = new StringList();
    String allItems = stringList.getFullString();
    //String arrayToString = "";
    String searchedItem = "informática";
    int searchPosition = 0;

    public String [] stringintoArray(){
        allItems = allItems.replaceAll("[\\.\\,\\(\\)]", "");
        arrayList = allItems.split(" "); 
        return arrayList;
    }
    public void SortArray(){
        Arrays.sort(arrayList);
    }
    public String arrayToString(){
        allItems = "";
        for (int i = 0; i < arrayList.length; i++) {
            if (allItems == ""){
                allItems = arrayList[i];
            }else allItems += " " + arrayList[i];
        }allItems = allItems.replaceAll("[\\.\\,\\(\\)]", "");
        return allItems; 
    }
    public String arrayListToString(){
        allItems = Arrays.toString(arrayList);
        allItems = allItems.replaceAll("[\\.\\,\\(\\)]", "");
        return allItems;
    }
    public int searchItemPosition(String searchedItem){
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i].equals(searchedItem)) {
                return i;
            }
        }
        System.out.println(searchPosition);
        return searchPosition;
    } 
    public String[] deleteArrayElement(int index){
        for (int i = 0; i < arrayList.length; i++) {
            if (i == index) {
                arrayList[index]= "";
            }
        }
        return arrayList;
    }
    public String[] eliminateListPosition(String searchedItem){
        deleteArrayElement(searchItemPosition(searchedItem));
        arrayToString();
        stringintoArray();
        return arrayList;
    }
    public String[] eliminateListPosition(int i){
        deleteArrayElement(i);
        arrayToString();
        stringintoArray();
        return arrayList;
    }

    // Getters and Setters of ArrayItemsList
    public void setAllItems(String allItems) {
        this.allItems = allItems;
        setArrayList(stringintoArray());
    }
    public String[] getArrayList() {
        return arrayList;
    }
    public void setArrayList(String[] arrayList) {
        this.arrayList = arrayList;
    }
}