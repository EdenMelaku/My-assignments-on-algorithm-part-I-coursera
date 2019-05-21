import edu.princeton.cs.algs4.StdRandom;

public class PercolationStats {
	
   public static double trialsResult[];
   double mean;
   
   public PercolationStats(int n, int trials)throws IllegalArgumentException  {
	  
	   if (n<=0||trials<=0) {
		   throw new IllegalArgumentException();
	   }
	   else {
	   Percolation per =new Percolation(n);
	   
	   int lim=(n*n);
	   
	   for(int i=0;i<trials;i++) {
		   while (!per.percolates()) {
			   
			   per.open(StdRandom.uniform(1,lim+1),StdRandom.uniform(1,lim+1));
		   }
		   
		   int res=per.numberOfOpenSites()/ (lim);
		   
		   trialsResult[i]=res;
		   
	   }
	   
	   }
   }  // perform trials independent experiments on an n-by-n grid
   public double mean()  {
	double sum=0;
	for(int i=0;i<trialsResult.length;i++) {
		
		sum=sum+trialsResult[i];
	
	} 
	mean=sum/trialsResult.length;
	
	return mean;   
   }                        // sample mean of percolation threshold
   public double stddev()  {
	   
	   double sum=0;
		for(int i=0;i<trialsResult.length;i++) {
			double x=trialsResult[i]-mean;
			x=x*x;
			sum=sum+x;
		
		} 
		double standardDeviation=sum/trialsResult.length-1;
		
		return standardDeviation;
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
	   
		   System.out.println(trialsResult[i]);
	   
	   }
	   
   }       // test client (described below)
}