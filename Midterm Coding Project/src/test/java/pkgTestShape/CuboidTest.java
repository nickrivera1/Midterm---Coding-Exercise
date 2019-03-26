package pkgTestShape;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Rectangle; 


public class CuboidTest 
{
	@Test(expected = IllegalArgumentException.class)
	public void CubeTestA() throws Exception 
	{
		new Cuboid(-10,-20,-30);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CubeTestB() throws Exception 
	{
		new Cuboid(-10,20,-30);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void CubeTestC() throws Exception 
	{
		new Cuboid(10,-20,30);
	}
	
	
	@Test
	public void CubeTestD() throws Exception
	{
		new Cuboid (10,20,30);
	}
	
	@Test
	public void getTestCube() throws Exception 
	{	
		assertEquals(new Cuboid(10,20,30).getiWidth(), 10);
		assertEquals(new Cuboid(10,20,30).getiLength(), 20);
		assertEquals(new Cuboid(10,20,30).getiDepth(), 30);
	}
	
	@Test
	public void setTestCube() throws Exception 
	{	
		Cuboid cube1 = new Cuboid (10,20,30);
		cube1.setiLength(15);
		cube1.setiWidth(25);
		cube1.setDepth(35);
		
		assertEquals(cube1.getiWidth(), 25);
		assertEquals(cube1.getiLength(), 15);
		assertEquals(cube1.getiDepth(), 35);
	}
	
	@Test
	public void areaTestCube() throws Exception 
	{
		Cuboid cube1 = new Cuboid (10,20,30);
		assertEquals(cube1.area(), 2200, 0.0001);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void PerimeterTestCube() throws Exception 
	{
		Cuboid cube1 = new Cuboid(10,20,30);
		cube1.perimeter();
	}
	
	@Test
	public void CompareTest() throws Exception 
	{
		ArrayList<Cuboid> cuboids = new ArrayList<Cuboid>();
		int x = 0;
		int y = 1;
		int z = 2;
		for (int i = 0; i < 10; i++)
		{
			x++;
			y+=2;
			z++;
			cuboids.add(new Cuboid(x,y,z));
		}
		
		Collections.sort(cuboids);
		for (int i = 0; i < 9; i++)
		{
			assertTrue(cuboids.get(i).area() < cuboids.get(i + 1).area());
		}
	}
	
	@Test
	public void VolumeTestCube() throws Exception 
	{
		Cuboid cube1 = new Cuboid (10,20,30);
		assertEquals(cube1.area(),2200, 0.0001);
	}
	
	
	
}
