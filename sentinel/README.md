# sentinel

##  简介
nacos持久化sentinel规则示例


## 说明

- sentinel启动命令：

```java
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -Dauth.enabled=true -Dsentinel.dashboard.auth.username=sentinel -Dsentinel.dashboard.auth.password=123456 -jar sentinel-dashboard-1.8.4.jar
```

- 限流规则

```json
[
{
"resource": "/sentinel/hello",
"limitApp": "default",
"grade": 1,
"count": 1,
"strategy": 0,
"controlBehavior": 0,
"clusterMode": false
}
]
```

- resource：资源名
- limitApp：针对来源，若为 default 则不区分调用来源
- grade：阈值类型，0表示线程数，1表示QPS
- count：单机阈值
- strategy：流控模式，0表示直接，1表示关联，2表示链路
- controlBehavior：流控效果，0表示快速失败，1表示Warm Up，2表示排队等待
- clusterMode：是否集群

## 调用地址
- 测试地址：http://127.0.0.1:9000/sentinel/hello

- sentinel访问地址：http://127.0.0.1:8080/     sentinel/123456

- sentinel 官网地址：https://sentinelguard.io/zh-cn/docs/open-source-framework-integrations.html

- sentinel黑白名单设置：
https://blog.csdn.net/qq_41538097/article/details/124330640
https://blog.csdn.net/W_317/article/details/111416140






