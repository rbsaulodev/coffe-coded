let titulo = document.querySelector('h1');
titulo.innerHTML = "Hora do Desafio";

function imprimirConsole(){
    console.log("O botão foi clicado")
}

function alerta(){
    alert("Eu amo Java");
}

function promptClick(){
    let cidade = prompt("Digite um nome de uma cidade do Brasil: ")
    alert(`Estive em ${cidade} e lembrei de você`);
}

function soma(){
    let numero1 = parseInt(prompt("Digite um número inteiro"));
    let numero2 = parseInt(prompt("Digite outro número inteiro"));
    let soma = numero1 + numero2;
    alert(`${numero1} + ${numero2} = ${soma}`)
}