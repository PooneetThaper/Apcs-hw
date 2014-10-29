public class Driver{
    public static void main(String[] args){
	int r1=(int)Math.ceil(Math.random()*10);
	int r2=(int)Math.ceil(Math.random()*10);
	Arraystuff a = new Arraystuff();
	System.out.println("Array:");
	System.out.println(a.toString());
	System.out.println("The location of "+Integer.toString(r1)+" in the Array is:");
	System.out.println(a.find(r1));
	System.out.println("The max value in the array is:");
	System.out.println(a.maxVal());
	System.out.println("The frequency  of "+Integer.toString(r2)+" in the Array is:");
	System.out.println(a.count(r2));
    }
}
