package day13linkedlist.day13linkedlistproblem;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;


public class LinkedListTest 
{
    @Test
    public void searchedValueIfFound_ShouldReturnTrue()
    {
    	 LinkedList<Integer> listOfValues=new LinkedList<Integer>();
    	 boolean inference;
    	 Node<Integer> thirdNode=new Node<Integer>(70);
         Node<Integer> secondNode=new Node<Integer>(30);
         Node<Integer> firstNode=new Node<Integer>(56);
         listOfValues.appendingToList(firstNode);
         listOfValues.appendingToList(secondNode);
         listOfValues.appendingToList(thirdNode);
         inference=listOfValues.searchingNode(30);
         Assert.assertTrue(inference);
    }
    @Test
    public void searchedValueIfNotFound_ShouldReturnFalse()
    {
    	 LinkedList<Integer> listOfValues=new LinkedList<Integer>();
    	 boolean inference;
    	 Node<Integer> thirdNode=new Node<Integer>(70);
         Node<Integer> secondNode=new Node<Integer>(30);
         Node<Integer> firstNode=new Node<Integer>(56);
         listOfValues.appendingToList(firstNode);
         listOfValues.appendingToList(secondNode);
         listOfValues.appendingToList(thirdNode);
         inference=listOfValues.searchingNode(27);
         Assert.assertFalse(inference);
    }
    @Test
    public void AfterInsertionOfValue_WhenSearchedAndFoundInList_ShouldReturnTrue()
    {
    	 LinkedList<Integer> listOfValues=new LinkedList<Integer>();
    	 boolean inference;
    	 Node<Integer> thirdNode=new Node<Integer>(70);
         Node<Integer> secondNode=new Node<Integer>(30);
         Node<Integer> firstNode=new Node<Integer>(56);
         Node<Integer> fourthNode=new Node<Integer>(40);
         listOfValues.appendingToList(firstNode);
         listOfValues.appendingToList(secondNode);
         listOfValues.appendingToList(thirdNode);
         listOfValues.insertionInBetween(secondNode, fourthNode);
         listOfValues.printingList();
         inference = listOfValues.searchingNode(40);
 		 Assert.assertTrue(inference);
    }
    @Test
    public void AfterInsertionOfValue_WhenSearchedNotFoundInList_ShouldReturnFalse()
    {
    	 LinkedList<Integer> listOfValues=new LinkedList<Integer>();
    	 boolean inference;
    	 Node<Integer> thirdNode=new Node<Integer>(70);
         Node<Integer> secondNode=new Node<Integer>(30);
         Node<Integer> firstNode=new Node<Integer>(56);
         Node<Integer> fourthNode=new Node<Integer>(40);
         listOfValues.appendingToList(firstNode);
         listOfValues.appendingToList(secondNode);
         listOfValues.appendingToList(thirdNode);
         listOfValues.insertionInBetween(secondNode, fourthNode);
         listOfValues.printingList();
         inference = listOfValues.searchingNode(20);
 		 Assert.assertFalse(inference);
    }
}
