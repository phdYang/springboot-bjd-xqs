# SpringBoot + MyBatis 
> 铁路线桥隧状态监测系统

目前项目结构为：

* src
    * main
        * java/
            * com.bjd515.bjdxqs/controller: 主要放置和前端的交互接口。返回视图数据VO （待完善）
            * com.bjd515.bjdxqs/filter: 用于实现一些过滤器功能，如CROS的实现
            * com.bjd515.bjdxqs/mapper: 编写DAO层（待优化）
            * com.bjd515.bjdxqs/model：实体类（待优化）
            * com.bjd515.bjdxqs/service：业务逻辑处理（待优化）
            * com.bjd515.bjdxqs/utils: 一些工具类的实现
            * com.bjd515.bjdxqs/VO: 视图层返回前端的数据
        * resources/
            * static: 前端静态资源
            * templates: 模板文件（前后端分离项目不涉及）
            * application.properties: 核心配置文件
    * test: 单元测试类

目前完成的功能：
1. [] 设备管理 <br>
   1. [] 传感器增加
   2. [] 传感器修改
   3. [] 传感器删除
   4. [x] 传感器全部查询
   5. [] 传感器三个条件查询
   6. [x] 条件框查询
2. [] 监测数据折线显示
    1. [] 树形选择框多选查询选中
    2. [] 日期组件
    3. [] 折线图多对象显示Echarts
3. [] 监测数据预测
     1. [] 树形选择框多选查询选中
     2. [] 日期组件
     3. [] 折线图多对象显示Echarts
     4. [] 上传模型组件
     5. [] 使用模型
4. [] 数据报警
5. [] 用户管理
6. [] 用户日志查询

## 下一步解决的问题

1 如何记录日志，能否借助aop；<br>
2 如何做登录验证，目前的方法是存储在前端的session中；<br>
3 如何完善DAO，service,controller <br>