import java.util.*;

public class Arraystuff{
    public int[] n=new int[10];

    public static void main(String[] args){
	int r1=(int)Math.ceil(Math.random()*10);
	int r2=(int)Math.ceil(Math.random()*10);
	Arraystuff a = new Arraystuff();
	System.out.println("Array:");
	System.out.println(a.toString());
	System.out.println("Mode:");
	System.out.println(a.mode(a.n));
	System.out.println("The location of "+Integer.toString(r1)+" in the Array is:");
	System.out.println(a.find(r1));
	System.out.println("The max value in the array is:");
	System.out.println(a.maxVal(a.n));
	System.out.println("The frequency  of "+Integer.toString(r2)+" in the Array is:");
	System.out.println(a.count(r2));
    }

    public Arraystuff(){	
	for(int i=0; i<n.length;i++){
	    n[i]=(int)Math.ceil(Math.random()*10);
	}
    }
    
    public String toString(){
	String s="";
	for(int i=0; i<n.length;i++){
	    s=s+n[i];
	    s=s+", ";
	}
	return s;
    }

    public int find(int c){
	for(int i=0;i<n.length;i++){
	    if (n[i]==c){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(int[] n){
	int max=n[0];
	for(int i=0;i<n.length;i++){
	    if (n[i]>max){
		max=n[i];
	    }
	}
	return max;
    }

    public int count(int c){
	int count=0;
	for(int i=0;i<n.length;i++){
	    if (n[i]==c){
		count=count+1;
	    }
	}
	return count;
    }

    //Coding Bat
    public int sum67(int[] nums) {
	int sum=0;
	int six=0;
	for(int i=0; i<nums.length; i++){
	    if (six==0){
		if (nums[i]==6){
		    six=1;
		}
		else{
		    sum=sum+nums[i];
		}
	    }
	    if (six==1){
		if (nums[i]==7){
		    six=0;
		}
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int one=0;
	int four=0;
	for(int i=0;i<nums.length;i++){
	    if (nums[i]==1) one=one+1;
	    if (nums[i]==4) four=four+1;
	}
	if (one>four) return true;
	else return false;
    }


    public int[] tenRun(int[] nums) {
	int active=0;
	int ten=0;
	for(int i=0;i<nums.length;i++){
	    if (nums[i]%10==0){ 
		ten=nums[i];
		active=1;
	    }
	    else{
		if (active==1){
		    if (nums[i]%10!=0) nums[i]=ten;
		}
	    }
	}
	return nums;
    }
    
    public boolean tripleUp(int[] nums) {
	for(int i=0;i<nums.length-2;i++){
	    if (nums[i]==nums[i+1]-1 && nums[i+1]==nums[i+2]-1) return true;
	}
	return false;
    }
    
    public boolean canBalance(int[] nums) {
	int Before = 0;
	int After = 0;
	for (int i = 0; i < nums.length; i++) {
	    After = After + nums[i];
	}
	for (int i = 0; i < nums.length; i++) {
	    if (Before == After) {
		return true;
	    } else {
		Before = Before + nums[i];
		After = After - nums[i];
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int k=n*(n+1)/2;
	int[] f=new int[k];
	int place=0;
	for (int i=0;i<n;i++){
	    for (int a=1;a<=i+1;a++){
		f[place]=a;
		place=place+1;
	    }
	}
	return f;
    }

    //doesnt work
    public int maxMirror(int[] nums) {
	int k=0;
	boolean active=false;
	for(int i=0;i<nums.length;i++){
	    for(int h=nums.length-1;h>0;h=h-1){
		if (active){
		    if (nums[h]==nums[i]){
			k=k+1;
		    }
		    else{
			return k;
		    }
		}
		if (nums[h]==nums[i]){
		    k=k+1;
		    active=true;
		    break;
		}
	    }
	}
	return k;
    }

    public int mode(int[] n){
	int[] f= new int[maxVal(n)+1];
	for(int i=0; i<n.length;i++){
	    f[n[i]]+=1;
	}
	return Arrays.asList(f).indexOf(maxVal(f));
    }
}
