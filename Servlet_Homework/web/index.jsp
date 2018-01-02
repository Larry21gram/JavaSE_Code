<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2017/12/28
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>提交信息</title>
    <script src="js/jquery-3.2.1.min.js"></script>
  </head>
  <body>

      <form action="/write" method="post">
          <label for="username">用户名</label>
          <input type="text" id="username" name="username">
          <label for="gender">性别</label>
          <input type="text" id="gender" name="gender">
          <input type="submit">
      </form>
  </body>

</html>
