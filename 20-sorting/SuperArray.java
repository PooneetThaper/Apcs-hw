import java.util.Arrays;

public class SuperArray{
    private String[] data,copy;//should be object[]
    private int last;

    public SuperArray(){
	last=0;
	data=new String[1];
	for(int i=0; i<data.length;i++){
	    data[i]="";
	}
    }

    public void test(){
	String s="";
	for(int i=0; i<data.length;i++){
	    s=s+data[i];
	    s=s+", ";	 
	}
	System.out.println(s);
    }

    public boolean add(String s){
	if (last==0){
	    data[0]=s;
	    last++;
	    return true;
	}
	else if (last<data.length){
	    data[last]=s;
	    return true;
	}
	else{
	    String[] temp=new String[data.length+1];
	    for(int k=0;k<data.length;k++){
		temp[k]=data[k];
	    }
	    data=temp;
	    data[last]=s;
	    last++;
	    return true;
	}

    }

    public void isort() {
        for (int j = 1; j < data.length; j++) {
	    String N = data[j];
	    int i;
	    for (i=j; i>0 && N.compareTo(data[i-1]) < 0; i--) {
		data[i] = data[i-1];
	    }
	    data[i] = N;
        }
    }
    /*
      insertion sort
      loops to each value and checks if it belongs 
      anywhere before where it is
      5|2|8|6|4|9
      2|5|8|6|4|9
      2|5|6|8|4|9
      2|4|5|6|8|9
     */

    public void ssort(){
	for (int i=0;i<data.length; i++){
	    String min=data[i];
	    int index=i;
	    for (int j=i;j<data.length;j++){
		if (min.compareTo(data[j])>0){    
		min=data[j];
		index=j;
		}
	    }
	    data[index]=data[i];
	    data[i]=min;
	}
    }

    /*
      selection sort
      i=0
      look at the array from i to end
      find min
      swap min and element i
      i=i+1

      1|5|47|9|21|69|420|3
      1|5|47|9|21|69|420|3
      1|3|47|9|21|69|420|5
      1|3|5|9|21|69|420|47
      1|3|5|9|21|69|420|47
      1|3|5|9|21|69|420|47
      1|3|5|9|21|47|420|69
      1|3|5|9|21|47|69|420
     */

    public void bsort(){
	for (int i=0;i<data.length;i++){
	    for (int j=0;j<data.length-i-1;j++){
		if(data[j].compareTo(data[j+1])>0){
		    String temp=data[j];
		    data[j]=data[j+1];
		    data[j+1]=temp;
		}
	    }
	}
    }
    
    /*
      bubble sort
      starts off at one end
      switches a[i] and a[i+1] so that they are ordered
      keeps doing that
      effectively moves the max to the end
      then you can do that again and move the second max
      and so on

      5|3|4|8|9|1|2|6
      3|5|4|8|9|1|2|6
      3|4|5|8|9|1|2|6
      3|4|5|8|9|1|2|6
      3|4|5|8|9|1|2|6
      3|4|5|8|1|9|2|6
      3|4|5|8|1|2|9|6
      3|4|5|8|1|2|6|9

      and then loops again doing the same thing until it through all of it.
     */

    public int size(){
	int count=0;
	for(int i=0;i<data.length;i++){
	    if (!data[i].equals(""))
		count++;
	}
	return count;
    }

    public String get(int index){
	return data[index];
    }

    public String set(int index,String s){
	String old=data[index];
	data[index]=s;
	return old;
    }

    public String remove (int index){
	String old=data[index];
	String[] temp=new String[data.length-1];
	for(int k=0;k<index;k++){
	    temp[k]=data[k];
	}
	data=temp;
	for (int i=index+1;i<data.length;i++){
	    data[i-1]=data[i];
	}
	last--;
	return old;
    }

    public void backup(){
	copy=data;
    }

    public void retrieve(){
	data=copy;
	test();
    }

    public void in(){
	Arrays.sort(data);
	//if you want to sort only a portion, do Arrays.sort(data,0,n)
    }

    public static void main(String[] args){
	String [] words= {"apple","pickle","pear","banana","racoon","swiggety", "main", "angstrom", "computer", "java", "lian", "victor", "project", "lenovo", "mouse", "wire", "shirt", "facebook", "google", "light", "roof", "floor", "book", "closet", "clock", "flag", "shoe"};
	SuperArray a=new SuperArray(20);
    }
}
