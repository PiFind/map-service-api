# 地图服务标准API

这里面规定了地图服务的标准接口和模型，其主要目的是为其他项目提供了标准通用的接口。

## 模块介绍

* [common](common/README.md) : API中一些通用的模型和常量（枚举）定义
* [place-api](place-api/README.md) : 地点服务标准接口和模型定义的模块
* [poi-api](poi-api/README.md) : POI(Point of Interest, 兴趣点) 服务标准接口和模型定义的模块

## Maven 引入方式

**第一步** 请在 Maven 的 setting.xml 中添加如下服务器配置

```xml
<servers>
    <server>
      <id>pifind-maven-releases</id>
      <username>subscriber</username>
      <password>PiFind@2023$</password>
    </server>
    <server>
      <id>pifind-maven-snapshots</id>
      <username>subscriber</username>
      <password>PiFind@2023$</password>
    </server>
</servers>
```

**第二步** 在项目中增加 pifind 仓库

```xml
<repositories>
    <repository>
        <id>pifind-maven-releases</id>
        <url>https://pifind.mvn.pub/repository/maven-releases/</url>
    </repository>
    <repository>
        <id>pifind-maven-snapshots</id>
        <url>https://pifind.mvn.pub/repository/maven-snapshots/</url>
    </repository>
</repositories>
```

**第三步** 在项目的 pom.xml 中加入如下依赖

```xml
<!-- 地点服务标准API -->
<dependency>
  <groupId>io.pifind.map</groupId>
  <artifactId>place-api</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

<!-- POI服务标准API -->
<dependency>
    <groupId>io.pifind.map</groupId>
    <artifactId>poi-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>

```