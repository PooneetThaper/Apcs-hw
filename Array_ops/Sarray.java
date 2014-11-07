public class Sarray{
    private int[] data;//should be object[]
    private int last;

    public static void main(String[] args){
	Sarray a=new Sarray();
	a.add(5);
	a.add(15);
	a.add(52);
	a.add(537);
	a.test();
    }

    public Sarray(){
	last=0;
	data=new int[10];/*
	for(int i=0; i<data.length;i++){
	    data[i]=i;
	    }*/
    }

    public void test(){
	String s="";
	for(int i=0; i<data.length;i++){
	    s=s+Integer.toString(data[i]);
	    s=s+", ";	 
	}
	System.out.println(s);
    }

    public void add(int i){
	if (last<data.length){
	    data[last]=i;
	    last++;
	}
    }
    /*
    public void adds(int index,int i){

    }
    
    public int get(int index){

    }

    public void set(int index,int i){

    }

    public int size(){

    }
    */
    //remove(int index)

}
