public class Sarray{
    private int[] data;//should be object[]
    private int last;

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

    public boolean add(int i){
	if (last<data.length){
	    if (data[last]==0){
		data[last]=i;
		last++;
		return true;
	    }
	    else{
		last++;
		return add(i);
		
	    }
	}
	else{
	    int[] temp=new int[data.length+1];
	    for(int k=0;k<data.length;k++){
		temp[k]=data[k];
	    }
	    temp[data.length]=i;
	    data=temp;
	    last=data.length+1;
	    return true;
	}
    }
    
    public void add(int index,int i){
	//assuming index<data.length 
	if (last<data.length && index<=last){
	    for(int k=last;k>index;k--){
		data[k]=data[k-1];
	    }
	    data[index]=i;
	    last++;	
	}
	else if (last<data.length && (index>last && index<data.length)){
	    if (data[data.length-1]==0){
		for(int k=last;k>index;k--){
		    data[k]=data[k-1];
		}
		data[index]=i;
	    }
	    else{
		int[] temp=new int[data.length+1];
		for(int k=0;k<index;k++){
		    temp[k]=data[k];
		}
		for(int k=index;k<data.length;k++){
		    temp[k+1]=data[k];
		}
		temp[index]=i;
		data=temp;
	    }
	    //leaves a gap of zeros for position p
	    //last< p <index
	}
	else{
	    int[] temp=new int[data.length+1];
	    for(int k=0;k<index;k++){
		temp[k]=data[k];
	    }
	    for(int k=index;k<data.length;k++){
		temp[k+1]=data[k];
	    }
	    temp[index]=i;
	    data=temp;
	    last++;
	}
    }

    public int size(){
	int count=0;
	for(int i=0;i<data.length;i++){
	    if (data[i]!=0)
		count++;
	}
	return count;
    }
 
    public int get(int index){
	return data[index];
    }

    public int set(int index,int i){
	int old=data[index];
	data[index]=i;
	return old;
    }

    public int remove (int index){
	int old=data[index];
	data[index]=0;
	return old;
    }
    
    public static void main(String[] args){
	Sarray a=new Sarray();
	a.test();
	a.add(5);
	a.add(3);
	a.add(2);
	a.test();
	System.out.println("The array has "+a.size()+" items in it");
	a.add(2,6);
	a.test();
	a.add(7,4);
	a.test();
	a.add(7);
	a.test();
	System.out.println("The array has "+a.size()+" items in it");
	a.add(9);
	a.test();
	a.add(6,8);
	a.test();
	a.add(1);
	a.test();
	System.out.println("The array has "+a.size()+" items in it");
	a.add(7,10);
	a.test();
	a.add(8,11);
	a.test();
	a.add(12);
	a.test();
	System.out.println("The array has "+a.size()+" items in it");
	System.out.println("The value at index 6 is "+a.get(6));
	System.out.println("The value at index 7 will be changed to 42 from its current value "+a.set(7,42));
	a.test();
	System.out.println("The value at index 2 (currently equal to "+a.remove(2)+") will be deleted");
	a.test();
    }
}
