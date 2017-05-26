
// Get the modal
var modal = document.getElementById('myModal');


function openMessage()
{
	modal.style.display = "block";
}


function closeMessage() 
{ 
	modal.style.display = "none";
}

window.onclick = closeMessage();
window.onload = openMessage();