## Design Patterns
- solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos.

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