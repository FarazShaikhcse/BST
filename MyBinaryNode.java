/**
 * @author farazshabbir
 * a node in BST contains key(data), right and left child node
 * @param <K>
 */
public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;
	public MyBinaryNode(K key)
	{
		this.key = key;
		this.left = this.right=null;
	}
}