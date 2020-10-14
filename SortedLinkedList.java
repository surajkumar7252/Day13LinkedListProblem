package day13linkedlist.day13linkedlistproblem;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortedLinkedList {
	public InterfaceNode<Integer> headPart=null;
    public InterfaceNode<Integer> tailPart=null;
	private static final Logger log = LogManager.getLogger(SortedLinkedList.class);
	 
	public void appendingToList(InterfaceNode<Integer> tempNode) {
			if (this.headPart == null) {
				this.headPart = tempNode;
			}
			if (this.tailPart == null) {
				this.tailPart = tempNode;
			} else {
				this.tailPart.setNext(tempNode);
				this.tailPart = this.tailPart.getNext();
			}this.sorting();
			
		}
	
	 public void printingList() {
			InterfaceNode<Integer> tempNode=this.headPart;
			
			if(tempNode!=null) {
				log.debug("This is the Linked List : ");
				do {
					System.out.print(tempNode.getKey()+"->");
				}while((tempNode=tempNode.getNext())!=null);
				
				
			}
			
		}
	 
	 public void sorting() {
		 InterfaceNode<Integer> present =this.headPart;
		 InterfaceNode<Integer>lastOne = null;
		 InterfaceNode<Integer> upNext;
		 InterfaceNode<Integer> temp;
		
			for(upNext = this.headPart.getNext();upNext != null;){
				if ((Integer)present.getKey() > (Integer)upNext.getKey()) {
					
					if (lastOne != null ) {
						temp = upNext.getNext();
						lastOne.setNext(upNext);
						upNext.setNext(present);
						present.setNext(temp);
					} else {
						temp =upNext.getNext();
						this.headPart= upNext;
						upNext.setNext(present);
						present.setNext(temp);
					}
					lastOne = upNext;
					upNext = present.getNext();
				} else { 
					lastOne = present;
					present = upNext;
					upNext = upNext.getNext();
				}
			} 
			 
		
	 }
	 public static void main(String[] args) {
		    SortedLinkedList listOfValues=new SortedLinkedList();
	       
	        log.debug( "Sorted Linked List" );
	        Node<Integer> thirdNode=new Node<Integer>(70);
	        Node<Integer> secondNode=new Node<Integer>(30);
	        Node<Integer> firstNode=new Node<Integer>(56);
	        Node<Integer> fourthNode=new Node<Integer>(40);
	        listOfValues.appendingToList(firstNode);
	        listOfValues.appendingToList(secondNode);
	        listOfValues.appendingToList(thirdNode);
	        listOfValues.appendingToList(fourthNode);
	        listOfValues.printingList();   
		
	}
}
