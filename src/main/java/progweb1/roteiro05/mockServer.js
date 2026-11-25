// Mock server local - simula a API do mockAPI.io para o Exercício 08
// Executar com: node mockServer.js
// Endpoints: GET /produtos  e  POST /produtos
// Depois de testar aqui, troque BASE_URL no Exercício_08.html
// pela URL do seu projeto real em https://mockapi.io/

const http = require('http');

// Lista inicial de produtos (mesmo formato do enunciado)
let produtos = [
    { id: 1, nome: "Notebook X", preco: 3500.00 },
    { id: 2, nome: "Mouse Gamer", preco: 150.00 },
    { id: 3, nome: "Teclado Mecânico", preco: 500.00 }
];

const servidor = http.createServer((req, res) => {
    // CORS: permite o navegador (file:// ou localhost) consumir a API
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, OPTIONS');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');

    // Pré-requisição CORS do navegador
    if (req.method === 'OPTIONS') {
        res.writeHead(204);
        res.end();
        return;
    }

    // GET /produtos → retorna a lista
    if (req.method === 'GET' && req.url === '/produtos') {
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify(produtos));
        return;
    }

    // POST /produtos → recebe produto, devolve com status: "criado"
    if (req.method === 'POST' && req.url === '/produtos') {
        let corpo = '';
        req.on('data', (pedaco) => { corpo += pedaco; });
        req.on('end', () => {
            try {
                const produto = JSON.parse(corpo);
                // Simula o que o mockAPI faz: adiciona id e o campo status
                const novoProduto = {
                    id: produtos.length + 1,
                    ...produto,
                    status: "criado"
                };
                produtos.push(novoProduto);
                res.writeHead(201, { 'Content-Type': 'application/json' });
                res.end(JSON.stringify(novoProduto));
            } catch (erro) {
                res.writeHead(400, { 'Content-Type': 'application/json' });
                res.end(JSON.stringify({ erro: "JSON inválido" }));
            }
        });
        return;
    }

    // Rota não encontrada
    res.writeHead(404, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ erro: "Rota não encontrada" }));
});

const PORTA = 3000;
servidor.listen(PORTA, () => {
    console.log(`Mock server rodando em http://localhost:${PORTA}/produtos`);
    console.log('GET  → lista de produtos');
    console.log('POST → cadastra produto (retorna status: "criado")');
});
