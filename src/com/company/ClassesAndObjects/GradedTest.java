package com.company.OOPS;

public class GradedTest{}


/** 1 **/
class a {
    //public  Test() {}
    public  a(int i){}
 }

 class b extends  a{
    //The given code is incorrect because class B inherits class A; so, when an object of class B is created,
     // the default constructor of class B will be invoked, which will also invoke the super() method that will
     // reach the constructor of class A. Since the constructor is not defined in class A,
     // because there is no integer argument passed in the default constructor invocation, an error will be thrown.
 }

 /** 2 **/
interface bookTickets {
    int number = 0; 

    public void addSeat() { // cannot implement in interface except default and static
        number++;
    }

    public void display();
}

/** 3 **/
    /*The order of access modifiers in the increasing order of their restrictive nature is:
public > protected > default > private

A more restrictive access modifier can be converted into a less restrictive access modifier but not vice versa,
                which means that a protected method can be made public but a public method cannot be made protected.
        Similarly, in this option, you can override a default method to either public or protected
because it is less restrictive.*/
