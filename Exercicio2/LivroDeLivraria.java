package javabasico.aula24.orientacaoobjetos.ExerciciosClassesEAtributos.Exercicio2;

public class LivroDeLivraria {
    public static void main(String[] args){

        Livro liv1 = new Livro();

        liv1.titulo = "Programar em Java é fácil";
        liv1.autor = "Zé javeiro";
        liv1.editora = "Javai é tarde";
        liv1.idioma = "Português";
        liv1.paginas = 299;

        System.out.println("Título: " + liv1.titulo+".");
        System.out.println("Autor: " + liv1.autor+".");
        System.out.println("Editora: " + liv1.editora+".");
        System.out.println("Idioma: " + liv1.idioma+".");
        System.out.println("Quantidade de páginas: " + liv1.paginas+".");
        System.out.println();

        System.out.println("A seguir: a classe livro de biblioteca:");
        System.out.println();

        LivroDeBiblioteca emprestado = new LivroDeBiblioteca();

        emprestado.titulo = "Clean code";
        emprestado.autor = "Desconhecido";
        emprestado.editora = "Saraiva";
        emprestado.idioma = "Português";
        emprestado.paginas = 404;
        emprestado.codNumeracao = 1897;
        emprestado.nomeCliente = "Zé javeiro";

        System.out.println("Título: " + emprestado.titulo+".");
        System.out.println("Autor: " + emprestado.autor+".");
        System.out.println("Editora: " + emprestado.editora+".");
        System.out.println("Idioma: " + emprestado.idioma+".");
        System.out.println("Quantidade de páginas: " + emprestado.paginas+".");
        System.out.println("Código de numeração: " + emprestado.codNumeracao+".");
        System.out.println("Nome do cliente: " + emprestado.nomeCliente + ".");


    }
}
