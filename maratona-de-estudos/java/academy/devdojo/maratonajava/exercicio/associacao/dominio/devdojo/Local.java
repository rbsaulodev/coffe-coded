package academy.devdojo.maratonajava.exercicio.associacao.dominio.devdojo;

public class Local {
    private String endereco;

    public void imprime(){
        System.out.println("Endereco" + this.endereco);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
