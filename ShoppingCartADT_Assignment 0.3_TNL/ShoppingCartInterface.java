
/**
 * @author Truong Le
 *
 */
public interface ShoppingCartInterface<T> {
	
	/**
	 * Get the total number of Items in the Cart
	 * @return total number of Items in the Cart
	 */
	public int getItemTotal();
	
	/**
	 * Return true or false based on if the Cart is Empty or not
	 * @return true if Cart is Empty and false if otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Add an Item to the Cart
	 * @param item Item that is going to be added to the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean add(T item);
	
	/**
	 * Remove an Item from the Cart
	 * @return the removed Item
	 */
	public T remove();
	
	/**
	 * Remove one of a certain Item
	 * @param item Item that is going to be remove from the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean remove(T item);
	
	/**
	 * Remove everything in the Cart
	 */
	public void emptyCart();
	
	/**
	 * Get the frequency of a certain Item
	 * @param item Item to see the frequency of
	 * @return number of a certain Item
	 */
	public int getFrequencyOf(T item);
	
	/**
	 * Checks to see if a certain Item is in the Cart
	 * @param item Item to check to see if its in the Cart
	 * @return True if Item is in Cart, false otherwise
	 */
	public boolean contains(T item);
	
	/**
	 * Get all Items in the Cart
	 * @return array if the Items in the Cart
	 */
	public T[] toArray();
	
	/**
	 * Get total price of everything in the Cart
	 * @return price of everything in the Cart
	 */
	public double totalPrice();
	
	/**
	 * Remove all of a certain Item
	 * @param item Item that is going to be remove from the Cart
	 * @return True if successful, false otherwise
	 */
	public boolean removeAll(T item);
	
}
