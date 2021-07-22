package com.company;

public class List {

    class Node{

        Node next;
        Node prev;
        Student data;
    }

    private Node Top;
    public int Length = 0;

    public boolean Set_Element(Student value, int index){
        if(index<0 || index > Length){
            return false;
        }
        if(index ==0) {
            addFirst(value);
            return true;
        }
        if(index == Length){
            addLast(value);
            return true;
        }

        Node newElement = new Node();
        newElement.data = value;
        Node cur = Top;

        for (int i = 1; i < index; i++) {
            cur = cur.next;
        }

        newElement.next = cur.next;
        cur.next.prev= newElement;
        cur.next = newElement;
        newElement.prev=cur;
        Length++;
        return true;
    }

    public void addFirst(Student value){

        Node newElem = new Node();
        newElem.data = value;
        if(Top!= null){
            newElem.next = Top;
            Top.prev = newElem;
        }
        Top = newElem;
        Length++;
    }

    public void addLast(Student value){
        Node newElem = new Node();
        newElem .data =value;
        Node cur = Top;
        if(cur==null) {
            Top = newElem;
        }
        else{
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next = newElem;
            newElem.prev = cur;
        }
        Length++;
    }

    public Node Get_Element(int number){
        Node result = Top;
        for(int i = 0; i < number; i++){
            result = result.next;
        }
        return result;
    }

    private void Set_Val(Student val, int number){
        Node result = Top;
        for(int i = 0; i < number; i++){
            result = result.next;
        }
        result.data=val;
    }

    public void Sort(){
        for(int i = 0; i < Length-1; i++){
            for(int j = 0; j < Length - i - 1; j++){
                if(Get_Element(j+1).data.Grade > Get_Element(j).data.Grade){
                    Student temp = Get_Element(j).data;
                    Set_Val(Get_Element(j+1).data,j);
                    Set_Val(temp, j+1);
                }
            }
        }
    }
}
