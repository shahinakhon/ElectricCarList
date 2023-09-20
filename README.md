# ElectricCarList
This is simple java project for Top Electric Car list website runned with TomCat Server 
<%@ page import="edu.dccc.topelectriccars.topelectriccars.ElectricCar" %>
<%@ page import="edu.dccc.topelectriccars.topelectriccars.ElectricCarList" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Car and Driver Top Electric Cars</title>
    <style>
        body {
            font-family: "Roboto", sans-serif;
            background-color: rgba(102, 93, 103, 0.87);
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            margin-top: 20px;
        }
        .car-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            align-items: center;
            max-width: 1200px;
            margin: 0 auto;
        }
        .car-card {
            background-color: #fff5ff;
            border: 2px solid #333;
            border-radius: 8px;
            padding: 20px;
            margin: 10px;
            width: calc(33.33% - 20px);
            box-sizing: border-box;
        }
        .car-card img {
            display: block;
            margin: 0 auto 10px;
            max-width: 100%;
            height: auto;
        }
        .text-frame {
            border: 2px solid #333; /* Border width, style, and color */
            padding: 10px; /* Optional padding to create space between text and border */
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<br/>

<h1> 12 Top Selling Electric Vehicles of 2021  </h1>
<div class="car-container">
<%
    // Following 3 lines simulate retrieving data from a database or other data source
    ElectricCarList cl = new ElectricCarList();
    cl.populateElectricCarList();
    ArrayList<ElectricCar> carList = cl.getCarList();

    // Dynamically generate top car list
    for (ElectricCar car: carList ) { %>
<div class="car-card">
    <h2><%= car.getRank()%>. <%= car.getModel()%></h2>
    <img src=<%=car.getImgSrc()%>>
    <div class="text-frame">
        <ul>
            <li>Base price: <%=car.getFormattedBasePrice()%></li>
            <li>EPA Fuel Economy combined/city/highway: <%=car.getEpaFuelEconomy()%></li>
            <li>EPA Range: <%=car.getEpaMaxRange()%></li>
        </ul>
    </div>
</div>

<% } %>
</div>
</body>
</html>
