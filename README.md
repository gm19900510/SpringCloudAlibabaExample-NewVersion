##  简介
一套专门介绍SpringCloud Alibaba相关组件使用的相关教程，包括SpringCloud Nacos，Dubbo，分布式事物Seata等相关内容。涵盖大部分的应用场景。

##  项目结构
```lua
SpringCloudAlibabaExample
├── nacos-config                    -- nacos配置中心
├── nacos-discovery-http            -- nacos注册中心
├──├── nacos-discovery-http-consumer    -- http nacos服务消费者
├──├── nacos-disvoery-http-provider     -- http nacos服务提供者
├── nacos-discovery-dubbo           -- nacos整合dubbo
├──├── nacos-discovery-dubbo-api        --nacos提供的接口
├──├── nacos-discovery-dubbo-consumer   --nacos服务消费者
├──├── nacos-discovery-dubbo-provider   --nacos服务提供者
├── sentinel                        --sentinel
├──├── sentinel-flow-control            --Sentinel配置
├──├── sentinel-nacos-conf              --Sentinel使用Nacos进行配置管理
```


## 主要版本说明

- spring-cloud 2021.0.3
- spring-boot 2.6.8
- spring-cloud-alibaba 2021.0.1.0
- dubbo 3.0.8