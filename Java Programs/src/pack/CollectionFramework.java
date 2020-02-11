package pack;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionFramework {

	public static void main(String[] args) 
	{
            ArrayList array_list = new ArrayList();
            array_list.add("Syed");
            array_list.add("Muhammad");
            array_list.add("ali");
            array_list.add("Haider");
            array_list.add("Haider");
            
            System.out.println(array_list);
    
	        LinkedList link_list = new LinkedList();
	        link_list.add("Syed");
	        link_list.add("Muhammad");
	        link_list.add("ali");
	        link_list.add("Haider");
	        link_list.add("Haider");
	        
	        System.out.println(link_list);
	}
}