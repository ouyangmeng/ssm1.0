import model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * user:ouym
 * date: 2015/7/31
 * time: 11:55
 */
public class UserTest {

   // @Autowired
    private UserService userService;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("ouym");
        user.setPassword("1234567");

        System.out.println(userService.insertUser(user));
    }
}
