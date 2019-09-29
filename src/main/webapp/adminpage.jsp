<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin page</title>
</head>
<body>
<h2>ADD A BOOK</h2>
<form action="addbook">
book category id: <input type="text" name="book_category_id"><br>
book category name: <input type="text" name="book_category_name"><br>
book name:<input type="text" name="book_name"><br>
book price:<input type="text" name="book_price"><br>
book description: <input type="text" name="book_description"><br>
<input type="submit" value="addbook">
</form>
<BR><BR>

<h2>UPDATE A BOOK BY SEARCHING</h2>
<form action="viewbook">
<input type="text" name="bookid" placeholder="bookid">
<input type="submit" value="viewbook">

</form>
<form action="updatebook">
book id:<input type="text" name="book_id" value="<%=request.getAttribute("b_id") %>" >
book category id: <input type="text" name="book_category_id" value="<%=request.getAttribute("b_cid") %>"><br>
book category name: <input type="text" name="book_category_name" value="<%=request.getAttribute("b_cname") %>"><br>
book name:<input type="text" name="book_name" value="<%=request.getAttribute("b_name") %>"><br>
book price:<input type="text" name="book_price" value="<%=request.getAttribute("b_price") %>"><br>
book description: <input type="text" name="book_description" value="<%=request.getAttribute("b_desc") %>"><br>
<input type="submit" value="update">
</form>
<BR><BR>

<h2>DELETE A BOOK</h2>
<form action="deletebook">
<input type="text" name="book_id" placeholder="book Id">
<input type="submit" value="delete">
</form>
<br><br>

<h2>VIEW ALL BOOKS</h2>
<form action="viewallbooks">
<input type="submit" value="View books">
</form>
</body>
</html>