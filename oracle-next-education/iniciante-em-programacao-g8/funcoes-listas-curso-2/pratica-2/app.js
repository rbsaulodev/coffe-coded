/*
Criar uma função que exibe "Olá, mundo!" no console.

Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

Criar uma função que recebe três números como parâmetros e retorna a média deles.

Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo
*/

function helloWorld() {
    console.log("Hello World!");
}
helloWorld();

function helloNome(nome){
    console.log(`Olá, ${nome}!`);
}
helloNome("Saulo");

function dobrarValor(valor){
    return valor*2;
}
console.log(dobrarValor(4));

function media(valor1, valor2, valor3){
    return (valor1 + valor2 + valor3)/3;
}
console.log(media(6,7,5));

function mostrarValorMaior(valor1, valor2){
    return valor1 > valor2 ? valor1 : valor2;
}
console.log(mostrarValorMaior(2,5));

function quadradoDeUmNumero(valor){
    return valor * valor;
}
console.log(quadradoDeUmNumero(6));