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