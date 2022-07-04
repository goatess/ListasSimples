public class App {
    public static void main(String[] args) throws Exception {
    }
}

class SimpleList {
    String list = "";

    public String addItem(String item) {
        if (list == "") {
            list = item;
        } else
            list += " " + item;
        return list;
    }

    public int searchItem_ByValueANDList(String item, String list) {
        int position = list.indexOf(item);
        return position;
    }
    public int searchItem_ByValue(String item) {
        int position = list.indexOf(item);
        return position;
    }

    public String searchItem_ByPosition(int position) {
        String item = "";
        for (int i = position; i < list.length(); i++) {
            char nextChar = list.charAt(i);
            if (nextChar != ' ') {
                item += nextChar;
            } else {
                String itemWithSpace = item; 
                itemWithSpace += nextChar;
                break;
            }
        }
        return item;
    }

    void deleteItem(int position) {
        String item = searchItem_ByPosition(position);
        int itemLength = position + item.length() + 1;
        StringBuilder newList = new StringBuilder();
        newList.append(this.list);
        if (newList.charAt(position - 1) == ' ') {
            newList.delete(position, itemLength);
            this.list = newList.substring(0);
        } else
            System.out.println("position " + position + " is not a valid position");
    }

    public String getList() {
        return list;
    }

    public void setList_string(String list) {
        this.list = list;
    }
}

class ArrayList {
    String[] arrList = new String[] {};
    SimpleList sList = new SimpleList();

    public void convertToArray(String list) {
        list = list.replaceAll("[\\.\\,\\(\\)]", "");
        arrList = list.split(" ");
        this.arrList = arrList;
    }

    public String convertToString() {
        String list = "";
        for (int i = 0; i < arrList.length; i++) {
            list = sList.addItem(arrList[i]);
        }
        return list;
    }

    public Boolean compareToArray(String list, String[]arrList) {
        boolean equal = false;
        int position = 0;
        sList.setList_string(list);
        for (int i = 0; i < arrList.length; i++) {
            String item = sList.searchItem_ByPosition(position); // item pos
            if (arrList[i].equals(item)) {
                equal = true;
            } else {
                equal = false;
                break;
            }
            position += item.length() + 1;                 // next pos
        }
        return equal;
    }

    public String[] getArrList() {
        return arrList;
    }

    public void setArrList(String[] arrList) {
        this.arrList = arrList;
    }
}