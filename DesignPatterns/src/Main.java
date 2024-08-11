import facade.BibliotecaFacade;

public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();

        biblioteca.addLivro("1", "Razão e Sensibilidade", "Jane Austen");
        biblioteca.addLivro("2", "Persuasão", "Jane Austen");
        biblioteca.addLivro("3", "Orgulho e Preconceito", "Jane Austen");

        biblioteca.addMembro("1", "Alana");
        biblioteca.addMembro("2", "Maria");
        biblioteca.addMembro("3", "Franciele");

        biblioteca.livroEmprestado("1", "1");
        biblioteca.livroEmprestado("2", "2");
        biblioteca.livroEmprestado("3", "3");

        biblioteca.mostrarEmprestimos();
    }
}

