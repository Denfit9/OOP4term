package composite;


public class City extends Component{
	private int population;

	public City(String name, int population) {
		super(name);
		this.population = population;
	}
	
	public void print()	{
		System.out.println(name + " " + population);
	}

}
