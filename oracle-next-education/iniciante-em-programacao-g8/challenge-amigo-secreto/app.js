let nomes = [];

let campoResultado = document.getElementById("resultado");

function atualizarMensagem(mensagem, cor){
    campoResultado.innerHTML = mensagem;
    campoResultado.style.color = cor;
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
    }
}

function sortearAmigo(){
    if(nomes.length == 0){
        atualizarMensagem("Por favor, digite os nomes dos amigos", "black");
    }
    else if (nomes.length == 1){
        atualizarMensagem("Por favor, digite mais de um amigo", "black");
    }
    else{
        let indice = Math.floor(Math.random() * nomes.length);
        let resultado = nomes[indice];
        atualizarMensagem(`O amigo sorteado foi o: ${resultado}`, "green");
    }
}