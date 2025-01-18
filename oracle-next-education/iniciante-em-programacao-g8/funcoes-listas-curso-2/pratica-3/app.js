/*
Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.

Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.

Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
*/

function calcularIMC(altura, peso) {
    let imc = peso / (altura * altura);
    console.log(`O seu IMC é de ${imc.toFixed(2)}`);
}
calcularIMC(1.75, 70);

function calcularFatorial(numero) {
    let fatorial = 1;
    while(numero > 1) {
        fatorial = fatorial * numero;
        numero--;
    }
    console.log(`O fatorial é: ${fatorial}`);
}
calcularFatorial(6);

function dolarParaReal(dolar) {
    let convertido = dolar * 4.8;
    console.log(`US$ ${dolar} equivale a R$ ${convertido.toFixed(2)}`);
}
dolarParaReal(10);

function perimetroEArea(altura, largura){
    const area = altura * largura;
    const perimetro = 2 * (altura + largura);
    console.log(`Área: ${area}m², Perímetro: ${perimetro}m`);
}
perimetroEArea(2, 4);

function salaCicular(r){
    const area = 3.14 * r**2;
    const perimetro = 2 * 3.14 * r;
    console.log(`Área do círculo: ${area.toFixed(2)}m²`);
    console.log(`Perímetro do círculo: ${perimetro.toFixed(2)}m`);
}
salaCicular(14);

function mostrarTabuada(numero) {
    console.log(`Tabuada do ${numero}:`);
    for(let i = 1; i <= 10; i++) {
        console.log(`${numero} x ${i} = ${numero * i}`);
    }
}
mostrarTabuada(7);