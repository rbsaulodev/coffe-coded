let chute;
let tentativas = 1;
let numeroMaxino = 20;
let numeroSecreto = parseInt(Math.random()* numeroMaxino) + 1;
let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';

alert("Seja bem-vindo ao jogo do Número Secreto. Boa sorte!");

while(chute !== numeroSecreto){
    
    chute = Number(prompt(`Digite o número secreto! (de 0 ao ${numeroMaxino})`));

    if(chute === null){
        alert(`Por favor digite um número`);
    }

    else if(chute === numeroSecreto){
        palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        alert(`Parabéns você acertou o número secreto: ${numeroSecreto} com ${tentativas} ${palavraTentativa}`);
    }

    else{
        tentativas++;
        palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        
        if(chute > numeroSecreto){
            alert(`O número secreto é menor que ${chute}`);
        }
        else{
            alert(`O número secreto é maior que ${chute}`);
        }
    }
}