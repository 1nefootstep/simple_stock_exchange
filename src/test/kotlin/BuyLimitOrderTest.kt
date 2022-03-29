import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuyLimitOrderTest {
    @Test
    internal fun oneOrder() {
        val exchange = Exchange()
        exchange.limitBuy("FB", 100, 3000)
        val orders = exchange.viewOrders()
        assertEquals(orders.size, 1)
    }

    @Test
    internal fun limitBuy() {
        val exchange = Exchange()
        exchange.limitBuy("FB", 100, 3000)
        val orders = exchange.viewOrders()
        assertEquals(orders.size, 1)
    }
}