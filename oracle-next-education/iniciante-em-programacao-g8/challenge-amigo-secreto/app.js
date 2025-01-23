let nomes = [];
let nomesJaEscolhidos = [];
let lista = document.querySelector("#listaAmigos");

let campoResultado = document.getElementById("resultado");

function atualizarMensagem(mensagem, cor){
    campoResultado.innerHTML = mensagem;
    campoResultado.style.color = cor;
}

function mostrarAmigosDaLista() {
    lista.innerHTML = "";

    for (let i = 0; i < nomes.length; i++) {
        let item = document.createElement("li");
        item.textContent = nomes[i];
        lista.appendChild(item);
    }
}

function novoSorteio(){
    nomes = [];
    nomesJaEscolhidos = [];
    lista.innerHTML = "";
    atualizarMensagem("", "black");
}

function adicionarAmigo(){
    let nome = document.querySelector("input").value;

    if(nome == ''){
        atualizarMensagem("Por favor, digite o nome do seu amigo!", "red");
    }
    else if(nomes.includes(nome)){
        atualizarMensagem("Por favor, digite um nome diferente do outro!", "red");
    }
    else if(nome.length > 50){
        atualizarMensagem("O nome é muito longo! Use no máximo 50 caracteres.", "red");
    }
    else{
        nomes.push(nome);
        atualizarMensagem("Amigo adicionado com sucesso", "black");
        document.querySelector("input").value = "";
        mostrarAmigosDaLista();
    }
}

function sortearAmigo() {
    if (nomes.length === 0) {
        atualizarMensagem("Por favor, digite os nomes dos amigos", "black");
    }
    else if (nomes.length === 1) {
        atualizarMensagem("Só há um amigo na lista, sorteio impossível!", "black");
    } 
    else {
        let indice = Math.floor(Math.random() * nomes.length);
        let amigoSorteado = nomes[indice];

        nomes.splice(indice, 1);
        atualizarMensagem(`O amigo sorteado foi: ${amigoSorteado}`, "green");
        mostrarAmigosDaLista();
    }
}
