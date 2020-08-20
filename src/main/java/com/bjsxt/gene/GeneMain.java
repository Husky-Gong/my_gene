package com.bjsxt.gene;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

// 代码生成
public class GeneMain {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator generator = new AutoGenerator();
        // 配置
        GlobalConfig config = new GlobalConfig();
        // 目录获取, 工作目录
        String dirPath = System.getProperty("user.dir");
        // 配置
        config.setFileOverride(false); // 覆盖
        config.setActiveRecord(true); // plus record
        config.setEnableCache(false); // 缓存
        config.setBaseResultMap(true); // 设置resultMap
        config.setBaseColumnList(false); // 设置sql标签，定义字段列表
        config.setOutputDir(dirPath); // 输出位置
        config.setDateType(DateType.ONLY_DATE); // 只使用java.util.Date
        config.setIdType(IdType.AUTO); // 主键生成策略。

        // datasource 数据库连接池
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUsername("jersey");
        dataSourceConfig.setPassword("Zz010013");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://waiwangjersey.mysql.rds.aliyuncs.com:3306/ego?serverTimezone=Asia/Shanghai");

        // 包 package 配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.ego")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("pojo")
                .setXml("mapperxml");

        // 策略 设置下划线
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true) // 大写模式
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("tb_")
                .setEntityLombokModel(true)
                .setInclude("tb_content","tb_content_category","tb_item",
                        "tb_item_cat","tb_item_desc","tb_item_param",
                        "tb_item_param_item","tb_manager","tb_order",
                        "tb_order_item","tb_order_shipping","tb_user");

        // 组装配置
        generator.setStrategy(strategyConfig);
        generator.setPackageInfo(packageConfig);
        generator.setDataSource(dataSourceConfig);
        generator.setGlobalConfig(config);

        // 生成
        generator.execute();
    }
}