<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<body background="resources/info.jpg">

	<script>
		function go(gnum) {
			var url = "newPlan.ps?";
			var title = "���� �߰�";
			window.open(
							'newPlan.ps?gnum='+gnum,
							"���� �߰�",
							"width=509,height=227, scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
		/* 	frm.target = title; //form.target �� �κ��� ������ form�� ������ ���� �ʽ��ϴ�. 
			frm.action = url;
			frm.method = "post";
			frm.submit(); */
		}
	</script>
	
		<script>
		function click1(frm) {
			var url = "groupinfo.ps";
			var title = "�׷� ����";
			window.open(
							'groupinfo.ps',
							"�׷� ����",
							"width=509,height=227, scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
			frm.target = title; //form.target �� �κ��� ������ form�� ������ ���� �ʽ��ϴ�. 
			frm.action = url;
			frm.method = "post";
			frm.submit();
		}
	</script>
	
	
	<script>

function button_event(){
if (confirm("���� Ż���Ͻðڽ��ϱ�?") == true){    //Ȯ��
//	document.getElementById("f").action = "group_main_top.ps";
//	alert(gnum)
//	document.getElementById("gnum").value = gnum;
	alert("Ż��Ǿ����ϴ�.");
//  document.form.submit();
}else{   //���
	alert("��ҵǾ����ϴ�!")
	return;
}
}

</script>

	<div style="font-family: �������" align="center">
	 ${login }��,<br>
	 �ݰ����ϴ� !</div> <br>
	<br>
	<form method="post" action="group_secession.ps?gnum=${g.gnum }" target="_parent">
		<img src="resources/addplan.png" border="0" style="cursor: pointer;" onclick="go(${g.gnum})">
		
		<br>
		<br>
		<a href="javascript:click1();"><img src="resources/ginfo.png" border="0" style="cursor: pointer;"></a>
		<br>
		<br>
		<img src="resources/gout.png" border="0" style="cursor: pointer;" onclick="button_event();">
		</form>
		<br>
		<a href = "deletegroup.ps?gnum=${g.gnum }" target="_parent"><img src="resources/gdel.png" border="0" style="cursor: pointer;"></a>
		<br>
		<br>
		<a href = "main.ps" target="_parent"><img src="resources/gohome.png" border="0" style="cursor: pointer;"></a>
	
</body>
</html>