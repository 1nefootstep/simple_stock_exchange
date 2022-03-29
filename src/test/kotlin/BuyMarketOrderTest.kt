import org.junit.jupiter.api.Test

class BuyMarketOrderTest {
    @Test
    internal fun marketBuy() {
        val exchange = Exchange()
        val isSuccessful = exchange.marketBuy("FB", 100)
        assert(!isSuccessful)
        val mockExchange = MockExchange()
        mockExchange.addOrder(BuySell.SELL, OrderType.LIMIT, "FB", 1200, 4000)
    }
}