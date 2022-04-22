package composite;

import java.util.ArrayList;

public class Part extends Component {
	private ArrayList<Component> components = new ArrayList<Component>();
	public Part(String name) 
	{
		super(name);	
	}
	
	public void add(Component component) 
	{
		components.add(component);
	}
	public void remove(Component component) 
	{
		components.remove(component);
	}
	public void print() 
	{
		System.out.println("\nNode -> " + name);
		if (components.isEmpty())
		{
			System.out.println("No subnodes yet here");
		}else {
		System.out.println("\nSubnodes list :"  );
		}
		for(Component compon : components) 
		{
			System.out.print(compon.name +" | " );
		}
		System.out.println("");
		if(components.isEmpty()) {}
		else{System.out.println("\nSubnodes info :"  );}
		for(Component compon : components) 
		{
			compon.print();
		}
	}
}
