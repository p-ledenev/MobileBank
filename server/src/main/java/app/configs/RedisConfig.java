package app.configs;

import org.springframework.context.annotation.*;
import org.springframework.data.redis.connection.jedis.*;
import org.springframework.session.data.redis.config.annotation.web.http.*;
import redis.clients.jedis.*;
import redis.embedded.*;

import javax.annotation.*;
import java.io.*;

/**
 * Created by DiKey on 29.08.2015.
 */
@Configuration
@EnableRedisHttpSession
public class RedisConfig {

    private static RedisServer redisServer;

    @Bean
    public JedisConnectionFactory connectionFactory() throws IOException {
        redisServer = new RedisServer(Protocol.DEFAULT_PORT);
        redisServer.start();
        return new JedisConnectionFactory();
    }

    @PreDestroy
    public void destroy() {
        redisServer.stop();
    }
}
