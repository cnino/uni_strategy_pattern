# Strategy Pattern

Repositório para exercício sobre o padrão de projeto Strategy.

### Especificação
Você está dando manutenção no sistema de vendas online de uma loja. Sua tarefa é incluir uma nova forma de frete, pois a empresa fechou uma parceria com uma transportadora que possibilita um novo formato de envio, com um cálculo específico de frete. Observe abaixo um esquema da classe *Pedido* e do método *calcularFrete()*:

|          Pedido                 |
|---------------------------------|
| - itensPedido: List<ItemPedido> |
| - tipoFrete: int                |
| + calcularFrete(): double       |

Observação: para calcular o frete são utilizadas informações que estão nos itens de pedido, como peso e dimensões por exemplo.

Como podemos aplicar o padrão Strategy neste caso?
Faça as alterações necessárias no código disponibilizado para demonstrar a aplicação do padrão.
