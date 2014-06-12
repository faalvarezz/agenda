<%-- 
    Document   : index
    Created on : 06-05-2014, 08:37:58 PM
    Author     : fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese libro</h1>
        <form action="agregar.do" method="POST">
            <table border ="9">
                <tr>
                    <td>Isbn:</td>
                    <td><input type="text" name="txtIsbn" value="" /></td>
                </tr>
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" name="txtNombre" value="" /></td>
                </tr>
                <tr>
                    <td>Autor:</td>
                    <td><input type="text" name="txtAutor" value="" /></td>
                </tr>
                <tr>
                    <td>Editorial:</td>
                    <td><input type="text" name="txtEditorial" value="" /></td>
                </tr>
                <tr>
                    <td>Paginas:</td>
                    <td><input type="text" name="txtPaginas" value="" /></td>
                </tr>
                <tr>
                    <td>Año:</td>
                    <td><input type="text" name="txtAno" value="" /></td>
                </tr>
            </table><br><br>
            <input type="submit" value="Agregar" />
        </form>
    </body>
</html>
