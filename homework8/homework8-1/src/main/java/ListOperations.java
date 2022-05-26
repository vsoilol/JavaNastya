import Resources.ExceptionMessages;

import java.util.ArrayList;

public class ListOperations {
    public boolean contains(int[] list, int item) {
        for (int listItem : list) {
            if (listItem == item) {
                return true;
            }
        }

        return false;
    }

    public int getIndexOfItem(int[] list, int item) throws IllegalArgumentException {
        if (!contains(list, item)) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_IS_NO_SUCH_ITEM);
        }
        for (int i = 0; i < list.length; i++) {
            if (item == list[i]) {
                return i;
            }
        }
        return 0;
    }

    public int[] addItem(int[] list, int item) throws IllegalArgumentException {
        if (contains(list, item)) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_IS_SUCH_ITEM);
        }
        int[] newList = new int[list.length + 1];

        System.arraycopy(list, 0, newList, 0, list.length);

        newList[newList.length - 1] = item;

        return newList;
    }

    public int[] removeItem(int[] list, int item) throws IllegalArgumentException {
        if (!contains(list, item)) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_IS_NO_SUCH_ITEM);
        }
        int[] newList = new int[list.length - 1];
        int itemIndex = newList.length + 1;

        for (int i = 0; i < newList.length + 1; i++) {
            if (list[i] == item) {
                itemIndex = i;
                continue;
            }
            if (i <= itemIndex) {
                newList[i] = list[i];
            }
            if (i > itemIndex) {
                newList[i - 1] = list[i];
            }
        }

        return newList;
    }

    public int lastIndexOf(int[] list, int item) throws IllegalArgumentException {
        if (!contains(list, item)) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_IS_NO_SUCH_ITEM);
        }

        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                index = i;
            }
        }

        return index;
    }
}
