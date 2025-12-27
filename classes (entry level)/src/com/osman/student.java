package com.osman;

public class student {
	
	public int ID;
	
	public String name;
	
	public String surname;
	
	public float number;
	
	private String gender; // unavailable to other ones
	
	// Constructor using;
	public student (int id, String isim, String soyisim)
	{
		// this : working on now
		
		this.ID = id;
		this.name = isim;
		this.surname = soyisim;
	}
	
	public student ()
	{ 
		this.number = 3.71f;
	}

	public student (String a)
	{
		this.gender = a;
	}
	
	public void write()
	{
		System.out.println("Gender: " + this.gender);
	}
}
