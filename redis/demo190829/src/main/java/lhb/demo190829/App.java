package lhb.demo190829;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
    	Jedis jedis = new Jedis("192.168.187.128", 6379);
    	System.out.println("===="+jedis.ping());
    	jedis.set("test", "lhb");
    	System.out.println("==="+jedis.get("test"));
    }
}
