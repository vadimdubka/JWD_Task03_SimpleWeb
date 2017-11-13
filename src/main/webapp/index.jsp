<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index page</title>
</head>
<body>

<form action="Controller" method="get">
    Name: <input type="text" name="name" value=""/><br/>
    Surname: <input type="text" name="surname" value=""/><br/>
    <input type="hidden" name="command" value="show_users_by_criteria">
    <input type="submit" value="Show users by criteria"/><br/>
</form>

<form action="Controller" method="get">
    <input type="hidden" name="command" value="show_all_users">
    <input type="submit" value="Show all users">
</form>

</body>
</html>
