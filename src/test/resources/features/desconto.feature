# language: pt

  Funcionalidade:  Receber Desconto da Qazando
    Eu como usuário da Qazando
    Quero receber um cupom de desconto
    Para comprar um curso com valor reduzido

    @gerar-cupom
    Cenário: Visualizar código de desconto

      Dado que estou no site da qazando
      Quando preencho meu email
      E dou enter em ganhar cupom
      Então eu vejo o código de desconto