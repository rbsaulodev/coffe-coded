/*Desafios
Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".

Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.

Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar.".

Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.

Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.*/

let diaDaSemana = prompt("Digite o dia da Semana!");

if(diaDaSemana == "Sábado" || diaDaSemana == "Domingo"){
    alert("Bom fim de semana!")
}else{
    alert("Boa semana!");
}

let numero = prompt("Digite um número");

if(numero < 0){
    alert("Negativo")
}else{
    alert("Positivo")
}

let pontos = 100;

if(pontos >= 100){
    alert("Parabéns, você venceu!");
}else{
    alert("Tente novamente para ganhar.")
}

let saldoConta = 2000;
let nomeUser = "Saulo";
alert(`Bom dia usuario ${nomeUser}, o seu saldo atual é de R$${saldoConta}`)

let nomePrompt = prompt("Insira seu nome:")
alert(`Seja bem vindo ${nomePrompt}`);



