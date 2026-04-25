package leiturasProject;
public class LivroMain {

    public static void main(String[] args) {

        System.out.println("Livrinhos no forno jaja saindoooo!!");

        // Instanciando objeto
        Livro livro1 = new Livro("Alice no País das Maravilhas", "Lewis Carroll");

        // Exibindo objeto
        System.out.println(livro1);

        // Criando outro só pra você ver que funciona múltiplas instâncias
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin");

        System.out.println(livro2);
    }
}
