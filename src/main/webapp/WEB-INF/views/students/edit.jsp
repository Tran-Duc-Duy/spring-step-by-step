<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>edit page</title>
    <base href="/">
</head>
<body>
    <h1>edit page</h1>
    <hr>
    <form action="students/update" method="post">
        Student ID: <input type="text" name="studentId" value="${student.getStudentId()}" /> <br />
        Name: <input type="text" name="studentName" value="${student.getStudentName()}"/> <br />
        <button>Update</button>
        <button formmethod="get" formaction="students/list">List</button>
        <button formmethod="get" formaction="students/search">Search</button>
    </form>
</body>
</html>