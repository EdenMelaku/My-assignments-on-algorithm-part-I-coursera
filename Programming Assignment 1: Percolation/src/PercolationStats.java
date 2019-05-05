
public class PercolationStats {
   public PercolationStats(int n, int trials)  {
	   Public int trialsResult[];
	   
	   Percolation per =new Percolation(n);
	   
	   int lim=(n*n)-1;
	   for(int i=0;i<trials;i++) {
		   while (!per.percolates()) {
			   
			   per.open(Std.Random(0,lim),Std.Random(0,lim));
		   }
		   
		   int res=per.numberOfOpenSites()/ (lim+1);
		   
		   trialResult[i]=res;
		   
	   }
	   
	   
   }  // perform trials independent experiments on an n-by-n grid
   public double mean()  {
	   
	return 0.0;   
   }                        // sample mean of percolation threshold
   public double stddev()  {
	   
	   return 0.0; 
   }                      // sample standard deviation of percolation threshold
   public double confidenceLo() {
	   
	   return 0.0;
   }                  // low  endpoint of 95% confidence interval
   public double confidenceHi()      {
	   
	   return 0.0;
	   
	   
   }               // high endpoint of 95% confidence interval

   public static void main(String[] args) {
	   
	   
	   PercolationStats ps=new PercolationStats(20,10);
	   
	   for(int i=0;i<10;i++) {
	   
		   system.out.println(trialResult[i]);
	   
	   }
	   
   }       // test client (described below)
}