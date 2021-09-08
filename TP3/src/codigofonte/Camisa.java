package codigofonte;

public class Camisa extends Roupa {
    private String tamanho;

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return    "Nome: " + nome + "\n"
                + "Descrição: " + descricao + "\n"
                + "Gênero: " + genero + "\n"
                + "Marca: " + marca + "\n"
                + "Cor: " + cor + "\n"
                + "Tamano: " + tamanho + "\n"
                + "Preço: " + preco;
    }

}
