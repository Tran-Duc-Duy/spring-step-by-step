<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student detail</title>
</head>
<body>
    <h3>Student ID: ${student.studentId}</h3>
    <h3>Name: ${student.name}</h3>
    <h3>Email: ${student.email}</h3>
    <h3>Hobbies: ${student.hobbies}</h3>
    <h3>Gender: ${student.gender}</h3>
    <%--b3--%>
    <h3>Image: <img src="/images/${student.imageUrl}" alt="img"></h3>
</body>
</html>