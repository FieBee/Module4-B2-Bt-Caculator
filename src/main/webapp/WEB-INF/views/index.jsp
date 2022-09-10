<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/result/" method="post">
    <table>
        <tr>
            <td>
                <input id="sothunhat" name="num1" type="number">
            </td>
            <td>
                <input id="sothuhai" name="num2" type="number">
            </td>
            <td></td>
            <td>Result: </td>
            <td>${result} </td>
        </tr>
    </table>
    <table>
        <tr>
            <td>
                <button value="+" name="caculation">Cộng</button>
            </td>
            <td>
                <button value="-" name="caculation">Trừ</button>
            </td>
            <td>
                <button value="*" name="caculation">Nhân</button>
            </td>
            <td>
                <button value="/" name="caculation">Chia</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>