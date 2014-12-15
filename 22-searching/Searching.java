import java.util.Arrays;

public class Searching implements Comparable{

    public Comparable[] a;
    public int last;

    public Searching (int n){
	a= new Comparable [n];
	last=0;
    }

    public boolean add(Comparable item){
	if (last==0){
	    a[0]=item;
	    last++;
	    return true;
	}
	else if (last<a.length){
	    a[last]=item;
	    last++;
	    return true;
	}
	else{
	    Comparable[] temp=new Comparable[a.length+1];
	    for(int k=0;k<a.length;k++){
		temp[k]=a[k];
	    }
	    a=temp;
	    a[last]=item;
	    last++;
	    return true;
	}
    }

    public int compareTo (Object other){
	Comparable x= (Comparable)other;
	return this.compareTo(x);
    }

    public Comparable lsearch(Comparable item){
	for (int i=0;i<a.length;i++){
	    if (a[i]==item) return item;
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	int l=0;
	int h=a.length;
	int mid = (l+h)/2;

	if (item.compareTo(a[0])<0 || item.compareTo(a[h-1])>0) return null;
	
	while (l!=h){
	    if (item.compareTo(a[mid])==0) return item;
	    else if (item.compareTo(a[mid])>0){
		l=mid+1;
		mid =(l+h)/2;
	    }else{
		h=mid;
		mid =(l+h)/2;
	    }
	}
	return null;
    }

    public Comparable rbsearch(Comparable item){
	int l=0;
	int h=a.length;
	if (item.compareTo(a[0])<0 || item.compareTo(a[h-1])>0) return null;
	else{
	    return rbsearch(item,l,h);
	}
    }

    public Comparable rbsearch(Comparable item, int l, int h){
	int mid=(l+h)/2;
	if (l==h) return null;
	if (item.compareTo(a[mid])!=0){
	    if (item.compareTo(a[mid])>0){
		l=mid+1;
		return rbsearch(item,l,h);
	    }else{
		h=mid;
		return rbsearch(item,l,h);
	    }
	}else return item;
    }
	
    public static void main(String[] args){
	String[] toadds= {"avacado","triplet","pangea","octopus","frequency","atom","processor","diode","quadcore","python","pickle"};

	int[] toaddi= {2,1,4,5,6,3,7,9,8,0,12};
	    
	Searching s=new Searching(10);
	for (int i=0;i<10;i++){
	    s.add(toadds[i]);
	}
	
	Arrays.sort(s.a);
	System.out.println(Arrays.toString(s.a));

	for (int i=0;i<toadds.length;i++){
	    System.out.println(s.rbsearch(toadds[i]));
	}
    }
    
}


/*
  binary search has a speed of log(base 2) n
  lg n= log(base 2)n

  linear subtracts data that doesnt fit
  binear divides data, throws out more
 */
