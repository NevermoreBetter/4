package com.company;

public class Main {

    public static void main(String[] args) {
	/*Student[] s=new Student[4];
	s[0]= new Student("a","a",2,4.3);
	s[1]= new Student("b","b",1,4.5);
	s[2]= new Student("c","c",3,4.4);
	s[3]= new Student("d","d",2,5);
	for(Student student:s){
	    System.out.println(student.toString());
    }
	System.out.println("----------");
	Sort.DoubleBubbleSort(s,4);
        for(Student student:s){
            System.out.println(student.toString());
        }*/

        List list=new List();
        list.addFirst(new Student("a","a",2,4.3));
		list.addFirst(new Student("b","b",1,4.5));
		list.addFirst(new Student("c","c",3,4.4));
		list.addFirst(new Student("d","d",2,5));
		for (int i = 0;i< list.Length;i++){
			System.out.println(list.Get_Element(i).data.toString());
		}
		System.out.println("----------");
		list.Sort();
		for (int i = 0;i< list.Length;i++){
			System.out.println(list.Get_Element(i).data.toString());
		}

    }
}
