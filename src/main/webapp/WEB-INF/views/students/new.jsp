<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>New student</title>
    <base href="/">
</head>
<body>
    <h1>New student</h1>
    <form action="students/saveOrUpdate" method="post">
        Student ID: <input type="text" name="studentId" /> <br />
        Name: <input type="text" name="studentName" /> <br />
        <button>Save</button>
        <button formmethod="get" formaction="students/list">List</button>
        <button formmethod="get" formaction="students/search">Search</button>
    </form>
</body>
</html>