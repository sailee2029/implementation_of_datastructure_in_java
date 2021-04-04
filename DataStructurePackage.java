package datastructurepackage;

import java.util.Scanner;

public class DataStructurePackage 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);     
        int ch1,ch2;
        ILinkedList i;
        
        System.out.println("\nData Structures Package:");
        System.out.println("1)Singly Linked List");
        System.out.println("2)Doubly Linked List");
        System.out.println("3)Circular Singly Linked List");
        System.out.println("4)Circular Doubly Linked List");
        System.out.print("Enter your choice:");
        ch1=in.nextInt();
        
        switch(ch1)
        {
            case 1:
            i=new SinglyLinkedList();
            do
            {
                System.out.println("\nSingly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            case 2:
            i=new DoublyLinkedList();
            do
            {
                System.out.println("\nDoubly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);    
            break;
        
            case 3:
            i=new CircularSinglyLinkedList();
            do
            {
                System.out.println("\nCircular singly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            case 4:
            i=new CircularDoublyLinkedList();
            do
            {
                System.out.println("\nCircular doubly linked list operations:");
                System.out.println("1)Insert a node at front");
                System.out.println("2)Insert a node at rear");
                System.out.println("3)Insert a node after particular position");
                System.out.println("4)Delete the node at the front");
                System.out.println("5)Delete the node at the rear");
                System.out.println("6)Delete a node at a particular position");
                System.out.println("7)Display");
                System.out.println("8)Exit");
                System.out.print("Enter your choice:");
                ch2=in.nextInt();

                switch(ch2)
                {
                    case 1:i.insertAtFront();
                           break;

                    case 2:i.insertAtRear();
                           break;

                    case 3:i.insertAfterPos();
                           break;

                    case 4:i.deleteAtFront();
                           break;

                    case 5:i.deleteAtRear();
                           break;

                    case 6:i.deleteAtPos();
                           break;
                           
                    case 7:i.display();
                           break;
                           
                    case 8:break;

                    default:System.out.println("Invalid choice!!!");
                }
            }while(ch2!=8);
            break;
            
            default:System.out.println("\nInvalid choice!!!");
        }
    }
}   