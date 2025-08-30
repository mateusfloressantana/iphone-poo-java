public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIPhone.selecionarMusica("Drum Show - Twenty One Pilots");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIPhone.ligar("(22) 1234-5678");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador de Internet ---");
        meuIPhone.exibirPagina("https://www.apple.com/br/");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}