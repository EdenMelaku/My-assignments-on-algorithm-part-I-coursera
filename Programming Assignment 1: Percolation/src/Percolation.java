import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {
	
	public int[][] grid;
	   public Percolation(int n)                // create n-by-n grid, with all sites blocked\
	   
	   {
	   grid=new int[n][n];
	   for (int i=0;i<n;i++) {
		   for (int j=0;j<n;j++) {
			   grid[i][j]=0;
		   }
	   }


       }
	   public    void open(int row, int col)    // open site (row, col) if it is not open already
	   {
		   grid[row][col]=1; 
	   }
	   public boolean isOpen(int row, int col)  // is site (row, col) open?
	   {
		if ( grid[row][col]==1) {
			return true;
		}   
		else {
			return false;
		}
	   }
	   public boolean isFull(int row, int col)  // is site (row, col) full?
	   {
		   if (grid[row-1][col]==1) {
			   return true;
		   }
		   if (grid[row+1][col]==1) {
			   return true;
		   }
		   if (grid[row][col-1]==1) {
			   return true;
		   }
		   if (grid[row][col+1]==1) {
			   return true;
		   }
		   else {
			   return false;
		   }
		   
	   }
	   public     int numberOfOpenSites()       // number of open sites
	   {
		   
	   }
	   public boolean percolates()              // does the system percolate?
	   {
		   
	   }

	   public static void main(String[] args)   // test client (optional)
	   
	   {
		   
		   
	   }
	}

