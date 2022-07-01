import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ListInArray arrayItemsList = new ListInArray();
        arrayItemsList.stringToArray();
        arrayItemsList.compareStringtoArray();
    }
}

// A list of items in a String
class ListInString{
    String item = "";
    String itemWithSpace = "";
    String list_string = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems";
    int position_string = 0;
    int offset;
    
    public String addItem_String(){
        if (list_string == ""){
            list_string = item;
        }else list_string += ", " + item;
        return list_string;
    }
    public String divideString(int position){
        for (int i = position; list_string.charAt(position) != ' ' && i < list_string.length(); i++) {
            char nextChar = list_string.charAt(i);
            if (nextChar != ' '){
                item += nextChar; 
            } else {
                itemWithSpace = (item += nextChar); 
                break;
            } 
        }
        return item;
    }
    public void deleteItem_ByValue_String(String value){
        int position_String = getPosition_string(value);
        int offset = getOffset(value);
        String result = list_string.substring(position_String, offset + 1); 
        value = result;
        list_string = list_string.replaceAll(value, "");
    }
    public String deletItem_ByPosition_String(int position){
        divideString(position);
        item = itemWithSpace;
        list_string = list_string.replaceAll(item, "");
        return list_string;
    }

    //setters and getters os StringList
    public String getList_string() {
        return list_string;
    }
    public void setList_string(String fullString) {
        this.list_string = fullString;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPosition_string(String searchedItem) {
        position_string = list_string.indexOf(searchedItem); 
        return position_string;
    }
    public int getOffset(String searchedItem){
        offset = searchedItem.length();
        offset += list_string.indexOf(searchedItem);
        return offset;
    }
    public void setDeleteSubString(String subString) {
        this.item = subString;
        deleteItem_ByValue_String(subString);
    }
      public void setDeleteSubString(int searchPosition) {
        this.position_string = searchPosition;
        deletItem_ByPosition_String(searchPosition);
    }
}

// A list of items in an Array
class ListInArray {
    ListInString listInString = new ListInString();
    String[] list_array = null;
    String list_string = listInString.getList_string();
    String itemValue = "informática";
    int itemPosition_string = 0;
    boolean isEqual = true;
    int itemPosition_array = 0;
    
    public String [] stringToArray(){
        if (list_string == ""){
            list_string = listInString.getList_string();
        }else list_string = list_string.replaceAll("[\\.\\,\\(\\)]", "");
        list_array = list_string.split(" "); 
        return list_array;
    }
    public void SortArray(){
        Arrays.sort(list_array);
    }
    public String arrayToString(){
        list_string = "";
        for (int i = 0; i < list_array.length; i++) {
            if (list_string == ""){
                list_string = list_array[i];
            }else list_string += " " + list_array[i];
        }
        return list_string; 
    }
    public String arrayToString_Format(){ 
    list_string = list_string.replaceAll("[\\.\\\\(\\)]", "");
    list_string = Arrays.toString(list_array);
    return list_string;
}
    public int searchItemPosition(String searchedItem){
        for (int i = 0; i < list_array.length; i++) {
            if (list_array[i].equals(searchedItem)) {
                return i;
            }
        }
        System.out.println(itemPosition_string);
        return itemPosition_string;
    } 
    public String searchItemValue(int position){
        return itemValue;
    }
    public String[] eliminateArrayPosition(String item){
        int pos = searchItemPosition(item);
        list_array[pos]= "";
        arrayToString();
        stringToArray();
        return list_array;
    }
    public String[] eliminateArrayPosition(int position){
        list_array[position]= "";
        arrayToString();
        stringToArray();
        return list_array;
    }

    public Boolean compareStringtoArray(){
        list_string = listInString.list_string;
        stringToArray();
        arrayToString();
        int position = 0;
        String item = "";
        for (int i = 0; i < list_array.length; i++) {
           
            position = listInString.position_string + listInString.item.length();
            item = listInString.divideString(position);
            listInString.setItem(item);
           
            if(list_array[i].equals(listInString.item)) {
                isEqual = true; 
                System.out.println("true " + listInString.item);
            } 
            else {
                isEqual = false;
                System.out.println("false " + listInString.item);
            } 
        }
        return isEqual;   
    }   

    // Getters and Setters of ArrayItemsList
    public String[] getAllItemsArray() {
        return list_array;
    }
    public void setAllItemsArray(String[] arrayList) {
        this.list_array = arrayList;
    }
    public String getAllItemsString() {
        return list_string;
    }
    public void setAllItemsString(String allItems) {
        this.list_string = allItems;
    }
    public void setEliminateArrayPosition (String searchedItem){
        this.itemValue = searchedItem;
        eliminateArrayPosition(searchedItem);
    }
    public void setEliminateArrayPosition (int arrayPosition){
        this.itemPosition_array = arrayPosition;
        eliminateArrayPosition(arrayPosition);
    }
    public boolean getComparation(){
        return isEqual;
    }
}