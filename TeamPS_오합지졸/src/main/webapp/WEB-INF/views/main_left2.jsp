<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
a:link {color: black;}
a:VISITED {color:black;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body background="resources/info.jpg">
	<script>
		function click(frm) {
			var url = "join_group.ps";
			var title = "�׷� �����ϱ�";
			window.open(
							'join_group.ps',
							"�׷� �����ϱ�",
							"width=500,height=175,scrollbars=no,toolbar=no,location=no,directories=no,top=300,left=550,noresize,resizeable=no");
			frm.target = title; //form.target �� �κ��� ������ form�� ������ ���� �ʽ��ϴ�. 
			frm.action = url;
			frm.method = "post";
			frm.submit();
		}
	</script>
	
	<script>
		function go() {
			
			
			var index = document.getElementById("sel").selectedIndex;
			var gnum = document.getElementById("sel").options[index].value;
			alert(gnum+"hihi")
		parent.location.href = 'group_main.ps?gnum='+gnum;
		
		}
	</script>
	


<form method="post" action="search.ps" target="right">
	<table>
		<c:if test="${!empty login }">
			<tr>
				<td colspan="3"> ${login } ��  &nbsp;&nbsp;</td>
			</tr>
			<tr style="font-size: 11px  " align="center">
				<td><a href="" style="text-decoration: none; ">��������</a></td>
				<td><a href="logout.ps" style="text-decoration: none;">�α׾ƿ�</a></td>
			</tr>
		</c:if>
		
		<tr>
			<td colspan="3" >
			
			<select id="sel" style="width: 225px"  onchange = "javascript:go();" ><option>���Ե�Ŭ��</option>
			 <c:forEach items="${list2 }" var="se">
				<option value = "${se.gmnum }"  >${se.gname }</option>
			</c:forEach>
		</select>
			
			</td>
		</tr>
	
		<tr>
			<td colspan="3"><a href="javascript:click();"><img src="resources/gmake.png" border="0" style="cursor: pointer;"></a></td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" name="search"
				placeholder="�˻�� �Է��ϼ���" style="width: 194px"></td>
			<td><input type="image" src="resources/ico_search.gif" style="cursor: pointer;"></td>
		</tr>
	</table>
</form>
</body>
</html>