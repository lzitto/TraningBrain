package leetcode;

public class MainDebugger {

    public static void main(String[] args) {

        // 1. Monta os nós na mão (BST)
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // 2. Instancia a sua Solution
        Solution solua = new Solution();

        // 3. Roda a busca
        TreeNode resultado = solua.searchBST(root, 2);

        // 4. Imprime a saída
        if (resultado != null) {
            System.out.println("Nó encontrado: " + resultado.val);
        } else {
            System.out.println("null");
        }
    }
}