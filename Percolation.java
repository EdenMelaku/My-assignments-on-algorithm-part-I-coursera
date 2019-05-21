import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int x=0;
	private int[][] grid;
	private int len;
	   public Percolation(int n)                
	   // create n-by-n grid, with all sites blocked\
	   
	   {
        
		   len=n;
	   grid=new int[n][n];
	   for (int i=0;i<n;i++) {
		   for (int j=0;j<n;j++) {
			   grid[i][j]=0;
		   }
	   }



       }
	   public    void open(int row, int col)    
	   // open site (row, col) if it is not open already
	   {
		   grid[row][col]=1; 
	   }
	   public boolean isOpen(int row, int col) 
	    // is site (row, col) open?
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
		   try {
		   if (grid[row-1][col]==1) {
			   //return true;
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
		   catch(IllegalArgumentException x) {
			   System.out.println(x);
			   return false;
		   }
		   
	   }
	   public     int numberOfOpenSites()       // number of open sites
	   {
		   int n=0;
		   for (int i=0;i<n;i++) {
			   for (int j=0;j<n;j++) {
				   if(isOpen(i,j)) {
					   n++;
				   }
			   }
		   }
		   return n;


	   }
	   public boolean percolates()              // does the system percolate?
	   {
		  int routes=0;
		   
		   for(int i=1;i<=len;i++) {
			  
			  System.out.println("finding route for grid   "+i);
			   
			   int r=0;
			   int c=i;
			   
			   
			   
			   if (!isOpen(r,c)) {
				   System.out.println("this grid is not open no route for grid  0,"+c);
					  

			   } 
			   if (isFull(r,c)){
				   System.out.println(" this grid is not full no route for grid  0,"+c);
					  

			   } 
			   else {
				   CheckConn(r,c,len);
				   if(x==1) {
					   System.out.println(" the grid   0,"+c+"  percolates");

					   routes++;
				   }
				   else {
					   System.out.println(" the grid  0,"+c+"  does  NOT percolate");

					
				   }
		   
		   }
		   
		   }
		   if (routes>0) {
		   
		   return true;
	   }
		   else {
			   return false;
		   }
	   }

	   public static void main(String[] args)   // test client (optional)
	   
	   {
		   
		   
	   }
	   
	   private boolean CheckConn(int r, int c,int n) {
		   
		  if(!isFull(r,c) || r>n ||c>n) {
			  return false;
		  } 
		  else if(isOpen(r,c) && r==n) {
			   x=1;
			  return true;
		  }
		  else {
			  
			 if (CheckConn(r+1,c,n) || CheckConn(r,c-1,n)|| CheckConn(r,c+1,n)) {
				 return true;
			 }
			 else {
				 return false;
				 }
			  
			  
		  }
	   }
	}

