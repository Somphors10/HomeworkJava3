<!DOCTYPE html>
<html>
<head>
    <title>Submitted Data</title>
</head>
<body>
    <h2>Submitted Data</h2>
    <p>Email: ${student.email}</p>
    <p>Password: ${student.password}</p>
    <p>Birthday: ${student.birthday}</p>
    <p>New Student: ${student.newStudent ? 'Yes' : 'No'}</p>
    <p>Favorite Color: <span style="color:${student.favoriteColor}">${student.favoriteColor}</span></p>
    <p>Terms and Conditions: ${student.terms ? 'Agreed' : 'Not Agreed'}</p>
</body>
</html>