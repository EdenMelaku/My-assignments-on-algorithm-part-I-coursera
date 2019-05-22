import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int x=0;
	private int[][] grid;
	private int len;
	private WeightedQuickUnionUF wq;
	private int numberOfOpenSites;
	   public Percolation(int n)                
	   // create n-by-n grid, with all sites blocked\
	   
	   {
           if(n <= 0) {
			   
			   throw new IllegalArgumentException("invalid size ");
			   
		   }
           System.out.println("length= "+n);
           
     wq=new WeightedQuickUnionUF(n*n); 
       
	   len=n;
	   numberOfOpenSites=0;
	   grid=new int[n][n];
	   for (int i = 1 ;i <= n; i++) {
		   for (int j = 1; j <= n; j++) {
			   grid[i][j]=0;
		   }
	   }
	   



       }
	   public void open(int row, int col)    
	   // open site (row, col) if it is not open already
	   {
		   validate(row,col);

		   if(  grid[row][col] == 1) {
			   return;
		   }
		   
		   grid[row][col]=1; 
		   numberOfOpenSites++;
		   
		   if (isValid(row-1,col) && grid[row-1][col] == 1) {
           wq.union(getReverseCoordinate(row-1,col), getReverseCoordinate(row,col));
		   }
		   

		   if (isValid(row+1,col) && grid[row+1][col] == 1) {
	           wq.union(getReverseCoordinate(row+1,col), getReverseCoordinate(row,col));
		   }
		   
           if(isValid(row,col-1)){
		   if ( grid[row][col-1] == 1) {
	           wq.union(getReverseCoordinate(row,col-1), getReverseCoordinate(row,col));
		   }
		   
           }
           if(isValid(row,col+1)){
		   if (grid[row][col+1] == 1) {
	           wq.union(getReverseCoordinate(row,col+1), getReverseCoordinate(row,col));
		   }
           }
	   }
	   public boolean isOpen(int row, int col) 
	    // is site (row, col) open?
	   {
		   validate(row,col);

		if ( grid[row][col] == 1) {
			return true;
		}   
		else {
			return false;
		}
	   }
	   public boolean isFull(int row, int col)  // is site (row, col) full?
	   {   
		   boolean v=false;
		   validate(row,col);
		   if (row==1) {
			   v= true;
		   }
		   for (int i = 1;i <= len;i++) {
			   if(wq.connected(getReverseCoordinate(0,i),getReverseCoordinate(row,col))) {
				   v=true;
				   return v;
			   }
		   }
		   return v;
	}
		   
	   
	   public int numberOfOpenSites()       // number of open sites
	   {
		  return numberOfOpenSites;


	   }
	   
	   
	   public boolean percolates()              // does the system percolate?
	  
	   {
		  boolean b=false;
		  for (int i = 1; i < len; i++) {
			  for (int j = 1; j < len; j++) {
				  if(wq.connected(getReverseCoordinate(0,i),getReverseCoordinate(len,j))){
					  b=true;
					  return b;
				  }
			  }  
		  }
		  return b;
	   }

	   public static void main(String[] args)   // test client (optional)
	   
	   {
		   
		   
	   }
	   

	   
	   private boolean isValid(int row, int col ) {
		   if(row<=0 ||row>len || col<=0|| col>len) {
			   
			   return false;
			   
		   }
		   else { return true;}
		 
	   }
	   
	   private void validate(int i, int j) {
		   if (!isValid(i,j)) {
			   throw new IllegalArgumentException("invalid row or column "+i+"  "+j);
		   }
		   
	   }
	 private int getReverseCoordinate(int r, int c) {
		 
		 return ((r*len)+c);
	 }
	}

