import org.junit.*;

/**
 * Created by admin on 2022-12-08.
 */
public class JunitTest1 {
    //启动后执行执行
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("this is @BeforeClass ...");
    }
    //所有测试执行完后执行
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("this is @AfterClass ...");
    }
    //测试用例执行前执行
    @Before
    public void setUp() throws Exception {
        System.out.println("this is @Before ...");
    }
    //测试用例执行后执行
    @After
    public void tearDown() throws Exception {
        System.out.println("this is @After ...");
    }

    @Test
    public void test1() {
        System.out.println("this is test1 ...");
    }

    @Test
    public void test2() {
        System.out.println("this is test2 ...");
    }
}
