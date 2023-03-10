package ie.tudublin;

public class Animal
{
	// Public
	// Private
	// Protected
	private String name;

	// Constructor.
	// Same name as the class.
	// No return type.
	// If one is not added, a default constuctor is added.
	public Animal(String name)
	{
		setName(name);
	}

	// Accessor method.
	public String getName()
	{
		return name;
	}

	// Mutator.
	public void setName(String name)
	{
		this.name = name;
	}
}