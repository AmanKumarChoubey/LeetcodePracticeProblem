class Print1toNByRecursion{
  static void printTillN(int N){
    // Code here
    solver(1,N);
  }
  static void solver(int i,int n){
    // Base Condition
    if(i>n) return;
    System.out.print(i+" ");
    solver(i+1,n);
  }
}
