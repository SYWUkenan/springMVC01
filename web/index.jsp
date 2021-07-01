<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2021-06-02
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.0/jquery.min.js"></script>
    <script type="text/javascript">

      $(function(){


        $("#btn1").click(function(){


        $.ajax({
          url:"${pageContext.request.contextPath}/json/response03",
          method:"post",
          data:"吴雨声",
          contentType:"application/json",
          //如果是这种类型传输，传输数据可以用{"":'","":""}传输
          success:function(result){
            alert(result.name);
          }

        });
        })

        $("#btn2").click(function(){
          var  order={'id':5,'name':'wuyusheng'};
          var jsonValue=JSON.stringify(order);
          $.ajax({
            url:"${pageContext.request.contextPath}/json/response04",
            method:"post",
            // data:'{"id":4,"name":"魏语婷","password":"wei","birthday":"2021-07-01"}',
            data:jsonValue,
            contentType:"application/json",
            //如果是这种类型传输，传输数据可以用{"":'","":""}传输
            success:function(result){
              alert(result.name);
            }

          });
        })

        $("#btn3").click(function(){
          var  order={'id':6,'name':'wuyusheng'};
          var jsonValue=JSON.stringify(order);
          $.ajax({
            url:"${pageContext.request.contextPath}/json/response05",
            method:"post",
            // data:'{"id":4,"name":"魏语婷","password":"wei","birthday":"2021-07-01"}',
            data:jsonValue,
            contentType:"application/json",
            //如果是这种类型传输，传输数据可以用{"":'","":""}传输
            success:function(result){
              alert(result.name);
            }

          });
        })

        $("#btn4").click(function(){
         var order1={"id":7,"name":"张三","password":"123","birthday":"2021-07-01"};
         var order2={"id":8,"name":"lisi","password":"123","birthday":"2021-07-01"};
         var order = new Array();
         order.push(order1);
         order.push(order2);
          $.ajax({
            url:"${pageContext.request.contextPath}/json/response06",
            method:"post",
            // data:'[{"id":7,"name":"张三","password":"123","birthday":"2021-07-01"},' +
            //         '{"id":8,"name":"李四","password":"456","birthday":"2021-07-01"}]',
            data:JSON.stringify(order),
            contentType:"application/json",
            //如果是这种类型传输，传输数据可以用{"":'","":""}传输
            success:function(result){
              alert(result.name);
            }

          });
        })
      })

    </script>
  </head>
  <body>
  <input type="submit"  value="单个参数传递" id="btn1">
  <input type="submit"  value="对象进行传递" id="btn2">
  <input type="submit"  value="map数据对象进行传递" id="btn3">
  <input type="submit"  value="对象进行List传递" id="btn4">
  </body>
</html>
