let numeroSecreto = gerarNumeroAleatorio();
let numeroDeTentativa = 1;

function exibirMensagemInicial() {
    inserirTexto("h1", "Jogo do Número Secreto");
    inserirTexto("p", "Números entre 1 ao 10!");
}

function atualizarPalavraTentativa() {
    return numeroDeTentativa > 1 ? `${numeroDeTentativa} tentativas` : `${numeroDeTentativa} tentativa`;
}

function inserirTexto(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

exibirMensagemInicial();

function verificarChute() {
    let chute = document.querySelector("input").value;
    
    if (chute == '') {
        inserirTexto("p", "Por favor insira um número");
        return;
    }

    if(chute == numeroSecreto) {
        inserirTexto("p", `Parabens você acertou o número secreto com ${atualizarPalavraTentativa()}`);
        document.getElementById('chute').disabled = true;
        document.getElementById('reiniciar').disabled = false;
    }
    
    else {
        numeroDeTentativa++;
        if(chute > numeroSecreto) {
            inserirTexto("p", `O número secreto é menor que: ${chute}`);
        } else {
            inserirTexto("p", `O número secreto é maior que: ${chute}`);
        }
        limparCampo();
    }
}

function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 3 + 1);
}

function limparCampo(){
    let chute = document.querySelector("input");
    chute.value = '';
}

function reiniciarJogo(){
    numeroDeTentativa = 1;
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    exibirMensagemInicial();
    document.getElementById('reiniciar').disabled = true;
    document.getElementById('chute').disabled = false;
    verificaSeNumeroFoiUsado();
}