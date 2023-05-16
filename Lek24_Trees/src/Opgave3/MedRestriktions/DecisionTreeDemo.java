package Opgave3.MedRestriktions;

/**
 * This program demonstrates a decision tree for an animal guessing game.
 */
public class DecisionTreeDemo {
	public static void main(String[] args) {

		BinaryTree<Integer> fifteen = new BinaryTree<>(15);
		BinaryTree<Integer> eleven = new BinaryTree<>(11,null,fifteen);

		BinaryTree<Integer> twentyFive = new BinaryTree<>(25);
		BinaryTree<Integer> thirty = new BinaryTree<>(30,twentyFive,null);

		BinaryTree<Integer> twentyTwo = new BinaryTree<>(22,eleven,thirty);

		BinaryTree<Integer> eightyEight = new BinaryTree<>(88);
		BinaryTree<Integer> ninety = new BinaryTree<>(90, eightyEight, null);

		BinaryTree<Integer> seventyseven = new BinaryTree<>(77,null, ninety);

		BinaryTree<Integer> fortyFive = new BinaryTree<>(45,twentyTwo,seventyseven);

		System.out.println(fortyFive.sum());

	}
}
