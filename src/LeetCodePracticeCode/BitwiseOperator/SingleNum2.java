package LeetCodePracticeCode.BitwiseOperator;

class SingleNum2{
  public int singleNumber(int[] nums) {
    // ~ represent Not Operator
        int ones = 0, twos = 0;
        for (int ele : nums) {
            ones = (ones ^ ele) & (~twos);
            twos = (twos ^ ele) & (~ones);
        }
        return ones;
    }
}
