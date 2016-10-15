/**
 * Created by somutha on 10/14/2016.
 */

//SetData
//GetData
//SetNextNode
//GetNextNode

public class BasicLinkedList {

    private int data;
    private BasicLinkedList next;

    public BasicLinkedList(int data){
        this.data=data;
    }

    public void SetData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public void setNextNode(BasicLinkedList next){
        this.next=next;
    }

    public BasicLinkedList getNextNode(){
        return this.next;
    }

}
