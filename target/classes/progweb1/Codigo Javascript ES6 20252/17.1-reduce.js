const numeros = [10, 20, 30, 40];

const soma = numeros.reduce((acumulador, valorAtual) => {
  return acumulador + valorAtual;
}, 0);

console.log(soma);