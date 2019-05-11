# 测评题目
## 题目说明

共5道题，数据库题目需要提前安装好mysql数据库，编程题以提供基础的Spring boot工程，使用maven构建，可直接运行。答题时间给半个小时。



## 准备条件

* 请在本地提前安装好MySQL数据库。
* 请在本地提前安装好IntelliJ Idea.
* 请准备一张纸和一支笔，用来作答第一题。



## 项目安装步骤

* 请将本项目clone到本地：

  ```java
  git clone https://github.com/ZhangGangTW/grad-exam-java-web.git
  ```

* 用IntelliJ Idea导入该项目：

  ![](http://ww1.sinaimg.cn/large/af4e9f79ly1g2x5i4676kj20tu152gq8.jpg)

* 运行该项目：

  ![](http://ww1.sinaimg.cn/large/af4e9f79ly1g2x5kkc1ebj22500r24b4.jpg)



## 作答题目

### 1. 问答题: 电器抽象

电器是指以电能来进行驱动的用具，冰箱、烤箱、蒸箱、微波炉都是电器， 现在市面上出现了一种集成度更高的产品，同时具备蒸、烤、微波的一体机。  

请根据你对这些电器的理解来设计类/接口(可以画在纸上)。

### 2. 实践题: 学生表查询

#### 请使用题目中的提供的SQL按照如下表格建立对应数据库及数据表, 并插入表格中的数据:

Database: school   
Table: student                    

| id        | name      | age       | class     |
|-----------|-----------|-----------|-----------|
| 1         | alice     | 22        | 1         |
| 2         | bob       | 30        | 2         |
| 3         | charlie   | 25        | 1         |

建库建表及插入数据SQL语句: 
```mysql
DROP SCHEMA IF EXISTS school;   
CREATE SCHEMA school;  
USE school;    
DROP TABLE IF EXISTS student;    
CREATE TABLE student  
(    
    id    INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,    
    name  VARCHAR(32) NOT NULL,  
    age   INT         NOT NULL,  
    class INT         NOT NULL    
);  
INSERT INTO student VALUES(NULL, 'alice', 22, 1);  
INSERT INTO student VALUES(NULL, 'bob', 30, 2);  
INSERT INTO student VALUES(NULL, 'charlie', 25, 1);  
```

**题目: 分别按照如下要求查询对应的学生信息**

1. 查询姓名为bob的学生信息
2. 查询所有年龄大于等于25岁的学生信息并按照年龄升序排序
3. 查询姓名中包含字母a的学生信息
4. 按照班级统计每个班级包含多少名学生



### 3. 实践题: 教师表建表查询

#### 3.1 按照如下表格建立对应的数据表, 并插入数据（其中一个教师可能会教多个班级的课程）  
Database: school  
Table: teacher  

| id        | name      | subject   | class     |
|-----------|-----------|-----------|-----------|
| 1         | david     | java      | 1,2       |
| 2         | erin      | mysql     | 1         |
| 3         | frank     | mysql     | 2         |

#### 3.2 查询参加erin老师讲课的学生列表



### 4. 编码题: 用户API实现

#### 已提供基础的Spring Boot Web工程和用户服务实现，在```UserController```中完成下列3个接口的开发。
1. 添加新用户
2. 根据用户ID查询用户信息
3. 根据用户ID删除该用户



### 5. 编码题: 使用TDD的方式实现新需求

需求：添加用户时需要校验用户名，规则是用户名不能为空，校验失败抛出```InvalidUsernameException```。  
（请在在已有的```UserService```的```addUser```方法中完成）