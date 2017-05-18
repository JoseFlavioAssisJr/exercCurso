<%-- 
    Document   : inserirAluno
    Created on : 18/05/2017, 19:13:37
    Author     : José Flávio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <form action="ServletAluno" method="get">
        <center>
        <h1>Inserir Aluno</h1>
        <p>
            <table border="0">
            <tr align ="left"><td>
            Matricula: <input type="text" name="vmatricula" value="" /><p>
            Nome:<input type="text" name="vnome" value="" /><p>
            Curso: <select name="vcurso">
                <option>Sistemas de Informação</option>
                <option>Ciência da Computação</option>
                <option>Engenharia da Computação</option>
            </select><p>
            Período:<input type="text" name="vperiodo" value="" /><p>
            Ano de Ingresso:<input type="text" name="vanoDeIngresso" value="" /><p>
            Renda:<input type="text" name="vrenda" value="" /><p>
            <p>
                <input type="hidden" name="opcao" value="1" />
                <input type="submit" value="Cadastrar" />
                <input type="reset" value="Cancelar" />
        </center>
            </form>
            </td></tr></table>
    </body>
</html>
