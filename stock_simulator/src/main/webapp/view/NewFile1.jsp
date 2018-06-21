<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#wss{opacity:0;
-webkit-transsition:opacity 1.0s liner 0s;
transition:opacity 1.0s linear 0s;}
</style>
<script>
var was_i=0;
var wss_array=["cute","Happy","Payful"];
var wss_elem;
function wssNext()
{
	wss_i++;
	wss_elem.style.opacity=0;
	if(wss_i>(wss_elem.length-1))
		{
		wss_i=0;
		}
	window.setTimeout('wssSlide()',1000);
	
}
function wssSlide() {
	wss_elem.innerHTML=wss_array[was_i];
	wss_elem.style.opacity=1;
	window.setTimeout('wssNext()',2000);
}
</script>
</head>
<body>
My <span id=wss></span>
<script>wss_elem=document.getElementById("wss");wssSlide();</script>
</body>

</html>