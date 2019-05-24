package com.myjoon.test.Leetcode.youngjoon;

import java.math.BigInteger;

import com.myjoon.util.ListNode;

public class AddTwoNumbers_2 {
	
	public static void main(String[] arg) {
		AddTwoNumbers_2 add = new AddTwoNumbers_2();
		

		ListNode l2 = null;
		l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		
		ListNode resultNode = add.addTwoNumbers(l1, l2);
		
		do {
			System.out.println(resultNode.val);
			resultNode = resultNode.next;
		} while (resultNode != null);
		
	}
	
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNodeStart = null;
        ListNode sumNodePre = null;
        
        BigInteger firstNumber = getNumber(l1);
        BigInteger secondNumber = getNumber(l2);
        
        BigInteger sum = firstNumber.add(secondNumber);
        String sumString = sum.toString();
        
        
        for (int i=sumString.length()-1; i >= 0 ; i--){
        	if (sumNodeStart == null)
        	{
        		sumNodeStart = new ListNode(Character.getNumericValue(sumString.charAt(i)));
        		sumNodePre = sumNodeStart;
        		continue;
        	}
        	sumNodePre.next = new ListNode(Character.getNumericValue(sumString.charAt(i)));
        	sumNodePre = sumNodePre.next;
        }
        
    	return sumNodeStart;
    }
    
    public BigInteger getNumber(ListNode listNode) {
    	ListNode nextNode = listNode;
	    StringBuilder sb = new StringBuilder();
	    do {
	    	sb.append(nextNode.val);
	    	nextNode = nextNode.next;
	    } while (nextNode != null);
	    
	    return new BigInteger(sb.reverse().toString());
    }
}
