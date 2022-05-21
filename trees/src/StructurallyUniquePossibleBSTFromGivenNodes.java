public class StructurallyUniquePossibleBSTFromGivenNodes {
    public static int countTrees(int numNodes) {
        if (numNodes <=1) {
            return 1;
        }

        int sum = 0;
        for (int i = 1; i<=numNodes; i++) {
            int countLeftTrees = countTrees(i-1);
            int countRightTrees = countTrees(numNodes - i);

            sum = sum + (countLeftTrees * countRightTrees);
        }

        return sum;
    }
}
