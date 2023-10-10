<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file uploaded result</title>
</head>
<body>
<h1>${msg }</h1>

 <img alt="img"  src="<c:url value="/resources/img/${filename }"/>" /> 
 <embed src="<c:url value="/resources/img/${filename }"/>" width="800px" height="2100px" /> 

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/PapaParse/4.1.2/papaparse.js"></script>
<script>
    function arrayToTable(tableData) {
        var table = $('<table></table>');
        $(tableData).each(function (i, rowData) {
            var row = $('<tr></tr>');
            $(rowData).each(function (j, cellData) {
                row.append($('<td>'+cellData+'</td>'));
            });
            table.append(row);
        });
        return table;
    }

    $.ajax({
        type: "GET",
        url:"<c:url value="/resources/img/${filename }"/>" ,
        success: function (data) {
            $('body').append(arrayToTable(Papa.parse(data).data));
        }
    });
</script>


</body>
</html>