import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    }
}

// A list of items in a String
class SimpleList {
    String item = "";
    String itemWithSpace = "";
    String list = "";
    int position_string = 0;
    int itemLength;

    public String addItem() {
        if (list == "") {
            list = item;
        } else
            list += ", " + item;
        return list;
    }

    public int searchItem(String value) {
        int position_String = getPosition_string(value);
        itemLength = getItemLength(value);
        item = list.substring(position_String, itemLength + 1);
        return position_string;
    }

    public String searchItem(int position) {
        item = "";
        for (int i = position; i < list.length(); i++) {
            char nextChar = list.charAt(i);
            if (nextChar != ' ') {
                item += nextChar;
            } else {
                itemWithSpace = item;
                itemWithSpace += nextChar;
                break;
            }
        }
        this.position_string = position;
        return item;
    }

    void deleteItem_ByPosition(int position) {
        StringBuilder list = new StringBuilder();
        String item = searchItem(position);
        int offset = item.length() + position + 1;
        list.append(this.list);
        if (list.charAt(position - 1) == ' ') {
            list.delete(position, offset);
            this.list = list.substring(0);

        } else
            System.out.println("position " + position + " is not a valid position");
    }

    // setters and getters os StringList
    public String getList_string() {
        return list;
    }

    public void setList_string(String fullString) {
        this.list = fullString;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPosition_string(String searchedItem) {
        position_string = list.indexOf(searchedItem);
        return position_string;
    }

    public int getItemLength(String searchedItem) {
        itemLength = searchedItem.length();
        itemLength += list.indexOf(searchedItem);
        return itemLength;
    }

    public void setDeleteSubString(int position) {
        this.position_string = position;
        deleteItem_ByPosition(position);
    }
}

// A list of items in an Array
class ArrayList {
    SimpleList simpleList = new SimpleList();
    String[] listArray = null;
    String list = "";
    String itemValue = "";
    int itemPosition_string = 0;
    boolean stringEqualsArray = true;
    int itemPosition_array = 0;

    public String[] convertToArray() {
        if (list == "") {
            list = simpleList.getList_string();
        } else
            list = list.replaceAll("[\\.\\,\\(\\)]", "");
        listArray = list.split(" ");
        return listArray;
    }

    public String convertToString() {
        for (int i = 0; i < listArray.length; i++) {
            if (list == "") {
                list = listArray[i];
            } else
                list += " " + listArray[i];
        }
        return list;
    }

    public Boolean compareStringtoArray() {
        convertToArray();
        int position = 0;
        String item = "";
        String arrayItem = "";
        for (int i = 0; i < listArray.length; i++) {
            item = simpleList.searchItem(position);
            position += item.length() + 1;
            arrayItem = listArray[i];
            if (arrayItem.equals(item)) {
                stringEqualsArray = true;
            } else {
                stringEqualsArray = false;
                break;
            }
        }
        return stringEqualsArray;
    }

    // Getters and Setters of ArrayItemsList
    public String[] getAllItemsArray() {
        return listArray;
    }

    public void setFullArray(String[] arrayList) {
        this.listArray = arrayList;
    }

    public String getFullString() {
        return list;
    }

    public void setFullString(String allItems) {
        this.list = allItems;
    }

    public boolean getComparation() {
        return stringEqualsArray;
    }
}