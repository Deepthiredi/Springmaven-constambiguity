package com.testyanthra.constructor_ambiguity;

public class Employee 
{
	public Employee(int a, int b)
	{
		System.out.println("hi");
	}
	public Employee(String a, String b)
	{
		System.out.println("hello");
	}
    public Employee(double a,double b)
    {
    	System.out.println("good morning");
    }
}
