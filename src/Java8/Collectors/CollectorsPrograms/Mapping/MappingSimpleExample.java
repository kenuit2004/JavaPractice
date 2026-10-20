package Java8.Collectors.CollectorsPrograms.Mapping;
import java.util.*;
import java.util.stream.*;
class City
{
	String name;
	double temperature;
	City(String name,double temperature)
	{
		this.name=name;
		this.temperature=temperature;
	}
	public String getName()
	{
		return name;
	}
	public double getTemperature()
	{
		return temperature;
	}
	public String toString()
	{
		return name+" "+temperature;
	}
}
public class MappingSimpleExample 
{
	static List<City> ken()
	{
		List<City> cities=new ArrayList<>();
		cities.add(new City("New Delhi", 33.5));
	    cities.add(new City("Mexico", 47));
	    cities.add(new City("New York", 13));
	    cities.add(new City("Dubai", 43));
	    cities.add(new City("London", 15));
	    cities.add(new City("Alaska", 1));
	    cities.add(new City("Kolkata", 30));
	    cities.add(new City("Sydney", 11));
	    cities.add(new City("Mexico", 14));
	    cities.add(new City("Dubai", 50)); 
	    return cities;
	}
	public static void main(String[] args) 
	{
		Map<String,List<Double>> b=ken()
		.stream()
		.collect(Collectors.groupingBy(City::getName,Collectors.mapping(City::getTemperature,Collectors.toList())));
		System.out.println(b);
	}
}
