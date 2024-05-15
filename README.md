# Score-Enquiry-System
前端介绍---基本框架：

1.进入页面从Login.html开始:
里面包含登录判断，以及注册功能（注册功能还没实现）


2.Login.html进行登录验证的是Class-ligon：
       ligon充当的主要是一个中转站，用来判断用户和密码是否匹配->事件监听
       若正确，则进入Index.jsp容器这是一个中转页面，
       可以选择进行学生系统端(Servlet)，课程系统端（还未实现）


3.进入学生系统端：Class-StudentList(Servlet) 交给list.jsp处理显示页面，地址仍然是StudentList.。
好处：页面，StudentList页面
可以在StudentList类中，实现后端的信息处理，
同时借助jsp容器实现前端的页面操作以及跳转

--------------------------------------------------------------------

后端的介绍：
(1)Student类,该类包含了匿名包装了一下学生信息的变量，以及
构造器，设置器和获得器。
该类主要是方便在StudentDao中调用出来的数据库信息，存放和调用。

(2)DBHC是一个数据库连接的类；
该类主要实现数据库的连接与关闭，为StudentDao的实现数据库操作做准备。

(3)StudentDao是一个是实现数据库的增删查改功能的函数，并把它赋值到student类中方便数据的调用。


因此user与userDao的功能与上述的student实例类似，
该类主要是实现注册功能，后续再详细说。

(4)Lesson和lessonDao主要是实现课程的查询


--------------------------------------------------------------------

功能的描述：

1.主页面的功能：

显示所有学生的信息，以及含有一下增加和查询的按钮

实现的类有：StudentList（Servlet）, List.jsp

StudentList执行流程:
   1.在doGet中实现对StudentDao的调用，查找出来学生的所有信息
   2.把调用出来的信息存进属性
   3.使用请求转发List.jsp，进行页面布置
    4.在List.jsp中，把存进属性里的值调出来，在表格中显示出来

--------------------------------------------------------------------

2.增加信息功能：（其他功能也是相同的思路，例如：查询，删除）

涉及的相关知识:
     请求转发和重定向的区别：前者转发一次，后者转发两次。
     请求转发：在doGet是把一个jsp获取进来
               在doPost中是跳进去另一个servlet

增加功能的代码流程：
     1.进入了一个StudentList类中，而这个类有一个请求转发的List.jsp     
     2.在这个List.jsp的容器中，有一个“增加” 按钮
     3.点击按钮后会进入一个add.jsp容器中，该容器中会有一份表单
     4.提交表单后会交给add类来处理（Servlet类）（事件监听）       
     

Add类（servlet类）中的具体操作:
1.将表单的信息进行获取，将其获取到该类中
2.将数据的数据类型进行处理，传入mysql中
3.启动Student类的设置器，把数据传入student类
4.调用StudentDao类----addStudent函数
5.进行请求转发，再次进入StudentList中，就可以看到更新的数据


-------------------------------------------------------------------

3.实现修改和查询功能：
（1）在给table赋值时候，给href标签赋值，
 然后传递给Servelt,调用lessonDao进行查询


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/1.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/2.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/3.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/4.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/5.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/6.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/7.png)


![image](https://github.com/Jonathan522566/Score-Enquiry-System/blob/main/image/%E9%A1%B5%E9%9D%A2%E5%9B%BE%E7%A4%BA/8.png)





