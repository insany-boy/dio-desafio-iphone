public class Main {
    public static void main(String[] args) throws Exception {
        iPhone meuiPhone = new iPhone();

        //Testando reprodutor musical
        meuiPhone.selecionarMusica("Natural - Imagine Dragons");
        meuiPhone.tocar();
        meuiPhone.pausar();

       //Testando Aparelho Telefonico

       meuiPhone.ligar("71988471991");
       meuiPhone.atender();
       meuiPhone.iniciarCorreioVoz();

       //Testando NavegadorInternet
       meuiPhone.exibirPagina("www.youtube.com.br");
       meuiPhone.adicionarNovaAba();
       meuiPhone.atualizarPagina();
    }
}
