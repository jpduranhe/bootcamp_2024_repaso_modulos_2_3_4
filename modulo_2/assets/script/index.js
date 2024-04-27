

function validarFormulario(){
    $('#todobien').hide();
    $('#todomal').hide();


    const nombre=$('#nombre').val();
    const raza=$('#raza').val();
    const genero=$('#genero').val();
    
    if(nombre !== '' && raza!== '' && genero!==''){
        $('#todobien').show();
    }else{
        $('#todomal').show();
    }
}
function limpiarFormulario(){
    $('#nombre').val('');
    $('#raza').val('');
    $('#genero').val('');
    $('#todobien').hide();
    $('#todomal').hide();
}