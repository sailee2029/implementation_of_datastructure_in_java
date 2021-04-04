
package DataStructure;

public class CircularQueue {

    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;

        }
    }
    public node head=null;
    public node tail=null;

    public int size=0;

    public void add(int data){

        node newnode= new node(data);
        if(head==null){

            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
        }
        else
        {
            head.next=newnode;
            tail=newnode;
            tail.next=head;
            size++;
        }
    }



    public void delete(){
        node temp=head;
        while(temp.next !=head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
        System.out.println("deleted node is "+temp.data);
        size--;
    }

    public void deletefromposition(int position){
        if(position<0 || position >= size){
            throw new IllegalArgumentException("position is invaid");
        }
        node current=head,previous=head;
        for(int i=0;i<position;i++){
            if(current.next==head){
                break;


            }
            previous=current;
            current=current.next;


        }
        if(position==0){
            delete();

        }else{
            previous.next=current.next;

        }


    }
    public void display(){
        node current= head;
        if(head==null){
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("nodes of circular linked list:");
            do{
                System.out.println(" "+current.data);
                current=current.next;
            }
            while(current!=head);
            System.out.println();
        }

    }


}
