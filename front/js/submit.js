const fileInput = document.querySelector("input[type=file]");
const output = document.querySelector(".output");
const submit = document.querySelector("form")

const url = "http://127.0.0.1:8080/v1/inovacoes/xml/post"
const [file] = fileInput.files;

const parser = new DOMParser();
const _parser = new XMLSerializer;
// const xmld = XMLDocument;

const stream = parser.parseFromString(file.text(),"application/xml");



submit.addEventListener("submit",async () =>{
    const response = await fetch(url,
        {
        method:"POST",
        mode: "no-cors",
        cache:"no-cache",
        body:file,
        headers:{

        
            "Accept": 'application/xml',
            "Content-Type": 'application/xml',
            "Access-Control-Allow-Origin": "*",
            "Content-Type": "application/xml",
        }
        }
    )
    .catch((err)=>console.log(err))
    if (file) {
    
      output.innerText = await file.text();
    }

});
