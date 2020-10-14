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

public class LinkedList<I> 
{   private static final Logger log=LogManager.getLogger(LinkedList.class);
    public InterfaceNode<I> headPart=null;
    public InterfaceNode<I> tailPart=null;
  
    
    public void addToList(InterfaceNode<I> tempNode) {
    	if(this.headPart==null) {
    		this.headPart=tempNode;
    	}
    	if(this.tailPart==null) {
    		this.tailPart=tempNode;
    	}else {
    		InterfaceNode<I> temp=this.headPart;
    		this.headPart=tempNode;
    		this.headPart.setNext(temp);
    	}
    	
    }
    public void printingList() {
		InterfaceNode<I> tempNode=this.headPart;
		
		if(tempNode!=null) {
			log.debug("This is the Linked List : ");
			do {
				System.out.print(tempNode.getKey()+"->");
			}while((tempNode=tempNode.getNext())!=null);
			
			
		}
		
	}
    public void appendingToList(InterfaceNode<I> tempNode) {
		if (this.headPart == null) {
			this.headPart = tempNode;
		}
		if (this.tailPart == null) {
			this.tailPart = tempNode;
		} else {
			this.tailPart.setNext(tempNode);
			this.tailPart = this.tailPart.getNext();
		}
		
	}
    public void insertionInBetween(InterfaceNode<I> node1, InterfaceNode<I> node2) {
    	InterfaceNode<I> tempNode=node1.getNext();
		node1.setNext(node2);
		node1.getNext().setNext(tempNode);
		
	}
    public static void main( String[] args )
    {  LinkedList<Integer> listOfValues=new LinkedList<Integer>();
        log.debug( "Linked List Creation" );
        Node<Integer> thirdNode=new Node<Integer>(70);
        Node<Integer> secondNode=new Node<Integer>(30);
        Node<Integer> firstNode=new Node<Integer>(56);
        listOfValues.appendingToList(firstNode);
        listOfValues.appendingToList(thirdNode);
		listOfValues. insertionInBetween(firstNode,secondNode);
		
		listOfValues.printingList();		
		
    }
}
