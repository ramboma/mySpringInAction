<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-03-09
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="embeddedFlow">
    <p class="notice">This is step 2 of the embedded flow</p>
    <form id="step2" action="${flowExecutionUrl}" method="POST">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <button id="cancel" type="submit" name="_eventId_cancel">Cancel</button>
        <button id="previous" type="submit" name="_eventId_previous">&lt;&lt; Previous</button>
        <button id="finish" type="submit" name="_eventId_finish">Finish &gt;&gt;</button>
        <script type="text/javascript">
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId:'finish',event:'onclick',formId:'step2',params:{fragments:"body"}}));
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId:'previous',event:'onclick',formId:'step2',params:{fragments:"body"}}));
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId:'cancel',event:'onclick',formId:'step2',params:{fragments:"body"}}));
        </script>
    </form>
</div>
</body>
</html>
