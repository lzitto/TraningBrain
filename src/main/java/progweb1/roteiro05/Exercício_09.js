// Exercício 09 - Roteiro V
// Executar com: node Exercício_09.js
// (usa require('crypto') do Node.js — módulo nativo do servidor JS)

const crypto = require('crypto');

// Criptografia de dados (fornecida pelo professor)
const criptografarMensagem = (texto, chaveSecreta) => {
    const algorithm = 'aes-256-cbc';
    const iv = crypto.randomBytes(16);
    const cipher = crypto.createCipheriv(algorithm, Buffer.from(chaveSecreta), iv);
    let encrypted = cipher.update(texto, 'utf8', 'hex');
    encrypted += cipher.final('hex');
    // Retorna o IV junto com o texto criptografado
    return `${iv.toString('hex')}:${encrypted}`;
}

// Função para descriptografar dados (fornecida pelo professor)
const decritografar = (textoCriptografado, chaveSecreta) => {
    const algorithm = 'aes-256-cbc';
    const [ivHex, encrypted] = textoCriptografado.split(':');
    const iv = Buffer.from(ivHex, 'hex');
    const decipher = crypto.createDecipheriv(algorithm, Buffer.from(chaveSecreta), iv);
    let decrypted = decipher.update(encrypted, 'hex', 'utf8');
    decrypted += decipher.final('utf8');
    return decrypted;
}

// processarNumeros(numeros, callbackFunction)
// - filtra pares com arrow function
// - aplica a callback (criptografia) em cada par com arrow function
// - sem laços (for/while): apenas filter e map
const processarNumeros = (numeros, callbackFunction) => {
    // 1. Filtrar apenas os números pares
    const pares = numeros.filter((n) => n % 2 === 0);

    // 2. Aplicar a função de criptografia em cada número par
    const criptografados = pares.map((n) => callbackFunction(n.toString()));

    // 3. Retornar o resultado como nova lista
    return criptografados;
};

// Exemplo de uso:
const numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const chaveSecreta = '0123456789abcdef0123456789abcdef'; // exatamente 32 bytes para aes-256

const resultado = processarNumeros(numeros, (numero) => {
    return criptografarMensagem(numero, chaveSecreta);
});

console.log('Lista original:', numeros);
console.log('Pares criptografados:');
resultado.forEach((item, indice) => {
    console.log(`  [${indice}] ${item}`);
    console.log(`       → descriptografado: ${decritografar(item, chaveSecreta)}`);
});
