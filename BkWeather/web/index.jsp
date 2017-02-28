
<%@page import="weather.*"%>
<%@page import="weatherGetter.WeatherGetter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BKWeather</title>
    </head>
    <body>
        <%Current weather=WeatherGetter.Weather();%>
        <h1><%=weather.getCity().getName()%></h1>
        <p>Country code: <%=weather.getCity().getCountry()%><br>Temperature:<%=weather.getTemperature().getValue()%> 
            <img src="http://openweathermap.org/img/w/<%=weather.getWeather().getIcon()%>.png"></p>
        
</html>
