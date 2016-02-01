import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TrivialPursuit 
{
	private static int userDesiredCategory;
	static ArrayList <Questions>actualArray = new ArrayList<Questions>();
	private static int shuffleQuestions;
	public static int playerPoints = 0;
	
	public static void chooseCategory()
	{
		System.out.println();
		System.out.println("Please select a category:");
		System.out.println("1) History");
		System.out.println("2) Geography");
		System.out.println("3) Entertainment");
		System.out.println("4) Arts and Literature");
		System.out.println("5) Science and Nature");
		System.out.println("6) Sports and Leisure");
		System.out.println();
		Scanner userInput = new Scanner (System.in);
		userDesiredCategory = userInput.nextInt();
		if (userDesiredCategory > 0 && userDesiredCategory <= 6)
		{
			switch (userDesiredCategory)
			{
				case 1:
				{
					actualArray = Cards.history;
					break;
				}
				case 2:
				{
					actualArray = Cards.geography;
					break;
				}
				case 3:
				{
					actualArray = Cards.entertainment;
					break;
				}
				case 4:
				{
					actualArray = Cards.artsAndLiterature;
					break;
				}
				case 5:
				{
					actualArray = Cards.scienceAndNature;
					break;
				}
				case 6:
				{
					actualArray = Cards.sportsAndLeisure;
					break;
				}
			}
		}
		else 
		{
			chooseCategory();
		}
	}
	public static void generateQuestion ()
	{
		System.out.println();
		Collections.shuffle(actualArray);
		System.out.println(actualArray.get(0).getQuestion());
		
	}
	public static void generateAnswers()
	{
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("1) " + actualArray.get(0).getAnswer1());
		System.out.println("2) " + actualArray.get(0).getAnswer2());
		System.out.println("3) " + actualArray.get(0).getAnswer3());
		System.out.println("4) " + actualArray.get(0).getAnswer4());
		System.out.println();
		Scanner userInput = new Scanner (System.in);
		String userAnswer = userInput.nextLine();
		
		if (userAnswer.equals("1") || userAnswer.equals("2") || userAnswer.equals("3") || userAnswer.equals("4"))
			{
			if(userAnswer.equals(actualArray.get(0).getCorrectAnswerNumber()))
			{
				System.out.println();
				System.out.println("You got it correct.");
				playerPoints++;
				if (userAnswer.equals(actualArray.get(0).getCorrectAnswerNumber()))
				{
					if(playerPoints == 1)
					{
						System.out.println("You have " + playerPoints + " point.");
					}
					else
					{
						System.out.println("You have " + playerPoints + " points.");
					}
				}
				else
				{
				
				}
			}
			else
			{
				System.out.println();
				System.out.println("You got it wrong.");	
			}
			actualArray.remove(0);
			}
		else
		{
			System.out.println("Please choose one of the options provided.");
			generateAnswers();
		}
	}
	public static void main(String[] args) 
	{
		Cards.history();
		Cards.geography();
		Cards.entertainment();
		Cards.artsAndLiterature();
		Cards.scienceAndNature();
		Cards.sportsAndLeisure();
	boolean flag = true;
	while (flag)
		if (playerPoints < 6)
		{
			chooseCategory();
			generateQuestion();
			generateAnswers();
		}
		else if (playerPoints == 6)
		{
		System.out.println("Congratulations, you win!");
		System.exit(0);
		}
	}
}
