import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdOut;

public class PercolationStats {
	
   private static double trialsResult[];
   private double mean;
   private final double param=1.96;
   
   public PercolationStats(int n, int trials){
	  
	   if (n <= 0 || trials <= 0) {
		   throw new IllegalArgumentException();
	   }
	   else {
		   StdOut.println("  running started ");
	   
	  
	   trialsResult=new double[trials];
	   for(int i = 0;i < trials;i++) {
		   Percolation per =new Percolation(n);
		   
		   int lim=(n*n);
		   StdOut.println("  trial "+(i+1));

		   while (!per.percolates()) {
			   int r=StdRandom.uniform(0,n+1);
			   int c=StdRandom.uniform(0,n+1);
			 //  System.out.println("openninggg "+ r+" ,"+c);
			   per.open(r,c);
		   }
		   int x=per.numberOfOpenSites();
		   double res;
		   res=(1.0*x)/(1.0*lim);
		   StdOut.println("number of open sites= "+per.numberOfOpenSites());
		   StdOut.println("lim = "+lim);
		   StdOut.println("result "+res);

		   trialsResult[i]=res;
		   
	   }
	   
	   }
   }  // perform trials independent experiments on an n-by-n grid
   public double mean()  {
		
	return StdStats.mean(trialsResult);
   }                        // sample mean of percolation threshold
   public double stddev()  {
		return StdStats.stddev(trialsResult) ;
   }                      // sample standard deviation of percolation threshold
   public double confidenceLo() {
	   double x=mean()-(param*stddev())/Math.sqrt(trialsResult.length);
	   return x;
   }                  // low  endpoint of 95% confidence interval
   public double confidenceHi()      {
	   double x=mean()-(param*stddev())/Math.sqrt(trialsResult.length);

	   return x;
	   
	   
   }               // high endpoint of 95% confidence interval

   public static void main(String[] args) {
	   
	   
	   PercolationStats ps=new PercolationStats(0,100);
	   
	   for(int i = 0; i < trialsResult.length; i++) {
	   
		   StdOut.println(trialsResult[i]);
	   
	   }
	   
	   StdOut.println("mean "+ ps.mean());
	   StdOut.println("standard deviation  "+ ps.stddev());
	   StdOut.println("confidence high "+ ps.confidenceHi());
	   StdOut.println("confidence low "+ ps.confidenceLo());
	   
	   
	   
	   
	   
	   

   }       // test client (described below)
}