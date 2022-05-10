import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {   
        //HARD DIFFICULTY
    	char cont, win = 'N';
    	String userInput;
    	int playerplace;
    	int count = 0;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Welcome to Tic-Tac-Toe v.1 \n \n \n");
    	GameProcedures gameBoard = new GameProcedures();
    		
    	do
    	{
    	    gameBoard.printBoard();
    	    //X goes when count = 0,2,4,6,8
    	    
    	    //O goes when count = 1,3,5,7
    		
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
    			System.out.println("Would you like to continue? (type Y or N) \n");
    			userInput = input.nextLine();
    			userInput = userInput.toUpperCase();
    			cont = userInput.charAt(0);
    			if (cont != 'Y' && cont != 'N')
    			{
    				System.out.println("Invalid Entry \n");
    				System.out.println("Enter Y for yes or N for no \n");
    			}
    		}while(cont != 'Y' && cont != 'N');
    
            gameBoard.gameReset();
            if(cont == 'Y' && win == 'N'){
                gameBoard.printBoard();
            }
            count = 0;
            win = 'N';
    
    	}while(cont == 'Y');
    
    	System.out.println("Thank you for playing Tic-Tac-Toe v.1 \n ");
        
    }
}
