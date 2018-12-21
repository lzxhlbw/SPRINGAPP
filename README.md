# SPRINGAPP
软件体系架构作业


### 2018/12/21<br>

404错误状：加入表单部分后，可能因为版本问题，多版本springmvc造成无报错404


### 解决无故404


原因：spring版本问题，统一版本之后问题解决

classnotfound可能是没有引入相关jar包或者版本不对，jar包里没有相应类

spring-form.tld标签库的使用

手动拖拽jar包进目录并不合理，加入外来包之后要在project structure的output layout里put into output root


### 添加dao层

>步骤：

>新建数据库，插入数据
>编写jdbc配置文件
>引入依赖的JAR包：commons-dbcp、commons-pool、aopalliance、mysql-connector-java
>更改配置文件springapp-servlet、web、applicationContext内容，加入监听器，更改数据源
>编写持久层（操作数据库数据）
>修改服务类相关区域

### 出现的问题和解决方式

1.can't load JDBC driver"com.mysql.jdbc.Driver"------导入JDBC驱动（mysql-connector-java.jar）

2.applicationContext里的aop无法识别-------在开头加上命名空间

3.can't open JDBCConnectionFactory(unknown database 'xxx")-----可能原因有很多，首先检查url、username、password有无问题，还可能是缓存问题，这次我的原因是有两个MySQL服务在启动（之前用过禅道。找了好久的原因在一个论坛里找到了类似的解决方式），将一个服务问题解决。还可能是最大连接池数目超了（暂时没有遇到）

4.数据库只能读不能写-------在配置文件里设置了read-only，改掉即可




