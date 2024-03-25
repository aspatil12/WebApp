<html>
    <head>Simple Web Application</head>
    <body>
        <center>
            <h1>Welcome to Login page</h1>
            <h2>Login to Proceed</h2>
            <font color="red">${errormessage}</font>
            <form method="post">
                Username: <input type="text" name="name"/><br>
                <br>Password: <input type="text" name="password" required/><br>
                <br><input type="submit"/>
            </form>
        </center>
    </body>
</html>