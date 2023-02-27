package escola;

public enum StatusAluno {

    APROVADO("Aprovado"),
    NAO_APROVADO("Reprovado"),
    RECUPERACAO("Recuperação");

    public String descricao;

    StatusAluno(String descricao) {
        this.descricao = descricao;
    }

}
