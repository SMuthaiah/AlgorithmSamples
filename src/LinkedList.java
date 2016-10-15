/**
 * Created by somutha on 10/14/2016.
 */

public class LinkedList {

    public LinkedList(){
        length=0;
    }
    private int length=0;
    BasicLinkedList head;

    //Return the first Node of the list
    public synchronized BasicLinkedList getHead(){
        return head;
    }

    //Insert a node at the beginning of the list
    public synchronized void insertAtBegin(BasicLinkedList node){
        node.setNextNode(head);
        head = node;
        length ++;
    }

    //Insert a node at the end of the list
    public synchronized void insertAtEnd(BasicLinkedList node){
        if (head==null){
            head = node;
        }
        else{
            BasicLinkedList p,q;
            //find the last node here
            for (p=head;(q=p.getNextNode())!=null;p=q){
                p.setNextNode(node);
            }
        }

        length ++;
    }

    //Add a new value to a list at a given Position

    public synchronized void InsertAtPosistion(int data,int position) {
        //fixing the positon input
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length;
        }

        //if list is empty, make the incoming data the firstnode.

        if (head == null) {
            head = new BasicLinkedList(data);
        }

        //if adding at the front of the list i.e if position=0

        else if (position == 0) {
            BasicLinkedList temp = new BasicLinkedList(data);
            temp.setNextNode(head);
            head = temp;
        }

        //Find the correct position

        else {
            BasicLinkedList temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.getNextNode();
            }

            BasicLinkedList newNode = new BasicLinkedList(data);
            newNode.setNextNode(temp.getNextNode());
            temp.setNextNode(newNode);
        }
    }

        //Remove and return the node at the  head of the list
        public synchronized BasicLinkedList removeAndReturnAtHead(){

        BasicLinkedList temp = head;
        if (temp!=null){
            head = temp.getNextNode();
            temp.setNextNode(null);
        }
        return temp;
    }

        //Remove and Return a node at the end of the list
        public synchronized BasicLinkedList removeandReturnlastNode(){
            BasicLinkedList temp = head;
            //find the last but the node before it here
            if(temp.getNextNode()==null){
                head=null;
                return temp;
            }
            else if (head==null){
                return null;
            }
            else {
                for (int i = 1; i < length; i++) {
                    temp = temp.getNextNode();
                }
                BasicLinkedList node = temp.getNextNode();
                temp.setNextNode(null);
                return node;
            }
        }

    }


