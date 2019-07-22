# Bukkit 插件脚手架

你通过此脚手架，快速编写出Spigot/Bukkit插件。

## 脚手架介绍     
名称|描述
-|-
basic|基本的插件
command|实现命令处理
event|实现事件监听
ormlite|包含了ORMLITE框架，可以进行数据库操作
stand|标准插件，包含了ormlite框架和常用前置

## 使用方法
克隆本仓库，然后选择一个适合的脚手架，复制到你的项目文件夹。
重命名脚手架中的包名，并修改pom.xml的 中的`groupId`,`artifactId`,`version`
之后就可以在脚手架的基础上，创造你的插件了！

## 打包命令(请确认你已经安装了maven)
```
mvn package
```
