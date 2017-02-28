
<%@page import="weather.*"%>
<%@page import="weatherGetter.WeatherGetter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%Current weather=WeatherGetter.Weather();%>
        <%=weather.getCity().getName()%>
        <%=weather.getCity().getCountry()%>
        <%=weather.getTemperature().getValue()%>
        <%=weather.getWeather().getIcon()%>
</html>
