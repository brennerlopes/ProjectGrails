package clientesfatea

class Cliente {

    String nome
    Character cpf
    Date dataNascimento
    String endereco
    String telefone


    static constraints = {
        cpf (MaxSize: 13)

    }
}
