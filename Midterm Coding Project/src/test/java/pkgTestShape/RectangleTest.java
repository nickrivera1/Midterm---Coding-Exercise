package pkgTestShape;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Rectangle; 
public class RectangleTest {

	
	
	@Test(expected = IllegalArgumentException.class)
	public void RectTestA() throws Exception 
	{
		new Rectangle(-10,-20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectTestB() throws Exception 
	{
		new Rectangle(-10,20);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectTestC() throws Exception 
	{
		new Rectangle(10,-20);
	}
	
	
	@Test
	public void RectTestD() throws Exception
	{
		new Rectangle (10,20);
	}
	
	@Test
	public void getTest() throws Exception 
	{	
		assertEquals(new Rectangle(10,20).getiWidth(), 10);
		assertEquals(new Rectangle(10,20).getiLength(), 20);
	}
	
	@Test
	public void setTest() throws Exception 
	{	
		Rectangle rect1 = new Rectangle (10,20);
		rect1.setiLength(15);
		rect1.setiWidth(25);
		
		assertEquals(rect1.getiWidth(), 25);
		assertEquals(rect1.getiLength(), 15);
	}
	
	@Test
	public void areaTest() throws Exception 
	{
		Rectangle rect1 = new Rectangle (10,20);
		assertEquals(rect1.area(), 200, 0.0001);
	}
	
	@Test
	public void PerimeterTest() throws Exception 
	{
		assertEquals(new Rectangle(10,20).perimeter(), 60, 0.001);
	}
	
	@Test
	public void CompareTest() throws Exception 
	{
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		int x = 0;
		int y = 1;
		for (int i = 0; i < 10; i++)
		{
			x++;
			y+=2;
			rectangles.add(new Rectangle(x,y));
		}
		
		Collections.sort(rectangles);
		for (int i = 0; i < 9; i++)
		{
			assertTrue(rectangles.get(i).area() < rectangles.get(i + 1).area());
		}
	}
	
}
