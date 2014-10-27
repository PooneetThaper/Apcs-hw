public int[] frontPiece(int[] nums) {
    if (nums.length >=  2) {
	return new int[] {nums[0], nums[1]};
    } else {
	return nums;
  }
}

public int sum13(int[] nums) {
    int s=0;
    for (int i=0; i<nums.length; i=i+1) {
	if (nums[i]==13) {
	    i=i+1;
	} else {
	    s+=nums[i];
	}
    }
    return s;
}
