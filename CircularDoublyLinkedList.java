package datastructurepackage;

import java.util.Scanner;

public class CircularDoublyLinkedList implements ILinkedList
{
    private class Node
    {
        int data;
        Node left,right;
    }
    
    Scanner in=new Scanner(System.in);
    
    private Node first,last;
    
    public CircularDoublyLinkedList()
    {
        first=null;
        last=null;
    }
    
    public void insertAtFront()
    {
        Node newNode=new Node();
        
        newNode.left=newNode.right=null;
        
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();
        if(first==null)
        {
            first=last=newNode;
            last.right=first;
            first.left=last;
        }
        else
        {
            newNode.right=first;
            first.left=newNode;
            first=newNode;
            last.right=first;
            first.left=last;
        }
    }
    
    public void insertAtRear()
    {
        Node newNode=new Node();
      
        newNode.left=newNode.right=null;
        
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();        
        
        if(first==null)
        {
            first=last=newNode;
            last.right=first;
            first.left=last;
        }
        else
        {
            newNode.left=last;
            last.right=newNode;
            last=newNode;
            last.right=first;
            first.left=last;
        }
    }
    
    public int length()
    {
        int count=0;
        Node temp;
        
        if(first!=null)
            for(count=1,temp=first.right;temp!=first;count++,temp=temp.right);
        
        return count;
    }
    
    public void insertAfterPos()
    {
        Node newNode=new Node();
        int pos,len;
        
        newNode.left=newNode.right=null;
        
        System.out.print("\nEnter the position after which the element is to be inserted:");
        pos=in.nextInt();
        
        len=length();
        
        if(pos<1 || pos>len)
            System.out.println("Invalid position entered!!!");
        else
        {
            System.out.print("Enter an element to insert:");
            newNode.data=in.nextInt();
            
            Node temp;
            int i;
            for(temp=first,i=1;i<pos;i++,temp=temp.right);
            
            newNode.right=temp.right;
            newNode.left=temp;
            temp.right=newNode;
        }
    }
    
    public void deleteAtFront()
    {
        if(first==null)
            System.out.println("Circular doubly linked list is empty!!!");
        else if(first==last)
        {
            System.out.print("\nDeleted node contained element:"+first.data);
            first.left=last.right=null;
            first=last=null;
        }
        else
        {
            Node temp;
            
            temp=first;
            first=first.right;
            last.right=first;
            first.left=last;
            temp.left=temp.right=null;
            System.out.print("\nDeleted node contained element:"+temp.data);
            temp=null;
        }
    }
    
    public void deleteAtRear()
    {
        if(first==null)
            System.out.println("Circular doubly linked list is empty!!!");
        else if(first==last)
        {
            System.out.print("\nDeleted node contained element:"+last.data);
            first.left=last.right=null;
            first=last=null;
        }
        else
        {
            Node temp;
            
            temp=last;
            last=last.left;
            last.right=first;
            first.left=last;
            System.out.println("\nLast node contains:"+last.data);
            System.out.print("\nDeleted node contained element:"+temp.data);
            temp.left=temp.right=null;
            temp=null;
        }
    }
    
    public void deleteAtPos()
    {
        if(first==null)
            System.out.println("Circular doubly linked list is empty!!!");
        else
        {
            Node temp1,temp2;
            int pos,len;
            
            System.out.print("\nEnter the position of the element to be deleted:");
            pos=in.nextInt();
            
            len=length();
            
            if(pos<1 || pos>len)
                System.out.println("\nInvalid position entered!!!");
            else if(pos==1)
            {
                deleteAtFront();
            }
            else if(pos==len)
            {
                deleteAtRear();
            }
            else
            {
                Node temp3;
                int i;
                for(i=1,temp1=first;i<pos-1;temp1=temp1.right,i++);
                
                temp2=temp1.right;
                temp3=temp2.right;
                temp1.right=temp3;
                temp3.left=temp1;
                System.out.println("\nDeleted node contained element:"+temp2.data);
                temp2.left=temp2.right=null;
                temp2=null;
            }
        }
    }
    
    public void display()
    {
        if(first==null)
            System.out.println("\nCircular doubly linked list is empty!!!");
        else
        {
            Node temp;
            
            System.out.println("\nContents of circular doubly linked list are:");
            temp=first;
            do
            {
                System.out.print(temp.data+" ");
                temp=temp.right;
            }while(temp!=first);
            
            System.out.println();
        }
    }
}