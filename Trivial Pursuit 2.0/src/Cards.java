import java.util.ArrayList;
// i hate this so much
public class Cards 
{
	static ArrayList <Questions>history = new ArrayList<Questions>();
	static ArrayList <Questions>geography = new ArrayList<Questions>();
	static ArrayList <Questions>entertainment = new ArrayList<Questions>();
	static ArrayList <Questions>artsAndLiterature = new ArrayList<Questions>();
	static ArrayList <Questions>scienceAndNature = new ArrayList<Questions>();
	static ArrayList <Questions>sportsAndLeisure = new ArrayList<Questions>();
	public static void history()
	{
		history.add(new Questions ("What year was America found in?", "1776", "1492", "1778", "1812", "1"));
		history.add(new Questions ("Where was John F. Kennedy assassinated?","Austin","Washington D.C.", "Dallas", "Philadelphia", "3"));
		history.add(new Questions ("Who perfected the lightbulb?", "Benjamin Franklin", "Thomas Jefferson", "George Washington", "Thomas Edison", "4"));
		history.add(new Questions ("Who was the first president of America?", "George Washington", "John F. Kennedy", "Samuel Adams", "Benjamin Franklin", "1"));
		history.add(new Questions ("What nationality was Marco Polo?", "British", "Italian", "French", "German", "2"));
		history.add(new Questions ("What was the first state to enter the union after the original thirteen?", "Maine", "Texas", "Vermont", "North Carolina", "3"));
	}
	public static void geography()
	{
		geography.add(new Questions ("Which is the largest ocean?", "Atlantic","Indian", "Arctic","Pacific", "4"));
		geography.add(new Questions ("What's the capital of Denmark?", "London","Copenhagen", "Berlin", "Oslo", "2"));
		geography.add(new Questions ("Which river goes through London?", "Thames", "Nile", "Mississippi", "Rhine", "1"));
		geography.add(new Questions ("Which German city is famous for the perfume it produces?", "Brussles", "Berlin", "Cologne", "Frankfurt", "3"));
		geography.add(new Questions ("What's the capital of Scotland?", "Edinburgh", "London", "Dublin", "Glasgow", "1"));
		geography.add(new Questions ("How many avenues radiate from the Arc de Triomphe in Paris?", "7", "4", "12", "9", "3"));
	}
	public static void entertainment()
	{
		entertainment.add(new Questions ("What do Sean Connery, George Lazenby, Timothy Dalton, Pierce Brosnan have in common?","They all played The Teminator", "They all played James Bond", "They were all part of The Beatles", "They all played Indiana Jones", "2"));
		entertainment.add(new Questions ("In which city is Hollywood?", "Los Angeles", "San Fransisco", "San Diego", "Palm Springs", "1"));
		entertainment.add(new Questions ("What award ceremony celebrates music?","Emmys", "Grammys", "Oscars", "Tonys", "2"));
		entertainment.add(new Questions ("Who married John Lennon?", "Audrey Hepburn", "Yoko Ono", "Chrissy Tiegen", "Marilyn Monroe", "2"));
		entertainment.add(new Questions ("What band were John Lennon, Paul McCartney, Ringo Starr, and George Harrison in?","The Rolling Stones", "The Police", "ACDC", "The Beatles", "4"));
		entertainment.add(new Questions ("Who sings Thriller?","John Lennon", "Sting", "Michael Jackson", "The Jackson Five", "3"));
	}
	public static void artsAndLiterature()
	{
		artsAndLiterature.add(new Questions ("Who lived at 221B, Baker Street, London?", "James Bond", "Adele", "Chris Martin","Sherlock Holmes", "4"));
		artsAndLiterature.add(new Questions ("What are the first three words of the bible?", "In the beginning", "So it began", "A long time", "God created life", "1"));
		artsAndLiterature.add(new Questions ("Who painted the Sistine Chapel?","Da Vinci", "Michelangelo", "Van Gough", "Picasso", "2"));
		artsAndLiterature.add(new Questions ("Who said: I think, therefore I am?", "Aristotle", "Plato", "Descartes", "Socrates", "3"));
		artsAndLiterature.add(new Questions ("Who wrote Romeo and Juliet?", "Shakespeare", "Socrates", "Judy Blume", "Hemingway", "1"));
		artsAndLiterature.add(new Questions ("Who painted the Mona Lisa?","Michelangelo", "Van Gough", "Picasso", "Da Vinci", "1"));
	}
	public static void scienceAndNature()
	{
		scienceAndNature.add(new Questions ("How many colours are there in a rainbow?", "9","7", "13", "10", "2"));
		scienceAndNature.add(new Questions ("Which is the only mammal that can't jump?", "Elephant", "Seal", "Human", "Dolphin", "1"));
		scienceAndNature.add(new Questions ("What does the roman numeral C represent?", "5", "20", "100", "10", "3"));
		scienceAndNature.add(new Questions ("Who said E=mc2","Benjamin Franklin","Thomas Edison", "Johanes Guttenberg", "Albert Einstein", "4"));
		scienceAndNature.add(new Questions ("Which planet is nearest the sun?", "Venus", "Mercury", "Mars", "Uranus", "2"));
		scienceAndNature.add(new Questions ("What's the hardest rock?","Cobalt", "Pearl", "Granite", "Diamond", "4"));
	}
	public static void sportsAndLeisure()
	{
		sportsAndLeisure.add(new Questions ("What language has the most words?", "Chinese", "German", "English", "French", "3"));
		sportsAndLeisure.add(new Questions ("What money do they use in Japan?", "Yen", "Euro", "Dollar", "Yang", "1"));
		sportsAndLeisure.add(new Questions ("What time do the pubs normally close in England?", "7", "11", "5", "12", "2"));
		sportsAndLeisure.add(new Questions ("How many balls are there in billiards?", "15", "12", "5", "10", "1"));
		sportsAndLeisure.add(new Questions ("Who starts first in chess?","Black","Red", "Blue", "White","4"));
		sportsAndLeisure.add(new Questions ("What horoscope sign has a crab?", "Leo", "Scorpio", "Aries", "Cancer", "4"));
	}
}
