//Omar Abarca
//CMSC203
public class Plot 
{
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot(Plot p) 
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	public Plot(int x, int y, int width, int depth) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot() 
	{
		x=0;
		y=0;
		width=1;
		depth=1;
	}
	public String toString() 
	{
	String toString = "Upper Left: (" + x + "," + y + ")" + " Width: " + width + " Depth: " + depth;
	return toString;
	}
	public boolean overlaps(Plot plot) 
	{
		boolean Overlaps1,Overlaps2,Overlaps3,Overlaps4,Overlaps5,Overlaps6,Overlaps7,Overlaps8;

		Overlaps1 = (plot.x >= x && plot.x < (x+width)) && (plot.y >= y 
				&& plot.y < (y+depth));
		Overlaps2 = (x >= plot.x && x < (plot.x + width)) && (y >= plot.y 
				&& y < (plot.depth + plot.y));

		Overlaps3 = (plot.x + plot.width) > x && (plot.x + plot.width) < (x + width) 
				&& plot.y >= y && plot.y <= (y + depth);
		Overlaps4 = (x + width) > plot.x && (x + width) < (plot.x + plot.width) 
				&& y>= plot.y && y <= (plot.y + plot.depth);

		Overlaps5 = plot.x >= x && plot.x < (x + width) && (plot.y + plot.depth) > y 
				&& (plot.y + plot.depth) <= (y + depth);
		Overlaps6 = x >= plot.x && x < (plot.x + plot.width) && (y + depth) > plot.y 
				&& (y + depth) <= (plot.y + plot.depth);

		Overlaps7 = (plot.x + plot.width) > x && (plot.x +plot.width) <= (x + width) 
				&& (plot.y + plot.depth) > y && (plot.y + plot.depth) <= (y + depth);
		Overlaps8 = (x + width) > plot.x && (x + width) <= (plot.x + plot.width) 
				&& (y + depth) > plot.y && (y + depth) <= (plot.y + plot.depth);

	
		return Overlaps1 || Overlaps2 || Overlaps3 || Overlaps4 || Overlaps5 || Overlaps6 || Overlaps7 || Overlaps8;
	}

	public int getWidth() 
	{
		return width;
	}
	public int getDepth() 
	{
		return depth;
	}
	public void setX(int x) 
	{
		this.x=x;
	}
	public void setDepth(int depth) 
	{
		this.depth = depth;
	}
	public void setY(int y) 
	{
		this.y=y;
	}
	public int getX() 
	{
		return x;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public int getY() 
	{
		return y;
	}
	public boolean encompasses(Plot plot) 
	{	
		boolean xBool, yBool, widthBool, depthBool;
		xBool = plot.x >= x;
		yBool = plot.y >= y;
		widthBool = (plot.x + plot.width) <= (x + width);
		depthBool = (plot.y + plot.depth) <= (y + depth);
		return xBool && yBool && widthBool && depthBool;
	}	
}
