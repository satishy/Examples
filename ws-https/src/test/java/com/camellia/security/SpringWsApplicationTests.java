package com.camellia.security;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;
import java.util.List;

import com.camellia.security.ws.client.TicketAgentClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringWsApplicationTests {

    @Autowired
    private TicketAgentClient ticketAgentClient;

    @Test
    public void testListFlights() {
        List<BigInteger> flights = ticketAgentClient.listFlights();

        assertThat(flights.get(0)).isEqualTo(BigInteger.valueOf(101));
    }
}