import java.util.*;
public class Dicebox{

	private ArrayList<Dice> box;

	public Dicebox(){
			box = new ArrayList<Dice>();

	}
	public void add(Dice x){
		this.box.add(x);
	}
	public void shake(){
		for(Dice di:this.box)
			di.roll();

	}
	public int getTotal(){
			int total = 0;
		for(Dice di:this.box)
			total += di.getFace();
		return total;
	}
	public void printDices(){
		for(int i=0;i<this.box.size();i--){
			System.out.println((i+1) + "." + box.get(i));
		}
	}
}