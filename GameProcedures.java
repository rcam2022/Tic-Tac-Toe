import java.util.Scanner;

public class GameProcedures {
    private int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; //Storing in a matrix that is 3x3
	private char[][] game = {{ ' ', ' ', ' '},{ ' ', ' ', ' '}, {' ', ' ', ' '}};
	private int playerPlace;
	private int computerPlace;
	Scanner input = new Scanner(System.in);
    
    
    //ENTER COMPUTER INTELLIGENCE 
    //You will store the computer as O's in the game matrix
    public void computerLoop(int count){
         
    }
    
    public void playerLoop(){
        boolean flag = false;
        do
		{
			System.out.println("Player, where would you like to place your piece? \n");
			playerPlace = input.nextInt();
			
			for(int y = 0; y < 3; y++)	
			{
				for(int x = 0; x < 3; x++)
				{
					if(playerPlace == board [y][x])
					{	
						if(game [y][x] == 'X' | game [y][x] == 'O')
						{
							System.out.println("Invalid Entry.  Try Again.");
						}
						else
						{
							game[y][x] = 'X';
							flag = true;
						}
					}
			
				}

			}
			
			System.out.println();
            System.out.println();
			
		}while(flag == false);
		
    }
    
    //RESETS THE GAMEBOARD BACK TO A BLANK BOARD 
    public void gameReset(){
		for(int y = 0; y < 3; y++)														//Resetting the game matrix back to blanks
		{
			for(int x = 0; x < 3; x++)
			{
				game[y][x] = ' ';
			}
		}
    }
    
    //PRINTS THE GAMEBOARD AND THE KEY
    public void printBoard(){
        for(int y = 0; y < 3; y++)	//Prints the board 
		{
			System.out.println("    ");
			for(int x = 0; x < 3; x++)
			{
				System.out.print(board [y] [x]); 
				System.out.print("    |    ");
			}

            System.out.println();
		}
		System.out.println();
    	System.out.println();
    	
    	for(int y = 0; y < 3; y++)	//Prints the game board (Start)
    	{
    		System.out.println("    ");
    		for(int x = 0; x < 3; x++)
    		{
    			System.out.print(game [y] [x]); 
    			System.out.print("    |    ");
    		}
    
    	    System.out.println();
    	}		
    }
    
    //DETERMINES THE WINNER IS X or 0s
    //Input the code here to determine whether or not you or the computer has won
    public char winner(int count){
        if(count == 8){
            System.out.println("The game ends CAT");
        }
        return 'N';
    }
}
