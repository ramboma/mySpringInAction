<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-03-09
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="embeddedFlow">
    <p class="success">Embedded flow ended successfully!</p>
    <div>
        <p>
            <a id="startFlow" href="embedded-flow">Start Over</a>
            <script type="text/javascript">
                Spring.addDecoration(new Spring.AjaxEventDecoration({elementId:"startFlow",event:"onclick",params:{fragments:"body",mode:"embedded"}}));
            </script>
        </p>
    </div>
</div>
</body>
</html>
