import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; //Storing in a matrix that is 3x3
    	char[][] game = {{ ' ', ' ', ' '},{ ' ', ' ', ' '}, {' ', ' ', ' '}};
    	char cont, win = 'N';
    	String userInput;
    	int x;
    	int y;
    	int playerplace;
    	int count = 0;
    	int computerplace;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to Tic-Tac-Toe v.1 \n \n \n");
    	GameProcedures gameBoard = new GameProcedures();
    	
    	gameBoard.printBoard();
    	
    	
    	do
    	{
    		while(count != 9 && win !='Y')
    		{	
    		
    			
    			if(count % 2 == 0) //Players loop
    			{
    			    gameBoard.playerLoop();
    				count++;
    			}
    			else 						//Computers Loop
    			{
    				System.out.println("Computer is Thinking...");
    				System.out.println();
    				
    				gameBoard.computerLoop(count);
    				count ++;
    			}
                
                gameBoard.printBoard();
                win = gameBoard.winner(count); //Determines the winner and returns 'Y' or 'N'
    		}
    		
    	    do
    		{
    			System.out.println("Would you like to continue? \n");
    			userInput = input.nextLine();
    			userInput = userInput.toUpperCase();
    			cont = userInput.charAt(0);
    			if (cont != 'Y' & cont != 'N')
    			{
    				System.out.println("Invalid Entry \n");
    				System.out.println("Enter Y for yes or N for no \n");
    			}
    		}while(cont != 'Y' & cont != 'N');
    
            gameBoard.gameReset();
            if(cont =='Y'){
                gameBoard.printBoard();
            }
            count = 0;
    
    	}while(cont == 'Y');
    
    	System.out.println("Thank you for playing Tic-Tac-Toe v.1 \n ");
        
    }
}
