public class Main {
    public static void main(String[] args) {
        ReprodutorMusical player = new ReprodutorMusical();
        player.selecionarMusica("Stairway to Heaven");
        player.tocar();
        player.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
