package src.test;


import io.swagger.Swagger2SpringBoot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Swagger2SpringBoot.class)
@WebAppConfiguration

public class SpringBootWebApplicationTests {
    @Test
    public void contextLoads() {

    }


}
