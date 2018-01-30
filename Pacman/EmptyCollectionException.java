package Pacman;

public class EmptyCollectionException extends RuntimeException
{
    public EmptyCollectionException(String collection)
    {
	super ("Error: The " + collection + "is empty.");
    }
}
