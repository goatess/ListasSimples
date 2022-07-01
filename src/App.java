import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayItemsList arrayItemsList = new ArrayItemsList();
        arrayItemsList.stringintoArray();
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
    int offset;
    String word = "";
    String deleteThisWord = "";
    
    public String addSubString(){
        if (fullString == ""){
            fullString = Item;
        }else fullString += ", " + Item;
        return fullString;
    }
    public String divideString(int searchPosition){
        for (int i = searchPosition; fullString.charAt(searchPosition) != ' ' && i < fullString.length(); i++) {
            if (fullString.charAt(i) != ' '){
                word += fullString.charAt(i); 
            } else {
                deleteThisWord = word;
                deleteThisWord += fullString.charAt(i); 
                break;
            } 
        }
        return deleteThisWord;
    }
    public void deleteSubString(String deleteThisString){
        deleteThisString = "informática";
        getSearchPosition(deleteThisString);
        getOffset(deleteThisString);
        String result = fullString.substring(searchPosition, offset + 1); 
        deleteThisString = result;
        fullString = fullString.replaceAll(deleteThisString, "");
    }
    public void deleteSubString(int searchPosition){
        divideString(searchPosition);
        deleteThisString = deleteThisWord;
        fullString = fullString.replaceAll(deleteThisString, "");
        System.out.println(fullString);
    }

    //setters and getters os StringList
    public String getFullString() {
        return fullString;
    }
    public void setFullString(String fullString) {
        this.fullString = fullString;
    }
    public void setItem(String item) {
        Item = item;
    }
    public int getSearchPosition(String searchedItem) {
        isFound = fullString.contains(searchedItem);
        searchPosition = fullString.indexOf(searchedItem); 
        return searchPosition;
    }
    public int getOffset(String searchedItem){
        offset = searchedItem.length();
        offset += fullString.indexOf(searchedItem);
        return offset;
    }
    public void setDeleteThisString(String deleteThisString) {
        this.deleteThisString = deleteThisString;
        deleteSubString(deleteThisString);
    }
      public void setDeleteThisString(int searchPosition) {
        this.searchPosition = searchPosition;
        deleteSubString(searchPosition);
    }
}

// A list of items in an Array
class ArrayItemsList {
    StringList stringList = new StringList();
    String[] arrayList = null;
    String allItems = "";
    String searchedItem = "informática";
    int searchPosition = 0;
    boolean comparation = true;
    int arrayPosition = 0;
    
    public Boolean [] compareStringtoArray(){
        allItems = stringList.fullString;
        stringintoArray();
        arrayToStringNoComma();
        Boolean [] bool = new Boolean[arrayList.length];
        Arrays.fill(bool, Boolean.TRUE);
        if(arrayList.equals(allItems)) {
            comparation = true; 
            System.out.println("true");
        }
        else {
            comparation = false;
            System.out.println("false");
        }
        return bool;   
    } 

    public String [] stringintoArray(){
        if (allItems == ""){
            allItems = stringList.getFullString();
        }else allItems = allItems.replaceAll("[\\.\\,\\(\\)]", "");
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
            }else allItems += ", " + arrayList[i];
        }
        return allItems; 
    }
    public String arrayToStringNoComma(){
        allItems = "";
        for (int i = 0; i < arrayList.length; i++) {
            if (allItems == ""){
                allItems = arrayList[i];
            }else allItems += " " + arrayList[i];
        }
        return allItems; 
    }
        public String arrayListToString(){ 
        allItems = Arrays.toString(arrayList);
        allItems = allItems.replaceAll("[\\.\\\\(\\)]", "");
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
    public String[] eliminateArrayPosition(String searchedItem){
        deleteArrayElement(searchItemPosition(searchedItem));
        arrayToString();
        stringintoArray();
        return arrayList;
    }
    public String[] eliminateArrayPosition(int arrayPosition){
        deleteArrayElement(arrayPosition);
        arrayToString();
        stringintoArray();
        return arrayList;
    }

    // Getters and Setters of ArrayItemsList
    public void setAllItems(String allItems) {
        this.allItems = allItems;
    }
    public String getAllItems() {
        return allItems;
    }
    public String[] getArrayList() {
        return arrayList;
    }
    public void setArrayList(String[] arrayList) {
        this.arrayList = arrayList;
    }

    public boolean getComparation(){
        return comparation;
    }
    public void setEliminateArrayPosition (String searchedItem){
        this.searchedItem = searchedItem;
        eliminateArrayPosition(searchedItem);
    }
    public void setEliminateArrayPosition (int arrayPosition){
        this.arrayPosition = arrayPosition;
        eliminateArrayPosition(arrayPosition);
    }
}