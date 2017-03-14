<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-03-10
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <title></title>
</head>
<body>
<h2>Place content here</h2>
<form>
    <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
    <input type="text" name="phoneNumber"/>
    <input type="submit" name="_eventId_phoneEntered" value="lookup customer"/>
</form>
</body>
</html>
