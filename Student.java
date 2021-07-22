package com.company;

public class Student {
    String Surname;
    String Name;
    int Group;
    double Grade;

        Student (String Surname, String Name, int Group, double Grade){
            this.Surname = Surname;
            this.Name = Name;
            this.Group = Group;
            this.Grade = Grade;
        }

        @Override
        public String toString(){
            return String.format("%12s %10s %4d %5f ", Surname, Name, Group, Grade);
        }
}

