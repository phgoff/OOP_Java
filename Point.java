public class Point{
	private float x,y,z;
	
	public Point(float x,float y,float z){
	 this.x = x;
	 this.y = y;
	 this.z = z;

	}
	public float getx(){
	 return this.x;	
	}
	public float gety(){
	 return this.y;
	}
	public float getz(){
	 return this.z;
	}
	public void setx(float x){
	 this.x = x;
	}
	public void sety(float y){
	 this.y = y;	
	}
	public void setz(float z){
	 this.z = z;	
	}
	public void setxyz(float x, float y,float z){
	 this.x=x;
	 this.y =y;
	 this.z =z;
	}
	public void setPoint(Point pt){
	 this.x = pt.getx();
	 this.y = pt.gety();
	 this.z = pt.getz();
	}


}