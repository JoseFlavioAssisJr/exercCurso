<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : listarAlunos
    Created on : 18/05/2017, 20:07:35
    Author     : José Flávio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <h1>Alunos Cadastrados</h1>
        <p>
            <table cellspacing="2" cellpadding="5" border="2">
                <tr>
                    <th>Matricula</th>
                    <th>Nome</th>
                    <th>Curso</th>
                    <th>Período</th>
                    <th>Ano de Ingresso</th>
                    <th>Ação</th>
                </tr>
                <c:forEach var="aluno" items="${sessionScope.lista}">
                    <tr>
                        <td>${aluno.matricula}</td>
                        <td>${aluno.nome}</td>
                        <td>${aluno.curso}</td>
                        <td>${aluno.periodo}</td>
                        <td>${aluno.anoDeIngresso}</td>
                        <td>Remover</td>
                    </tr>
                </c:forEach>
                
                
            </table>
        <p>
        <a href="inserirAluno.jsp">Cadastrar novo aluno</a>
    </center>
    </body>
</html>
