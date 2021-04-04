package datastructurepackage;

import java.util.Scanner;

public class SinglyLinkedList implements ILinkedList
{   
    private class Node
    {
        int data;
        Node link;
    }
    
    Scanner in=new Scanner(System.in);
    
    private Node first;
    
    public SinglyLinkedList()
    {
        first=null;
    }
    
    public void insertAtFront()
    {
        Node newNode=new Node();
        
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();
        newNode.link=first;
        first=newNode;
    }
    
    public void insertAtRear()
    {
        Node newNode=new Node();
      
        System.out.print("\nEnter an element to insert:");
        newNode.data=in.nextInt();        
        
        if(first==null)
            first=newNode;
        else
        {
            Node temp;
            
            temp=first;
            
            while(temp.link!=null)
                temp=temp.link;
            
            temp.link=newNode;
            newNode.link=null;
        }
    }
    
    public int length()
    {
        int count=0;
        Node temp;
        
        if(first!=null)
            for(temp=first;temp!=null;count++,temp=temp.link);
        
        return count;
    }
    
    public void insertAfterPos()
    {
        Node newNode=new Node();
        int pos,len;
        
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
            for(temp=first,i=1;i<pos;i++,temp=temp.link);
            
            newNode.link=temp.link;
            temp.link=newNode;
        }
    }
    
    public void deleteAtFront()
    {
        if(first==null)
            System.out.println("Singly linked list is empty!!!");
        else
        {
            Node temp;
            
            temp=first;
            first=first.link;
            System.out.print("\nDeleted node contained element:"+temp.data);
            temp.link=null;
            temp=null;
        }
    }
    
    public void deleteAtRear()
    {
        if(first==null)
            System.out.println("Singly linked list is empty!!!");
        else if(first.link==null)
        {
            System.out.println("\nDeleted node contained:"+first.data);
            first=null;
        }
        else
        {
            Node temp1,temp2;
            
            for(temp1=first,temp2=first.link;temp2.link!=null;temp2=temp2.link)
                temp1=temp2;
                         
            temp1.link=null;
            System.out.println("\nDeleted node contained:"+temp2.data);
            temp2=null;
        }
    }
    
    public void deleteAtPos()
    {
        if(first==null)
            System.out.println("Singly linked list is empty!!!");
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
                int i;
                for(i=1,temp1=first;i<pos-1;temp1=temp1.link,i++);
                
                temp2=temp1.link;
                temp1.link=temp2.link;
                System.out.println("\nDeleted node contained element:"+temp2.data);
                temp2.link=null;
                temp2=null;
            }
        }
    }
    
    public void display()
    {
        if(first==null)
            System.out.println("\nSingly linked list is empty!!!");
        else
        {
            Node temp;
            
            System.out.println("\nContents of singly linked list are:");
            for(temp=first;temp!=null;temp=temp.link)
                System.out.print(temp.data+" ");
            
            System.out.println();
        }
    }
}