//O principal objetivo deste desafio é fortalecer suas habilidades em lógica de programação. Aqui você deverá desenvolver a lógica para resolver o problema.

let nomes = [];

function inserirTexto(id, texto) {
    let campo = document.getElementById(id);
    campo.innerHTML = texto;
}

function adicionarAmigo(){
    let campoResultado = document.getElementById("resultado");
    let nome = document.querySelector("input").value;

    if(nome == ''){
        inserirTexto('resultado', "Por favor, digite um nome!");
        resultado.style.color = "red";
    }else{
        nomes.push(nome);
        campoResultado.style.color = "black";
        console.log(nomes)
    }
}

function sortearAmigo(){
    let campoResultado = document.getElementById("resultado");
    if(nomes.length == 0){
        inserirTexto('resultado', "Por favor, digite os nomes dos participantes!");
        resultado.style.color = "black";
    }else if (nomes.length == 1){
        inserirTexto('resultado', "Por favor, digite mais de um nome!");
        resultado.style.color = "black";
    }else{
        let indice = Math.floor(Math.random() * nomes.length);
        let resultado = nomes[indice];
        inserirTexto('resultado', `Parabéns, o amigo sorteado foi ${resultado}`);
        campoResultado.style.color = "green";
    }
}