<%--
  Created by IntelliJ IDEA.
  User: hauringu
  Date: 2019/5/11
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book home index</title>
    <script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
</head>
<body>
<input id="title" type="text" placeholder="请输入书名">
<input type="button" onclick="findBook()" value="查询"/>
<table border="1">
    <tr>
        <td>id</td>
        <td>title</td>
        <td>author</td>
        <td>price</td>
        <td>state</td>
    </tr>
</table>
<script>
    function findBook()
    {
        $("tr").remove();
        var title = $("#title").val().trim();
        $.getJSON("queryBook", {"title": title}, function (json) {
            for (let i = 0; i < json.length; i++) {

                var tr = $("<tr><td></td><td></td><td></td><td></td><td></td></tr>");
                tr.find("td").eq(0).text(json[i].id);
                tr.find("td").eq(1).text(json[i].title);
                tr.find("td").eq(2).text(json[i].author);
                tr.find("td").eq(3).text(json[i].price);
                tr.find("td").eq(4).text(json[i].state);
                $("table:eq(0)").append(tr);
            }
        })
    }
</script>
</body>
</html>

