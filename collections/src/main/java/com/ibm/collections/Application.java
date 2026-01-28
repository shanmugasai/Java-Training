package com.ibm.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Application
{
	public Collection<String>getData(){
		List<String> result= new LinkedList<String>();
		result.add("A");
		result.add("B");
		result.add("E");
		result.add("C");
		return result;
		}
	public static void main( String[] args )
	{
		Application application = new Application();
		Collection<String> data=application.getData();
		Iterator <String> iterator=data.iterator();
		while(iterator.hasNext()) {
			String text=iterator.next();
			System.out.println(text);
			
		}
		
	}
}