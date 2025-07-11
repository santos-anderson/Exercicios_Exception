public class Main {

    // Exceção checada
    public static class mensagemErroChecado extends Exception {
        public mensagemErroChecado(String msg) {
            super(msg);
        }
    }

    public static void erromensagemChecado() throws mensagemErroChecado {
        throw new mensagemErroChecado("Mensagem de erro Checado!");
    }

    // Exceção não-checada
    public static class mensagemErroNaoChecado extends RuntimeException {
        public mensagemErroNaoChecado(String texto) {
            super(texto);
        }
    }

    public static void erromensagemNaoChecado() {
        throw new mensagemErroNaoChecado("Deu erro NÃO Checado!");
    }

    public static void main(String[] args) {
        System.out.println("Teste exception checada");
        try {
            erromensagemChecado();
        } catch (mensagemErroChecado e) {
            System.out.println("Messagem de erro checado: " + e.getMessage());
        }

        System.out.println("\nTeste exception NÃO checada");
        try {
            erromensagemNaoChecado();
        } catch (mensagemErroNaoChecado e) {
            System.out.println("Mensagem de erro não checado: " + e.getMessage());
        }

        System.out.println("\nTry-catch-finally sem erro");
        try {
            int resultado = 2 + 3;
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("não devia cair aqui");
        } finally {
            System.out.println("Fim do try-catch-finally (sem erro)");
        }

        System.out.println("\nTry-catch-finally COM erro");
        try {
            int n = 5 / 0;
            System.out.println("isso não vai aparecer");
        } catch (Exception e) {
            System.out.println("Mensagem de erro: " + e);
        } finally {
            System.out.println("finally executado mesmo com erro");
        }
    }
}