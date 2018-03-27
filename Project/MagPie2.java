package magpie2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 *david is pretty
 *i do not know how to code 
 */
public class MagPie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		//if (statement.indexOf("no") >= 0)
		//{
			//response = "Why so negative?";
		//}
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("teacher") >= 0 || statement.indexOf("Lint") >= 0) {
			response = "They sounds like a good teacher";
		}
		else if (statement.trim() == null) {
			response = "Say something please";
		}
		else if (statement.indexOf("summer") >= 0) {
			response = "Are you excited?";
		}
		else if (statement.indexOf("Zellers") >= 0) {
			response = "Do you follow wrestling?";
		}
		else if (statement.indexOf("chatbot") >= 0) {
			response = "That's what I am!";
		}
		//make a say something please fix into it
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES =6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse == 4)
		{
			response = "I love you";
		}
		else if(whichResponse == 5)
		{
			response = "Do you have friends" ;
		}
		return response;
	}
}
