/*
Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número.

Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número.

Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.

Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.
*/

let contador1 = 0;
let contador2 = 10;

while(contador1 <= 10){
    alert(`Contando até 10: ${contador1++}`);
}

while(contador2 >= 0){
    alert(`Contagem regressiva até o 10: ${contador2--}`);
}

let contagemRegressiva = prompt("Digite um número: ");

while(contagemRegressiva >= 0){
    alert(`Contagem regressiva do número ${contagemRegressiva}: ${contagemRegressiva--}`);
}

let contador3 = 0
let contagemProgressiva = prompt("Digite um número: ");

while(contador3 <= contagemProgressiva){
    alert(`Contagem progressiva do número ${contagemProgressiva}: ${contador3++}`);
}