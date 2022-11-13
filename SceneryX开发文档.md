# 项目

苏锡

com.yp.sx



## 父工程

### SceneryX

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.7.5</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
    <groupId>com.yp.sx</groupId>
    <artifactId>SceneryX</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>pom</packaging>
    <name>SceneryX</name>
    <description>SceneryX</description>
    <properties>
        <java.version>1.8</java.version>
        <spring-cloud.version>2021.0.5</spring-cloud.version>
        <alibaba-cloud.version>2021.0.1.0</alibaba-cloud.version>
        <mybatis-plus.version>3.5.2</mybatis-plus.version>
        <druid.version>1.2.6</druid.version>
        <knife4j.version>3.0.3</knife4j.version>
        <mysql.version>8.0.31</mysql.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
                <version>${alibaba-cloud.version}</version>
            </dependency>

            <dependency>
                <groupId>com.baomidou</groupId>
                <artifactId>mybatis-plus-boot-starter</artifactId>
                <version>${mybatis-plus.version}</version>
            </dependency>

            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid-spring-boot-starter</artifactId>
                <version>${druid.version}</version>
            </dependency>

            <dependency>
                <groupId>com.github.xiaoymin</groupId>
                <artifactId>knife4j-spring-boot-starter</artifactId>
                <version>${knife4j.version}</version>
            </dependency>

            <dependency>
                <groupId>com.mysql</groupId>
                <artifactId>mysql-connector-j</artifactId>
                <version>${mysql.version}</version>
            </dependency>

        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-webflux</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway</artifactId>
        </dependency>


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

### SceneryX_api

```xml
<dependencies>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-loadbalancer</artifactId>
    </dependency>

    <dependency>
        <groupId>com.github.xiaoymin</groupId>
        <artifactId>knife4j-spring-boot-starter</artifactId>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.7.5</version>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### SceneryX_authServer

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
    </dependency>

    <dependency>
        <groupId>com.baomidou</groupId>
        <artifactId>mybatis-plus-boot-starter</artifactId>
    </dependency>

    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid-spring-boot-starter</artifactId>
    </dependency>

    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
    </dependency>
</dependencies>

<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.7.5</version>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### SceneryX_common



暂无



### SceneryX_gateway



```xml
<dependencies>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-gateway</artifactId>
    </dependency>

    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
    </dependency>

</dependencies>


<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.7.5</version>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

### SceneryX_networkApi



```xml
<dependencies>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-loadbalancer</artifactId>
    </dependency>

    <dependency>
        <groupId>com.github.xiaoymin</groupId>
        <artifactId>knife4j-spring-boot-starter</artifactId>
    </dependency>
</dependencies>


<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
            <version>2.7.5</version>
            <configuration>
                <excludes>
                    <exclude>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                    </exclude>
                </excludes>
            </configuration>
        </plugin>
    </plugins>
</build>
```

声明：我使用的是mariadb  如果同样使用，自行替换

项目创建后如下

![image-20221112112147201](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112112147201.png)



## 编写appliaction.yml

appliaction.yml

## 多环境配置

appliaction-dev.yml

appliaction-prod.yml

appliaction-test.yml

### 

```yaml
spring:
  application:
    name: sx-authServer
  profiles:
    active: dev

server:
  port: 52
```



```yaml
spring:
  datasource:
    url: jdbc:mariadb://124.221.98.135:3366/db_scenery?useSSL=true
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: org.mariadb.jdbc.Driver
    username: root
    password: root
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
```



## 测试



### 编写测试类

![image-20221112111839887](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112111839887.png)

### 启动nacos

localhost:8848/nacos

![image-20221112111632255](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112111632255.png)

### 启动AuthServerApplication

![image-20221112111924129](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112111924129.png)

![image-20221112111747253](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112111747253.png)

浏览器输入localhost:52/server/auth/test.do

返回结果 如下 代表测试成功

![image-20221112112041503](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221112112041503.png)

## 认证服务

#### 1.1 功能

 ：鉴权服务 实现整体系统中的登录相关操作 主要包含 ：各种形式的登录 、注册、找回密码、修改密码、注销

#### 1.2 效果图

#### 1.3分析

登录：2种 有状态登录（服务端记录登录状态）2无状态登录 不记录。。

登录成功的标记：令牌（token登录）

令牌生成算法：JWT



##### 添加Jwt加密

```java
public class JwtUtil {

    /**
     * token 过期时间, 单位: 秒. 这个值表示 30 天
     */
    private static final long TOKEN_EXPIRED_TIME = 30 * 24 * 60 * 60;

    public static final String jwtId = "xxx";

    /**
     * jwt 加密解密密钥(可自行填写)
     */
    private static final String JWT_SECRET = "xxx";

    //生成令牌
    public static String createToken(String content,Long time){

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        SecretKey secretKey = generalKey();
        long nowMillis = System.currentTimeMillis();//生成JWT的时间

        JwtBuilder builder = Jwts.builder() //这里其实就是new一个JwtBuilder，设置jwt的body
                .setSubject(content)          //如果有私有声明，一定要先设置这个自己创建的私有的声明，这个是给builder的claim赋值，一旦写在标准的声明赋值之后，就是覆盖了那些标准的声明的
                .setId(UUID.randomUUID().toString())                  //设置jti(JWT ID)：是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setIssuedAt(new Date())           //iat: jwt的签发时间
                .signWith(signatureAlgorithm, secretKey);//设置签名使用的签名算法和签名使用的秘钥
        if (time >= 0) {
            long expMillis = nowMillis + time;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);     //设置过期时间
        }
        return builder.compact();
    }

    /**
     * 由字符串生成加密key
     *
     * @return
     */
    private static SecretKey generalKey() {
        String stringKey = JWT_SECRET;
        byte[] encodedKey = Base64.getEncoder().encode(stringKey.getBytes());
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    //解析
    public static String parseToken(String token) {
        SecretKey key = generalKey();
        try {
            Claims claims = Jwts.parser()  //得到DefaultJwtParser
                    .setSigningKey(key)         //设置签名的秘钥
                    .parseClaimsJws(token).getBody();
            return claims.getSubject();
        } catch (Exception e) {
            return null;
        }//设置需要解析的jwt
    }
}
```

##### 测试



```java
public class JwtTest {

    @Test
    public void t1(){


        String token = JwtUtil.createToken("123456",5000000L);
        System.out.println(token);
    }

    @Test
    public void t2(){
        System.err.println(JwtUtil.parseToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTYiLCJqdGkiOiJiZjhjNDljOC1hYzI0LTQxZDEtYWU1Ny0wZDhlYWYwZmI0NGQiLCJpYXQiOjE2NjgyNDA1NDIsImV4cCI6MTY2ODI0NTU0Mn0.hQvZtO6KXSM8x--XqXX93mfkLrVWLlgj8YaS9vXeyE0"));
    }
}
```





### 登录形式

1单点登录 SSO 针对PC项目 大型内部系统 一处登录，处处可用

2唯一登录 一个账号，只能在线一个

3限定次数登录：一个账号，可以在线指定次数

4多设备唯一登录：在每种设备上是唯一登录，但是允许多个设备同时登录

5普通登录：不做限制，只要账号密码正确



账号密码登录

手机号验证码登录

第三方登录 QQ、微信

扫码登录

一键登录：手机号识别登录

人脸识别、指纹登录

这里选择 限制次数+账号密码登录



迭代式开发

##### 创建用户表

```sql
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ctime` datetime NOT NULL COMMENT '创建时间',
  `mtime` datetime NOT NULL COMMENT '修改时间',
  `flag` tinyint(4) DEFAULT 1 COMMENT '状态：1.正常，0.禁用',
  `phone` varchar(11) COLLATE utf8mb4_bin NOT NULL COMMENT '手机号',
  `password` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '密码',
  `pid` int(11) DEFAULT NULL COMMENT '用户来源t_platform(id)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户基本信息';

CREATE TABLE `t_user_log` (
	`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT COMMENT '主键',
	`ctime` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP () COMMENT '创建时间',
	`uid` BIGINT ( 20 ) NOT NULL COMMENT '用户编号t_user(id)',
	`pid` BIGINT ( 20 ) DEFAULT NULL COMMENT '客户端id，t_platform(id)',
	`flag` TINYINT ( 4 ) NOT NULL DEFAULT 1 COMMENT '登录状态 1成功，0失败',
	`type` TINYINT ( 4 ) NOT NULL COMMENT '操作类型 1注册，2登录，3密码找回，4修改密码',
	`ip` VARCHAR ( 255 ) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '操作IP',
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户操作日志';
```





##### 编写controller

```java
@RestController
@RequestMapping("/api/auth")
@Api(value = "实现认证操作",tags = "实现认证操作")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all.do")
    public R all(){
        return userService.getAll();
    }

    @PostMapping("/save.do")
    public R save(@RequestBody UserAddDto dto){
        return userService.save(dto);
    }

    @PostMapping("/login.do")
    public R login(@RequestBody UserLoginDto dto){
        return userService.login(dto);
    }
}
```

```java
@RestController
@RequestMapping("/server/auth/user")
public class UserController  {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @GetMapping("/all.do")
    public R getAll(){

        return userService.all();
    }

    @PostMapping("/save.do")
    public R save(@RequestBody UserAddDto dto){
        return userService.add(dto);
    }

    @PostMapping("/login.do")
    public R login(@RequestBody UserLoginDto dto){
        return userService.loginV1(dto);
    }


}
```

##### 编写service

```java
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public R all() {
        return R.ok(userDao.selectList(null));
    }

    @Override
    public R loginV1(UserLoginDto dto) {

        //查询数据库
        User user = userDao.selectOne(new QueryWrapper<User>().eq("phone",dto.getPhone()));
        //验证用户是否存在
        if (user != null) {
            //校验密码 密文比较
            if (Objects.equals(user.getPassword(), PassUtil.aesenc(SystemConfig.PASS_KEY,dto.getPass()))) {
                //生成令牌
                String token = JwtUtil.createToken(user.getId()+"",604800016L);
                //存储令牌 有效期
                redisTemplate.boundValueOps(redisKeyConfig.LOGIN_PHONE+dto.getPhone())
                        .set(token,redisKeyConfig.LOGIN_TOKEN_TIME, TimeUnit.MINUTES);
                redisTemplate.boundListOps(redisKeyConfig.LOGIN_TOKEN+token)
                        .leftPushAll(JSON.toJSONString(user),1);
                return R.ok(token);
            }
        }
        return R.fail();
    }

    @Override
    public R loginV2(UserLoginDto dto) {
        return null;
    }

    @Override
    public R add(UserAddDto dto) {

        User user = new User(dto.getPhone(), PassUtil.aesenc(SystemConfig.PASS_KEY,dto.getPass()), dto.getPid());
        if (userDao.insert(user)>0){
            return R.ok();
        }
        return R.fail();
    }
}
```

##### 添加jar包

```xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.3.0</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.3.0</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

##### 添加redis配置

```yaml
  redis:
    host: 127.0.0.1
    port: 6379
```

```java
public class redisKeyConfig {

    //记录令牌 List类型 令牌和用户信息 1用户信息 2 次数 用户注销
    public static final String LOGIN_TOKEN = "xxxx"; //追加令牌
    public static final String LOGIN_PHONE = "xxx"; //追加手机号

    public static final int LOGIN_TOKEN_TIME =xxxx; //有效期xxx分钟
}
```

##### 密钥和登录次数

```java
public class SystemConfig {

    private static final int LOGIN_NUM=x;

    //密钥
    public static final String PASS_KEY= "xxx";
```

##### 编写dto

![image-20221113122950884](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221113122950884.png)

##### 编写密码加密

![image-20221113123028101](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221113123028101.png)

##### 编写R类

```java
@AllArgsConstructor
@NoArgsConstructor
@Data
public class R {

    private int code;

    private String msg;

    private Object data;

    public static R ok(String msg,Object data){
        return new R(RCode.OK.getValue(),msg,data);
    }

    public static R ok(Object data){
        return ok("OK",data);
    }

    public static R ok(){
        return ok(null);
    }


    public static R fail(int code,String msg,Object data){
        return new R(code,msg,data);
    }

    public static R fail(){
        return new R(RCode.FAIL.getValue(),"Fail",null);
    }
```

##### R枚举

```java
public enum RCode {

    OK(10000),FAIL(10001),LOGIN_ERROR(10002);
    private int value;

    public int getValue(){
        return value;
    }

    private RCode(int v){
        value = v;
    }
```

##### swagger配置

```java
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public ApiInfo createApiInfo(){
        return new ApiInfoBuilder().title("SceneryX接口文档").description("接口文档")
                .contact(new Contact("土狗","http://tugou.com","tugou@outlook.com"))
                .version("v1.0.0").build();
    }

    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApiInfo()).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build();
    }
```

#### 测试结果

![image-20221113123442537](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221113123442537.png)

![image-20221113123500929](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221113123500929.png)

![image-20221113123517634](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221113123517634.png)