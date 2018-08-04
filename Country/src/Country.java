
public class Country
{
	private String name;//instance member
	private int area;
	private long population;
	private double density;
	
	//getter
	
	public String getName() {
		return name;
	}
	public int getArea() {
		return area;
	}
	public long getPopulation() {
		return population;
	}
	public double getDensity() {
		return density;
	}
	
	public Country(String name,int area, long population)//constructor
	{
		this.area = area;
		this.population = population;
		this.density = population/area;
		this.name=name;	
	}	
}
