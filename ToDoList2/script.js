const al = document.querySelector("#al");
const sil = document.querySelector("#sil"); 
const inputext = document.querySelector("#inputtext");
const todolist = document.querySelector("#toDoList");


al.addEventListener("click", function(){
    let prg = document.createElement("p");

    prg.classList.add("prgcss");

     todolist.appendChild(prg);
     
     prg.innerText = inputext.value;
     
     inputext.value ="";
   
    
     prg.addEventListener("click",function(){

         prg.style.textDecoration = 'line-through';
         prg.style.color ='red';
         prg.style.backgroundColor = 'rgb(183 ,242 ,247)';
     });

     prg.addEventListener("dblclick",function(){
         todolist.removeChild(prg);
     });
    
    });

     sil.addEventListener("click",function(){
         todolist.innerHTML="";
     });
     
   
