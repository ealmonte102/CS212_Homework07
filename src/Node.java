/**
 * Homework #7 Created by Evan Almonte on 12/6/2015.
 */
import java.io.*;

public class Node {
	
	private int data;
	private Node next;
	
	public Node(int d){
		data = d;
	}
	
	public Node(int d, Node n){
		data = d;
		next = n;
	}
	
	public int getData(){return data;}

    public Node getNext(){return next;}

    public void setNext(Node n){next = n;}

    public int sum() throws MyException {
        if(data < 0) { throw new MyException("Data of node is negative"); }
        if(next == null) {
            return data;
        }
        return data + next.sum();
    }

    public void printBackwards(PrintWriter myWriter) throws MyException {
        if(next != null) {
            next.printBackwards(myWriter);
        }
        if(data == 9) { throw new MyException("Encountered the number 9"); }
        myWriter.print(data + " ");
    }
}