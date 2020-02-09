public class Board {

    // create a board from an n-by-n array of tiles,
    // where tiles[row][col] = tile at (row, col)
    int[][] tiles;
    boolean[][] numbers;
    public Board(int[][] tiles) {

        this.tiles=tiles;
        int n=tiles.length;
        numbers=new int[n][n];
        if(tiles.length<2 || tiles.length >128) {
            System.out.println("size of tiles is invalid");
            return;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(tiles[i][j] < 0 ||tiles > MATH.square(n)-1) {
                    System.out.println("number out of range");
                    return;
                }
                else{
                    if(numbers[i][j]) {
                        System.out.println("duplicated number");
                        return;
                    }
                    else{
                        numbers[i][j]=true;
                    }
                }
            }
        }


    }

    // string representation of this board
    public String toString() {
        String s=" ";
        s=s+tiles.length.toString()+"\n";

        for(int i=0;i<n;i++) {

            String row = "";
            for (int j = 0; j < n; j++) {
                row = row + tiles[i][j] + " ";
            }
            s = s + row + "\n"
        }
        return s;
    }

    // board dimension n
    public int dimension(){
        return tiles.length;
    }

    // number of tiles out of place
    public int hamming(){
        int n=dimension();
        int distance=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {

                int correct=(i*n)+(j+1);
                if( row + tiles[i][j]!=correct)  distance++;
            }

        }
        return distance;
    }
    }

    // sum of Manhattan distances between tiles and goal
    public int manhattan(){
        int n=dimension();
        int distance=0;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                int correcti=(tiles[i][j]-1)/n;
                int correctj=(tiles[i][j]-1)%n;
                int h=MATH.abs(i-correcti)+MATH.abs(j-correctj);
                distance=distance+h;
            }

        }
        return distance;

    }

    // is this board the goal board?
    public boolean isGoal(){
          return hamming()==0;
    }

    // does this board equal y?
    public boolean equals(Object y){

         int[]][] ty=(int[][])y;
         return tiles.equals(y);

    }

    // all neighboring boards
    public Iterable<Board> neighbors(){
         Iterable<Board> boards=new Iterable<>();
         int x,y;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if(tiles[i][j]==0){
                    x=i;
                    y=j;
            }

        }



    }

    // a board that is obtained by exchanging any pair of tiles
    public Board twin(){}

    // unit testing (not graded)
    public static void main(String[] args) {

    }

}