<%
	String time = (String)request.getAttribute("serverTime");

	out.println("time:" + time);
	out.println("time:" + time);out.println("time:" + time);

%>
<html>
<head>
	<title>Home</title>
</head>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
 <script type="text/javascript">
 
 $(document).ready(function(){
  $("#banIdx").click(function(){
   
   var obj = new Object();
   obj.name = "adsf";
   obj.age = "asdf";
   obj.orderNumber = "orderNumber";
   
   var json_data = JSON.stringify(obj);
   //alert(json_data);
   $.ajax({
    type:'POST',
    url:'http://localhost:8080/getProcessPost',
    //data:'banIdx=banIdx',
	//accept : 'application/json',
    data:json_data,
    dataType:'json',
    contentType: 'application/json;charset=UTF-8',
    success: function(data){
     
     console.log("success !!!!");
     $.each(data, function(){
      console.log(data.name + ":" + data.age + ":"  + ":" + data.list.name);
     });
    }
   });
  });
 });
 
 </script>

<body>
<h1>
	home Hello world!  <p id="banIdx"> banIdx </p>
</h1>

<P>  The time on the server is  >> ${serverTime}  <<. </P>
</body>
</html>
