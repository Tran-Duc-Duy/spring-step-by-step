<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List page</title>
    <base href="/">
</head>
<body>
    <h1>List students</h1>
    <hr>
    // table>tr>td*3
    <table>
        <tr>
            <td>Student ID</td>
            <td>Name</td>
            <td></td>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>
                    <a href="students/view-detail/${student.studentId}">View</a> |
                    <a href="students/edit/${student.studentId}">Edit</a> |
                    <a href="students/delete/${student.studentId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>