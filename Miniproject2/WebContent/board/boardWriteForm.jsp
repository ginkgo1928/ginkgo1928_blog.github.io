<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>글쓰기</h1>
<form name="boardwriteform" method="post" action="/Miniproject2/board/boardWrite.do">
<table border="1" align="left"  width="700" >

<tr>
	<th width="80"> 제목</th>
	<td><input type="text" name="subject" id="subject" placeholder="제목 입력"  style="width: 500px;"></td>
</tr>

<tr>
	<th width="80">내용</th>
	<td><textarea name ="content" placeholder ="내용을 입력" id="content" style="width: 500px; height: 500px;"></textarea>
</tr>
	
<tr>
		<td colspan="2" align="center">
		<input type="button" value="글쓰기" onclick="checkBoard()"> 
		<input type="reset" value="다시작성">
	</td>
</tr>

</table>
</form>

<script src="../js/boardjs.js" type="text/javascript"></script>
