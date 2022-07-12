# nacos-discovery-dubbo

##  简介
nacos服务注册/发现-dubbo使用示例



## 说明

- 配资文件

```yaml
dubbo:
  registry:
    address: nacos://192.168.2.36:8848
    # 配置 隔离组，有配置 group 的需要指定 group
    group: DEFAULT_GROUP
    # 配置 namespace，有namespace需要指定namespace
    parameters:
      namespace: 18041d6e-77a1-4b5e-8a76-eb8c7456dad5
  metadata-report:
    address: nacos://192.168.2.36:8848
    username: nacos
    password: nacos
    # 配置 namespace，有namespace需要指定namespace
    parameters:
      namespace: 18041d6e-77a1-4b5e-8a76-eb8c7456dad5
    # 配置 隔离组，有配置 group 的需要指定 group
    group: DEFAULT_GROUP
  cloud:
    subscribed-services: nacos-dubbo-provider
  application:
    logger: slf4j
    # 元数据中心 local 本地 remote 远程 这里使用远程便于其他服务获取
    metadataType: remote
    # 可选值 interface、instance、all，默认是 all，即接口级地址、应用级地址都注册
    register-mode: instance
    service-discovery:
      # FORCE_INTERFACE，只消费接口级地址，如无地址则报错，单订阅 2.x 地址
      # APPLICATION_FIRST，智能决策接口级/应用级地址，双订阅
      # FORCE_APPLICATION，只消费应用级地址，如无地址则报错，单订阅 3.x 地址
      migration: FORCE_APPLICATION
  protocol:
    # 设置为 tri 即可使用 Triple 3.0 新协议
    # 性能对比 dubbo 协议并没有提升 但基于 http2 用于多语言异构等 http 交互场景
    # 使用 dubbo 协议通信
    name: dubbo
    # dubbo 协议端口(-1表示自增端口,从20880开始)
    port: -1
    # 指定dubbo协议注册ip
    # host: 192.168.2.11
  # 消费者相关配置
  consumer:
    # 结果缓存(LRU算法)
    # 会有数据不一致问题 建议在注解局部开启
    cache: false
    # 支持校验注解
    validation: true
    # 超时时间
    timeout: 3000
    # 初始化检查
    check: false

```



- JDK11、17启动 在vm args新增以下启动参数防止出现启动异常

```
--add-opens java.base/java.lang=ALL-UNNAMED
```

##  调用地址

- 消费者
http://127.0.0.1:8081/hello?name=gm

- 查看注册的服务
http://192.168.2.36:8848/nacos/#/serviceManagement?serverId=center&group=&dataId=&namespace=18041d6e-77a1-4b5e-8a76-eb8c7456dad5&appName=&pageSize=&pageNo=
