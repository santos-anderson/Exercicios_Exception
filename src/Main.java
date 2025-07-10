public class Main {

    //1. Exceção Checada//

    public static class ExceptionChecada extends Exception {
        public ExceptionChecada(String msg) {
            super(msg);
        }
    }

    public static void mensagemChecada() throws ExceptionChecada {
        throw new ExceptionChecada("Mensagem de exceção checada lançada!");
    }

    public static void mensagemChecadaChamada() throws ExceptionChecada {
        mensagemChecada();
    }


    // 2. Exceção Não-Checada//

    public static class ExceptionNaoChecada extends RuntimeException {
        public ExceptionNaoChecada(String msg) {
            super(msg);
        }
    }

    public static void mensagemNaoChecada() {
        throw new ExceptionNaoChecada("mensagem de exceção NÃO checada lançada!");
    }

    public static void mensagemNaoChecadaChamada() {
        mensagemNaoChecada();
    }

    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 1: EXCEÇÃO CHECADA ");
        try {
            mensagemChecadaChamada();
        } catch (ExceptionChecada e) {
            System.out.println("Peguei uma mensagem exception checada: " + e.getMessage());
        }

        System.out.println("\n EXERCÍCIO 2: EXCEÇÃO NÃO-CHECADA");

        //mensagemNaoChecada();

        try {
            mensagemNaoChecadaChamada();
        } catch (ExceptionNaoChecada e) {
            System.out.println("Peguei uma mensagem exception NÃO checada: " + e.getMessage());
        }

        System.out.println("\n EXERCÍCIO 3: TRY-CATCH-FINALLY SEM EXCEÇÃO");
        try {
            System.out.println("TRY: Antes do cálculo.");
            int resultado = 6 + 5;
            System.out.println("TRY: Calculei 6 + 5 = " + resultado);
            System.out.println("TRY: Fim do bloco TRY (sem exceção).");
        } catch (Exception e) {
            System.out.println("CATCH: Não será executado.");
        } finally {
            System.out.println("FINALLY: Sempre executa.");
        }

        System.out.println("\n EXERCÍCIO 4: TRY-CATCH-FINALLY COM EXCEÇÃO");
        try {
            System.out.println("TRY: Antes de lançar a exceção.");
            int erro = 10 / 0;
            System.out.println("TRY: Esta linha NÃO será executada.");
        } catch (Exception e) {
            System.out.println("CATCH: Peguei a exceção: " + e);
        } finally {
            System.out.println("FINALLY: Sempre executa (mesmo com erro).");
        }
    }
}