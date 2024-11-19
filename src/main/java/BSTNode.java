import java.lang.Comparable;
import java.util.function.Consumer;


/**
   This is a smart Node that utilizes generics.
   Note how we ensured that the type T will always be comparable...

 */
public class BSTNode<T extends Comparable<T>>
{

   private T val;
   private BSTNode<T> left;
   private BSTNode<T> right;



   public BSTNode(T val)
   {
      this(val,null,null);
   }
    

   public BSTNode(T val, BSTNode<T> l,BSTNode<T> r)
   {
	   this.val = val;
	   this.left = l;
	   this.right = r;
			   
   }



   /*
     Uses recursion to insert the target into the tree
    */
   public void insert(T target)
   {
	   int comparison = target.compareTo(val);
	   
	   if(comparison < 0) 
	   {
		   if(left == null)
		   {
			   left = new BSTNode<>(target);
		   }
		   else
		   {
			   left.insert(target);
		   }
		   if(comparison > 0)
		   {
			   if(right == null)
			   {
				   right = new BSTNode<>(target);
			   }
			   else
			   {
				   right.insert(target);
			   }
		   }
	   }
   }


   /*
     Uses recursion to retrieved the value target from the tree.  
     Returns null if it can't find the value.
    */
   public T retrieve(T target)
   {
		
	if(val.equals(target))
	{
		return target;
	}
	if(val.compareTo(target) < 0 && left.val != null)
	{
		return left.retrieve(target);	
	}
	
	if(val.compareTo(target) < 0 && left.val == null)
	{
		return null;
	}
	
	if(val.compareTo(target) < 0 && right.val != null)
	{
		return right.retrieve(target);
	}
	
	if(val.compareTo(target) < 0 && right.val == null)
	{
		return null;
	}
	return target;
   }


    /**
       If it is present, what level is the node?
       If it is not present, what level would it be placed.
     */
   public int retrieveDepth(T target)
   {
	if(val.equals(target))
	{
		return 0;
	}
	
	if(val.compareTo(target) < 0 && left.val != null)
	{
		return 1 + left.retrieveDepth(target) + 1;
	}
	
	if(val.compareTo(target) < 0 && right.val != null)
	{
		return 1 + right.retrieveDepth(target);
	}
	return 1;
   }

   /**
      Uses recursion to return the largest value in the tree
    */
   public T getLargest()
   {
	if(right.val == null)
	{
		return val;
	}
	return right.getLargest();
   }


   /**
      Uses recursion to do an inorder traversals.
      consume is part of a strategy pattern, to determine what the
      "Visit" should be.

    */
   public void inOrderTraversal(Consumer<T> consume)
   {
	   if(left != null)
	   {
		   left.inOrderTraversal(consume);
	   }
	   consume.accept(val);
	   if(right != null)
	   {
		   right.inOrderTraversal(consume);
	   }
	   return;
   }


   /**
      returns true if this tree is equal to that tree.
      false otherwise.

      Note: While I must always be non-null.  
            Nothing prevents "that" from being null.
	    
	    This one is long!
    */
   public boolean myEquals(BSTNode<T> that)
   {
	if(that == null)
	{
		return false;
	}
	boolean valEqual = val.equals(that.val);
	boolean leftEqual;
	boolean rightEqual;
	
	if(left == null)
	{
		leftEqual = (that.left == null);
	}
	else
	{
		leftEqual = left.myEquals(that.left);
	}
	if(right == null)
	{
		rightEqual = (that.right == null);
	}
	else
	{
		rightEqual = right.myEquals(that.right);
	}
	return valEqual && leftEqual && rightEqual;
   }
   
   public int addUp(Consumer<T> consume)
   {
	int sum = 0;
	
	if(left != null)
	{
		sum = sum + left.addUp(consume);
	}
	if(right != null)
	{
		sum = sum + right.addUp(consume);
	}
	return sum + this.val;
   }
   
}
   
   

