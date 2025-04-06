package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprime(){
        if (jogadores == null)
            return;
        System.out.println(this.nome);
        for (Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return this.nome; // Agora retorna o nome do time ao imprimir
    }

}
