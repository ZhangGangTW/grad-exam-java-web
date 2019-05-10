# 测评题目
共5道题，数据库题目需要提前安装好mysql数据库，编程题以提供基础的Spring boot工程，使用maven构建，可直接运行

## 第一题 问答题: 电器抽象
电器是指以电能来进行驱动的用具，冰箱、烤箱、蒸箱、微波炉都是电器， 现在市面上出现了一种集成度更高的产品，同时具备蒸、烤、微波的一体机。  

请根据你对这些电器的理解来设计类/接口。

## 第二题 实践题: 学生表查询

#### 请使用题目中的提供的SQL按照如下表格建立对应数据库及数据表, 并插入表格中的数据:

Database: school   
Table: student                    

| id        | name      | age       | class     |
|-----------|-----------|-----------|-----------|
| 1         | alice     | 22        | 1         |
| 2         | bob       | 30        | 2         |
| 3         | charlie   | 25        | 1         |

建库建表SQL语句: 
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

## 第三题 实践题: 教师表建表查询

#### 1. 按照如下表格建立对应的数据表, 并插入数据（其中一个教师可能会教多个班级的课程）  
Database: school  
Table: teacher  

| id        | name      | subject   | class     |
|-----------|-----------|-----------|-----------|
| 1         | david     | java      | 1,2       |
| 2         | erin      | mysql     | 1         |
| 3         | frank     | mysql     | 2         |

#### 2. 查询参加erin老师讲课的学生列表

## 第四题 编码题: 用户API实现

#### 已提供基础的Spring Boot Web工程和用户服务实现，在```UserController```中完成下列3个接口的开发。
1. 添加新用户
2. 根据用户ID查询用户信息
3. 根据用户ID删除该用户

## 第五题 编码题: 使用TDD的方式实现新需求

需求：添加用户时需要校验用户名，规则是用户名不能为空，校验失败抛出```InvalidUsernameException```。  
（请在在已有的```UserService```的```addUser```方法中完成）