
<%@page import="weather.*"%>
<%@page import="weatherGetter.WeatherGetter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>div{width:250px;margin-left:43%;margin-top:6%;height: 220px;color:white;border:2px solid black; }
        p{margin-left:20px  }</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BKWeather</title>
    </head>
    <body background="http://wallpapercave.com/wp/4W2pw5V.jpg">
        <div>
        <%Current weather=WeatherGetter.Weather();%>
        <h1 align="center"><%=weather.getCity().getName()%></h1> 
        <p>Country code: <%=weather.getCity().getCountry()%><br>Temperature:<%=weather.getTemperature().getValue()%>°C<br>
            Clouds: <%=weather.getClouds().getName()%><br>Wind Direction: <%=weather.getWind().getDirection().getName()%><br>
            Wind Speed: <%=weather.getWind().getSpeed().getValue()%> mps<br>
            <img src="http://openweathermap.org/img/w/<%=weather.getWeather().getIcon()%>.png"></p>
        </div>
</html>
