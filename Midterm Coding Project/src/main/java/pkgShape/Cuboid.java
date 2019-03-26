package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) throws Exception 
	{
		super(iWidth, iLength);
		if (iDepth < 0)
		{
			throw new IllegalArgumentException("iDepth must be a positive number.");
		}
		else
		{
			this.iDepth = iDepth;
		}
	}
	
	public int getiDepth()
	{
		return iDepth;
	}

	public void setDepth(int iDepth)
	{
		this.iDepth = iDepth;
	}
	
	public double Volume()
	{
		return 0;
	}
	
	@Override
	public double area()
	{
		return  ( 2 * this.getiWidth() * this.getiLength()  + 2 * this.getiLength()  * this.getiDepth() + 2 * this.getiDepth() * getiWidth());
		
	}
	
	@Override
	public double perimeter() throws Exception 
	{
		throw new UnsupportedOperationException("You cannot have a perimeter for a cuboid.");	
	}
	
	@Override
	public int compareTo(Object x)
	{
		Cuboid cubex = (Cuboid) x;
		return (int) (this.area() - cubex.area());
	}
}
	
class SortByArea implements Comparator<Cuboid> 
{		
	SortByArea() 		
	{
		super();
	}
	public int compare(Cuboid cube1, Cuboid cube2) 
	{
		return (int) (cube1.area() - cube2.area());
	}
		
}

class SortByVolume implements Comparator<Cuboid> 
{
	SortByVolume() 
	{
		super();
	}
	public int compare(Cuboid cube1, Cuboid cube2) 
	{
		return (int) (cube1.Volume() - cube2.Volume());
	}	
}
	
	
	
	
	

