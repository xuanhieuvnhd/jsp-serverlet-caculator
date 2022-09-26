<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Máy tính đơn giản</h1>
<form method="post" action="/calculate">
    <fieldset>
        <legend>Máy tính</legend>
        <table>
            <tr>
                <td>Số thứ nhất: </td>
                <td><input name="first-operand" type="text"/></td>
            </tr>
            <tr>
                <td>Chọn phép tính: </td>
                <td>
                    <select name="operator">
                        <option value="+">Cộng</option>
                        <option value="-">Trừ</option>
                        <option value="*">Nhân</option>
                        <option value="/">Chia</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Số thứ 2: </td>
                <td><input name="second-operand" type="text"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Tính toán"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
