var fileInput = document.querySelector("input[type='file']");
const output = document.querySelector(".output");
const submit_query = document.querySelector("button[type=submit]");
const url = "http://127.0.0.1:8080/v1/inovacoes/nfe/post";
var [file] = fileInput.files;

async function onclickevent(){
    
    console.log("funciona");
    console.log();
    
    [file] = fileInput.files;
    xmlValue = await file.text();

    console.log(file.text());
    const dom = new DOMParser().parseFromString(file.value,"application/xml");
    const response = await fetch(
        url,
        {
        method:"post",
        mode: "no-cors",
        body:dom,
        headers:{
            "Content-Type": "application/xml",
            "ACCEPT": "application/xml",
            "Access-Control-Allow-Origin": "*",
        }
        }
    )
    .then((rs)=>{
        if (file) {
            output.innerText = dom;
          }
    })
    .catch((err)=>console.log(err))
}


