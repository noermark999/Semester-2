package Opgave3;

/**
 * This program demonstrates a decision tree for an animal guessing game.
 */
public class DecisionTreeDemo {
	public static void main(String[] args) {

		BinaryTree fifteen = new BinaryTree(15);
		BinaryTree eleven = new BinaryTree(11,null,fifteen);

		BinaryTree twentyFive = new BinaryTree(25);
		BinaryTree thirty = new BinaryTree(30,twentyFive,null);

		BinaryTree twentyTwo = new BinaryTree(22,eleven,thirty);

		BinaryTree eightyEight = new BinaryTree(88);
		BinaryTree ninety = new BinaryTree(90, eightyEight, null);

		BinaryTree seventyseven = new BinaryTree(77,null, ninety);

		BinaryTree fortyFive = new BinaryTree(45,twentyTwo,seventyseven);

		System.out.println(fortyFive.sum());

	}
}
