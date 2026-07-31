package leetcode;

import R11-01.src.main.java.adt.bst.BSTNode;

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
    public int somaNosInternos() {
    int soma = 0;
    if (!this.root.isEmpty()) {
        // Inicia pelos filhos da raiz para garantir que a raiz NÃO seja somada
        soma = somaNosInternos((BSTNode<Integer>) this.root.getLeft())
             + somaNosInternos((BSTNode<Integer>) this.root.getRight());
    }
    return soma;
}

private int somaNosInternos(BSTNode<Integer> node) {
    int soma = 0;

    if (!node.isEmpty()) {
        BSTNode<Integer> left = (BSTNode<Integer>) node.getLeft();
        BSTNode<Integer> right = (BSTNode<Integer>) node.getRight();

        // Um nó é interno se ele TIVER pelo menos um filho
        boolean isInternal = !left.isEmpty() || !right.isEmpty();

        if (isInternal) {
            soma = node.getData()
                 + somaNosInternos(left)
                 + somaNosInternos(right);
        }
    }

    return soma;
}

public int countSmaller(BSTNode<T> node, T element) {
    int ans = 0;

    if (node != null && !node.isEmpty() && element != null) {
        int comp = element.compareTo(node.getData());

        if (comp <= 0) {
            // Se o elemento buscado é menor ou igual ao nó atual,
            // os menores só podem estar na subárvore esquerda.
            ans = countSmaller((BSTNode<T>) node.getLeft(), element);
        } else {
            // Se o elemento buscado é maior, o nó atual conta (+1),
            // toda a subárvore esquerda dele conta, e continuamos buscando na direita.
            ans = 1 + size((BSTNode<T>) node.getLeft()) 
                    + countSmaller((BSTNode<T>) node.getRight(), element);
        }
    }

    return ans;
}