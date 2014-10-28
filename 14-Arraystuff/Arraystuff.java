import java.util.*;

public class Arraystuff{
    int[] n=new int[10];

    public Arraystuff(){	
	for(int i=0; i<n.length;i++){
	    n[i]=i;
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

    public int maxVal(){
	int max=0;
	for(int i=0;i<n.length;i++){
	    if (n[i]>max){
		max=n[i];
	    }
	}
	return max;
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

    
}
