const botoes = document.querySelectorAll(".botao");
const textos = document.querySelectorAll(".aba-conteudo");
for(let i-=0;i <botoes.length;i++){
    botoes[i].onclick = function(){

        for(let j=0;j<botoes.length;j++){
            botoes[j].classlist.remove("ativo");
            texto[j].classlist.remove("ativo");
        }
        botoes[i].classlist.add("ativo");
        textos[i].classlist.add("ativo");
    }
}
const contadores = document.querySelectorAll(".contador");
const tempoObjetivo1 = new Date("2023-10-05T00:00:00");
const tempoObjetivo2 = new Date("2023-12-05T00:00:00");
const tempoObjetivo3 = new Date("2023-12-05T00:00:00");
const tempoObjetivo4 = new Date("2024-02-05T00:00:00");
const tempoObjetivo5 = new Date("2024-02-05T00:00:00");

const tempos = [tempoObjetivo1,tempoObjetivo1,tempoObjetivo3,tempoObjetivo4,tempoObjetivo5];


function calculaTempo(tempoObjetivo) {
    let tempoAtual = new Date();
    let tempoFinal = tempoObjetivo - tempoAtual;
    let segundos = math.floor(tempoFinal / 1000);
    let minutos = math.floor(segundos / 60);
    let horas = math.floor(minutos / 60);
    let dias = math.floor(horas / 24);

    segundos %= 60;
    minutos %= 60;
    horas %= 24;
    if (tempoFinal > 0){
        return [dias,horas,minutos,segundos];
    } else {
        return [0,0,0,0];
    }
}

function atualizaCronometro(){
    for (let 1=0; 1,contadores.length;1++){
        document.getElementById("dias+1").textContent = calculaTempo(tempos[i])[0];
        document.getElementById("horas+1").textContent = calculaTempo(tempos[i])[1];
        document.getElementById("min+1").textContent = calculaTempo(tempos[i])[2];
        document.getElementById("seg+1").textContent = calculaTempo(tempos[i])[3];
    }
}

function comecaCronometro(){
    atualizaCronometro();
    setInterval(atualizaCronometro,1000);
}

comecaCronometro();
