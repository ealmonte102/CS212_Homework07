/**
 * Homework #7 Created by Evan Almonte on 12/6/2015.
 */
public class Homework07 {
    public static void main(String [] args) {
        LinkedList myList = new LinkedList();
        int lengthOfList = 20;
        for(int i = 0; i < lengthOfList; ++i) {
            if(i != 9) {
                myList.append(i);
            }
        }
        myList.printB();
    }
}