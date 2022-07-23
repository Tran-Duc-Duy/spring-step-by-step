<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Forms</title>
</head>
<body>
    <form:form action="/students/saveOrUpdate" method="post" modelAttribute="student">
        Student ID: <form:input path="student.studentId"/> <br />
        Name: <form:input path="name"/> <br>
        Email: <form:input path="email"/> <br />
        Mark: <form:input path="mark"/> <br />
        Faculty: <form:select path="faculty" items="${faculties}"></form:select> <br/>
        <form:radiobuttons path="gender" items="${genders}"></form:radiobuttons> <br>
        <form:checkboxes items="${hobbies}" path="hobbies"/>
        <form:button>Save</form:button>
    </form:form>
</body>
</html>