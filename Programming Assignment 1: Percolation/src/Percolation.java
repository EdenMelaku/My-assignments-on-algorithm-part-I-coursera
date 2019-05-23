
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private boolean[][] grid;
	private final int len;
	private final WeightedQuickUnionUF wq;
	private final WeightedQuickUnionUF wq2;
	private final int bottom;
	private final int top;
	private int numberOfOpenSites;
	   public Percolation(int n)                
	   // create n-by-n grid, with all sites blocked\
	   
	   {
           if (n <= 0) {
			   
			   throw new IllegalArgumentException("invalid size ");
			   
		   }
           //StdOut.println("length= "+ n);
           
           wq = new WeightedQuickUnionUF(n*n+2); 
           wq2 = new WeightedQuickUnionUF(n*n+1); 
       
	   len = n;
	   numberOfOpenSites = 0;
	   grid = new boolean[n][n];
	   for (int i = 0; i < n; i++) {
		   for (int j = 0; j < n; j++) {
			   grid[i][j] = false;
		   }
	   }
	   
       top = n*n;
       bottom = n*n+1;


       }
	   public void open(int row, int col)    
	   // open site (row, col) if it is not open already
	   {
		   validate(row, col);

		   if (isOpen(row, col)) {
			   return;
		   }
		   int index = getReverseCoordinate(row, col);
		   grid[row-1][col-1] = true; 
		   numberOfOpenSites++;
		   
		   if (isValid(row, col) && row == 1) {
	           wq.union(top, index);
	           wq2.union(top, index);
	           
			   }
		   if (isValid(row, col) && row == len) {
	           wq.union(bottom, index);
			   }
		   
		   
		   
		   if (isValid(row-1, col) && isOpen(row-1, col)) {
	           wq.union(getReverseCoordinate(row-1, col), index);
	           wq2.union(getReverseCoordinate(row-1, col), index);
		   }
		   

		   if (isValid(row+1, col) && isOpen(row+1, col)) {
	           wq.union(getReverseCoordinate(row+1, col), index);
	           wq2.union(getReverseCoordinate(row+1, col), index);
		   }
		   
           if(isValid(row, col-1)){
		   if (isOpen(row, col-1)) {
	           wq.union(getReverseCoordinate(row, col-1), index);
	           wq2.union(getReverseCoordinate(row, col-1), index);
		   }
		   
           }
           if(isValid(row, col+1)){
		   if (isOpen(row, col+1)) {
	           wq.union(getReverseCoordinate(row, col+1), index);
	           wq2.union(getReverseCoordinate(row, col+1), index);
		   }
           }
	   }
	   public boolean isOpen(int row, int col) 
	    // is site (row, col) open?
	   {
		   validate(row, col);
          // StdOut.println("check "+(row-1)+"  "+(col-1));
           if (isValid(row, col)) {
		
			return grid[row-1][col-1];
		   
		
           }
           return false;
	   }
	   public boolean isFull(int row, int col)  // is site (row, col) full?
	   {   int index = getReverseCoordinate(row, col);

	   validate(row, col);
		return wq2.connected(top, index);
	}
		   
	   
	   public int numberOfOpenSites()       // number of open sites
	   {
		  return numberOfOpenSites;


	   }
	   
	   
	   public boolean percolates()              // does the system percolate?
	  
	   {
		 return wq.connected(top, bottom);
	   }

	   public static void main(String[] args)   // test client (optional)
	   
	   {
		   //StdOut.print();
		   
	   }
	   

	   
	   private boolean isValid(int row, int col) {
		   int srow = row-1;
		   int scol = col-1;
		   
		   if(srow >= 0 && srow < len && scol >= 0 && scol < len) {
			   
			   return true;
			   
		   }
		   else { return false;
		   }
		 
	   }
	   
	   private void validate(int i, int j) {
		   if (!isValid ( i,j )) {
			   throw new IllegalArgumentException("invalid row or column "+i+"  "+j);
		   }
		   
	   }
	 private int getReverseCoordinate(int r, int c) {
		 
		 return (((r-1) * len) + c-1);
	 }
	}

