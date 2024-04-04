const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const ibairro = document.querySelector(".bairro");
const icpf = document.querySelector(".cpf");
const idata = document.querySelector(".data");
const inome = document.querySelector(".nome");

function cadastrar(){
    fetch("http://localhost:8080/alunos",
        {
            headers: {
                "accept":"application/json",
                "content-Type": "application/json"
                
            },
            method: "POST",
            body: JSON.stringify({
                nome: inome.value,
                bairro: ibairro.value,
                cpf: icpf.value,
                data: idata.value
            })
        }
    )
    .then(function (res){console.log(res)})
    .catch(function (res){console.log(res)})

    console.log(idata);
    console.log(ibairro);
}

function limpar(){
    ibairro.value = "",
        icpf.value = "",
        idata.value = "",
        inome.value = ""
}

formulario.addEventListener("submit", function (event){
    event.preventDefault();
    cadastrar();
    limpar();
});