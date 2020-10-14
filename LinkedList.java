package day13linkedlist.day13linkedlistproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

interface InterfaceNode<I>{
	I getKey();
	public void setKey(I key);
	InterfaceNode<I> getNext();
	public void setNext(InterfaceNode<I> next);
}

class Node<I> implements InterfaceNode<I>{
	public I key;
	public Node<I> next;
	public Node(I key) {
		
		this.key = key;
		this.next = null;
	}
	public I getKey() {
		return key;
	}
	public void setKey(I key) {
		this.key = key;
	}
	public Node<I> getNext() {
		return next;
	}
	public void setNext(InterfaceNode<I> next) {
		this.next = (Node<I>) next;
	}
	
}

public class LinkedList 
{   private static final Logger log=LogManager.getLogger(LinkedList.class);
    public static void main( String[] args )
    {
       log.debug( "Linked List Creation" );
        Node<Integer> firstNode=new Node<Integer>(56);
		Node<Integer> secondNode=new Node<Integer>(30);
		Node<Integer> thirdNode=new Node<Integer>(70);
		Node<Integer> tempnode=firstNode;
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		log.debug("This is the Linked List : ");
		do {
			System.out.print(tempnode.getKey()+"->");
		}while((tempnode=tempnode.getNext())!=null);
    }
}
