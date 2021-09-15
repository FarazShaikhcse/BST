/**
 * @author farazshabbir
 * this class represents a BST
 * @param <K>
 */
public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	
	/**
	 * @param key
	 * calls addRecursively method
	 */
	public void add(K key)
	{
		this.root = this.addRecursively(root,key);
	}
	
	/**
	 * @param current
	 * @param key is the data of the node to be added
	 * this method adds a node to the tree
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current,K key)
	{
		if(current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0)
		{
			current.left = addRecursively(current.left,key);
		}
		else
		{
			current.right = addRecursively(current.right,key);
		}
		return current;
	}
	
	/**
	 * @return size of the tree
	 */
	public int getSize()
	{
		return this.getSizeRecursive(root);
	}
	
	/**
	 * @param current
	 * @return
	 * this method calculates the total number of nodes 
	 */
	private int getSizeRecursive(MyBinaryNode<K> current)
	{
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}
	/**
	 * calls printnodes method
	 */
	public void getNodes()
	{
		this.printNodes(root);
	}
	/**
	 * @param root is the root node
	 * prints all the nodes in the tree
	 */
	private void printNodes(MyBinaryNode<K> root) 
	{
		if(root == null)
			return;
		printNodes(root.left);
		System.out.print(root.key+" ");
		printNodes(root.right);
		
	}
	public void search(K key)
	{
		this.searchNodes(key,root);				
	}
	/**
	 * this method is used to search for a node
	 * @param key element to be searched
	 * @param root position of last search
	 */
	private void searchNodes(K key,MyBinaryNode<K> root)
	{
		if(root==null)
		{
			System.out.println(key + " not found");
			return;
		}
		int compareResult = key.compareTo(root.key);
		if(compareResult == 0)
			System.out.println(key + " is found");
		else if(compareResult<0)
			searchNodes(key,root.left);
		else
			searchNodes(key, root.right);
	}
}