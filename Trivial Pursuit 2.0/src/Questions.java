// github is so confusing
public class Questions 
{
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private String correctAnswerNumber;
	
	public Questions (String q, String a, String b, String c, String d, String e)
	{
		question = q;
		answer1 = a;
		answer2 = b;
		answer3 = c;
		answer4 = d;
		correctAnswerNumber = e;
	}

	public String getQuestion() 
	{
		return question;
	}

	public void setQuestion(String question) 
	{
		this.question = question;
	}

	public String getAnswer1() 
	{
		return answer1;
	}

	public void setAnswer1(String answer1) 
	{
		this.answer1 = answer1;
	}

	public String getAnswer2() 
	{
		return answer2;
	}

	public void setAnswer2(String answer2) 
	{
		this.answer2 = answer2;
	}

	public String getAnswer3() 
	{
		return answer3;
	}

	public void setAnswer3(String answer3) 
	{
		this.answer3 = answer3;
	}

	public String getAnswer4() 
	{
		return answer4;
	}

	public void setAnswer4(String answer4) 
	{
		this.answer4 = answer4;
	}

	public String getCorrectAnswerNumber() 
	{
		return correctAnswerNumber;
	}

	public void setCorrectAnswerNumber(String correctAnswerNumber) 
	{
		this.correctAnswerNumber = correctAnswerNumber;
	}

}
