import composite.*;
public class Main {

	public static void main(String[] args) {
		Component countries = new Part("Countries");
		Component Belarus = new Part("Belarus");
		Component MinskRegion = new Part("Minsk region");
		Component Slutsk = new City("Slutsk", 61396);
		Component Smolevichi = new City ("Smolevichi", 16594);
		Component MinskCity = new City("Minsk", 1975000);
		Component Vatican = new Part("Vatican");
		Component VaticanCity = new City("Vatican", 825);
		
		MinskRegion.add(Smolevichi);
		MinskRegion.add(Slutsk);
		Belarus.add(MinskCity);
		Belarus.add(MinskRegion);
		Vatican.add(VaticanCity);
		countries.add(Vatican);
		countries.add(Belarus);
		countries.print();
		
	}

}
