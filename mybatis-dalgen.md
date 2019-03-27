#引入依赖
<build>
	<plugin>
			<groupId>cn.dalgen.plugins</groupId>
			<artifactId>mybatis-maven-plugin</artifactId>
			<version>1.2.0</version>
			<configuration>
				<templateDirectory>dalgen/templates</templateDirectory>
				<copyTemplate>true</copyTemplate>
				<outputDirectory>src</outputDirectory>
			</configuration>
		</plugin>
    </plugins>
</build>

#执行步骤

1、在项目的module下 打开命令窗口 运行命令 mvn mybatis:gen
2、修改运行命令后生产的dalgen/config/config.xml 数据库连接
3、继续运行第一步，输入表名。  目前测试版本不支持*，操作所有表


