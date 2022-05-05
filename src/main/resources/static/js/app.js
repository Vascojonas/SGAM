

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