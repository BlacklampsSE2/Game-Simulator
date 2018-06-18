<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<body>
	<button id="startButton" onclick="start()">Start</button>
	<button onclick="stop()">stop</button>
	<button onclick="clearText()">clear</button>
	<textarea id="displayTextArea" readonly="readonly" rows="30" cols="45"></textarea>
	<script>
		var eventSource=null;
		function start(){
			eventSource=new EventSource("http://localhost:8080/SSEServlet");
			eventSource.onopen=function(){displayTextArea.value+= 'Connected...'+'\n';};
			eventSource.onmessage=function(message){displayTextArea.value+=message.data+'\n\n'};
			eventSource.onerror=function(){displayTextArea.value+='Error Occured...'+'\n'};
			startButton.disabled=true;
		}
		function stop(){
			eventSource.close();
			startButton.disabled=false;
		}
		function clearText(){
		displayTextArea.value='';
		}
	</script>
</body>
</html>