//O principal objetivo deste desafio é fortalecer suas habilidades em lógica de programação. Aqui você deverá desenvolver a lógica para resolver o problema.

let nomes = ["Saulo", "Maria"];

function adicionarAmigo(){
    let nome = document.querySelector("input").value;
    if(nome == ''){
        alert("Por favor, digite um nome!");
    }else{
        nomes.push(nome);
        console.log(nomes);
    }
}

function sortearAmigo(){

}