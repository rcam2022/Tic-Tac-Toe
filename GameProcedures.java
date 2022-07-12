import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameProcedures 
{
    private int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }}; //Storing in a matrix that is 3x3
	private char[][] game = {{ ' ', ' ', ' '},{ ' ', ' ', ' '}, {' ', ' ', ' '}};
	private int playerPlace;
	private int computerPlace;
	Scanner input = new Scanner(System.in);
	private boolean value = false;
	private boolean value2 = false;
    
    //ENTER COMPUTER INTELLIGENCE 
    //You will store the computer as O's in the game matrix
    //HARD DIFFICULTY
    public void computerLoop(int count)
    {
        value = false;
        value2 = false;
        try 
        {
            TimeUnit.SECONDS.sleep(1);
        } 
        catch (InterruptedException ie) 
        {
            Thread.currentThread().interrupt();
        }
        //checks if first move
        if(count == 1)
        {
            if(game[0][0] == 'X' || game[0][2] == 'X' || game[2][0] == 'X' || game[2][2] == 'X')
            {
                game[1][1] = 'O';
            }
            else if(game[1][1] == 'X')
            {
                game[0][0] = 'O';
            }
            else
            {
                game[1][1] = 'O';
            }
        }
        //checks if second move
        else if(count == 3)
        {
            placeComputer();
        }
        //checks if third move
        else if(count == 5)
        {
            placeComputer();    
        }
        //checks if fourth move
        else if(count == 7)
        {
            placeComputer();
        }
    }
    //FINAL
    public void playerLoop()
    {
        boolean flag = false;
        do
		{
		    //X goes when count = 0, 2, 4, 8
		    
		    //O goes when count = 1, 3, 5, 7
			
			System.out.println("Player, where would you like to place your piece? \n");
			playerPlace = input.nextInt();
			for(int y = 0; y < 3; y++)	
			{
				for(int x = 0; x < 3; x++)
				{
					if(playerPlace == board [y][x])
					{	
						if(game [y][x] == 'X' || game [y][x] == 'O')
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
    //FINAL
    //RESETS THE GAMEBOARD BACK TO A BLANK BOARD 
    public void gameReset()
    {
        value = false;
        value2 = false;
		for(int y = 0; y < 3; y++)														//Resetting the game matrix back to blanks
		{
			for(int x = 0; x < 3; x++)
			{
				game[y][x] = ' ';
			}
		}
    }
    //FINAL
    //PRINTS THE GAMEBOARD AND THE KEY
    public void printBoard()
    {
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
    //FINAL
    public void placeComputer()
    {   
        if(game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == ' ' )
        {
            game[0][2] = 'O';
            value = true;
        }
        else if(game[0][0] == 'O' && game[0][2] == 'O' && game [0][1] == ' ')
        {
            game[0][1] = 'O';
            value = true;
        }
        else if(game[0][0] == ' ' && game[0][1] == 'O' && game[0][2] == 'O')
        {
            game[0][0] = 'O';
            value = true;
        }
        else if(game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == ' ' )
        {
            game[1][2] = 'O';
            value = true;
        }
        else if(game[1][0] == 'O' && game[1][2] == 'O' && game [1][1] == ' ')
        {
            game[1][1] = 'O';
            value = true;
        }
        else if(game[1][0] == ' ' && game[1][1] == 'O' && game[1][2] == 'O')
        {
            game[1][0] = 'O';
            value = true;
        }
        else if(game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == ' ' )
        {
            game[2][2] = 'O';
            value = true;
        }
        else if(game[2][0] == 'O' && game[2][2] == 'O' && game [2][1] == ' ')
        {
            game[2][1] = 'O';
            value = true;
        }
        else if(game[2][0] == ' ' && game[2][1] == 'O' && game[2][2] == 'O')
        {
            game[2][0] = 'O';
            value = true;
        }
        //checks vertical
        else if(game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == ' ')
        {
            game[2][0] = 'O';
            value = true; 
        }
        else if(game[0][0] == 'O' && game[1][0] == ' ' && game[2][0] == 'O')
        {
            game[1][0] = 'O';
            value = true; 
        }
        else if(game[0][0] == ' ' && game[1][0] == 'O' && game[2][0] == 'O')
        {
            game[0][0] = 'O';
            value = true; 
        }
        else if(game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == ' ')
        {
            game[2][1] = 'O';
            value = true; 
        }
        else if(game[0][1] == 'O' && game[1][1] == ' ' && game[2][1] == 'O')
        {
            game[1][1] = 'O';
            value = true; 
        }
        else if(game[0][1] == ' ' && game[1][1] == 'O' && game[2][1] == 'O')
        {
            game[0][1] = 'O';
            value = true; 
        }
        else if(game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == ' ')
        {
            game[2][2] = 'O';
            value = true; 
        }
        else if(game[0][2] == 'O' && game[1][2] == ' ' && game[2][2] == 'O')
        {
            game[1][2] = 'O';
            value = true; 
        }
        else if(game[0][2] == ' ' && game[1][2] == 'O' && game[2][2] == 'O')
        {
            game[0][2] = 'O';
            value = true; 
        }
        //checks diagonals
        else if(game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == ' ')
        {
            game[2][2] = 'O';
            value = true;
        }
        else if(game[0][0] == 'O' && game[1][1] == ' ' && game[2][2] == 'O')
        {
            game[1][1] = 'O';
            value = true;
        }
        else if(game[0][0] == ' ' && game[1][1] == 'O' && game[2][2] == 'O')
        {
            game[0][0] = 'O';
            value = true;
        }
        else if(game[2][0] == 'O' && game[1][1] == 'O' && game[0][2] == ' ')
        {
            game[0][2] = 'O';
            value = true;
        }
        else if(game[2][0] == 'O' && game[1][1] == ' ' && game[0][2] == 'O')
        {
            game[1][1] = 'O';
            value = true;
        }
        else if(game[2][0] == ' ' && game[1][1] == 'O' && game[0][2] == 'O')
        {
            System.out.println("Run Count 5");
            game[2][0] = 'O';
            value = true;
        }
        
        blockPlayer();
    }
    //FINAL
    public void blockPlayer()
    {
        if(value == false)
        {
            if(game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == ' ')
            {
                game[0][2] = 'O';
                value2 = true;
            }
            else if(game[0][0] == 'X' && game[0][2] == 'X' && game[0][1] == ' ')
            {
                game[0][1] = 'O';
                value2 = true;
            }
            else if(game[0][0] == ' ' && game[0][1] == 'X' && game[0][2] == 'X')
            {
                game[0][0] = 'O';
                value2 = true;
            }
            else if(game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == ' ')
            {
                game[2][0] = 'O';
                value2 = true;
            }
            else if(game[0][0] == 'X' && game[1][0] == ' ' && game[2][0] == 'X')
            {
                game[1][0] = 'O';
                value2 = true;
            }
            else if(game[0][0] == ' ' && game[1][0] == 'X' && game[2][0] == 'X')
            {
                game[0][0] = 'O';
                value2 = true;
            }
            else if(game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
                value2 = true;
            }
            else if(game[0][0] == 'X' && game[1][1] == ' ' && game[2][2] == 'X')
            {
                game[1][1] = 'O';
                value2 = true;
            }
            else if(game[0][0] == ' ' && game[1][1] == 'X' && game[2][2] == 'X')
            {
                game[0][0] = 'O';
                value2 = true;
            }
            else if(game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == ' ')
            {
                game[2][1] = 'O';
                value2 = true;
            }
            else if(game[0][1] == 'X' && game[1][1] == ' ' && game[2][1] == 'X')
            {
                game[1][1] = 'O';
                value2 = true;
            }
            else if(game[0][1] == ' ' && game[1][1] == 'X' && game[2][1] == 'X')
            {
                game[0][1] = 'O';
                value2 = true;
            }
            else if(game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
                value2 = true;
            }
            else if(game[0][2] == 'X' && game[1][2] == ' ' && game[2][2] == 'X')
            {
                game[1][2] = 'O';
                value2 = true;
            }
            else if(game[0][2] == ' ' && game[1][2] == 'X' && game[2][2] == 'X')
            {
                game[0][2] = 'O';
                value2 = true;
            }
            else if(game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == ' ')
            {
                game[2][0] = 'O';
                value2 = true;
            }
            else if(game[0][2] == 'X' && game[1][1] == ' ' && game[2][0] == 'X')
            {
                game[1][1] = 'O';
                value2 = true;
            }
            else if(game[0][2] == ' ' && game[1][1] == 'X' && game[2][0] == 'X')
            {
                game[0][2] = 'O';
                value2 = true;
            }
            else if(game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == ' ')
            {
                game[1][2] = 'O';
                value2 = true;
            }
            else if(game[1][0] == 'X' && game[1][1] == ' ' && game[1][2] == 'X')
            {
                game[1][1] = 'O';
                value2 = true;
            }
            else if(game[1][0] == ' ' && game[1][1] == 'X' && game[1][2] == 'X')
            {
                game[1][0] = 'O';
                value2 = true;
            }
            else if(game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
                value2 = true;
            }
            else if(game[2][0] == 'X' && game[2][1] == ' ' && game[2][2] == 'X')
            {
                game[2][1] = 'O';
                value2 = true;
            }
            else if(game[2][0] == ' ' && game[2][1] == 'X'&& game[2][2] == 'X')
            {
                game[2][0] = 'O';
                value2 = true;
            }
        }
        openSpace();
    }
    //FINAL
    public void openSpace()
    {
        if(value2 == false && value == false)
        {
            //count == 3 unfixed areas now fixed
            if(game[0][0] == ' ' && game[0][1] == ' ' && game[0][2] == 'X' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == 'X' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == ' ')
            {
                game[0][1] = 'O';
            }
            //topLeft
            else if(game[0][0] == 'X' && game[0][1] == ' ' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == 'X' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
            }
            else if(game[0][0] == 'X' && game[0][1] == ' ' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == 'X' && game[2][1] == ' ' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
            }
            //topRight
            else if(game[0][0] == ' ' && game[0][1] == ' ' && game[0][2] == 'X' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == 'X' && game[2][2] == ' ')
            {
                game[2][0] = 'O';
            }
            else if(game[0][0] == ' ' && game[0][1] == ' ' && game[0][2] == 'X' && game[1][0] == 'X' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == ' ')
            {
                game[2][0] = 'O';
            }
            //botRight
            else if(game[0][0] == ' ' && game[0][1] == 'X' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == 'X')
            {
                game[0][0] = 'O';
            }
            else if(game[0][0] == ' ' && game[0][1] == ' ' && game[0][2] == ' ' && game[1][0] == 'X' && game[1][1] == 'O' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == 'X')
            {
                game[0][0] = 'O';
            }
            //botLeft
            else if(game[0][0] == ' ' && game[0][1] == 'X' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == 'X' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == ' ')
            {
                game[0][2] = 'O';
            }
            else if(game[0][0] == ' ' && game[0][1] == ' ' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'O' && game [2][0] == 'X' && game[1][2] == 'X' && game[2][1] == ' ' && game[2][2] == ' ')
            {
                game[0][2] = 'O';
            }
            //center = 'X'
            else if(game[0][0] == 'O' && game[0][1] == ' ' && game[0][2] == ' ' && game[1][0] == ' ' && game[1][1] == 'X' && game [2][0] == ' ' && game[1][2] == ' ' && game[2][1] == ' ' && game[2][2] == 'X')
            {
                game[0][2] = 'O';
            }
            //two adjacent noncorners = 'O'
            else if(game[2][1] == 'X' && game[1][2] == 'X' && game[2][2] == ' ')
            {
                game[2][2] = 'O';
            }
            else if(game[0][1] == 'X' && game[1][2] == 'X' && game[0][2] == ' ')
            {
                game[0][2] = 'O';
            }
            else if(game[2][1] == 'X' && game[1][0] == 'X' && game[2][0] == ' ')
            {
                game[2][0] = 'O';
            }
            //all others after count == 3
            else if(game[0][0] == ' ')
            {
                game[0][0] = 'O';
            }
            else if(game[0][1] == ' ')
            {
                game[0][1] = 'O';
            }
            else if(game[0][2] == ' ')
            {
                game[0][2] = 'O';
            }
            else if(game[1][0] == ' ')
            {
                game[1][0] = 'O';
            }
            else if(game[1][1] == ' ')
            {
                game[1][1] = 'O';
            }
            else if(game[1][2] == ' ')
            {
                game[1][2] = 'O';
            }
            else if(game[2][0] == ' ')
            {
                game[2][0] = 'O';
            }
            else if(game[2][1] == ' ')
            {
                game[2][1] = 'O';
            }
            else if(game[2][2] == ' ')
            {
                game[2][2] = 'O';
            }
        }
    }
    
    //DETERMINES THE WINNER IS X or 0s
    //Input the code here to determine whether or not you or the computer has won
    //FINAL
    public char winner(int count){
        if(game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        else if(game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X')
        {
            System.out.println("You win!");
            return 'Y';
        }
        // if computer wins
        else if(game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        else if(game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O')
        {
            System.out.println("You lose!");
            return 'Y';
        }
        //CAT
        else if(count == 9)
        {
            System.out.println("The game ends CAT");
        }
        return 'N';
    }
}







//UNUSED CODE
        /*center = game[1][1];
	    topLeft = game[0][0];
	    midLeft = game[1][0];
	    botLeft = game[2][0];
	    botMid = game[2][1];
	    botRight = game[2][2];
	    midRight = game[1][2];
	    topRight = game[0][2];
    	topMid = game[0][1];*/
    	            //if first opponent move was not center FINAL
            /*if(center == 'O')
            {
                //checks for if in two corners FINAL
                if(topLeft == 'X' && topRight == 'X')
                {
                    topMid = 'O';
                }
                else if(topLeft == 'X' && botLeft == 'X')
                {
                    midLeft = 'O';
                }
                else if(botRight == 'X' && botLeft == 'X')
                {
                    botMid = 'O';
                }
                else if(topRight == 'X' && botRight == 'X')
                {
                    midRight = 'O';
                }
                else if(topRight == 'X' && botLeft == 'X' || topLeft == 'X' && botRight == 'X')
                {
                    topMid = 'O';
                }
                //checks for if corner and adjacent noncorner FINAL
                else if(topRight == 'X' && topMid == 'X' || midLeft == 'X' && botLeft == 'X')
                {
                    topLeft = 'O';
                }
                else if(topLeft == 'X' && topMid == 'X' || botRight == 'X' && midRight == 'X')
                {
                    topRight = 'O';
                }
                else if(topRight == 'X' && midRight == 'X' || botLeft == 'X' && botMid == 'X')
                {
                    botRight = 'O';
                }
                //checks for if corner and nonadjacent noncorner FINAL
                else if(topLeft == 'X')
                {
                    if(botMid == 'X')
                    {
                        midLeft = 'O';
                    }
                    else
                    {
                        botMid = 'O';
                    }
                }
                else if(topRight == 'X')
                {
                    if(botMid == 'X')
                    {
                        midRight = 'O';
                    }
                    else
                    {
                        topMid = 'O';
                    }
                }
                else if(botLeft == 'X')
                {
                    if(topMid == 'X')
                    {
                        midLeft = 'O';
                    }
                    else
                    {
                        botMid = 'O';
                    }
                }
                else if(botRight == 'X')
                {
                    if(topMid == 'X')
                    {
                        midRight = 'O';
                    }
                    else
                    {
                        botLeft = 'O';
                    }
                }
                // checks if in opposite noncorners
                else if(topMid == 'X' && botMid == 'X')
                {
                    topRight = 'O';
                }
                else if(midRight == 'X' && midLeft == 'X')
                {
                    botLeft = 'O';
                }
                else if(botMid == 'X' && midRight == 'X' || midRight == 'X' && topMid == 'X' || topMid == 'X' && midLeft == 'X' || midLeft == 'X' && botMid == 'X')
                {
                    if(botMid == 'X' && midRight == 'X')
                    {
                        botRight = 'O';
                    }
                    else if(botMid == 'X' && midLeft == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(topMid == 'X' && midRight == 'X')
                    {
                        topRight = 'O';
                    }
                    else if(topMid == 'X' && midLeft == 'X')
                    {
                       topLeft = 'O';
                    }
                }
            }
            //checks for if first move was center FINAL
            else if(center == 'X')
            {
                if(botMid == 'X')
                {
                    topMid = 'O';
                }
                else if(midRight == 'X')
                {
                    midLeft = 'O';
                }
                else if(topRight == 'X')
                {
                    botLeft = 'O';
                }
                else if(topMid == 'X')
                {
                    botMid = 'O';
                }
                else if(topLeft == 'X')
                {
                    botRight = 'O';
                }
                else if(midLeft == 'X')
                {
                    midRight = 'O';
                }
                else if(botLeft == 'X')
                {
                    topRight = 'O';
                }
                else if(botRight == 'X')
                {
                    topRight = 'O';
                }
            }*/
                    //turn 5
        /*else if(count == 5)
        {
            if(center == 'X')
            {
                if(topMid == 'X')
                {
                    if(topRight == 'X')
                    {
                       if(botLeft != 'O')
                       {
                           botLeft = 'O';
                       }
                       else
                       {
                           midLeft = 'O';
                       }
                    }
                    else if(midRight == 'X')
                    {
                        if(midLeft != 'O')
                        {
                            midLeft = 'O';
                        }
                        else
                        {
                            botLeft = 'O';
                        }
                    }
                    else if(botRight == 'X')
                    {
                        if(topRight != 'O')
                        {
                            botLeft = 'O';
                        }
                        else
                        {
                            botMid = 'O';
                        }
                    }
                    else if(botLeft == 'X')
                    {
                        if(topRight != 'O')
                        {
                            topRight = 'O';
                        }
                        else
                        {
                            botMid = 'O';
                        }
                    }
                    else if(midLeft == 'X')
                    {
                        if(midRight != 'O')
                        {
                            midRight = 'O';
                        }
                        else
                        {
                            botMid = 'O';
                        }
                    }
                }//here
                else if(topRight == 'X')
                {
                    if(midLeft == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(topMid == 'X' || midRight == 'X' || botRight == 'X' || botMid == 'X')
                    {
                        midLeft = 'O';
                    } 
                }
                else if(midRight == 'X')
                {
                    if(topMid == 'X' || topRight == 'X' || botMid == 'X' || botRight == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        topRight = 'O';
                    }
                }
                else if(botRight == 'X')
                {
                    if(midLeft == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(topMid == 'X' || topRight == 'X' || midRight == 'X' || botMid == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(botMid == 'X')
                {
                    if(midLeft == 'X' || botLeft == 'X' || botRight == 'X' || midRight == 'X')
                    {
                        topRight = 'O';
                    }
                    else if(topRight == 'X')
                    {
                        botLeft = 'O';
                    }
                }
                else if(botLeft == 'X')
                {
                    if(topMid == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(midLeft == 'X' || botMid == 'X' || botRight == 'X' || midRight == 'X')
                    {
                        topMid = 'O';
                    }
                }
                else if(midLeft == 'X')
                {
                    if(topMid == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(topRight == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botRight == 'X')
                    {
                        topRight = 'O';
                    }
                    else if(botMid == 'X')
                    {
                        topMid = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        topRight = 'O';
                    }
                }
            }
            else if(topMid == 'X')
            {
                if(center == 'X')
                {
                    if(topLeft == 'X')
                    {
                        botRight = 'O';
                    }
                    else if(midLeft == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        botRight = 'O';
                    }
                    else if(botRight == 'X')
                    {
                        topLeft = 'O';
                    }
                    else if(midRight == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(midRight == 'X')
                {
                    if(botRight == 'X' || botMid == 'X' || topLeft == 'X' || midLeft == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(botRight == 'X')
                {
                    if(botLeft == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(topLeft == 'X' || midLeft == 'X' || botMid == 'X' || midRight == 'X')
                    {
                        botLeft = 'O';
                    }
                }
                else if(botMid == 'X')
                {
                    if(botLeft == 'X')
                    {
                        botRight = 'O';
                    }
                    else if(topLeft == 'X' || midLeft == 'X' || midRight == 'X' || botRight == 'X')
                    {
                        botLeft = 'O';
                    }
                }
                else if(botLeft == 'X')
                {
                    if(topLeft == 'X')
                    {
                        midLeft = 'O';
                    }
                    else if(midLeft == 'X')
                    {
                        topLeft = 'O';
                    }
                    else if(center == 'X')
                    {
                        botRight = 'O';
                    }
                    else if(midRight == 'X')
                    {
                        center = 'O';
                    }
                    else if(botRight == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(midLeft == 'X')
                {
                    if(topLeft == 'X' || center == 'X' || botLeft == 'X' || botMid == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(midRight == 'X')
                    {
                        center = 'O';
                    }
                }
                else if(topLeft == 'X')
                {
                    if(midLeft == 'X' || center == 'X' || botLeft == 'X' || botMid == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(midRight == 'X')
                    {
                        midLeft = 'O';
                    }
                }
            }
            else if(topRight == 'X')
            {
                if(midRight == 'X')
                {
                    if(topLeft == 'X')
                    {
                        topMid = 'O';
                    }
                    else if(topMid == 'X' || midLeft == 'X' || botLeft == 'X' || botMid == 'X')
                    {
                        topLeft = 'O';
                    }
                }
                else if(botRight == 'X')
                {
                    if(midLeft == 'X')
                    {
                        topMid = 'O';
                    }
                    else if(topMid == 'X' || topLeft == 'X' || botLeft == 'X' || botMid == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(botMid == 'X')
                {
                    if(botLeft == 'X' || midLeft == 'X' || topMid == 'X' || midRight == 'X')
                    {
                        topLeft = 'O';
                    }
                    else if(topLeft == 'X')
                    {
                        topMid = 'O';
                    }
                }
                else if(botLeft  == 'X')
                {
                    if(topLeft == 'X' || midLeft == 'X' || midRight == 'X' || botRight == 'X')
                    {
                        topMid = 'O';
                    }
                    else if(topMid == 'X')
                    {
                        topLeft = 'O';
                    }
                }
                else if(midLeft == 'X')
                {
                    if(botRight == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(topMid == 'X' || midRight == 'X' || botMid == 'X' || botLeft == 'X')
                    {
                        botRight = 'O';
                    }
                }
                else if(topLeft == 'X')
                {
                    if(midLeft == 'X' || botLeft == 'X' || botRight == 'X' || midRight == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(botMid == 'X')
                    {
                        midLeft = 'O';
                    }
                }
                else if(topMid == 'X')
                {
                    if(botRight == 'X')
                    {
                        midRight = 'O';
                    }
                    else if(midLeft == 'X' || botLeft == 'X' || midRight == 'X' || botMid == 'X')
                    {
                        botRight = 'O';
                    }
                }
            }
            else if(midRight == 'X')
            {
                if(center == 'X')
                {
                    if(topRight == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(topMid == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(topLeft == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        topRight = 'O';
                    }
                    else if(botMid == 'X')
                    {
                        topMid = 'O';
                    }
                }
                else if(botMid == 'X')
                {
                    if(topLeft == 'X')
                    {
                        midLeft = 'O';
                    }
                    else if(botLeft == 'X' || midLeft == 'X' || topMid == 'X' || topRight == 'X')
                    {
                        topLeft = 'O';
                    }
                }
                else if(botLeft == 'X')
                {
                    if(topLeft == 'X')
                    {
                        midLeft = 'O';
                    }
                    else if(botMid == 'X' || midLeft == 'X' || topMid == 'X' || topRight == 'X')
                    {
                        topLeft = 'O';
                    }
                }
                else if(midLeft == 'X')
                {
                    if(topLeft == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botLeft == 'X' || midLeft == 'X' || topMid == 'X' || topRight == 'X')
                    {
                        topLeft = 'O';
                    }
                }
                else if(topLeft == 'X')
                {
                    if(topMid == 'X')
                    {
                        topRight = 'O';
                    }
                    else if(topRight == 'X')
                    {
                        topMid = 'O';
                    }
                    else if(center == 'X')
                    {
                        botLeft = 'O';
                    }
                    else if(botMid == 'X')
                    {
                        center = 'O';
                    }
                    else if(botLeft == 'X')
                    {
                        topMid = 'O';
                    }
                }
                else if(topMid == 'X')
                {
                    if(topRight == 'X' || topLeft == 'X' || midLeft == 'X' || center == 'X')
                    {
                        botMid = 'O';
                    }
                    else if(botMid == 'X')
                    {
                        center = 'O';
                    }
                }
                else if(topRight == 'X')
                {
                    if(botMid == 'X')
                    {
                        topLeft = 'O';
                    }
                    else if(topLeft == 'X' || topMid == 'X' || center == 'X' || midLeft == 'X')
                    {
                        botMid = 'O';
                    }
                }
            }
        }
        else if(count == 7)
        {
        }
        */
        //FINAL
       /* game[1][1] = center;
	    game[0][0] = topLeft;
	    game[1][0] = midLeft;
	    game[2][0] = botLeft;
	    game[2][1] = botMid;
	    game[2][2] = botRight;
	    game[1][2] = midRight;
	    game[0][2] = topRight;
    	game[0][1] = topMid;*/
		
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
