

function validarPassword(){
	pass= document.getElementById("password").value;
	pass2 = document.getElementById("confirmar_password").value;
	
	if(pass!==pass2){
		document.getElementById("confirmar_password").classList.add('border');
		document.getElementById("confirmar_password").classList.add('border-danger');
	}else{
		
		document.getElementById("confirmar_password").classList.remove('border');
		document.getElementById("confirmar_password").classList.remove('border-danger');
	}
}



  var loadFile = function(event, id) {
    var img = document.getElementById(id);
    img.src = URL.createObjectURL(event.target.files[0]);
  	 img.style.width='310px'
     img.onload = function() {
      URL.revokeObjectURL(img.src) // free memory
    }
  };
