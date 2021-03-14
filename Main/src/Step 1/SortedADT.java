
public abstract interface SortedADT {
    
    public class NotFoundException extends Exception{}

    public class NotUniqueException extends Exception{}

    public abstract void insert (Comparable object) throws NotUniqueException;
    
    // returns the object found
    public abstract Comparable remove(Comparable object) throws NotFoundException;

    // returns the object removed
    public abstract Comparable find(Comparable object) throws NotFoundException;
}
