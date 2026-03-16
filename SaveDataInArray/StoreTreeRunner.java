class StoreTreeRunner
{
	public static void main(String[] args)
	{
		String[] trees=new String[10];
		StoreTree storeTree=new StoreTree(trees);

		storeTree.getTreeName("Neem");
		storeTree.getTreeName("Banyan");
		storeTree.getTreeName("Mango");
		storeTree.getTreeName("Coconut");
		storeTree.getTreeName("Peepal");
		storeTree.getTreeName("Teak");
		storeTree.getTreeName("Oak");
		storeTree.getTreeName("Pine");
		storeTree.getTreeName("Maple");
		storeTree.getTreeName("Ashoka");
	}
}