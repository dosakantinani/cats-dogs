package ie.tudublin;

public class Cat extends Animal
{
	private int numLives;



	public Cat(String name)
	{
		super(name);	// Constructor chaining.

	}

		// Accessor method.
	public int getNumLives()
	{
		return numLives;
	}

	// Mutator.
	public void setNumLives(int numLives)
	{
		this.numLives = numLives;
	}

	public void speak()
	{
		System.out.println("MEOW")
	}
}