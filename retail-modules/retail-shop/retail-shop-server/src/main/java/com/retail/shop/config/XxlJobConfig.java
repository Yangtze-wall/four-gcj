//package com.retail.shop.config;
//
//
//import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * xxl-job config
// *
// * @author xuxueli 2017-04-28
// */
//@Configuration
//@Log4j2
//public class XxlJobConfig {
//
////   @Value("${xxl.job.admin.addresses}")
//    private String adminAddresses="http://127.0.0.1:8080/xxl-job-admin";
//
//   // @Value("${xxl.job.accessToken}")
//    private String accessToken="default_token";
//
//   // @Value("${xxl.job.executor.appname}")
//    private String appname="system";
//
//    //@Value("${xxl.job.executor.ip}")
//    private String ip=null;
//
//    //@Value("${xxl.job.executor.port}")
//    private int port=9999;
//
//   // @Value("${xxl.job.executor.logpath}")
//    private String logPath="/data/applogs/xxl-job/jobhandler";
//
//    //@Value("${xxl.job.executor.logretentiondays}")
//    private int logRetentionDays=30;
//
//
//    @Bean
//    public XxlJobSpringExecutor xxlJobExecutor() {
//        log.info("进入方法");
//        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
//        xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
//        xxlJobSpringExecutor.setAppname(appname);
//        xxlJobSpringExecutor.setPort(port);
//        xxlJobSpringExecutor.setAccessToken(accessToken);
////        xxlJobSpringExecutor.setLogPath(logPath);
////        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);
//
//        return xxlJobSpringExecutor;
//    }
//    /**
//     * 针对多网卡、容器内部署等情况，可借助 "spring-cloud-commons" 提供的 "InetUtils" 组件灵活定制注册IP；
//     *
//     *      1、引入依赖：
//     *          <dependency>
//     *             <groupId>org.springframework.cloud</groupId>
//     *             <artifactId>spring-cloud-commons</artifactId>
//     *             <version>${version}</version>
//     *         </dependency>
//     *
//     *      2、配置文件，或者容器启动变量
//     *          spring.cloud.inetutils.preferred-networks: 'xxx.xxx.xxx.'
//     *
//     *      3、获取IP
//     *          String ip_ = inetUtils.findFirstNonLoopbackHostInfo().getIpAddress();
//     */
//
//
//}