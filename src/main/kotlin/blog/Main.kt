package blog

import redis.clients.jedis.Jedis

// http://xetorthio.github.io/jedis/
fun main(args : Array<String>) {
    val jedis = Jedis("127.0.0.1")
    jedis.set("foo", "bar")
    jedis.hset("hsetKey", "hsetField", "hsetValue");
    val value = jedis.get("foo")
    val valueHset = jedis.hget("hsetKey", "hsetField")
    println(value)
    println(valueHset)
}