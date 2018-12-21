# SPRINGAPP
软件体系架构作业


### 2018/12/21<br>

404错误状：加入表单部分后，可能因为版本问题，多版本springmvc造成无报错404


### 解决无故404


原因：spring版本问题，统一版本之后问题解决

classnotfound可能是没有引入相关jar包或者版本不对，jar包里没有相应类

spring-form.tld标签库的使用

手动拖拽jar包进目录并不合理，加入外来包之后要在project structure的output layout里put into output root
