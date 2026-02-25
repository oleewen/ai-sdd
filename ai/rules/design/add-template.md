# 架构设计说明书 (ADD)

## 文档信息
| 属性     | 值             |
| -------- | -------------- |
| 版本     | 1.0 (逆向整理) |
| 更新日期 |                |



## 应用架构

### 系统架构

> 采用C4架构规范，绘制系统级C4架构，明确系统、子系统的职责、边界和集成关系



### 职责边界

> 系统的职责和边界说明

| 系统名称 | 主要职责      | 边界说明      |
| -------- | ------------- | ------------- |
| 系统A    | 系统A主要职责 | 系统A边界说明 |
| 系统B    | 系统B主要职责 | 系统B边界说明 |



## 技术架构

### 技术选型

> 采用C4架构规范，绘制容器级C4架构，明确技术容器及其协作关系



### 部署架构

> 采用mermaid协议图表达系统部署拓扑



## 工程架构

### 分层架构

> 采用mermaid协议图表达分层架构（MVC、DDD等），查明架构模式、代码组织、代码分层



### 领域模型

> 采用mermaid协议类图表达，明确对象关系，类仅包含类名，不包含属性和方法



### 组件架构

> 采用C4架构规范，绘制组件级C4架构，明确各模块及其的协作、依赖关系



### 核心组件

| **[组件名称]** | **职责** | **位置** | **依赖** | **被依赖** |
| -------------- | -------- | -------- | -------- | ---------- |
|                |          |          |          |            |



### API清单

| 端点 | 方法 | 描述 | 请求体 | 响应体 |
| ---- | ---- | ---- | ------ | ------ |
|      |      |      |        |        |



## 数据架构

### 数据库选型

```mermaid
flowchart LR
    Start(["🚀 存储选型开始"]) --> Q1{"数据是否结构化<br/>且需要复杂事务？"}

    Q1 -->|"✅ 是"| RDB["🗄️ <b>关系型数据库</b>"]
		RDB-->|数据存储量|Q3{"<b>数据体量单表够存储？</b>"}
		Q3-->|单表存储|MySQL["🗄️ <b>RDB</b><br/>MySQLMySQL<br/>PostgreSQL<br/>OceanBase"]
		Q3-->|分布式存储|OB["🗄️ <b>RDB</b><br/>OceanBase"]
		
    Q1 -->|"❌ 否"| Q2{"核心访问模式是什么？"}

    Q2 --> Q_KV{"高并发 KV 读写？"}
    Q2 --> Q_DOC{"文档型灵活 Schema？"}
    Q2 --> Q_LOG{"海量日志/全文检索？"}
    Q2 --> Q_TS{"时序数据？"}
    Q2 --> Q_COL{"海量列式分析？"}
    Q2 --> Q_GRAPH{"图关系查询？"}
    Q2 --> Q_OBJ{"对象/文件存储？"}
    Q2 --> Q_MSG{"消息/事件流？"}

    Q_KV -->|是| A_KV["⚡ <b>缓存/KV 存储</b><br/>KVRocks<br/>Redis<br/>Memcached"]
    Q_DOC -->|是| A_DOC["📄 <b>文档数据库</b><br/>MongoDB"]
    Q_LOG -->|是| A_LOG["🔍 <b>搜索引擎</b><br/>Elasticsearch"]
    Q_TS -->|是| A_TS["⏱️ <b>时序数据库</b><br/>InfluxDB<br/>TDengine<br/>TimescaleDB"]
    Q_COL -->|是| A_COL["📊 <b>列式存储/分析</b><br/>Doris<br/>ClickHouse<br/>HBase"]
    Q_GRAPH -->|是| A_GRAPH["🕸️ <b>图数据库</b><br/>Neo4j<br/>JanusGraph"]
    Q_OBJ -->|是| A_OBJ["📦 <b>对象/文件存储</b><br/>MinIO<br/>S3<br/>HDFS"]
    Q_MSG -->|是| A_MSG["📨 <b>消息/事件流</b><br/>Kafka<br/>RockitMQ<br/>RabbitMQ"]

    style Start fill:#4CAF50,color:#fff,stroke:#388E3C
    style Q1 fill:#FF9800,color:#fff,stroke:#F57C00
    style Q2 fill:#2196F3,color:#fff,stroke:#1976D2

    style Q3 fill:#FFF3E0,stroke:#FF9800
    style Q_KV fill:#FFF3E0,stroke:#FF9800
    style Q_DOC fill:#FFF3E0,stroke:#FF9800
    style Q_LOG fill:#FFF3E0,stroke:#FF9800
    style Q_TS fill:#FFF3E0,stroke:#FF9800
    style Q_COL fill:#FFF3E0,stroke:#FF9800
    style Q_GRAPH fill:#FFF3E0,stroke:#FF9800
    style Q_OBJ fill:#FFF3E0,stroke:#FF9800
    style Q_MSG fill:#FFF3E0,stroke:#FF9800

    style RDB fill:#E8F5E9,stroke:#4CAF50,color:#1B5E20
    style MySQL fill:#E8F5E9,stroke:#4CAF50,color:#1B5E20
    style OB fill:#E8F5E9,stroke:#4CAF50,color:#1B5E20
   
    style A_KV fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_DOC fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_LOG fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_TS fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_COL fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_GRAPH fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_OBJ fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
    style A_MSG fill:#E3F2FD,stroke:#2196F3,color:#0D47A1
```





### 核心表结构

> 采用UML规范的ER图和mermaid协议



### 数据流图

> 采用mermaid协议图表达



## 文档约定

- 优先采用C4和UML规范
- 优先采用mermaid协议