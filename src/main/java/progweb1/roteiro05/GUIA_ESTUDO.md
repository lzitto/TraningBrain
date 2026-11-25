# Roteiro V - Javascript ES6 — Guia de Estudo

> Disciplina: Programação para Web I — Prof. Demetrio Gomes Mestre (UFCG)

Este guia explica **a lógica e o porquê** de cada solução. Leia antes de olhar o código.

---

## Mapa de conceitos

| Questão | Conceito-chave | Ideia central |
|---|---|---|
| 01 | Promise + setTimeout | Simular algo que demora (requisição) |
| 02 | rest (`...`) + callback | Receber N parâmetros e verificar igualdade |
| 03 | spread (`...`) em objetos | Copiar propriedades de um objeto para outro |
| 04 | spread em arrays + sort | Juntar vários arrays e ordenar |
| 05 | callback como parâmetro | Delegar a "operação" para quem chama |
| 06 | Promises + encadeamento | Encadear etapas com `.then()` |
| 07 | async/await | Mesma cadeia do 06, escrita como síncrona |
| 08 | fetch + async/await + try/catch | Consumir API REST de verdade |
| 09 | filter + map + callback | Pipeline de processamento sem laços |

---

## 01 — Promise + setTimeout

**O que a questão pede:** função assíncrona que simule uma requisição ao servidor.

**Por que Promise + setTimeout?**
- `setTimeout` é o "relógio": ele dispara algo **depois** de X ms (simula latência de rede).
- `Promise` é o **contrato**: "um dia terei um valor (resolve) ou um erro (reject)".
- Juntos, modelam exatamente o comportamento de um `fetch`.

**Fluxo:**
```
new Promise(resolve, reject)
        │
        ▼
setTimeout(2000ms)  ← "espera a resposta do servidor"
        │
   ┌────┴────┐
resolve(url)  reject("erro")
```

**Por que `await`?** Para "parar" a função até a Promise resolvar, sem precisar de `.then()`.

---

## 02 — Rest + verificação com callback

**O que a questão pede:** aceitar número **indefinido** de parâmetros e dizer se há dois com **mesmo tipo e valor**.

**Por que rest (`...`)?**
```js
(...parametros)  // vira um array com todos os argumentos
verificar(1, 2, 1)  →  parametros = [1, 2, 1]
```
É o único jeito ES6 de capturar argumentos variáveis (substitui `arguments`).

**Lógica da verificação (por que assim?):**
- Para cada valor, contamos quantas vezes ele aparece **com o mesmo tipo**.
- `typeof outro === typeof valor` garante que `1` e `"1"` **não** são considerados iguais (tipos diferentes).
- `outro === valor` compara o valor estrito.
- Se qualquer valor aparece ≥ 2 vezes → `true`.

**Por que callback?** A questão exige. A função principal recebe a lógica de comparação como argumento — é o padrão que o Demetrio está ensinando (funções que recebem funções).

---

## 03 — Spread em objetos

**O que a questão pede:** combinar dois objetos.

**Por que `{ ...obj1, ...obj2 }`?**
- `...` **espalha** as propriedades de cada objeto dentro do novo.
- Ordem importa: propriedades de `obj2` sobrescrevem as de `obj1` em caso de chave igual.
- Cria um **novo objeto** (não altera os originais) — imutabilidade, boa prática do ES6.

**Por que callback?** Exigência da questão: `combinarObjetos(a, b, exibir)` — quem decide *o que fazer* com o resultado é quem chama.

---

## 04 — Spread + ordenação de múltiplos arrays

**O que a questão pede:** aceitar N arrays, juntar em um só, ordenar.

**Por que `...arrays` + `[...arrays.flat()]`?**
1. `(...arrays)` — rest junta os arrays argumentos: `[[30,10], [50,20], [40]]`
2. `.flat()` — achata para um nível: `[30, 10, 50, 20, 40]`
3. `[...]` — copia para um novo array (imutabilidade)
4. `.sort((a, b) => a - b)` — ordena **numericamente**

**Por que `(a, b) => a - b` no sort?**
- Sem comparator, o `sort` converte para string: `[10, 20, 30]` ok, mas `[100, 20]` → "100" < "20" (errado).
- `a - b` força comparação numérica: negativo = a antes de b.

---

## 05 — analisarTexto com callbacks

**O que a questão pede:** uma função que **delega** a operação para a callback recebida.

**A ideia central do callback (por que isso importa):**
```js
analisarTexto(frases, contarPalavras)  // conta palavras
analisarTexto(frases, maiorFrase)      // acha a frase maior
```
`analisarTexto` **não sabe** o que fazer — só sabe **com quem** fazer. Quem decide é quem chama. Isso é reutilização de código.

**contarPalavras — por que `reduce`?**
- `reduce` percorre o array **acumulando** um valor (aqui: total de palavras).
- `frase.split(" ").length` conta as palavras de cada frase.
- `0` no fim é o valor inicial do acumulador.

**maiorFrase — por que `reduce` de novo?**
- Reduce também serve para **encontrar** o maior: compara cada frase com a "atual maior" e guarda a que tem mais palavras.
- Sem valor inicial: a primeira frase já vira a "maior" inicial.

---

## 06 — Promises encadeadas

**O que a questão pede:** duas funções com Promise + encadeamento.

**colocarTodasLetrasEmMaiusculoEm500ms:**
- `typeof texto !== "string"` → `reject` (a Promise falha — é o contrato: validar e rejeitar).
- `setTimeout(500)` → `resolve(texto.toUpperCase())` (o valor chega depois).

**inverteTodasLetras:**
- `split("")` → array de caracteres → `reverse()` → `join("")` → string invertida.

**Por que encadeamento?**
```js
colocarMaiusculo("hello")     // Promise 1: "HELLO" (demora 500ms)
  .then(r => inverter(r))     // só roda quando P1 resolve; retorna P2
  .then(r => console.log(r))  // roda quando P2 resolve
  .catch(e => console.log(e)); // qualquer rejeição cai aqui
```
Cada `.then()` **espera** o anterior. O `.catch()` no fim captura erros de qualquer etapa.

---

## 07 — async/await (transformação do 06)

**Por que async/await é melhor que `.then()`?**
- Lê **de cima para baixo**, como código síncrono.
- `try/catch` substitui o `.catch()` — tratamento de erro no lugar onde o erro acontece.
- `await` = "espere essa Promise resolver antes de continuar".

```js
// 06 (promises)              // 07 (async/await)
p1.then(r => p2(r))          const r1 = await p1;
     .then(r => ...)          const r2 = await p2(r1);
     .catch(e => ...)         // try { } catch (e) { }
```

**Obs.:** o enunciado diz "questão 04", mas a questão 04 (spread de arrays) não usa promises — claramente refere-se à **questão 06** (funções com promises). A solução converte o 06.

---

## 08 — Integração com mockAPI

**O que a questão pede:** consumir uma API REST (GET e POST) com async/await.

**Por que `fetch`?** É a API nativa do navegador para requisições HTTP.

**GET — buscarProdutos:**
```
fetch(url) → resposta (Response)
  └─ await resposta.json() → dados (array de produtos)
```

**POST — cadastrarProduto:**
```js
fetch(url, {
  method: "POST",
  headers: { "Content-Type": "application/json" },  // avisa o formato
  body: JSON.stringify(produto)                     // objeto → string JSON
})
```

**Por que `try/catch`?** Exigência da questão — se a rede cair ou o servidor der erro, o `catch` impede o programa de quebrar.

**Por que funções separadas?** Exigência da questão — `buscarProdutos` e `cadastrarProduto` fazem **uma** coisa cada (responsabilidade única). O `executar()` só orquestra.

**Formato da saída** (fiel ao PDF):
```
Produto: Notebook X | Preço: R$ 3500.00
Produto "Headset" criado com sucesso! Status: criado
```

**Para rodar:**
- **Teste local:** `node mockServer.js` (o HTML já aponta para `localhost:3000`) — o `mockServer.js` implementa GET/POST `/produtos` igual ao mockAPI.
- **Entrega:** crie seu projeto em https://mockapi.io/, adicione `/produtos` e troque a `BASE_URL` no HTML (a segunda linha está comentada, é só descomentar).

### Estudo: como funciona um mock server (e o `mockServer.js`)

O enunciado manda criar os endpoints no **mockAPI.io** (serviço externo que precisa de conta). Para você testar **sem depender da internet**, o `mockServer.js` é um **servidor HTTP local** escrito em Node que imita exatamente o mesmo contrato da API. Entender ele é entender o que o mockAPI faz "por baixo".

**1. O que é um servidor HTTP?**
Um processo que "escuta" numa porta e responde requisições. O navegador (ou o `fetch`) manda pedidos e o servidor devolve respostas com status + corpo:
```
Cliente (fetch)  ──GET /produtos──▶  Servidor
                ◀──200 + JSON──────
```

**2. O módulo `http` do Node**
```js
const http = require('http');
http.createServer((req, res) => {
    req.method  // "GET" ou "POST"
    req.url     // "/produtos"
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(dados));
}).listen(3000);
```
- `req` = o que **chegou** (método, URL, corpo)
- `res` = o que você **devolve** (status, cabeçalhos, corpo)
- `.listen(3000)` = abre a porta 3000 → `http://localhost:3000`

**3. CORS — por que os cabeçalhos especiais?**
O HTML abre via `file://` ou `localhost:8080`, mas a API está em `localhost:3000`. O navegador **bloqueia** respostas de outra origem por segurança. O servidor precisa declarar:
```js
res.setHeader('Access-Control-Allow-Origin', '*');       // libera qualquer origem
res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS');
```
O `OPTIONS` é o "pré-voo" que o navegador faz antes do POST — o servidor responde `204` (sem conteúdo) só para dizer "pode vir".

**4. GET vs POST no servidor**
```js
// GET: devolve a lista (leitura)
if (req.method === 'GET' && req.url === '/produtos') → 200 + JSON

// POST: lê o corpo, processa, devolve criado (escrita)
if (req.method === 'POST' && req.url === '/produtos') {
    req.on('data', ...);   // acumula os pedaços do corpo
    req.on('end', ...);    // corpo completo → JSON.parse → salvar → 201
}
```
Repare: o corpo chega em **pedaços** (`data`/`end`) — é fluxo de dados, não uma string pronta.

**5. Por que `201` no POST e `200` no GET?**
Código de status HTTP é semântico: `200` = OK (leu), `201` = Created (criou), `400` = requisição ruim (JSON inválido), `404` = rota não existe. O mockAPI real faz a mesma coisa.

**6. O contrato bate com o enunciado?**
| Enunciado pede | mockServer.js faz |
|---|---|
| GET `/produtos` → lista JSON | `200` + array de produtos |
| POST `/produtos` → objeto + `"status": "criado"` | `201` + `{ id, ...produto, status: "criado" }` |

O `Exercício_08.html` **não muda** entre local e mockAPI — só a `BASE_URL`. Isso exemplifica o conceito de **API abstrata**: quem consome não precisa saber onde o servidor roda, só o contrato (URL + método + formato).

**7. Para testar o fluxo completo**
```bash
node mockServer.js          # terminal 1: sobe a API
# abre Exercício_08.html no navegador (F12 → Console)
# o fetch faz GET → imprime produtos → faz POST → imprime confirmação
```

---

## 09 — filter + map + criptografia (Node.js)

**Por que Node e não navegador?** O código de criptografia do professor usa `require('crypto')` — módulo nativo do **Node.js**. No navegador não existe `require`. Execute com: `node Exercício_09.js`

**A pipeline (por que filter → map?):**
```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        │ filter(n => n % 2 === 0)     ← só pares
        ▼
[2, 4, 6, 8, 10]
        │ map(n => criptografar(n))    ← transforma cada um
        ▼
["0b87...", "5689...", ...]            ← nova lista
```

**Por que sem `for`/`while`?** Regra da questão. `filter` e `map` são **métodos de array** que já fazem o laço por dentro — código mais curto e declarativo ("o que quero", não "como faço").

**Por que `filter` e não `forEach` com push?**
- `filter` **retorna** um novo array com os itens que passam no teste.
- `forEach` só percorre; você teria que criar o array à mão.

**Criptografia:** `criptografarMensagem` gera um IV aleatório, cifra com AES-256-CBC e retorna `iv:cifrado`. O `decritografar` inverte o processo. A chave precisa ter **exatamente 32 bytes** para aes-256.

---

## Resumo dos "porquês" gerais

1. **Arrow functions** em tudo: sintaxe curta, `this` léxico, estilo do ES6 que a disciplina ensina.
2. **`const`** para tudo que não muda de valor: mais seguro que `var`/`let`.
3. **Callbacks** nas questões 02-05: o professor está ensinando o padrão "função que recebe função" — base de `map`, `filter`, `reduce` e de frameworks.
4. **Promises → async/await** (06→07): evolução natural — mesmo poder, código mais legível.
5. **Imutabilidade** (spread cria cópias): não alterar dados originais evita bugs difíceis de rastrear.
