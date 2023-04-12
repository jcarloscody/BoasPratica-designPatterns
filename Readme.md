## Design Patterns
- solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos.
- [Boa Fonte](https://refactoring.guru/design-patterns/chain-of-responsibility)

### Categorias
- criacionais
- estruturais
- comportamentais

### `Categoria Comportamental`
- `Strategy`
- sempre que tivermos um algoritmo e ela varia com determinado parametro, usamos o polimorfismo para evitar o switch ou if/else
- Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.
- Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.

- `Chain of Responsibility`
- é um padrão de design comportamental que permite passar solicitações por uma cadeia de manipuladores. Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o próximo manipulador na cadeia.

- `Template Method` 
- O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
- a ideia é termos um método que funciona como template, como modelo que faz parte do processo, mas outra parte ele delega 

- `Pattern State`
- é usado quando temos uma transição de estados ou quando queremos executar algum algoritmo baseado em algum estado de alguma classe. 

- `Command`
- é um padrão de design comportamental que transforma uma solicitação em um objeto autônomo que contém todas as informações sobre a solicitação

- `Observer`
- a ideia é ter ouvintes observadores que estão de olho em determinado evento e quando um determinado evento X acontecer, ela será chamada 