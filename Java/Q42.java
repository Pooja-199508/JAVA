/*Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor.
 Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.*/
import java.util.Scanner;
class Tile{
	int edge;
	 double area;
	Tile(int edge){
		this.edge=edge;
		this.area=edge*edge;
	}
}

class Floor{
	int l;
	 int w;
	 double area; 
	Floor(int l,int w){
		this.l=l;
		this.w=w;
		this.area=l*w;
	}
 	double totaltiles(Tile t)
	{
                           return (this.area/t.area);
	}
}

class Q42{
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	Tile t=new Tile(10);
	Floor f=new Floor(100,200);
                     double tt=f.totaltiles(t);
	System.out.println("Total Tiles Required: "+tt);
}}