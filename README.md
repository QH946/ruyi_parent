# ruyi_parent

## 介绍

如意外卖项目，一款为餐饮企业打造的在线订餐软件  

技术选型
![img.png](img/1.png)

## 技术架构

Spring Boot
Mybatis
Mysql
Redis
JWT
Apache POI
Spring Task
阿里云OSS
微信小程序

## 开发环境

1. JDK 1.8
2. IntelliJ IDEA 2022.1.2
3. Maven 3.6.1
4. Node.js v16.15.1
5. Redis 7.0
6. MySQL 5.6.22
7. 微信开发者工具

## 前后端分离开发

### 介绍

|          | **开发语言**     | **开发工具**      | **运行环境** | **服务器** |
| -------- | ---------------- | ----------------- | ------------ | ---------- |
| 前端开发 | JavaScript、HTML | VS Code、Hbuilder | Node.js      | Nginx      |
| 后端开发 | Java             | IDEA、eclipse     | JDK          | Tomcat     |


首先修改mysql、redis密码、  wechat:appid: secret:  
以及project.config.json中的appid
### 前端工程

------

员工后台「ruyi-backend」
https://www.aliyundrive.com/s/AnRReoe66dQ
双击解压即可  
根目录cmd运行 npm run serve

访问前端工程，地址：http://localhost:8081

------

小程序源码 「ruyi-weixin」

https://www.aliyundrive.com/s/ivQsVr2ZhoN 

双击解压

导入到微信开发者工具

### 后端工程

Swagger  
接口文档访问路径为 http://localhost:8080/doc.html
![img.png](img/Swagger.png)

## **项目效果展示**

管理员展示
![img.png](img/ruyi.png)
小程序展示
![img.png](img/小程序.png)
